package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialScatterOptions
import typingsJapgolly.antvG2plot.libPlotsScatterTypesMod.ScatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Scatter")
@js.native
open class Scatter protected ()
  extends typingsJapgolly.antvG2plot.libPlotsScatterMod.Scatter {
  def this(container: String, options: ScatterOptions) = this()
  def this(container: HTMLElement, options: ScatterOptions) = this()
}
/* static members */
object Scatter {
  
  @JSImport("@antv/g2plot", "Scatter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 散点图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialScatterOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialScatterOptions]
}
