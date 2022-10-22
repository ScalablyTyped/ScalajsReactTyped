package typingsJapgolly.maximMazurokGapiClientJobs.gapi.client.jobs

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientJobs.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientJobs.anon.Callback
import typingsJapgolly.maximMazurokGapiClientJobs.anon.Fields
import typingsJapgolly.maximMazurokGapiClientJobs.anon.Key
import typingsJapgolly.maximMazurokGapiClientJobs.anon.Name
import typingsJapgolly.maximMazurokGapiClientJobs.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompaniesResource extends StObject {
  
  def create(request: Callback, body: Company): Request[Company] = js.native
  /** Creates a new company entity. */
  def create(request: Fields): Request[Company] = js.native
  
  /** Deletes specified company. Prerequisite: The company has no jobs associated with it. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves specified company. */
  def get(): Request[Company] = js.native
  def get(request: Accesstoken): Request[Company] = js.native
  
  /** Lists all companies associated with the project. */
  def list(): Request[ListCompaniesResponse] = js.native
  def list(request: Key): Request[ListCompaniesResponse] = js.native
  
  /** Updates specified company. */
  def patch(request: Name): Request[Company] = js.native
  def patch(request: Oauthtoken, body: Company): Request[Company] = js.native
}
