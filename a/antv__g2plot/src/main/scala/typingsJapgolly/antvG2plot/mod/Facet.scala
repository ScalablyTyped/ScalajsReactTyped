package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialFacetOptionskeyofF
import typingsJapgolly.antvG2plot.antvG2plotStrings.circle
import typingsJapgolly.antvG2plot.antvG2plotStrings.list
import typingsJapgolly.antvG2plot.antvG2plotStrings.matrix
import typingsJapgolly.antvG2plot.antvG2plotStrings.mirror
import typingsJapgolly.antvG2plot.antvG2plotStrings.rect
import typingsJapgolly.antvG2plot.antvG2plotStrings.tree
import typingsJapgolly.antvG2plot.libPlotsFacetTypesMod.FacetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Facet")
@js.native
open class Facet protected ()
  extends typingsJapgolly.antvG2plot.libPlotsFacetMod.Facet {
  def this(
    container: String,
    options: FacetOptions[
        /* keyof @antv/g2.@antv/g2/lib/interface.FacetCfgMap */ rect | mirror | list | matrix | circle | tree
      ]
  ) = this()
  def this(
    container: HTMLElement,
    options: FacetOptions[
        /* keyof @antv/g2.@antv/g2/lib/interface.FacetCfgMap */ rect | mirror | list | matrix | circle | tree
      ]
  ) = this()
}
/* static members */
object Facet {
  
  @JSImport("@antv/g2plot", "Facet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 分面图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialFacetOptionskeyofF = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialFacetOptionskeyofF]
}
