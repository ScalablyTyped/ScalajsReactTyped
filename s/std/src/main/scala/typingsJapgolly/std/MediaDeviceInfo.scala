package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MediaDevicesInfo interface contains information that describes a single media input or output device.
  * Available only in secure contexts.
  */
trait MediaDeviceInfo extends StObject {
  
  /* standard dom */
  val deviceId: java.lang.String
  
  /* standard dom */
  val groupId: java.lang.String
  
  /* standard dom */
  val kind: org.scalajs.dom.MediaDeviceKind
  
  /* standard dom */
  val label: java.lang.String
  
  /* standard dom */
  def toJSON(): Any
}
object MediaDeviceInfo {
  
  inline def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: org.scalajs.dom.MediaDeviceKind,
    label: java.lang.String,
    toJSON: CallbackTo[Any]
  ): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[MediaDeviceInfo]
  }
  
  extension [Self <: MediaDeviceInfo](x: Self) {
    
    inline def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: org.scalajs.dom.MediaDeviceKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
