package typingsJapgolly.atlassianCrowdClient.mod

import typingsJapgolly.atlassianCrowdClient.AnonAttributes
import typingsJapgolly.atlassianCrowdClient.AnonAuthenticate
import typingsJapgolly.atlassianCrowdClient.AnonChildren
import typingsJapgolly.atlassianCrowdClient.AnonCookie
import typingsJapgolly.atlassianCrowdClient.AnonCreate
import typingsJapgolly.atlassianCrowdClient.AnonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrowdClient
  extends typingsJapgolly.atlassianCrowdClient.apiMod.^ {
  var authentication: AnonAuthenticate = js.native
  var config: AnonCookie = js.native
  var group: AnonChildren = js.native
  var search: AnonGroup = js.native
  var session: AnonCreate = js.native
  var user: AnonAttributes = js.native
}

