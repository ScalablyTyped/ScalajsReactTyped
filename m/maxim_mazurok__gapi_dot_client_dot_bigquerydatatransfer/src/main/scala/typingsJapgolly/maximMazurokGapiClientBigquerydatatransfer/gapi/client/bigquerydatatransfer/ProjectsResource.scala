package typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.anon.Alt
import typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var dataSources: DataSourcesResource = js.native
  
  def enrollDataSources(request: Alt, body: EnrollDataSourcesRequest): Request[js.Object] = js.native
  /**
    * Enroll data sources in a user project. This allows users to create transfer configurations for these data sources. They will also appear in the ListDataSources RPC and as such, will
    * appear in the [BigQuery UI](https://console.cloud.google.com/bigquery), and the documents can be found in the public guide for [BigQuery Web
    * UI](https://cloud.google.com/bigquery/bigquery-web-ui) and [Data Transfer Service](https://cloud.google.com/bigquery/docs/working-with-transfers).
    */
  def enrollDataSources(request: UploadType): Request[js.Object] = js.native
  
  var locations: LocationsResource = js.native
  
  var transferConfigs: TransferConfigsResource = js.native
}
