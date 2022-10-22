package typingsJapgolly.reactWidgets.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactWidgets.esmMessagesMod.LabelMessage
import typingsJapgolly.reactWidgets.esmMessagesMod.RenderableMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-widgets.react-widgets/esm/messages.Messages> */
trait PartialMessages extends StObject {
  
  var createOption: js.UndefOr[js.Function2[/* _value */ Any, /* searchTerm */ String, Node]] = js.undefined
  
  var dateButton: js.UndefOr[LabelMessage] = js.undefined
  
  var decrement: js.UndefOr[LabelMessage] = js.undefined
  
  var emptyFilter: js.UndefOr[RenderableMessage] = js.undefined
  
  var emptyList: js.UndefOr[RenderableMessage] = js.undefined
  
  var increment: js.UndefOr[LabelMessage] = js.undefined
  
  var moveBack: js.UndefOr[LabelMessage] = js.undefined
  
  var moveForward: js.UndefOr[LabelMessage] = js.undefined
  
  var moveToday: js.UndefOr[LabelMessage] = js.undefined
  
  var noneSelected: js.UndefOr[LabelMessage] = js.undefined
  
  var openCombobox: js.UndefOr[LabelMessage] = js.undefined
  
  var removeLabel: js.UndefOr[LabelMessage] = js.undefined
  
  var selectedItems: js.UndefOr[js.Function1[/* labels */ js.Array[String], String]] = js.undefined
  
  var tagsLabel: js.UndefOr[LabelMessage] = js.undefined
}
object PartialMessages {
  
  inline def apply(): PartialMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessages]
  }
  
  extension [Self <: PartialMessages](x: Self) {
    
    inline def setCreateOption(value: (/* _value */ Any, /* searchTerm */ String) => Node): Self = StObject.set(x, "createOption", js.Any.fromFunction2(value))
    
    inline def setCreateOptionUndefined: Self = StObject.set(x, "createOption", js.undefined)
    
    inline def setDateButton(value: LabelMessage): Self = StObject.set(x, "dateButton", value.asInstanceOf[js.Any])
    
    inline def setDateButtonFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "dateButton", js.Any.fromFunction1(value))
    
    inline def setDateButtonUndefined: Self = StObject.set(x, "dateButton", js.undefined)
    
    inline def setDecrement(value: LabelMessage): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
    
    inline def setDecrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
    
    inline def setDecrementUndefined: Self = StObject.set(x, "decrement", js.undefined)
    
    inline def setEmptyFilter(value: RenderableMessage): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
    
    inline def setEmptyFilterCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "emptyFilter", value.toJsFn)
    
    inline def setEmptyFilterNull: Self = StObject.set(x, "emptyFilter", null)
    
    inline def setEmptyFilterUndefined: Self = StObject.set(x, "emptyFilter", js.undefined)
    
    inline def setEmptyFilterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyFilter", js.Array(value*))
    
    inline def setEmptyFilterVdomElement(value: VdomElement): Self = StObject.set(x, "emptyFilter", value.rawElement.asInstanceOf[js.Any])
    
    inline def setEmptyList(value: RenderableMessage): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
    
    inline def setEmptyListCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "emptyList", value.toJsFn)
    
    inline def setEmptyListNull: Self = StObject.set(x, "emptyList", null)
    
    inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
    
    inline def setEmptyListVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyList", js.Array(value*))
    
    inline def setEmptyListVdomElement(value: VdomElement): Self = StObject.set(x, "emptyList", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIncrement(value: LabelMessage): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setMoveBack(value: LabelMessage): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
    
    inline def setMoveBackFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveBack", js.Any.fromFunction1(value))
    
    inline def setMoveBackUndefined: Self = StObject.set(x, "moveBack", js.undefined)
    
    inline def setMoveForward(value: LabelMessage): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
    
    inline def setMoveForwardFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
    
    inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    inline def setMoveToday(value: LabelMessage): Self = StObject.set(x, "moveToday", value.asInstanceOf[js.Any])
    
    inline def setMoveTodayFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveToday", js.Any.fromFunction1(value))
    
    inline def setMoveTodayUndefined: Self = StObject.set(x, "moveToday", js.undefined)
    
    inline def setNoneSelected(value: LabelMessage): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
    
    inline def setNoneSelectedFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "noneSelected", js.Any.fromFunction1(value))
    
    inline def setNoneSelectedUndefined: Self = StObject.set(x, "noneSelected", js.undefined)
    
    inline def setOpenCombobox(value: LabelMessage): Self = StObject.set(x, "openCombobox", value.asInstanceOf[js.Any])
    
    inline def setOpenComboboxFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "openCombobox", js.Any.fromFunction1(value))
    
    inline def setOpenComboboxUndefined: Self = StObject.set(x, "openCombobox", js.undefined)
    
    inline def setRemoveLabel(value: LabelMessage): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
    
    inline def setRemoveLabelUndefined: Self = StObject.set(x, "removeLabel", js.undefined)
    
    inline def setSelectedItems(value: /* labels */ js.Array[String] => String): Self = StObject.set(x, "selectedItems", js.Any.fromFunction1(value))
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setTagsLabel(value: LabelMessage): Self = StObject.set(x, "tagsLabel", value.asInstanceOf[js.Any])
    
    inline def setTagsLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "tagsLabel", js.Any.fromFunction1(value))
    
    inline def setTagsLabelUndefined: Self = StObject.set(x, "tagsLabel", js.undefined)
  }
}
