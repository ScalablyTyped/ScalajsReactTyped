package typingsJapgolly.firebaseApp

import typingsJapgolly.firebaseApp.distAppSrcPublicTypesMod.FirebaseApp
import typingsJapgolly.firebaseApp.distAppSrcTypesMod.HeartbeatService
import typingsJapgolly.firebaseApp.distAppSrcTypesMod.PlatformLoggerService
import typingsJapgolly.firebaseApp.distAppSrcTypesMod.VersionService
import typingsJapgolly.firebaseApp.distAppTestUtilMod.TestService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  trait NameServiceMapping extends StObject {
    
    var app: FirebaseApp & typingsJapgolly.firebaseApp.distEsmAppSrcPublicTypesMod.FirebaseApp
    
    var `app-version`: VersionService
    
    var heartbeat: HeartbeatService & typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatService
    
    var `platform-logger`: PlatformLoggerService
    
    var test: TestService
    
    var `test-shell`: Unit
    
    var vs1: VersionService
    
    var vs2: VersionService
  }
  object NameServiceMapping {
    
    inline def apply(
      app: FirebaseApp & typingsJapgolly.firebaseApp.distEsmAppSrcPublicTypesMod.FirebaseApp,
      `app-version`: VersionService,
      heartbeat: HeartbeatService & typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatService,
      `platform-logger`: PlatformLoggerService,
      test: TestService,
      `test-shell`: Unit,
      vs1: VersionService,
      vs2: VersionService
    ): NameServiceMapping = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], vs1 = vs1.asInstanceOf[js.Any], vs2 = vs2.asInstanceOf[js.Any])
      __obj.updateDynamic("app-version")(`app-version`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-logger")(`platform-logger`.asInstanceOf[js.Any])
      __obj.updateDynamic("test-shell")(`test-shell`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    extension [Self <: NameServiceMapping](x: Self) {
      
      inline def setApp(value: FirebaseApp & typingsJapgolly.firebaseApp.distEsmAppSrcPublicTypesMod.FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def `setApp-version`(value: VersionService): Self = StObject.set(x, "app-version", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat(value: HeartbeatService & typingsJapgolly.firebaseApp.distEsmAppSrcTypesMod.HeartbeatService): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      inline def `setPlatform-logger`(value: PlatformLoggerService): Self = StObject.set(x, "platform-logger", value.asInstanceOf[js.Any])
      
      inline def setTest(value: TestService): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def `setTest-shell`(value: Unit): Self = StObject.set(x, "test-shell", value.asInstanceOf[js.Any])
      
      inline def setVs1(value: VersionService): Self = StObject.set(x, "vs1", value.asInstanceOf[js.Any])
      
      inline def setVs2(value: VersionService): Self = StObject.set(x, "vs2", value.asInstanceOf[js.Any])
    }
  }
}
