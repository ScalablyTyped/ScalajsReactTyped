package typingsJapgolly.dwt

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftStatic[TElement /* <: Node */] extends js.Object {
  var Lib: DynamsoftLib
  var WebTwainEnv: dwtEnv
}

object DynamsoftStatic {
  @scala.inline
  def apply[TElement /* <: Node */](Lib: DynamsoftLib, WebTwainEnv: dwtEnv): DynamsoftStatic[TElement] = {
    val __obj = js.Dynamic.literal(Lib = Lib.asInstanceOf[js.Any], WebTwainEnv = WebTwainEnv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamsoftStatic[TElement]]
  }
}

