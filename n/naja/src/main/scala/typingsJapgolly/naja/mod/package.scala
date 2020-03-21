package typingsJapgolly.naja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NajaEventListener[T /* <: typingsJapgolly.std.Event_ */] = (js.Function1[/* event */ T, js.Promise[scala.Unit] | scala.Unit]) | typingsJapgolly.naja.Anon0[T]
  type RequestData = scala.Null | java.lang.String | scala.Double | js.Array[js.Any] | js.Object | scala.scalajs.js.typedarray.ArrayBuffer | org.scalajs.dom.raw.Blob | org.scalajs.dom.raw.FormData
  type SnippetUpdateListener = (js.Function1[
    /* event */ typingsJapgolly.naja.mod.SnippetUpdateEvent, 
    js.Promise[scala.Unit] | scala.Unit
  ]) | typingsJapgolly.naja.AnonHandleEvent
}
