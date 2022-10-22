package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialWordCloudOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsWordCloudTypesMod.WordCloudOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWordCloudMod {
  
  @JSImport("@antv/g2plot/lib/plots/word-cloud", "WordCloud")
  @js.native
  open class WordCloud protected () extends Plot[WordCloudOptions] {
    def this(container: String, options: WordCloudOptions) = this()
    def this(container: HTMLElement, options: WordCloudOptions) = this()
  }
  /* static members */
  object WordCloud {
    
    @JSImport("@antv/g2plot/lib/plots/word-cloud", "WordCloud")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 词云图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialWordCloudOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialWordCloudOptions]
  }
}
