package typingsJapgolly.reactRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DoFetch[T] = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.reactRequest.mod.DoFetchOptions], 
    js.Promise[typingsJapgolly.reactRequest.mod.FetchResponse[T]]
  ]
}
