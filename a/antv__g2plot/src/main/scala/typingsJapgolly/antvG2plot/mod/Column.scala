package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialColumnOptions
import typingsJapgolly.antvG2plot.libPlotsColumnTypesMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Column")
@js.native
open class Column protected ()
  extends typingsJapgolly.antvG2plot.libPlotsColumnMod.Column {
  def this(container: String, options: ColumnOptions) = this()
  def this(container: HTMLElement, options: ColumnOptions) = this()
}
/* static members */
object Column {
  
  @JSImport("@antv/g2plot", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 柱形图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialColumnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialColumnOptions]
}
