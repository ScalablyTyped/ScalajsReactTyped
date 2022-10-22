package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientBooks.anon.AltAnnotationId
import typingsJapgolly.maximMazurokGapiClientBooks.anon.AnnotationIdCallback
import typingsJapgolly.maximMazurokGapiClientBooks.anon.LayerIds
import typingsJapgolly.maximMazurokGapiClientBooks.anon.ShowOnlySummaryInResponse
import typingsJapgolly.maximMazurokGapiClientBooks.anon.VolumeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsResource extends StObject {
  
  /** Deletes an annotation. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AccesstokenAlt): Request[js.Object] = js.native
  
  def insert(request: AltAnnotationId, body: Annotation): Request[Annotation] = js.native
  /** Inserts a new annotation. */
  def insert(request: ShowOnlySummaryInResponse): Request[Annotation] = js.native
  
  /** Retrieves a list of annotations, possibly filtered. */
  def list(): Request[Annotations] = js.native
  def list(request: LayerIds): Request[Annotations] = js.native
  
  /** Gets the summary of specified layers. */
  def summary(): Request[AnnotationsSummary] = js.native
  def summary(request: VolumeId): Request[AnnotationsSummary] = js.native
  
  def update(request: AccesstokenAlt, body: Annotation): Request[Annotation] = js.native
  /** Updates an existing annotation. */
  def update(request: AnnotationIdCallback): Request[Annotation] = js.native
}
