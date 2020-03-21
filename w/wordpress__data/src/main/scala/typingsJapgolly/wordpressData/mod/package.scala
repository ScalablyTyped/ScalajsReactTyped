package typingsJapgolly.wordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DispatcherMap = typingsJapgolly.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]]
  type Plugin[T /* <: typingsJapgolly.std.Record[java.lang.String, _] */] = js.Function2[
    /* registry */ typingsJapgolly.wordpressData.mod.DataRegistry, 
    /* options */ T, 
    typingsJapgolly.wordpressData.PartialDataRegistry
  ]
  type SelectorMap = typingsJapgolly.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Subscriber = js.Function1[/* callback */ js.Function0[scala.Unit], js.Function0[scala.Unit]]
}
