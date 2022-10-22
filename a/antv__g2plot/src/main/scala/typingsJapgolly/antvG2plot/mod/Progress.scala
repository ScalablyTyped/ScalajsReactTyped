package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialProgressOptions
import typingsJapgolly.antvG2plot.libPlotsProgressTypesMod.ProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Progress")
@js.native
open class Progress protected ()
  extends typingsJapgolly.antvG2plot.libPlotsProgressMod.Progress {
  def this(container: String, options: ProgressOptions) = this()
  def this(container: HTMLElement, options: ProgressOptions) = this()
}
/* static members */
object Progress {
  
  @JSImport("@antv/g2plot", "Progress")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 仪表盘 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialProgressOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialProgressOptions]
}
