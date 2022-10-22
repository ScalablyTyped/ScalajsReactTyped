package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Accurate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Bevelled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Block
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Crossed
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Custom
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Fast
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.FullGap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.FullPattern
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.HalfGap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.HalfPattern
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Mitered
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.NoConstraint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.OpenEnded
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Random
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Rounded
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Sinus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Square
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Triangle
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectArrow
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectBuffer
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectCut
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectDashes
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectJog
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectMove
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectOffset
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectRotate
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectScale
  - typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectWave
*/
trait CIMGeometricEffect extends StObject
object CIMGeometricEffect {
  
  inline def CIMGeometricEffectArrow(
    constructor: js.Function,
    geometricEffectArrowType: OpenEnded | Block | Crossed,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometricEffectArrowType = geometricEffectArrowType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectArrow")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectArrow]
  }
  
  inline def CIMGeometricEffectBuffer(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectBuffer")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectBuffer]
  }
  
  inline def CIMGeometricEffectControlMeasureLine(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    rule: String
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectControlMeasureLine")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine]
  }
  
  inline def CIMGeometricEffectCut(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectCut = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectCut")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectCut]
  }
  
  inline def CIMGeometricEffectDashes(
    constructor: js.Function,
    dashTemplate: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    lineDashEnding: NoConstraint | HalfPattern | HalfGap | FullPattern | FullGap | Custom,
    offsetAlongLine: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectDashes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dashTemplate = dashTemplate.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lineDashEnding = lineDashEnding.asInstanceOf[js.Any], offsetAlongLine = offsetAlongLine.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectDashes")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectDashes]
  }
  
  inline def CIMGeometricEffectJog(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    length: Double,
    position: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectJog = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectJog")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectJog]
  }
  
  inline def CIMGeometricEffectMove(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectMove = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectMove")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectMove]
  }
  
  inline def CIMGeometricEffectOffset(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    method: Mitered | Bevelled | Rounded | Square,
    offset: Double,
    option: Fast | Accurate,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectOffset")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectOffset]
  }
  
  inline def CIMGeometricEffectRotate(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectRotate = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectRotate")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectRotate]
  }
  
  inline def CIMGeometricEffectScale(
    XScaleFactor: Double,
    YScaleFactor: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectScale = {
    val __obj = js.Dynamic.literal(XScaleFactor = XScaleFactor.asInstanceOf[js.Any], YScaleFactor = YScaleFactor.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectScale")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectScale]
  }
  
  inline def CIMGeometricEffectWave(
    amplitude: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    period: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    waveform: Sinus | Square | Triangle | Random
  ): typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectWave = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), period = period.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), waveform = waveform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectWave")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMGeometricEffectWave]
  }
}
