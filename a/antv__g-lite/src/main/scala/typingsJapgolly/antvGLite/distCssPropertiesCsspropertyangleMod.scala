package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Call
import typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssPropertiesCsspropertyangleMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSUnitValue, number>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyAngle", "CSSPropertyAngle")
  @js.native
  open class CSSPropertyAngle () extends StObject {
    
    def calculator(name: String, oldParsed: CSSUnitValue, parsed: CSSUnitValue, `object`: DisplayObject[Any, Any]): Double = js.native
    
    def mixer(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]] = js.native
    @JSName("mixer")
    var mixer_Original: js.Function2[
        /* left */ Double, 
        /* right */ Double, 
        js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]]
      ] = js.native
    
    def parser(args: Any*): Any = js.native
    @JSName("parser")
    var parser_Original: Call = js.native
  }
}
