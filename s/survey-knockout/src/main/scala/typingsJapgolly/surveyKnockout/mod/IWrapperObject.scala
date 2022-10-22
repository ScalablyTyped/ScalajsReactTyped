package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWrapperObject extends StObject {
  
  def getClassNameProperty(): String
  
  def getOriginalObj(): Base
}
object IWrapperObject {
  
  inline def apply(getClassNameProperty: CallbackTo[String], getOriginalObj: CallbackTo[Base]): IWrapperObject = {
    val __obj = js.Dynamic.literal(getClassNameProperty = getClassNameProperty.toJsFn, getOriginalObj = getOriginalObj.toJsFn)
    __obj.asInstanceOf[IWrapperObject]
  }
  
  extension [Self <: IWrapperObject](x: Self) {
    
    inline def setGetClassNameProperty(value: CallbackTo[String]): Self = StObject.set(x, "getClassNameProperty", value.toJsFn)
    
    inline def setGetOriginalObj(value: CallbackTo[Base]): Self = StObject.set(x, "getOriginalObj", value.toJsFn)
  }
}
