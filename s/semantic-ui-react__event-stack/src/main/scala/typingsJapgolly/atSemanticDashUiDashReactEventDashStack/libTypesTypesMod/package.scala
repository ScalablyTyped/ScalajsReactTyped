package typingsJapgolly.atSemanticDashUiDashReactEventDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  import japgolly.scalajs.react.raw.React.RefHandle
  import org.scalajs.dom.raw.Document
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.Window
  import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.Anon_Called
  import typingsJapgolly.std.EventListener
  import typingsJapgolly.std.Map

  type CallableEventListener = EventListener with Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = Map[String, T]
  type InputEventListener = EventListener | js.Array[EventListener]
  type InputTargetElement = Boolean | String | TargetElement | RefHandle[TargetElement]
  type TargetElement = Document | HTMLElement | Window
}
