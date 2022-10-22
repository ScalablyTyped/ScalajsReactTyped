package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.blockTypesMod.BlockProps
import typingsJapgolly.baseui.blockTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelSmall {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_OverrideProps438760901[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_OverrideProps438760901[C](js.Array(this.component, __props.asInstanceOf[OverrideProps[C, BlockProps[C]]]))
  }
  
  @JSImport("baseui/typography", "LabelSmall")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: LabelSmall.type): SharedBuilder_OverrideProps438760901[C] = new SharedBuilder_OverrideProps438760901[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: OverrideProps[C, BlockProps[C]]): SharedBuilder_OverrideProps438760901[C] = new SharedBuilder_OverrideProps438760901[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
