package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.sizenumberstringcolorstri
import typingsJapgolly.baseui.toastTypesMod.KindType
import typingsJapgolly.baseui.toastTypesMod.NotificationType
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CloseIconSvg {
  
  inline def apply[C /* <: ElementType */](
    $closeable: Boolean,
    $color: String,
    $isFocusVisible: Boolean,
    $isRendered: Boolean,
    $isVisible: Boolean,
    $kind: KindType,
    $size: Double | String,
    $type: NotificationType
  ): SharedBuilder_AsOverrideProps_1057462427[C] = {
    val __props = js.Dynamic.literal($closeable = $closeable.asInstanceOf[js.Any], $color = $color.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isRendered = $isRendered.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $kind = $kind.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_1057462427[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, sizenumberstringcolorstri])]))
  }
  
  @JSImport("baseui/toast/styled-components", "CloseIconSvg")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, sizenumberstringcolorstri])): SharedBuilder_AsOverrideProps_1057462427[C] = new SharedBuilder_AsOverrideProps_1057462427[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
