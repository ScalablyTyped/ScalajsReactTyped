package typingsJapgolly.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.asn1js.mod.ILocalHexBlock because var conflicts: isHexOnly, valueHex. Inlined 
- typingsJapgolly.asn1js.mod.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSImport("asn1js", "LocalBitStringValueBlock")
@js.native
class LocalBitStringValueBlock () extends LocalConstructedValueBlock {
  def this(params: LocalBitStringValueBlockParams) = this()
  var isConstructed: scala.Boolean = js.native
  var isHexOnly: scala.Boolean = js.native
  var unusedBits: Double = js.native
  var valueHex: scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

