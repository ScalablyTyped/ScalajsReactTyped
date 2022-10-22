package typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSearchconsole.anon.Key
import typingsJapgolly.maximMazurokGapiClientSearchconsole.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileFriendlyTestResource extends StObject {
  
  def run(request: Key, body: RunMobileFriendlyTestRequest): Request[RunMobileFriendlyTestResponse] = js.native
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: PrettyPrint): Request[RunMobileFriendlyTestResponse] = js.native
}
