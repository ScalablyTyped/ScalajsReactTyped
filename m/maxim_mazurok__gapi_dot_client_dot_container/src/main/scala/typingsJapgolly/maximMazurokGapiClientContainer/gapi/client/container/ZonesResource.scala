package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContainer.anon.QuotaUserUploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZonesResource extends StObject {
  
  var clusters: ClustersResource = js.native
  
  /** Returns configuration info about the Google Kubernetes Engine service. */
  def getServerconfig(): Request[ServerConfig] = js.native
  def getServerconfig(request: QuotaUserUploadTypeUploadprotocol): Request[ServerConfig] = js.native
  
  var operations: OperationsResource = js.native
}
