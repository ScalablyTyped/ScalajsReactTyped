package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Resource class.
  */
trait ASPxClientResource extends StObject {
  
  /**
    * Returns the resource's caption.
    */
  def GetCaption(): String
  
  /**
    * Gets the resource's color.
    */
  def GetColor(): String
  
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String
  
  /**
    * Returns the resource's caption.
    */
  var caption: String
  
  /**
    * Gets the resource's color.
    */
  var color: String
  
  /**
    * Gets the resource ID.
    */
  var resourceId: String
}
object ASPxClientResource {
  
  inline def apply(
    GetCaption: CallbackTo[String],
    GetColor: CallbackTo[String],
    GetId: CallbackTo[String],
    caption: String,
    color: String,
    resourceId: String
  ): ASPxClientResource = {
    val __obj = js.Dynamic.literal(GetCaption = GetCaption.toJsFn, GetColor = GetColor.toJsFn, GetId = GetId.toJsFn, caption = caption.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientResource]
  }
  
  extension [Self <: ASPxClientResource](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setGetCaption(value: CallbackTo[String]): Self = StObject.set(x, "GetCaption", value.toJsFn)
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "GetColor", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "GetId", value.toJsFn)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
