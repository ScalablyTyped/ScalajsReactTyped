package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libGrammarMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreDialogsDialogStateMod {
  
  trait DialogState extends StObject {
    
    var callId: String
    
    var early: Boolean
    
    var id: String
    
    var localSequenceNumber: js.UndefOr[Double] = js.undefined
    
    var localTag: String
    
    var localURI: URI
    
    var remoteSequenceNumber: js.UndefOr[Double] = js.undefined
    
    var remoteTag: String
    
    var remoteTarget: URI
    
    var remoteURI: URI
    
    var routeSet: js.Array[String]
    
    var secure: Boolean
  }
  object DialogState {
    
    inline def apply(
      callId: String,
      early: Boolean,
      id: String,
      localTag: String,
      localURI: URI,
      remoteTag: String,
      remoteTarget: URI,
      remoteURI: URI,
      routeSet: js.Array[String],
      secure: Boolean
    ): DialogState = {
      val __obj = js.Dynamic.literal(callId = callId.asInstanceOf[js.Any], early = early.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localTag = localTag.asInstanceOf[js.Any], localURI = localURI.asInstanceOf[js.Any], remoteTag = remoteTag.asInstanceOf[js.Any], remoteTarget = remoteTarget.asInstanceOf[js.Any], remoteURI = remoteURI.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogState]
    }
    
    extension [Self <: DialogState](x: Self) {
      
      inline def setCallId(value: String): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
      
      inline def setEarly(value: Boolean): Self = StObject.set(x, "early", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalSequenceNumber(value: Double): Self = StObject.set(x, "localSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setLocalSequenceNumberUndefined: Self = StObject.set(x, "localSequenceNumber", js.undefined)
      
      inline def setLocalTag(value: String): Self = StObject.set(x, "localTag", value.asInstanceOf[js.Any])
      
      inline def setLocalURI(value: URI): Self = StObject.set(x, "localURI", value.asInstanceOf[js.Any])
      
      inline def setRemoteSequenceNumber(value: Double): Self = StObject.set(x, "remoteSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setRemoteSequenceNumberUndefined: Self = StObject.set(x, "remoteSequenceNumber", js.undefined)
      
      inline def setRemoteTag(value: String): Self = StObject.set(x, "remoteTag", value.asInstanceOf[js.Any])
      
      inline def setRemoteTarget(value: URI): Self = StObject.set(x, "remoteTarget", value.asInstanceOf[js.Any])
      
      inline def setRemoteURI(value: URI): Self = StObject.set(x, "remoteURI", value.asInstanceOf[js.Any])
      
      inline def setRouteSet(value: js.Array[String]): Self = StObject.set(x, "routeSet", value.asInstanceOf[js.Any])
      
      inline def setRouteSetVarargs(value: String*): Self = StObject.set(x, "routeSet", js.Array(value*))
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
}
