package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for objects representing Script data. */
trait ScriptObject extends StObject {
  
  /** Returns the name of this object’s type. */
  def getTypeName(): String
  
  /** Returns true if the object matches or derives from the passed in type. */
  def isOfType(`type`: String): Boolean
}
object ScriptObject {
  
  inline def apply(getTypeName: CallbackTo[String], isOfType: String => Boolean): ScriptObject = {
    val __obj = js.Dynamic.literal(getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[ScriptObject]
  }
  
  extension [Self <: ScriptObject](x: Self) {
    
    inline def setGetTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getTypeName", value.toJsFn)
    
    inline def setIsOfType(value: String => Boolean): Self = StObject.set(x, "isOfType", js.Any.fromFunction1(value))
  }
}
