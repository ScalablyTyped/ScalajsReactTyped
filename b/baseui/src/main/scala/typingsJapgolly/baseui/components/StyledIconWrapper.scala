package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.SizeSize
import typingsJapgolly.baseui.inputTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledIconWrapper {
  
  inline def apply[C /* <: ElementType */]($size: Size): SharedBuilder_AsOverrideProps1786875777[C] = {
    val __props = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1786875777[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SizeSize])]))
  }
  
  @JSImport("baseui/payment-card", "StyledIconWrapper")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SizeSize])): SharedBuilder_AsOverrideProps1786875777[C] = new SharedBuilder_AsOverrideProps1786875777[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
