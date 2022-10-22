package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Params
import typingsJapgolly.antvG2plot.libPlotsWordCloudTypesMod.WordCloudOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWordCloudAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/word-cloud/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[WordCloudOptions]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def legend(params: Params[WordCloudOptions]): Params[WordCloudOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[WordCloudOptions]]
}
