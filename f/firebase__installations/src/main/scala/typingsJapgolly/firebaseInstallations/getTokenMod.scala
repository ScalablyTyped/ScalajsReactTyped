package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/functions/get-token", JSImport.Namespace)
@js.native
object getTokenMod extends js.Object {
  def getToken(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  def getToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[String] = js.native
}

