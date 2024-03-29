package typingsJapgolly.maximMazurokGapiClientScript.gapi.client.script

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientScript.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientScript.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesResource extends StObject {
  
  /** List information about processes made by or on behalf of a user, such as process type and current status. */
  def list(): Request[ListUserProcessesResponse] = js.native
  def list(request: Accesstoken): Request[ListUserProcessesResponse] = js.native
  
  /** List information about a script's executed processes, such as process type and current status. */
  def listScriptProcesses(): Request[ListScriptProcessesResponse] = js.native
  def listScriptProcesses(request: Alt): Request[ListScriptProcessesResponse] = js.native
}
