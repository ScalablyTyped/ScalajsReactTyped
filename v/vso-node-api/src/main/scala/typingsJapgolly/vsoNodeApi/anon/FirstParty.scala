package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstParty extends StObject {
  
  var all: scala.Double
  
  var firstParty: scala.Double
  
  var none: scala.Double
  
  var preview: scala.Double
  
  var `private`: scala.Double
  
  var public: scala.Double
  
  var released: scala.Double
}
object FirstParty {
  
  inline def apply(
    all: scala.Double,
    firstParty: scala.Double,
    none: scala.Double,
    preview: scala.Double,
    `private`: scala.Double,
    public: scala.Double,
    released: scala.Double
  ): FirstParty = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], firstParty = firstParty.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParty]
  }
  
  extension [Self <: FirstParty](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setFirstParty(value: scala.Double): Self = StObject.set(x, "firstParty", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: scala.Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: scala.Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: scala.Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setReleased(value: scala.Double): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
  }
}
