package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorTypesResource extends StObject {
  
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(): Request[AcceleratorTypeAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[AcceleratorTypeAggregatedList] = js.native
  
  /** Returns the specified accelerator type. */
  def get(): Request[AcceleratorType] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.AcceleratorType): Request[AcceleratorType] = js.native
  
  /** Retrieves a list of accelerator types that are available to the specified project. */
  def list(): Request[AcceleratorTypeList] = js.native
  def list(request: Alt): Request[AcceleratorTypeList] = js.native
}
