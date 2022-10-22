package typingsJapgolly.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def error(param: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(param.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def format(format: Any, param: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(format.asInstanceOf[js.Any]).`++`(param.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def inherits(constructor: Any, superConstructor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inspect(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspect(`object`: Any, options: InspectOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Boolean, depth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Boolean, depth: Double, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Boolean, depth: Unit, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Unit, depth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Unit, depth: Double, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inspect(`object`: Any, showHidden: Unit, depth: Unit, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isArray(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isError(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def log(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def print(param: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(param.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def puts(param: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("puts")(param.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  trait InspectOptions extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var customInspect: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var showHidden: js.UndefOr[Boolean] = js.undefined
  }
  object InspectOptions {
    
    inline def apply(): InspectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectOptions]
    }
    
    extension [Self <: InspectOptions](x: Self) {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      inline def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    }
  }
}
