package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.IsFocusVisibleIsSelected
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledItemContent {
  
  inline def apply[C /* <: ElementType */]($isFocusVisible: Boolean, $isSelected: Boolean): Builder[C] = {
    val __props = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, IsFocusVisibleIsSelected])]))
  }
  
  @JSImport("baseui/tree-view", "StyledItemContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[IsFocusVisibleIsSelected, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: IsFocusVisibleIsSelected => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, IsFocusVisibleIsSelected])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
