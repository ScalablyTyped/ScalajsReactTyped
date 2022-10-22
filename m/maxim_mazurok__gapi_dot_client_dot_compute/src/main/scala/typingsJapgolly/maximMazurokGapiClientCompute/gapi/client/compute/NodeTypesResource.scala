package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTypesResource extends StObject {
  
  /** Retrieves an aggregated list of node types. */
  def aggregatedList(): Request[NodeTypeAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[NodeTypeAggregatedList] = js.native
  
  /** Returns the specified node type. Gets a list of available node types by making a list() request. */
  def get(): Request[NodeType] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.NodeType): Request[NodeType] = js.native
  
  /** Retrieves a list of node types available to the specified project. */
  def list(): Request[NodeTypeList] = js.native
  def list(request: Alt): Request[NodeTypeList] = js.native
}
