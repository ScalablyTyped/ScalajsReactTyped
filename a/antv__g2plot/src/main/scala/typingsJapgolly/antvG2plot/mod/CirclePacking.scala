package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialCirclePackingOptio
import typingsJapgolly.antvG2plot.libPlotsCirclePackingTypesMod.CirclePackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "CirclePacking")
@js.native
open class CirclePacking protected ()
  extends typingsJapgolly.antvG2plot.libPlotsCirclePackingMod.CirclePacking {
  def this(container: String, options: CirclePackingOptions) = this()
  def this(container: HTMLElement, options: CirclePackingOptions) = this()
}
/* static members */
object CirclePacking {
  
  @JSImport("@antv/g2plot", "CirclePacking")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 面积图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialCirclePackingOptio = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialCirclePackingOptio]
}
