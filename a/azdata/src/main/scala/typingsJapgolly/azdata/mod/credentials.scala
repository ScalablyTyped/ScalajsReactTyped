package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "credentials")
@js.native
object credentials extends js.Object {
  def getProvider(namespaceId: String): Thenable[CredentialProvider] = js.native
  def registerProvider(provider: CredentialProvider): Disposable = js.native
}

