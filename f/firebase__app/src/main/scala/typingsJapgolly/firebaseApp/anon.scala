package typingsJapgolly.firebaseApp

import typingsJapgolly.firebaseApp.distAppSrcTypesMod.HeartbeatsByUserAgent
import typingsJapgolly.firebaseApp.distAppSrcTypesMod.SingleDateHeartbeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppName extends StObject {
    
    var appName: String
  }
  object AppName {
    
    inline def apply(appName: String): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    extension [Self <: AppName](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeartbeatsToSend extends StObject {
    
    var heartbeatsToSend: js.Array[HeartbeatsByUserAgent]
    
    var unsentEntries: js.Array[SingleDateHeartbeat]
  }
  object HeartbeatsToSend {
    
    inline def apply(heartbeatsToSend: js.Array[HeartbeatsByUserAgent], unsentEntries: js.Array[SingleDateHeartbeat]): HeartbeatsToSend = {
      val __obj = js.Dynamic.literal(heartbeatsToSend = heartbeatsToSend.asInstanceOf[js.Any], unsentEntries = unsentEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeartbeatsToSend]
    }
    
    extension [Self <: HeartbeatsToSend](x: Self) {
      
      inline def setHeartbeatsToSend(value: js.Array[HeartbeatsByUserAgent]): Self = StObject.set(x, "heartbeatsToSend", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatsToSendVarargs(value: HeartbeatsByUserAgent*): Self = StObject.set(x, "heartbeatsToSend", js.Array(value*))
      
      inline def setUnsentEntries(value: js.Array[SingleDateHeartbeat]): Self = StObject.set(x, "unsentEntries", value.asInstanceOf[js.Any])
      
      inline def setUnsentEntriesVarargs(value: SingleDateHeartbeat*): Self = StObject.set(x, "unsentEntries", js.Array(value*))
    }
  }
  
  trait OriginalErrorMessage extends StObject {
    
    var originalErrorMessage: js.UndefOr[String] = js.undefined
  }
  object OriginalErrorMessage {
    
    inline def apply(): OriginalErrorMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginalErrorMessage]
    }
    
    extension [Self <: OriginalErrorMessage](x: Self) {
      
      inline def setOriginalErrorMessage(value: String): Self = StObject.set(x, "originalErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setOriginalErrorMessageUndefined: Self = StObject.set(x, "originalErrorMessage", js.undefined)
    }
  }
  
  /* Inlined std.Required<@firebase/app.@firebase/app/dist/esm/app/src/public-types.FirebaseAppSettings> */
  trait RequiredFirebaseAppSettin extends StObject {
    
    var automaticDataCollectionEnabled: Boolean
    
    var name: String
  }
  object RequiredFirebaseAppSettin {
    
    inline def apply(automaticDataCollectionEnabled: Boolean, name: String): RequiredFirebaseAppSettin = {
      val __obj = js.Dynamic.literal(automaticDataCollectionEnabled = automaticDataCollectionEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredFirebaseAppSettin]
    }
    
    extension [Self <: RequiredFirebaseAppSettin](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsentEntries extends StObject {
    
    var heartbeatsToSend: js.Array[typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatsByUserAgent]
    
    var unsentEntries: js.Array[typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.SingleDateHeartbeat]
  }
  object UnsentEntries {
    
    inline def apply(
      heartbeatsToSend: js.Array[typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatsByUserAgent],
      unsentEntries: js.Array[typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.SingleDateHeartbeat]
    ): UnsentEntries = {
      val __obj = js.Dynamic.literal(heartbeatsToSend = heartbeatsToSend.asInstanceOf[js.Any], unsentEntries = unsentEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsentEntries]
    }
    
    extension [Self <: UnsentEntries](x: Self) {
      
      inline def setHeartbeatsToSend(value: js.Array[typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatsByUserAgent]): Self = StObject.set(x, "heartbeatsToSend", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatsToSendVarargs(value: typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatsByUserAgent*): Self = StObject.set(x, "heartbeatsToSend", js.Array(value*))
      
      inline def setUnsentEntries(value: js.Array[typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.SingleDateHeartbeat]): Self = StObject.set(x, "unsentEntries", value.asInstanceOf[js.Any])
      
      inline def setUnsentEntriesVarargs(value: typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.SingleDateHeartbeat*): Self = StObject.set(x, "unsentEntries", js.Array(value*))
    }
  }
}
