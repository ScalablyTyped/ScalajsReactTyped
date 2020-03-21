package typingsJapgolly.bip174

import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  @js.native
  object globals extends js.Object {
    var globalXpub: TypeofglobalXpub = js.native
    var unsignedTx: TypeofunsignedTx = js.native
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
  }
  
  @js.native
  object inputs extends js.Object {
    var bip32Derivation: AnonCanAddToArray = js.native
    var finalScriptSig: TypeoffinalScriptSig = js.native
    var finalScriptWitness: TypeoffinalScriptWitness = js.native
    var nonWitnessUtxo: TypeofnonWitnessUtxo = js.native
    var partialSig: TypeofpartialSig = js.native
    var porCommitment: TypeofporCommitment = js.native
    var redeemScript: AnonCanAdd = js.native
    var sighashType: TypeofsighashType = js.native
    var witnessScript: AnonCanAdd = js.native
    var witnessUtxo: TypeofwitnessUtxo = js.native
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
  }
  
  @js.native
  object outputs extends js.Object {
    var bip32Derivation: AnonCanAddToArray = js.native
    var redeemScript: AnonCanAdd = js.native
    var witnessScript: AnonCanAdd = js.native
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
  }
  
}

