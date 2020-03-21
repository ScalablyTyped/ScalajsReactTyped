package typingsJapgolly.wouter

import typingsJapgolly.wouter.mod.NavigationalProps
import typingsJapgolly.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends NavigationalProps {
  var href: Path
}

object AnonHref {
  @scala.inline
  def apply(href: Path): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHref]
  }
}

