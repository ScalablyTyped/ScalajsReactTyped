package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.ratingTypesMod.StyledRatingItemProps
import typingsJapgolly.baseui.stylesTypesMod.Theme
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledStar {
  
  inline def apply[C /* <: ElementType */](
    $index: Double,
    $isActive: Boolean,
    $isFocusVisible: Boolean,
    $isPartialActive: Boolean,
    $isReadOnly: Boolean,
    $isSelected: Boolean,
    $size: Double,
    $theme: Theme
  ): SharedBuilder_AsOverrideProps_1610375801[C] = {
    val __props = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isPartialActive = $isPartialActive.asInstanceOf[js.Any], $isReadOnly = $isReadOnly.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_1610375801[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyledRatingItemProps])]))
  }
  
  @JSImport("baseui/rating", "StyledStar")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyledRatingItemProps])): SharedBuilder_AsOverrideProps_1610375801[C] = new SharedBuilder_AsOverrideProps_1610375801[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
