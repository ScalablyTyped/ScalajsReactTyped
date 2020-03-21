package typingsJapgolly.bip174.parserMod

import typingsJapgolly.bip174.interfacesMod.PsbtGlobal
import typingsJapgolly.bip174.interfacesMod.PsbtInput
import typingsJapgolly.bip174.interfacesMod.PsbtOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtAttributes extends js.Object {
  var globalMap: PsbtGlobal
  var inputs: js.Array[PsbtInput]
  var outputs: js.Array[PsbtOutput]
}

object PsbtAttributes {
  @scala.inline
  def apply(globalMap: PsbtGlobal, inputs: js.Array[PsbtInput], outputs: js.Array[PsbtOutput]): PsbtAttributes = {
    val __obj = js.Dynamic.literal(globalMap = globalMap.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PsbtAttributes]
  }
}

