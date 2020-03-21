package typingsJapgolly.semanticUiReactEventStack

import typingsJapgolly.semanticUiReactEventStack.typesMod.EventListeners
import typingsJapgolly.semanticUiReactEventStack.typesMod.GenericMap
import typingsJapgolly.semanticUiReactEventStack.typesMod.InputEventListener
import typingsJapgolly.semanticUiReactEventStack.typesMod.InputTargetElement
import typingsJapgolly.semanticUiReactEventStack.typesMod.TargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def cloneMap[T](map: GenericMap[T]): GenericMap[T] = js.native
  def isRefObject[T](ref: js.Any): /* is react.react.RefObject<T> */ Boolean = js.native
  def normalizeHandlers(handlers: InputEventListener): EventListeners = js.native
  def normalizeTarget(target: InputTargetElement): TargetElement = js.native
}

