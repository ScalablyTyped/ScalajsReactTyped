package typingsJapgolly.intercomClient.mod

import typingsJapgolly.intercomClient.PartialEvent
import typingsJapgolly.intercomClient.companyMod.List
import typingsJapgolly.intercomClient.eventMod.ListParam
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Events")
@js.native
class Events () extends js.Object {
  def create(event: PartialEvent): js.Promise[IncomingMessage] = js.native
  def create(event: PartialEvent, cb: callback[IncomingMessage]): Unit = js.native
  def listBy(params: ListParam): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: ListParam, cb: callback[ApiResponse[List]]): Unit = js.native
}

