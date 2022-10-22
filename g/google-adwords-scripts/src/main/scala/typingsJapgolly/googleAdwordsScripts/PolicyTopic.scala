package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyTopic extends StObject {
  
  def getId(): String
  
  def getName(): String
  
  def getType(): String
}
object PolicyTopic {
  
  inline def apply(getId: CallbackTo[String], getName: CallbackTo[String], getType: CallbackTo[String]): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getName = getName.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[PolicyTopic]
  }
  
  extension [Self <: PolicyTopic](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
  }
}
