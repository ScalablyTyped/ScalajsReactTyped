package typingsJapgolly.activexInfopath.InfoPath

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilObject extends StObject {
  
  val Date: VarDate
  
  /* private */ @JSName("InfoPath.UtilObject_typekey")
  var InfoPathDotUtilObject_typekey: UtilObject
  
  def Match(bstrValue: String, bstrPattern: String): Boolean
  
  val Math: MathObject
}
object UtilObject {
  
  inline def apply(
    Date: VarDate,
    InfoPathDotUtilObject_typekey: UtilObject,
    Match: (String, String) => Boolean,
    Math: MathObject
  ): UtilObject = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Match = js.Any.fromFunction2(Match), Math = Math.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.UtilObject_typekey")(InfoPathDotUtilObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilObject]
  }
  
  extension [Self <: UtilObject](x: Self) {
    
    inline def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotUtilObject_typekey(value: UtilObject): Self = StObject.set(x, "InfoPath.UtilObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: (String, String) => Boolean): Self = StObject.set(x, "Match", js.Any.fromFunction2(value))
    
    inline def setMath(value: MathObject): Self = StObject.set(x, "Math", value.asInstanceOf[js.Any])
  }
}
