package typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTesting.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientTesting.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDetailServiceResource extends StObject {
  
  /** Gets the details of an Android application APK. */
  def getApkDetails(request: Accesstoken): Request[GetApkDetailsResponse] = js.native
  def getApkDetails(request: Alt, body: FileReference): Request[GetApkDetailsResponse] = js.native
}
