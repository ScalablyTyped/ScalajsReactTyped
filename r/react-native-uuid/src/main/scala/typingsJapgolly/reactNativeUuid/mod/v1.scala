package typingsJapgolly.reactNativeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait v1 extends js.Object {
  var clockseq: Double
  var msecs: Double | js.Date
  var node: js.Array[Double]
  var nsecs: Double
}

object v1 {
  @scala.inline
  def apply(clockseq: Double, msecs: Double | js.Date, node: js.Array[Double], nsecs: Double): v1 = {
    val __obj = js.Dynamic.literal(clockseq = clockseq.asInstanceOf[js.Any], msecs = msecs.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nsecs = nsecs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[v1]
  }
}

