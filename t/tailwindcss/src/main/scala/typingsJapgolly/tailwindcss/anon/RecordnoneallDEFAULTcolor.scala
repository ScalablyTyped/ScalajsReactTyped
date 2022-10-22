package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'none' | 'all' | 'DEFAULT' | 'colors' | 'opacity' | 'shadow' | 'transform', string> */
trait RecordnoneallDEFAULTcolor extends StObject {
  
  var DEFAULT: String
  
  var all: String
  
  var colors: String
  
  var none: String
  
  var opacity: String
  
  var shadow: String
  
  var transform: String
}
object RecordnoneallDEFAULTcolor {
  
  inline def apply(
    DEFAULT: String,
    all: String,
    colors: String,
    none: String,
    opacity: String,
    shadow: String,
    transform: String
  ): RecordnoneallDEFAULTcolor = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordnoneallDEFAULTcolor]
  }
  
  extension [Self <: RecordnoneallDEFAULTcolor](x: Self) {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setColors(value: String): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
