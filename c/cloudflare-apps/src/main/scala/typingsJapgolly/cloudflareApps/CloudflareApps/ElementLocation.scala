package typingsJapgolly.cloudflareApps.CloudflareApps

import typingsJapgolly.cloudflareApps.cloudflareAppsStrings.after
import typingsJapgolly.cloudflareApps.cloudflareAppsStrings.append
import typingsJapgolly.cloudflareApps.cloudflareAppsStrings.before
import typingsJapgolly.cloudflareApps.cloudflareAppsStrings.prepend
import typingsJapgolly.cloudflareApps.cloudflareAppsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementLocation extends js.Object {
  var method: before | prepend | append | after | replace
  var selector: String
}

object ElementLocation {
  @scala.inline
  def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementLocation]
  }
}

