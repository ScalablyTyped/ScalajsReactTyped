package typingsJapgolly.rcAlign.components

import typingsJapgolly.rcAlign.esAlignMod.AlignProps
import typingsJapgolly.rcAlign.esAlignMod.RefAlign
import typingsJapgolly.rcAlign.esInterfaceMod.AlignType
import typingsJapgolly.rcAlign.esInterfaceMod.TargetType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcAlign {
  
  inline def apply(align: AlignType, target: TargetType): SharedBuilder_AlignPropsRefAttributes979062639[RefAlign] = {
    val __props = js.Dynamic.literal(align = align.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    new SharedBuilder_AlignPropsRefAttributes979062639[RefAlign](js.Array(this.component, __props.asInstanceOf[AlignProps & RefAttributes[RefAlign]]))
  }
  
  @JSImport("rc-align", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AlignProps & RefAttributes[RefAlign]): SharedBuilder_AlignPropsRefAttributes979062639[RefAlign] = new SharedBuilder_AlignPropsRefAttributes979062639[RefAlign](js.Array(this.component, p.asInstanceOf[js.Any]))
}
