package typingsJapgolly.coinbaseCommerceNode.mod

import typingsJapgolly.coinbaseCommerceNode.AnonDictkey
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELETE
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GET
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.POST
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: String
  var headers: AnonDictkey
  var method: GET | POST | DELETE | PUT
  var timeout: Double
  var url: String
}

object Options {
  @scala.inline
  def apply(
    body: String,
    headers: AnonDictkey,
    method: GET | POST | DELETE | PUT,
    timeout: Double,
    url: String
  ): Options = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

