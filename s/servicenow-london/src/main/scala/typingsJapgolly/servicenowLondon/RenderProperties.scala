package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProperties extends StObject {
  
  def getEncodedQuery(): String
  
  def getListControl(): Any
  
  def getParameterValue(value: String): String
  
  def getParameters(): js.Array[String]
  
  def getReferringURL(): String
  
  def getViewName(): String
  
  def getWindowProperties(): Any
  
  def isInDevStudio(): Boolean
  
  def isInteractive(): Boolean
  
  def isManyToMany(): Boolean
  
  def isRelatedList(): Boolean
}
object RenderProperties {
  
  inline def apply(
    getEncodedQuery: CallbackTo[String],
    getListControl: CallbackTo[Any],
    getParameterValue: String => String,
    getParameters: CallbackTo[js.Array[String]],
    getReferringURL: CallbackTo[String],
    getViewName: CallbackTo[String],
    getWindowProperties: CallbackTo[Any],
    isInDevStudio: CallbackTo[Boolean],
    isInteractive: CallbackTo[Boolean],
    isManyToMany: CallbackTo[Boolean],
    isRelatedList: CallbackTo[Boolean]
  ): RenderProperties = {
    val __obj = js.Dynamic.literal(getEncodedQuery = getEncodedQuery.toJsFn, getListControl = getListControl.toJsFn, getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = getParameters.toJsFn, getReferringURL = getReferringURL.toJsFn, getViewName = getViewName.toJsFn, getWindowProperties = getWindowProperties.toJsFn, isInDevStudio = isInDevStudio.toJsFn, isInteractive = isInteractive.toJsFn, isManyToMany = isManyToMany.toJsFn, isRelatedList = isRelatedList.toJsFn)
    __obj.asInstanceOf[RenderProperties]
  }
  
  extension [Self <: RenderProperties](x: Self) {
    
    inline def setGetEncodedQuery(value: CallbackTo[String]): Self = StObject.set(x, "getEncodedQuery", value.toJsFn)
    
    inline def setGetListControl(value: CallbackTo[Any]): Self = StObject.set(x, "getListControl", value.toJsFn)
    
    inline def setGetParameterValue(value: String => String): Self = StObject.set(x, "getParameterValue", js.Any.fromFunction1(value))
    
    inline def setGetParameters(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetReferringURL(value: CallbackTo[String]): Self = StObject.set(x, "getReferringURL", value.toJsFn)
    
    inline def setGetViewName(value: CallbackTo[String]): Self = StObject.set(x, "getViewName", value.toJsFn)
    
    inline def setGetWindowProperties(value: CallbackTo[Any]): Self = StObject.set(x, "getWindowProperties", value.toJsFn)
    
    inline def setIsInDevStudio(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInDevStudio", value.toJsFn)
    
    inline def setIsInteractive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInteractive", value.toJsFn)
    
    inline def setIsManyToMany(value: CallbackTo[Boolean]): Self = StObject.set(x, "isManyToMany", value.toJsFn)
    
    inline def setIsRelatedList(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRelatedList", value.toJsFn)
  }
}
