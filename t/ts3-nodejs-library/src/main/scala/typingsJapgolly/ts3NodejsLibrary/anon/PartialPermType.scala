package typingsJapgolly.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/util/Permission.Permission.PermType> */
trait PartialPermType extends StObject {
  
  var permname: js.UndefOr[String | Double] = js.undefined
  
  var permnegated: js.UndefOr[Boolean] = js.undefined
  
  var permskip: js.UndefOr[Boolean] = js.undefined
  
  var permvalue: js.UndefOr[Double] = js.undefined
}
object PartialPermType {
  
  inline def apply(): PartialPermType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPermType]
  }
  
  extension [Self <: PartialPermType](x: Self) {
    
    inline def setPermname(value: String | Double): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
    
    inline def setPermnameUndefined: Self = StObject.set(x, "permname", js.undefined)
    
    inline def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
    
    inline def setPermnegatedUndefined: Self = StObject.set(x, "permnegated", js.undefined)
    
    inline def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
    
    inline def setPermskipUndefined: Self = StObject.set(x, "permskip", js.undefined)
    
    inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
    
    inline def setPermvalueUndefined: Self = StObject.set(x, "permvalue", js.undefined)
  }
}
