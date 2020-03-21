package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointDetails extends js.Object {
  var authorization: EndpointAuthorization
  var data: StringDictionary[String]
  var `type`: String
  var url: String
}

object ServiceEndpointDetails {
  @scala.inline
  def apply(authorization: EndpointAuthorization, data: StringDictionary[String], `type`: String, url: String): ServiceEndpointDetails = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointDetails]
  }
}

