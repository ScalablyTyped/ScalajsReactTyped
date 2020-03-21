package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.remove() details argument object
  */
trait CookiesRemoveDetails extends js.Object {
  /**
    * The name of the cookie to remove.
    */
  var name: String
  /**
    * The ID of the cookie store to look in for the cookie.
    */
  var storeId: String
  /**
    * The URL associated with the cookie.
    */
  var url: String
}

object CookiesRemoveDetails {
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesRemoveDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookiesRemoveDetails]
  }
}

