package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that does a partial group-by-key. One input and one output.
  */
@js.native
trait SchemaPartialGroupByKeyInstruction extends js.Object {
  /**
    * Describes the input to the partial group-by-key instruction.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  /**
    * The codec to use for interpreting an element in the input PTable.
    */
  var inputElementCodec: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.native
  /**
    * If this instruction includes a combining function, this is the name of
    * the CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.native
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  /**
    * The value combining function to invoke.
    */
  var valueCombiningFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaPartialGroupByKeyInstruction {
  @scala.inline
  def apply(
    input: SchemaInstructionInput = null,
    inputElementCodec: StringDictionary[js.Any] = null,
    originalCombineValuesInputStoreName: String = null,
    originalCombineValuesStepName: String = null,
    sideInputs: js.Array[SchemaSideInputInfo] = null,
    valueCombiningFn: StringDictionary[js.Any] = null
  ): SchemaPartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputElementCodec != null) __obj.updateDynamic("inputElementCodec")(inputElementCodec.asInstanceOf[js.Any])
    if (originalCombineValuesInputStoreName != null) __obj.updateDynamic("originalCombineValuesInputStoreName")(originalCombineValuesInputStoreName.asInstanceOf[js.Any])
    if (originalCombineValuesStepName != null) __obj.updateDynamic("originalCombineValuesStepName")(originalCombineValuesStepName.asInstanceOf[js.Any])
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs.asInstanceOf[js.Any])
    if (valueCombiningFn != null) __obj.updateDynamic("valueCombiningFn")(valueCombiningFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartialGroupByKeyInstruction]
  }
}

