package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialAreaOptions
import typingsJapgolly.antvG2plot.libPlotsAreaMod.Area
import typingsJapgolly.antvG2plot.libPlotsAreaTypesMod.AreaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Area")
@js.native
open class Area_ protected () extends Area {
  def this(container: String, options: AreaOptions) = this()
  def this(container: HTMLElement, options: AreaOptions) = this()
}
/* static members */
object Area_ {
  
  @JSImport("@antv/g2plot", "Area")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 面积图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialAreaOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialAreaOptions]
}
