package typingsJapgolly.bip174

import typingsJapgolly.bip174.bip174Strings.`Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
import typingsJapgolly.bip174.interfacesMod.GlobalXpub
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/global/globalXpub", JSImport.Namespace)
@js.native
object globalXpubMod extends js.Object {
  val expected: `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket` = js.native
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean = js.native
  def decode(keyVal: KeyValue): GlobalXpub = js.native
  def encode(data: GlobalXpub): KeyValue = js.native
}

