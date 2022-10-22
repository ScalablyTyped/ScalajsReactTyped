package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialViolinOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsViolinTypesMod.ViolinOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsViolinMod {
  
  @JSImport("@antv/g2plot/lib/plots/violin", "Violin")
  @js.native
  open class Violin protected () extends Plot[ViolinOptions] {
    def this(container: String, options: ViolinOptions) = this()
    def this(container: HTMLElement, options: ViolinOptions) = this()
    
    /**
      * @override
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Violin {
    
    @JSImport("@antv/g2plot/lib/plots/violin", "Violin")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialViolinOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialViolinOptions]
  }
}
