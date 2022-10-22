package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Params
import typingsJapgolly.antvG2plot.libPlotsPieTypesMod.PieOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPieAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/pie/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[PieOptions]): Params[PieOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[PieOptions]]
  
  inline def interaction(params: Params[PieOptions]): Params[PieOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("interaction")(params.asInstanceOf[js.Any]).asInstanceOf[Params[PieOptions]]
  
  inline def pieAnnotation(params: Params[PieOptions]): Params[PieOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("pieAnnotation")(params.asInstanceOf[js.Any]).asInstanceOf[Params[PieOptions]]
  
  inline def transformStatisticOptions(options: PieOptions): PieOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStatisticOptions")(options.asInstanceOf[js.Any]).asInstanceOf[PieOptions]
}
