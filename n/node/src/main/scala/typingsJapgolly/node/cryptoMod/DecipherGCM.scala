package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.AnonPlaintextLength
import typingsJapgolly.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherGCM extends Decipher {
  def setAAD(buffer: ArrayBufferView): this.type = js.native
  def setAAD(buffer: ArrayBufferView, options: AnonPlaintextLength): this.type = js.native
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}

