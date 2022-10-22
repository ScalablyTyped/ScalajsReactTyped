package typingsJapgolly.antvG2plot

import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvG2plot.libTypesPatternMod.DotPatternCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPatternDotMod {
  
  @JSImport("@antv/g2plot/lib/utils/pattern/dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDotPattern(): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("createDotPattern")().asInstanceOf[CanvasPattern]
  inline def createDotPattern(cfg: DotPatternCfg): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("createDotPattern")(cfg.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  object defaultDotPatternCfg {
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.backgroundColor")
    @js.native
    def backgroundColor: String = js.native
    inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.fill")
    @js.native
    def fill: String = js.native
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.fillOpacity")
    @js.native
    def fillOpacity: Double = js.native
    inline def fillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    inline def fill_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.isStagger")
    @js.native
    def isStagger: Boolean = js.native
    inline def isStagger_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isStagger")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.lineWidth")
    @js.native
    def lineWidth: Double = js.native
    inline def lineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.rotation")
    @js.native
    def rotation: Double = js.native
    inline def rotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.size")
    @js.native
    def size: Double = js.native
    inline def size_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/dot", "defaultDotPatternCfg.stroke")
    @js.native
    def stroke: String = js.native
    inline def stroke_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
  }
  
  inline def drawDot(context: CanvasRenderingContext2D, cfg: DotPatternCfg, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawDot")(context.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
