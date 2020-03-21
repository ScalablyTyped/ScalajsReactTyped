package typingsJapgolly.bip174

import typingsJapgolly.bip174.bip174Strings.Buffer
import typingsJapgolly.bip174.interfacesMod.FinalScriptSig
import typingsJapgolly.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/finalScriptSig", JSImport.Namespace)
@js.native
object finalScriptSigMod extends js.Object {
  val expected: Buffer = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean = js.native
  def decode(keyVal: KeyValue): FinalScriptSig = js.native
  def encode(data: FinalScriptSig): KeyValue = js.native
}

