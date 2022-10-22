package typingsJapgolly.rcTooltip.components

import typingsJapgolly.rcTooltip.esTooltipMod.TooltipProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTooltip {
  
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcTooltip.type): SharedBuilder_TooltipPropsRefAttributes_1012152987 = new SharedBuilder_TooltipPropsRefAttributes_1012152987(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipProps & RefAttributes[Any]): SharedBuilder_TooltipPropsRefAttributes_1012152987 = new SharedBuilder_TooltipPropsRefAttributes_1012152987(js.Array(this.component, p.asInstanceOf[js.Any]))
}
