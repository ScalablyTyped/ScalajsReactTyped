package typingsJapgolly.bitcoinjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object psbtMod {
  /**
    * This function must do two things:
    * 1. Check if the `input` can be finalized. If it can not be finalized, throw.
    *   ie. `Can not finalize input #${inputIndex}`
    * 2. Create the finalScriptSig and finalScriptWitness Buffers.
    */
  type FinalScriptsFunc = js.Function6[
    /* inputIndex */ scala.Double, 
    /* input */ typingsJapgolly.bip174.interfacesMod.PsbtInput, 
    /* script */ typingsJapgolly.node.Buffer, 
    /* isSegwit */ scala.Boolean, 
    /* isP2SH */ scala.Boolean, 
    /* isP2WSH */ scala.Boolean, 
    typingsJapgolly.bitcoinjsLib.AnonFinalScriptSig
  ]
}
