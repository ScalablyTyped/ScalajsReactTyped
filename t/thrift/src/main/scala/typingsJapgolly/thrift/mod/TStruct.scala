package typingsJapgolly.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStruct extends js.Object {
  var fname: String
}

object TStruct {
  @scala.inline
  def apply(fname: String): TStruct = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TStruct]
  }
}

