package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import typingsJapgolly.maximMazurokGapiClientDocs.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDocs.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDocs.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDocs.anon.DocumentId
import typingsJapgolly.maximMazurokGapiClientDocs.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentsResource extends StObject {
  
  /**
    * Applies one or more updates to the document. Each request is validated before being applied. If any request is not valid, then the entire request will fail and nothing will be
    * applied. Some requests have replies to give you some information about how they are applied. Other requests do not need to return information; these each return an empty reply. The
    * order of replies matches that of the requests. For example, suppose you call batchUpdate with four updates, and only the third one returns information. The response would have two
    * empty replies, the reply to the third request, and another empty reply, in that order. Because other users may be editing the document, the document might not exactly reflect your
    * changes: your changes may be altered with respect to collaborator changes. If there are no collaborators, the document should reflect your changes. In any case, the updates in your
    * request are guaranteed to be applied together atomically.
    */
  def batchUpdate(request: Accesstoken): typingsJapgolly.gapiClient.gapi.client.Request[BatchUpdateDocumentResponse] = js.native
  def batchUpdate(request: Alt, body: BatchUpdateDocumentRequest): typingsJapgolly.gapiClient.gapi.client.Request[BatchUpdateDocumentResponse] = js.native
  
  /** Creates a blank document using the title given in the request. Other fields in the request, including any provided content, are ignored. Returns the created document. */
  def create(request: Callback): typingsJapgolly.gapiClient.gapi.client.Request[Document] = js.native
  def create(request: Fields, body: Document): typingsJapgolly.gapiClient.gapi.client.Request[Document] = js.native
  
  /** Gets the latest version of the specified document. */
  def get(): typingsJapgolly.gapiClient.gapi.client.Request[Document] = js.native
  def get(request: DocumentId): typingsJapgolly.gapiClient.gapi.client.Request[Document] = js.native
}
