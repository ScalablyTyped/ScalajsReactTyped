package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangelogsResource extends StObject {
  
  /** Retrieves the specified Changelog. */
  def get(): Request[GoogleCloudDialogflowCxV3Changelog] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Changelog] = js.native
  
  /** Returns the list of Changelogs. */
  def list(): Request[GoogleCloudDialogflowCxV3ListChangelogsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudDialogflowCxV3ListChangelogsResponse] = js.native
}
