package typingsJapgolly.intercomClient.mod

import typingsJapgolly.intercomClient.AnonContact
import typingsJapgolly.intercomClient.AnonTagid
import typingsJapgolly.intercomClient.PartialLead
import typingsJapgolly.intercomClient.leadMod.Lead
import typingsJapgolly.intercomClient.leadMod.LeadIdentifier
import typingsJapgolly.intercomClient.leadMod.List
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: AnonContact): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: AnonContact, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def create(lead: PartialLead): js.Promise[ApiResponse[Lead]] = js.native
  def create(lead: PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: AnonTagid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: AnonTagid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(lead: UserIdentifier with PartialLead): js.Promise[ApiResponse[Lead]] = js.native
  def update(lead: UserIdentifier with PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
}

