package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialTreemapOptions
import typingsJapgolly.antvG2plot.libPlotsTreemapTypesMod.TreemapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Treemap")
@js.native
open class Treemap protected ()
  extends typingsJapgolly.antvG2plot.libPlotsTreemapMod.Treemap {
  def this(container: String, options: TreemapOptions) = this()
  def this(container: HTMLElement, options: TreemapOptions) = this()
}
/* static members */
object Treemap {
  
  @JSImport("@antv/g2plot", "Treemap")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 矩阵树图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialTreemapOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTreemapOptions]
}
