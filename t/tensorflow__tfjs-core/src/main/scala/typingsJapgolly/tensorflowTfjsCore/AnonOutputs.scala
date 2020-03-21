package typingsJapgolly.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.modelTypesMod.ModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutputs extends js.Object {
  var inputs: StringDictionary[ModelTensorInfo]
  var outputs: StringDictionary[ModelTensorInfo]
}

object AnonOutputs {
  @scala.inline
  def apply(inputs: StringDictionary[ModelTensorInfo], outputs: StringDictionary[ModelTensorInfo]): AnonOutputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOutputs]
  }
}

