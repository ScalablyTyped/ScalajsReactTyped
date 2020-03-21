package typingsJapgolly.bitcoinjsLib.transactionMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var hash: Buffer
  var index: Double
  var script: Buffer
  var sequence: Double
  var witness: js.Array[Buffer]
}

object Input {
  @scala.inline
  def apply(hash: Buffer, index: Double, script: Buffer, sequence: Double, witness: js.Array[Buffer]): Input = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Input]
  }
}

