package typingsJapgolly.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var ref: Double | String
  var tf: Double
}

object TokenInfo {
  @scala.inline
  def apply(ref: Double | String, tf: Double): TokenInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], tf = tf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenInfo]
  }
}

