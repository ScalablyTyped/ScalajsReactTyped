package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.FileId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ReportId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Scope
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends StObject {
  
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(): Request[File] = js.native
  def get(request: FileId): Request[File] = js.native
  def get(request: ReportId): Request[File] = js.native
  
  /** Lists files for a user profile. */
  def list(): Request[FileList] = js.native
  def list(request: Scope): Request[FileList] = js.native
  def list(request: SortOrder): Request[FileList] = js.native
}
