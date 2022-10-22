package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialTinyAreaOptions
import typingsJapgolly.antvG2plot.libPlotsTinyAreaTypesMod.TinyAreaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "TinyArea")
@js.native
open class TinyArea protected ()
  extends typingsJapgolly.antvG2plot.libPlotsTinyAreaMod.TinyArea {
  def this(container: String, options: TinyAreaOptions) = this()
  def this(container: HTMLElement, options: TinyAreaOptions) = this()
}
/* static members */
object TinyArea {
  
  @JSImport("@antv/g2plot", "TinyArea")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialTinyAreaOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyAreaOptions]
}
