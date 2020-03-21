package typingsJapgolly.evernote.mod

import typingsJapgolly.evernote.AnonChina
import typingsJapgolly.evernote.mod.Types.LinkedNotebook
import typingsJapgolly.oauth.mod.OAuth
import typingsJapgolly.oauth.mod.oauth1tokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Client")
@js.native
class Client protected () extends js.Object {
  def this(config: AnonChina) = this()
  def getAccessToken(oauthToken: String, oauthTokenSecret: String, oauthVerifier: String, callback: oauth1tokenCallback): Unit = js.native
  def getAuthorizeUrl(oauthToken: String): String = js.native
  def getBusinessNoteStore(): NoteStoreClient = js.native
  def getEndpoint(path: String): String = js.native
  def getNoteStore(): NoteStoreClient = js.native
  def getNoteStore(noteStoreUrl: String): NoteStoreClient = js.native
  def getOAuthClient(callbackUrl: String): OAuth = js.native
  def getRequestToken(callbackUrl: String, callback: oauth1tokenCallback): Unit = js.native
  def getSharedNoteStore(linkedNotebook: LinkedNotebook): NoteStoreClient = js.native
  def getUserStore(): UserStoreClient = js.native
}

