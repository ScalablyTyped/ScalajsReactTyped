package typingsJapgolly.atSemanticDashUiDashReactEventDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.Anon_Called
  import typingsJapgolly.react.reactMod.RefObject
  import typingsJapgolly.std.Document
  import typingsJapgolly.std.EventListener
  import typingsJapgolly.std.HTMLElement
  import typingsJapgolly.std.Map
  import typingsJapgolly.std.Window

  type CallableEventListener = EventListener with Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = Map[String, T]
  type InputEventListener = EventListener | js.Array[EventListener]
  type InputTargetElement = Boolean | String | TargetElement | RefObject[TargetElement]
  type TargetElement = Document | HTMLElement | Window
}
