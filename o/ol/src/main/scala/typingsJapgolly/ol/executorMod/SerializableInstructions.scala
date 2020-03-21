package typingsJapgolly.ol.executorMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.canvasMod.FillState
import typingsJapgolly.ol.canvasMod.StrokeState
import typingsJapgolly.ol.canvasMod.TextState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableInstructions extends js.Object {
  var coordinates: js.Array[Double]
  var fillStates: StringDictionary[FillState]
  var hitDetectionInstructions: js.Array[_]
  var instructions: js.Array[_]
  var strokeStates: StringDictionary[StrokeState]
  var textStates: StringDictionary[TextState]
}

object SerializableInstructions {
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    fillStates: StringDictionary[FillState],
    hitDetectionInstructions: js.Array[_],
    instructions: js.Array[_],
    strokeStates: StringDictionary[StrokeState],
    textStates: StringDictionary[TextState]
  ): SerializableInstructions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], fillStates = fillStates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], strokeStates = strokeStates.asInstanceOf[js.Any], textStates = textStates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerializableInstructions]
  }
}

