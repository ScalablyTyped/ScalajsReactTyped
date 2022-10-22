package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialViolinOptions
import typingsJapgolly.antvG2plot.libPlotsViolinTypesMod.ViolinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Violin")
@js.native
open class Violin protected ()
  extends typingsJapgolly.antvG2plot.libPlotsViolinMod.Violin {
  def this(container: String, options: ViolinOptions) = this()
  def this(container: HTMLElement, options: ViolinOptions) = this()
}
/* static members */
object Violin {
  
  @JSImport("@antv/g2plot", "Violin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialViolinOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialViolinOptions]
}
