package typingsJapgolly.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domains extends js.Object {
  var Domains: js.Array[Domain]
  var TotalCount: Double
}

object Domains {
  @scala.inline
  def apply(Domains: js.Array[Domain], TotalCount: Double): Domains = {
    val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Domains]
  }
}

