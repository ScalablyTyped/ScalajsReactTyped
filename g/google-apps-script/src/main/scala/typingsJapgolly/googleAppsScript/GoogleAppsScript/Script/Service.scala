package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and manipulate script publishing.
  */
trait Service extends StObject {
  
  /** @deprecated DO NOT USE */ def disable(): Unit
  
  def getUrl(): String
  
  def isEnabled(): Boolean
}
object Service {
  
  inline def apply(disable: Callback, getUrl: CallbackTo[String], isEnabled: CallbackTo[Boolean]): Service = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, getUrl = getUrl.toJsFn, isEnabled = isEnabled.toJsFn)
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
  }
}
