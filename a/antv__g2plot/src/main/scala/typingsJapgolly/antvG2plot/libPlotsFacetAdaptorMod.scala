package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2plot.antvG2plotStrings.circle
import typingsJapgolly.antvG2plot.antvG2plotStrings.list
import typingsJapgolly.antvG2plot.antvG2plotStrings.matrix
import typingsJapgolly.antvG2plot.antvG2plotStrings.mirror
import typingsJapgolly.antvG2plot.antvG2plotStrings.rect
import typingsJapgolly.antvG2plot.antvG2plotStrings.tree
import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Params
import typingsJapgolly.antvG2plot.libPlotsFacetTypesMod.FacetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsFacetAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/facet/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(
    params: Params[
      FacetOptions[
        /* keyof @antv/g2.@antv/g2/lib/interface.FacetCfgMap */ rect | mirror | list | matrix | circle | tree
      ]
    ]
  ): Params[FacetOptions[rect | circle | mirror | list | matrix | tree]] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[FacetOptions[rect | circle | mirror | list | matrix | tree]]]
}
