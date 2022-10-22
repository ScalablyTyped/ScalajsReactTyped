package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.toastTypesMod.KindType
import typingsJapgolly.baseui.toastTypesMod.NotificationType
import typingsJapgolly.baseui.toastTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerContainer {
  
  inline def apply[C /* <: ElementType */](
    $closeable: Boolean,
    $isFocusVisible: Boolean,
    $isRendered: Boolean,
    $isVisible: Boolean,
    $kind: KindType,
    $type: NotificationType
  ): Builder[C] = {
    val __props = js.Dynamic.literal($closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isRendered = $isRendered.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $kind = $kind.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/toast/styled-components", "InnerContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[SharedStylePropsArg, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: SharedStylePropsArg => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
