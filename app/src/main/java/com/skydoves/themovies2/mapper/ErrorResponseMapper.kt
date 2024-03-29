/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.themovies2.mapper

import com.skydoves.sandwich.ApiErrorModelMapper
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message
import com.skydoves.themovies2.models.network.TheMovieErrorResponse

/**
 * A mapper for mapping [ApiResponse.Failure.Error] response as custom [TheMovieErrorResponse] instance.
 *
 * @see [ApiErrorModelMapper](https://github.com/skydoves/sandwich#apierrormodelmapper)
 */
object ErrorResponseMapper : ApiErrorModelMapper<TheMovieErrorResponse> {

  /**
   * maps the [ApiResponse.Failure.Error] to the [TheMovieErrorResponse] using the mapper.
   *
   * @param apiErrorResponse The [ApiResponse.Failure.Error] error response from the network request.
   * @return A customized [TheMovieErrorResponse] error response.
   */
  override fun map(apiErrorResponse: ApiResponse.Failure.Error<*>): TheMovieErrorResponse {
    return TheMovieErrorResponse(apiErrorResponse.statusCode.code, apiErrorResponse.message())
  }
}
