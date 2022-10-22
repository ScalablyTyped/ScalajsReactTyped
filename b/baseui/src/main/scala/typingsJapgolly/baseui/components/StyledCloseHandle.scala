package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.dndListTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledCloseHandle {
  
  inline def apply[C /* <: ElementType */](
    $index: Double,
    $isDragged: Boolean,
    $isFocusVisible: Boolean,
    $isOutOfBounds: Boolean,
    $isRemovable: Boolean,
    $isRemovableByMove: Boolean,
    $isSelected: Boolean
  ): SharedBuilder_AsOverrideProps_1593839454[C] = {
    val __props = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOutOfBounds = $isOutOfBounds.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_1593839454[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/dnd-list", "StyledCloseHandle")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): SharedBuilder_AsOverrideProps_1593839454[C] = new SharedBuilder_AsOverrideProps_1593839454[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
