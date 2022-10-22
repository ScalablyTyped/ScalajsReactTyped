package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialTinyLineOptions
import typingsJapgolly.antvG2plot.libPlotsTinyLineTypesMod.TinyLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "TinyLine")
@js.native
open class TinyLine protected ()
  extends typingsJapgolly.antvG2plot.libPlotsTinyLineMod.TinyLine {
  def this(container: String, options: TinyLineOptions) = this()
  def this(container: HTMLElement, options: TinyLineOptions) = this()
}
/* static members */
object TinyLine {
  
  @JSImport("@antv/g2plot", "TinyLine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialTinyLineOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyLineOptions]
}
