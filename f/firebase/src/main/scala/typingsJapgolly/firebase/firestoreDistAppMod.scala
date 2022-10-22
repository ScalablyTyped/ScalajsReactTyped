package typingsJapgolly.firebase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseApp.mod.FirebaseAppSettings
import typingsJapgolly.firebaseApp.mod.FirebaseOptions
import typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogCallback
import typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevelString
import typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreDistAppMod {
  
  @JSImport("firebase/firestore/dist/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/firestore/dist/app", "FirebaseError")
  @js.native
  open class FirebaseError protected ()
    extends typingsJapgolly.firebaseApp.mod.FirebaseError {
    def this(/** The error code for this error. */
    code: String, message: String) = this()
    def this(
      /** The error code for this error. */
    code: String,
      message: String,
      /** Custom data for this error. */
    customData: Record[String, Any]
    ) = this()
  }
  
  @JSImport("firebase/firestore/dist/app", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  inline def deleteApp(app: FirebaseApp): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteApp")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[FirebaseApp]
  inline def getApp(name: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")(name.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def getApps(): js.Array[FirebaseApp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApps")().asInstanceOf[js.Array[FirebaseApp]]
  
  inline def initializeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions, config: FirebaseAppSettings): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions, name: String): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  
  inline def onLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")().asInstanceOf[Unit]
  inline def onLog(logCallback: Null, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onLog(logCallback: LogCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onLog(logCallback: LogCallback, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerVersion(libraryKeyOrName: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(libraryKeyOrName.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerVersion(libraryKeyOrName: String, version: String, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(libraryKeyOrName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
