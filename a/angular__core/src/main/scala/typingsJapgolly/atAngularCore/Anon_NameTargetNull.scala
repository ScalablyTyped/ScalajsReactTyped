package typingsJapgolly.atAngularCore

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTargetNull extends js.Object {
  var name: String
  var target: Window | Null
}

object Anon_NameTargetNull {
  @scala.inline
  def apply(name: String, target: Window = null): Anon_NameTargetNull = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameTargetNull]
  }
}

