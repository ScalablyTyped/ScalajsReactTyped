package typingsJapgolly.semanticUiReactEventStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CallableEventListener = typingsJapgolly.std.EventListener with typingsJapgolly.semanticUiReactEventStack.AnonCalled
  type EventListeners = js.Array[typingsJapgolly.semanticUiReactEventStack.typesMod.CallableEventListener]
  type GenericMap[T] = typingsJapgolly.std.Map[java.lang.String, T]
  type InputEventListener = typingsJapgolly.std.EventListener | js.Array[typingsJapgolly.std.EventListener]
  type InputTargetElement = scala.Boolean | java.lang.String | typingsJapgolly.semanticUiReactEventStack.typesMod.TargetElement | japgolly.scalajs.react.raw.React.RefHandle[typingsJapgolly.semanticUiReactEventStack.typesMod.TargetElement]
  type TargetElement = typingsJapgolly.std.Document_ | org.scalajs.dom.raw.HTMLElement | typingsJapgolly.std.Window_
}
