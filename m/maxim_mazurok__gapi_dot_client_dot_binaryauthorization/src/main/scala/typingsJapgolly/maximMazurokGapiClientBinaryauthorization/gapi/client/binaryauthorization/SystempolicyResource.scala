package typingsJapgolly.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystempolicyResource extends StObject {
  
  /** Gets the current system policy in the specified location. */
  def getPolicy(): Request[Policy] = js.native
  def getPolicy(request: Callback): Request[Policy] = js.native
}
