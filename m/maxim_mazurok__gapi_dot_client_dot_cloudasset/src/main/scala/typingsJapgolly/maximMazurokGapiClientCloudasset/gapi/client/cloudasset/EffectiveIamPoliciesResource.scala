package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudasset.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectiveIamPoliciesResource extends StObject {
  
  /** Gets effective IAM policies for a batch of resources. */
  def batchGet(): Request[BatchGetEffectiveIamPoliciesResponse] = js.native
  def batchGet(request: Alt): Request[BatchGetEffectiveIamPoliciesResponse] = js.native
}
