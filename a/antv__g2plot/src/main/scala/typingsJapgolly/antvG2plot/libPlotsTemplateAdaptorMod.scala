package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Params
import typingsJapgolly.antvG2plot.libPlotsTemplateTypesMod.TemplateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTemplateAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/_template/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[TemplateOptions]): Params[TemplateOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TemplateOptions]]
  
  inline def meta(params: Params[TemplateOptions]): Params[TemplateOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TemplateOptions]]
}
