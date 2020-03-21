package typingsJapgolly.bip174

import typingsJapgolly.bip174.bip174Strings.Buffer
import typingsJapgolly.bip174.interfacesMod.FinalScriptWitness
import typingsJapgolly.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/finalScriptWitness", JSImport.Namespace)
@js.native
object finalScriptWitnessMod extends js.Object {
  val expected: Buffer = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean = js.native
  def decode(keyVal: KeyValue): FinalScriptWitness = js.native
  def encode(data: FinalScriptWitness): KeyValue = js.native
}

