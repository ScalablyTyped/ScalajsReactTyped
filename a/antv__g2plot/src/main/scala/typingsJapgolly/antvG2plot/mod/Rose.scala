package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialRoseOptions
import typingsJapgolly.antvG2plot.libPlotsRoseTypesMod.RoseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Rose")
@js.native
open class Rose protected ()
  extends typingsJapgolly.antvG2plot.libPlotsRoseMod.Rose {
  def this(container: String, options: RoseOptions) = this()
  def this(container: HTMLElement, options: RoseOptions) = this()
}
/* static members */
object Rose {
  
  @JSImport("@antv/g2plot", "Rose")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 玫瑰图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialRoseOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRoseOptions]
}
