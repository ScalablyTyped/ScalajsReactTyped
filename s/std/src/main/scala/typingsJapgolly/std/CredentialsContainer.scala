package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsContainer extends js.Object {
  def create(): js.Promise[Credential | Null] = js.native
  def create(options: CredentialCreationOptions): js.Promise[Credential | Null] = js.native
  def get(): js.Promise[Credential | Null] = js.native
  def get(options: CredentialRequestOptions): js.Promise[Credential | Null] = js.native
  def preventSilentAccess(): js.Promise[Unit] = js.native
  def store(credential: Credential): js.Promise[Credential] = js.native
}

@JSGlobal("CredentialsContainer")
@js.native
object CredentialsContainer extends Instantiable0[CredentialsContainer]

