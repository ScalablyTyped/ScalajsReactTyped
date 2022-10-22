package typingsJapgolly.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudtrace.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCloudtrace.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpansResource extends StObject {
  
  /** Creates a new span. */
  def createSpan(request: Accesstoken): Request[Span] = js.native
  def createSpan(request: Alt, body: Span): Request[Span] = js.native
}
