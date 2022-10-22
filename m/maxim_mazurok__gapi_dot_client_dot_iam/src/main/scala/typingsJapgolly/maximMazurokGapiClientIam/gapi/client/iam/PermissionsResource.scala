package typingsJapgolly.maximMazurokGapiClientIam.gapi.client.iam

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientIam.anon.Alt
import typingsJapgolly.maximMazurokGapiClientIam.anon.KeyOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionsResource extends StObject {
  
  def queryTestablePermissions(request: Alt, body: QueryTestablePermissionsRequest): Request[QueryTestablePermissionsResponse] = js.native
  /** Lists every permission that you can test on a resource. A permission is testable if you can check whether a principal has that permission on the resource. */
  def queryTestablePermissions(request: KeyOauthtoken): Request[QueryTestablePermissionsResponse] = js.native
}
