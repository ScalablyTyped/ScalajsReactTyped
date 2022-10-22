package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "CommentsApi")
@js.native
open class CommentsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createEnvelopeComments(accountId: String, envelopeId: String): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CommentHistoryResult] = js.native
  
  def getCommentsTranscript(accountId: String, envelopeId: String): js.Promise[js.Object] = js.native
  def getCommentsTranscript(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[js.Object] = js.native
  def getCommentsTranscript(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
  def getCommentsTranscript(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
}
