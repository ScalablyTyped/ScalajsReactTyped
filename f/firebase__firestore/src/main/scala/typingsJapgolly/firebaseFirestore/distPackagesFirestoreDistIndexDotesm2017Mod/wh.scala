package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait wh
  extends StObject
     with sh {
  
  def _toFieldTransform(t: Any): xn
  
  def isEqual(t: Any): Boolean
}
object wh {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => xn, isEqual: Any => Boolean): wh = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[wh]
  }
  
  extension [Self <: wh](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => xn): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
