package typingsJapgolly.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StateChangeTypes extends StObject
@JSImport("downshift", "StateChangeTypes")
@js.native
object StateChangeTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StateChangeTypes & String] = js.native
  
  @js.native
  sealed trait blurButton
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_blur_button__" */ val blurButton: typingsJapgolly.downshift.mod.StateChangeTypes.blurButton & String = js.native
  
  @js.native
  sealed trait blurInput
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_blur_input__" */ val blurInput: typingsJapgolly.downshift.mod.StateChangeTypes.blurInput & String = js.native
  
  @js.native
  sealed trait changeInput
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_change_input__" */ val changeInput: typingsJapgolly.downshift.mod.StateChangeTypes.changeInput & String = js.native
  
  @js.native
  sealed trait clickButton
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_click_button__" */ val clickButton: typingsJapgolly.downshift.mod.StateChangeTypes.clickButton & String = js.native
  
  @js.native
  sealed trait clickItem
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_click_item__" */ val clickItem: typingsJapgolly.downshift.mod.StateChangeTypes.clickItem & String = js.native
  
  @js.native
  sealed trait controlledPropUpdatedSelectedItem
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_controlled_prop_updated_selected_item__" */ val controlledPropUpdatedSelectedItem: typingsJapgolly.downshift.mod.StateChangeTypes.controlledPropUpdatedSelectedItem & String = js.native
  
  @js.native
  sealed trait itemMouseEnter
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_item_mouseenter__" */ val itemMouseEnter: typingsJapgolly.downshift.mod.StateChangeTypes.itemMouseEnter & String = js.native
  
  @js.native
  sealed trait keyDownArrowDown
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_keydown_arrow_down__" */ val keyDownArrowDown: typingsJapgolly.downshift.mod.StateChangeTypes.keyDownArrowDown & String = js.native
  
  @js.native
  sealed trait keyDownArrowUp
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_keydown_arrow_up__" */ val keyDownArrowUp: typingsJapgolly.downshift.mod.StateChangeTypes.keyDownArrowUp & String = js.native
  
  @js.native
  sealed trait keyDownEnter
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_keydown_enter__" */ val keyDownEnter: typingsJapgolly.downshift.mod.StateChangeTypes.keyDownEnter & String = js.native
  
  @js.native
  sealed trait keyDownEscape
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_keydown_escape__" */ val keyDownEscape: typingsJapgolly.downshift.mod.StateChangeTypes.keyDownEscape & String = js.native
  
  @js.native
  sealed trait keyDownSpaceButton
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_keydown_space_button__" */ val keyDownSpaceButton: typingsJapgolly.downshift.mod.StateChangeTypes.keyDownSpaceButton & String = js.native
  
  @js.native
  sealed trait mouseUp
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_mouseup__" */ val mouseUp: typingsJapgolly.downshift.mod.StateChangeTypes.mouseUp & String = js.native
  
  @js.native
  sealed trait touchEnd
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_touchend__" */ val touchEnd: typingsJapgolly.downshift.mod.StateChangeTypes.touchEnd & String = js.native
  
  @js.native
  sealed trait unknown
    extends StObject
       with StateChangeTypes
  /* "__autocomplete_unknown__" */ val unknown: typingsJapgolly.downshift.mod.StateChangeTypes.unknown & String = js.native
}
