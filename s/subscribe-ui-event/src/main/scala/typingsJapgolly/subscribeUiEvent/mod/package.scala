package typingsJapgolly.subscribeUiEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TouchEventCallback[T /* <: typingsJapgolly.subscribeUiEvent.mod.TouchEventType */] = js.Function2[
    /* event */ org.scalajs.dom.raw.TouchEvent, 
    /* payload */ typingsJapgolly.subscribeUiEvent.mod.ArgmentedEvent[T], 
    js.Any
  ]
  type UIEventCallback[T /* <: typingsJapgolly.subscribeUiEvent.mod.UIEventType */] = js.Function2[
    /* event */ org.scalajs.dom.raw.UIEvent, 
    /* payload */ typingsJapgolly.subscribeUiEvent.mod.ArgmentedEvent[T], 
    js.Any
  ]
}
