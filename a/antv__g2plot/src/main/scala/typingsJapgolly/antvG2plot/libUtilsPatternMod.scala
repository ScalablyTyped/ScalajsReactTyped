package typingsJapgolly.antvG2plot

import org.scalajs.dom.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPatternMod {
  
  @JSImport("@antv/g2plot/lib/utils/pattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCanvasPattern(options: PatternOption): js.UndefOr[CanvasPattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasPattern")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CanvasPattern]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvG2plot.anon.Cfg
    - typingsJapgolly.antvG2plot.anon.CfgType
    - typingsJapgolly.antvG2plot.anon.`7`
  */
  trait PatternOption extends StObject
  object PatternOption {
    
    inline def `7`(): typingsJapgolly.antvG2plot.anon.`7` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("square")
      __obj.asInstanceOf[typingsJapgolly.antvG2plot.anon.`7`]
    }
    
    inline def Cfg(): typingsJapgolly.antvG2plot.anon.Cfg = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("dot")
      __obj.asInstanceOf[typingsJapgolly.antvG2plot.anon.Cfg]
    }
    
    inline def CfgType(): typingsJapgolly.antvG2plot.anon.CfgType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[typingsJapgolly.antvG2plot.anon.CfgType]
    }
  }
}
