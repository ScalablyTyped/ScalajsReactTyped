package typingsJapgolly.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingUserData extends js.Object {
  var frag: Fragment
  var id: String
  var samples: js.Array[_]
}

object fragParsingUserData {
  @scala.inline
  def apply(frag: Fragment, id: String, samples: js.Array[_]): fragParsingUserData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[fragParsingUserData]
  }
}

