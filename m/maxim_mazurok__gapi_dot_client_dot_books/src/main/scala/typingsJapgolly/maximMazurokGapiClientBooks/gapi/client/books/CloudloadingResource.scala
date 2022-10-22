package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Drivedocumentid
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Resource
import typingsJapgolly.maximMazurokGapiClientBooks.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudloadingResource extends StObject {
  
  /** Add a user-upload volume and triggers processing. */
  def addBook(): Request[BooksCloudloadingResource] = js.native
  def addBook(request: Drivedocumentid): Request[BooksCloudloadingResource] = js.native
  
  /** Remove the book and its contents */
  def deleteBook(): Request[js.Object] = js.native
  def deleteBook(request: UploadType): Request[js.Object] = js.native
  
  /** Updates a user-upload volume. */
  def updateBook(request: Resource): Request[BooksCloudloadingResource] = js.native
  def updateBook(request: Uploadprotocol, body: BooksCloudloadingResource): Request[BooksCloudloadingResource] = js.native
}
