package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialBoxOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsBoxTypesMod.BoxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBoxMod {
  
  @JSImport("@antv/g2plot/lib/plots/box", "Box")
  @js.native
  open class Box protected () extends Plot[BoxOptions] {
    def this(container: String, options: BoxOptions) = this()
    def this(container: HTMLElement, options: BoxOptions) = this()
  }
  /* static members */
  object Box {
    
    @JSImport("@antv/g2plot/lib/plots/box", "Box")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialBoxOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBoxOptions]
  }
}
