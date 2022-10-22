package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialLineOptions
import typingsJapgolly.antvG2plot.libPlotsLineMod.Line
import typingsJapgolly.antvG2plot.libPlotsLineTypesMod.LineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Line")
@js.native
open class Line_ protected () extends Line {
  def this(container: String, options: LineOptions) = this()
  def this(container: HTMLElement, options: LineOptions) = this()
}
/* static members */
object Line_ {
  
  @JSImport("@antv/g2plot", "Line")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 折线图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialLineOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialLineOptions]
}
