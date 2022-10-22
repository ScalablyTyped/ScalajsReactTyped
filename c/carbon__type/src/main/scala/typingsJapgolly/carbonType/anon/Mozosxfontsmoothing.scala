package typingsJapgolly.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mozosxfontsmoothing extends StObject {
  
  var `-moz-osx-font-smoothing`: String
  
  var `-webkit-font-smoothing`: String
  
  var fontFamily: String
  
  var fontWeight: Double
  
  var textRendering: String
}
object Mozosxfontsmoothing {
  
  inline def apply(
    `-moz-osx-font-smoothing`: String,
    `-webkit-font-smoothing`: String,
    fontFamily: String,
    fontWeight: Double,
    textRendering: String
  ): Mozosxfontsmoothing = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textRendering = textRendering.asInstanceOf[js.Any])
    __obj.updateDynamic("-moz-osx-font-smoothing")(`-moz-osx-font-smoothing`.asInstanceOf[js.Any])
    __obj.updateDynamic("-webkit-font-smoothing")(`-webkit-font-smoothing`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mozosxfontsmoothing]
  }
  
  extension [Self <: Mozosxfontsmoothing](x: Self) {
    
    inline def `set-moz-osx-font-smoothing`(value: String): Self = StObject.set(x, "-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-font-smoothing`(value: String): Self = StObject.set(x, "-webkit-font-smoothing", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setTextRendering(value: String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
  }
}
