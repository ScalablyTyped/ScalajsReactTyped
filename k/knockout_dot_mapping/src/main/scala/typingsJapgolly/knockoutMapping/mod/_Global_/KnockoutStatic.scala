package typingsJapgolly.knockoutMapping.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  // this is a declaration merging with knockout's interface
  var mapping: KnockoutMapping
}

object KnockoutStatic {
  @scala.inline
  def apply(mapping: KnockoutMapping): KnockoutStatic = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

