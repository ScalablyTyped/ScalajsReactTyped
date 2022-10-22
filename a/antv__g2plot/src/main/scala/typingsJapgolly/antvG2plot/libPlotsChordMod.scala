package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialChordOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsChordTypesMod.ChordOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsChordMod {
  
  @JSImport("@antv/g2plot/lib/plots/chord", "Chord")
  @js.native
  open class Chord protected () extends Plot[ChordOptions] {
    def this(container: String, options: ChordOptions) = this()
    def this(container: HTMLElement, options: ChordOptions) = this()
  }
  /* static members */
  object Chord {
    
    @JSImport("@antv/g2plot/lib/plots/chord", "Chord")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 面积图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialChordOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialChordOptions]
  }
}
