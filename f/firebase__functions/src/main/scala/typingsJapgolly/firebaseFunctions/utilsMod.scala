package typingsJapgolly.firebaseFunctions

import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`auth-internal`
import typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.messaging
import typingsJapgolly.firebaseFunctions.mod.FirebaseApp
import typingsJapgolly.firebaseFunctions.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/functions/dist/test/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def createTestService(app: FirebaseApp): Service = js.native
  def createTestService(app: FirebaseApp, region: String): Service = js.native
  def createTestService(
    app: FirebaseApp,
    region: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSName("createTestService")
  def createTestService_authinternal(app: FirebaseApp, region: String, authProvider: Provider[`auth-internal`]): Service = js.native
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = js.native
}

