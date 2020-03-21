package typingsJapgolly.reactBeautifulDnd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBeautifulDnd.mod.DraggableId
import typingsJapgolly.reactBeautifulDnd.mod.DraggableProps
import typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided
import typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric
import typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable {
  def apply(
    draggableId: DraggableId,
    index: Double,
    disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[Boolean] = js.undefined,
    shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => CallbackTo[Element]
  ): UnmountedWithRoot[DraggableProps, typingsJapgolly.reactBeautifulDnd.mod.Draggable, Unit, DraggableProps] = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction3((t0: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided, t1: /* snapshot */ typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot, t2: /* rubric */ typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric) => children(t0, t1, t2).runNow()))
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectForcePress)) __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBeautifulDnd.mod.DraggableProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactBeautifulDnd.mod.Draggable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.DraggableProps])
  }
  @JSImport("react-beautiful-dnd", "Draggable")
  @js.native
  object componentImport extends js.Object
  
}

