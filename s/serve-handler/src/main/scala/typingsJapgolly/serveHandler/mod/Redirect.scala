package typingsJapgolly.serveHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends Rewrite {
  var `type`: Double
}

object Redirect {
  @scala.inline
  def apply(destination: String, source: String, `type`: Double): Redirect = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

