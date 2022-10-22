package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ProjectPublicDelegatedPrefix
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PublicDelegatedPrefixQuotaUser
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalPublicDelegatedPrefixesResource extends StObject {
  
  /** Deletes the specified global PublicDelegatedPrefix. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.PublicDelegatedPrefix): Request[Operation] = js.native
  
  /** Returns the specified global PublicDelegatedPrefix resource. */
  def get(): Request[PublicDelegatedPrefix] = js.native
  def get(request: ProjectPublicDelegatedPrefix): Request[PublicDelegatedPrefix] = js.native
  
  /** Creates a global PublicDelegatedPrefix in the specified project using the parameters that are included in the request. */
  def insert(request: KeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def insert(request: Xgafv, body: PublicDelegatedPrefix): Request[Operation] = js.native
  
  /** Lists the global PublicDelegatedPrefixes for a project. */
  def list(): Request[PublicDelegatedPrefixList] = js.native
  def list(request: MaxResults): Request[PublicDelegatedPrefixList] = js.native
  
  /**
    * Patches the specified global PublicDelegatedPrefix resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: PublicDelegatedPrefixQuotaUser): Request[Operation] = js.native
  def patch(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.PublicDelegatedPrefix,
    body: PublicDelegatedPrefix
  ): Request[Operation] = js.native
}
