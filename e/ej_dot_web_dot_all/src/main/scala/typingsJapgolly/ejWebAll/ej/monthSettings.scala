package typingsJapgolly.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait monthSettings extends js.Object {
  var names: js.Array[String]
  var namesAbbr: js.Array[String]
}

object monthSettings {
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String]): monthSettings = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[monthSettings]
  }
}

