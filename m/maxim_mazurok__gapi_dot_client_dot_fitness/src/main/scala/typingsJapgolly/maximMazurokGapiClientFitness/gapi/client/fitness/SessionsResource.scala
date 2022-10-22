package typingsJapgolly.maximMazurokGapiClientFitness.gapi.client.fitness

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFitness.anon.ActivityType
import typingsJapgolly.maximMazurokGapiClientFitness.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientFitness.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionsResource extends StObject {
  
  /** Deletes a session specified by the given session ID. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Lists sessions previously created. */
  def list(): Request[ListSessionsResponse] = js.native
  def list(request: ActivityType): Request[ListSessionsResponse] = js.native
  
  def update(request: QuotaUser, body: Session): Request[Session] = js.native
  /** Updates or insert a given session. */
  def update(request: Resource): Request[Session] = js.native
}
