package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialTinyColumnOptions
import typingsJapgolly.antvG2plot.libPlotsTinyColumnTypesMod.TinyColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "TinyColumn")
@js.native
open class TinyColumn protected ()
  extends typingsJapgolly.antvG2plot.libPlotsTinyColumnMod.TinyColumn {
  def this(container: String, options: TinyColumnOptions) = this()
  def this(container: HTMLElement, options: TinyColumnOptions) = this()
}
/* static members */
object TinyColumn {
  
  @JSImport("@antv/g2plot", "TinyColumn")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialTinyColumnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyColumnOptions]
}
