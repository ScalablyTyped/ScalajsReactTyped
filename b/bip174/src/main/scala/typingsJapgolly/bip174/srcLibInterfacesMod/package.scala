package typingsJapgolly.bip174.srcLibInterfacesMod

import typingsJapgolly.bip174.anon.InputCount
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ControlBlock = Buffer

type FinalScriptSig = Buffer

type FinalScriptWitness = Buffer

type NonWitnessUtxo = Buffer

type PorCommitment = String

type RedeemScript = Buffer

type SighashType = Double

type TapInternalKey = Buffer

type TapKeySig = Buffer

type TapMerkleRoot = Buffer

type TransactionFromBuffer = js.Function1[/* buffer */ Buffer, Transaction]

type TransactionIOCountGetter = js.Function1[/* txBuffer */ Buffer, InputCount]

type TransactionInputAdder = js.Function2[/* input */ TransactionInput, /* txBuffer */ Buffer, Buffer]

type TransactionLocktimeSetter = js.Function2[/* locktime */ Double, /* txBuffer */ Buffer, Buffer]

type TransactionOutputAdder = js.Function2[/* output */ TransactionOutput, /* txBuffer */ Buffer, Buffer]

type TransactionVersionSetter = js.Function2[/* version */ Double, /* txBuffer */ Buffer, Buffer]

type WitnessScript = Buffer
