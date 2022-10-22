package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialBarOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsBarTypesMod.BarOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBarMod {
  
  @JSImport("@antv/g2plot/lib/plots/bar", "Bar")
  @js.native
  open class Bar protected () extends Plot[BarOptions] {
    def this(container: String, options: BarOptions) = this()
    def this(container: HTMLElement, options: BarOptions) = this()
    
    /**
      * @override
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Bar {
    
    @JSImport("@antv/g2plot/lib/plots/bar", "Bar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 条形图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialBarOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBarOptions]
  }
}
