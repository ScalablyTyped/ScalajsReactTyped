package typingsJapgolly.bitcoinjsLib.transactionMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var script: Buffer
  var value: Double
}

object Output {
  @scala.inline
  def apply(script: Buffer, value: Double): Output = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Output]
  }
}

