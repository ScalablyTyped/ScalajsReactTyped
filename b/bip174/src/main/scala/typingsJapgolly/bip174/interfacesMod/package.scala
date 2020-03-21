package typingsJapgolly.bip174

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type FinalScriptSig = typingsJapgolly.node.Buffer
  type FinalScriptWitness = typingsJapgolly.node.Buffer
  type NonWitnessUtxo = typingsJapgolly.node.Buffer
  type PorCommitment = java.lang.String
  type RedeemScript = typingsJapgolly.node.Buffer
  type SighashType = scala.Double
  type TransactionFromBuffer = js.Function1[
    /* buffer */ typingsJapgolly.node.Buffer, 
    typingsJapgolly.bip174.interfacesMod.Transaction
  ]
  type TransactionIOCountGetter = js.Function1[/* txBuffer */ typingsJapgolly.node.Buffer, typingsJapgolly.bip174.AnonInputCount]
  type TransactionInputAdder = js.Function2[
    /* input */ typingsJapgolly.bip174.interfacesMod.TransactionInput, 
    /* txBuffer */ typingsJapgolly.node.Buffer, 
    typingsJapgolly.node.Buffer
  ]
  type TransactionLocktimeSetter = js.Function2[
    /* locktime */ scala.Double, 
    /* txBuffer */ typingsJapgolly.node.Buffer, 
    typingsJapgolly.node.Buffer
  ]
  type TransactionOutputAdder = js.Function2[
    /* output */ typingsJapgolly.bip174.interfacesMod.TransactionOutput, 
    /* txBuffer */ typingsJapgolly.node.Buffer, 
    typingsJapgolly.node.Buffer
  ]
  type TransactionVersionSetter = js.Function2[
    /* version */ scala.Double, 
    /* txBuffer */ typingsJapgolly.node.Buffer, 
    typingsJapgolly.node.Buffer
  ]
  type WitnessScript = typingsJapgolly.node.Buffer
}
