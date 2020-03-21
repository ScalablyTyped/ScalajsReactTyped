package typingsJapgolly.axiosTokenInterceptor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TokenProvider = js.Function1[
    /* config */ typingsJapgolly.axios.mod.AxiosRequestConfig, 
    js.Promise[typingsJapgolly.axios.mod.AxiosRequestConfig]
  ]
}
