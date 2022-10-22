package typingsJapgolly.reactMdForm.typesSliderTypesMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type RangeSliderDefaultValue = RangeSliderValue | js.Function0[RangeSliderValue]

type RangeSliderValue = js.Tuple2[Double, Double]

type SliderDefaultValue = SliderValue | js.Function0[SliderValue]

type SliderDragEvent = MouseEvent | TouchEvent | ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactMdForm.reactMdFormStrings.mouse
  - typingsJapgolly.reactMdForm.reactMdFormStrings.touch
  - scala.Null
*/
type SliderDraggingBy = _SliderDraggingBy | Null

type SliderThumbIndex = ThumbIndex | Null

type SliderValue = Double
