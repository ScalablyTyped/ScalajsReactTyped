package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATSArray extends StObject {
  
  var ATS: js.Array[String]
}
object ATSArray {
  
  inline def apply(ATS: js.Array[String]): ATSArray = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATSArray]
  }
  
  extension [Self <: ATSArray](x: Self) {
    
    inline def setATS(value: js.Array[String]): Self = StObject.set(x, "ATS", value.asInstanceOf[js.Any])
    
    inline def setATSVarargs(value: String*): Self = StObject.set(x, "ATS", js.Array(value*))
  }
}
