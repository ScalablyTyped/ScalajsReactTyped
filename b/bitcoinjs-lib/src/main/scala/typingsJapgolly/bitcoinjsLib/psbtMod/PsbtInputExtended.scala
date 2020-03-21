package typingsJapgolly.bitcoinjsLib.psbtMod

import typingsJapgolly.bip174.interfacesMod.Bip32Derivation
import typingsJapgolly.bip174.interfacesMod.FinalScriptSig
import typingsJapgolly.bip174.interfacesMod.FinalScriptWitness
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.NonWitnessUtxo
import typingsJapgolly.bip174.interfacesMod.PartialSig
import typingsJapgolly.bip174.interfacesMod.PorCommitment
import typingsJapgolly.bip174.interfacesMod.PsbtInput
import typingsJapgolly.bip174.interfacesMod.RedeemScript
import typingsJapgolly.bip174.interfacesMod.TransactionInput
import typingsJapgolly.bip174.interfacesMod.WitnessScript
import typingsJapgolly.bip174.interfacesMod.WitnessUtxo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtInputExtended
  extends PsbtInput
     with TransactionInput

object PsbtInputExtended {
  @scala.inline
  def apply(
    hash: String | Buffer,
    index: Double,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    finalScriptSig: FinalScriptSig = null,
    finalScriptWitness: FinalScriptWitness = null,
    nonWitnessUtxo: NonWitnessUtxo = null,
    partialSig: js.Array[PartialSig] = null,
    porCommitment: PorCommitment = null,
    redeemScript: RedeemScript = null,
    sequence: Int | Double = null,
    sighashType: Int | Double = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null,
    witnessUtxo: WitnessUtxo = null
  ): PsbtInputExtended = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation.asInstanceOf[js.Any])
    if (finalScriptSig != null) __obj.updateDynamic("finalScriptSig")(finalScriptSig.asInstanceOf[js.Any])
    if (finalScriptWitness != null) __obj.updateDynamic("finalScriptWitness")(finalScriptWitness.asInstanceOf[js.Any])
    if (nonWitnessUtxo != null) __obj.updateDynamic("nonWitnessUtxo")(nonWitnessUtxo.asInstanceOf[js.Any])
    if (partialSig != null) __obj.updateDynamic("partialSig")(partialSig.asInstanceOf[js.Any])
    if (porCommitment != null) __obj.updateDynamic("porCommitment")(porCommitment.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (sighashType != null) __obj.updateDynamic("sighashType")(sighashType.asInstanceOf[js.Any])
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript.asInstanceOf[js.Any])
    if (witnessUtxo != null) __obj.updateDynamic("witnessUtxo")(witnessUtxo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtInputExtended]
  }
}

