package typingsJapgolly.firebaseFunctions

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseApp.mod.FirebaseOptions
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseFunctions.distEsmNodeSrcServiceMod.FunctionsService
import typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`app-check-internal`
import typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`auth-internal`
import typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`messaging-internal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmNodeTestUtilsMod {
  
  @JSImport("@firebase/functions/dist/esm-node/test/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTestService(app: FirebaseApp): FunctionsService = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any]).asInstanceOf[FunctionsService]
  inline def createTestService(app: FirebaseApp, region: String): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: String,
    authProvider: Unit,
    messagingProvider: Provider[`messaging-internal`],
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Unit,
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[`messaging-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[`messaging-internal`],
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: Unit,
    authProvider: Unit,
    messagingProvider: Provider[`messaging-internal`],
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: Unit,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Unit,
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: Unit,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[`messaging-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService(
    app: FirebaseApp,
    region: Unit,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[`messaging-internal`],
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  
  inline def createTestService_appcheckinternal(
    app: FirebaseApp,
    region: String,
    authProvider: Unit,
    messagingProvider: Unit,
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService_appcheckinternal(
    app: FirebaseApp,
    region: Unit,
    authProvider: Unit,
    messagingProvider: Unit,
    appCheckProvider: Provider[`app-check-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  
  inline def createTestService_authinternal(app: FirebaseApp, region: String, authProvider: Provider[`auth-internal`]): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService_authinternal(app: FirebaseApp, region: Unit, authProvider: Provider[`auth-internal`]): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  
  inline def createTestService_messaginginternal(
    app: FirebaseApp,
    region: String,
    authProvider: Unit,
    messagingProvider: Provider[`messaging-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  inline def createTestService_messaginginternal(
    app: FirebaseApp,
    region: Unit,
    authProvider: Unit,
    messagingProvider: Provider[`messaging-internal`]
  ): FunctionsService = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], region.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[FunctionsService]
  
  inline def makeFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")().asInstanceOf[FirebaseApp]
  inline def makeFakeApp(options: FirebaseOptions): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
}
