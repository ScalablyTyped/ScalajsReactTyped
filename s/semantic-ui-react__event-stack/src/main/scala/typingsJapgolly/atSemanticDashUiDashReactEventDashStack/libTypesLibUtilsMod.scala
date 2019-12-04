package typingsJapgolly.atSemanticDashUiDashReactEventDashStack

import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.GenericMap
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputTargetElement
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.TargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/utils", JSImport.Namespace)
@js.native
object libTypesLibUtilsMod extends js.Object {
  def cloneMap[T](map: GenericMap[T]): GenericMap[T] = js.native
  def isRefObject[T](ref: js.Any): /* is react.react.RefObject<T> */ Boolean = js.native
  def normalizeHandlers(handlers: InputEventListener): EventListeners = js.native
  def normalizeTarget(target: InputTargetElement): TargetElement = js.native
}

