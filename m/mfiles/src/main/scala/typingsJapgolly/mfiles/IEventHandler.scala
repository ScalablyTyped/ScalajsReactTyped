package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFEventHandlerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventHandler extends StObject {
  
  var Active: Boolean
  
  def Clone(): IEventHandler
  
  var Description: String
  
  var EventType: MFEventHandlerType
  
  val GUID: String
  
  def GetID(): Double
  
  var VBScript: String
}
object IEventHandler {
  
  inline def apply(
    Active: Boolean,
    Clone: CallbackTo[IEventHandler],
    Description: String,
    EventType: MFEventHandlerType,
    GUID: String,
    GetID: CallbackTo[Double],
    VBScript: String
  ): IEventHandler = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Clone = Clone.toJsFn, Description = Description.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], GetID = GetID.toJsFn, VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventHandler]
  }
  
  extension [Self <: IEventHandler](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IEventHandler]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: MFEventHandlerType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    inline def setGetID(value: CallbackTo[Double]): Self = StObject.set(x, "GetID", value.toJsFn)
    
    inline def setVBScript(value: String): Self = StObject.set(x, "VBScript", value.asInstanceOf[js.Any])
  }
}
