package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.heightstringnumberSharedS
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledContentAnimationContainer {
  
  inline def apply[C /* <: ElementType */]($height: String | Double, $isFocusVisible: Boolean): SharedBuilder_AsOverrideProps1780301599[C] = {
    val __props = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1780301599[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, heightstringnumberSharedS])]))
  }
  
  @JSImport("baseui/accordion", "StyledContentAnimationContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, heightstringnumberSharedS])): SharedBuilder_AsOverrideProps1780301599[C] = new SharedBuilder_AsOverrideProps1780301599[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
