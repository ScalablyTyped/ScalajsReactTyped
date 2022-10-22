package typingsJapgolly.maximMazurokGapiClientTpu.gapi.client.tpu

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorTypesResource extends StObject {
  
  /** Gets AcceleratorType. */
  def get(): Request[AcceleratorType] = js.native
  def get(request: Accesstoken): Request[AcceleratorType] = js.native
  
  /** Lists accelerator types supported by this API. */
  def list(): Request[ListAcceleratorTypesResponse] = js.native
  def list(request: Alt): Request[ListAcceleratorTypesResponse] = js.native
}
