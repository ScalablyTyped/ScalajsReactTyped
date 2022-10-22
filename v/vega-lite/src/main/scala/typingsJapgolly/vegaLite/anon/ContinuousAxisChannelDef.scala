package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.PositionFieldDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkCommonMod.GenericCompositeMarkDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBand
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBandDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBar
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorEncoding
import typingsJapgolly.vegaLite.buildSrcTransformMod.Transform
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousAxisChannelDef[MD /* <: (ErrorBarDef & GenericCompositeMarkDef[M]) | (ErrorBandDef & GenericCompositeMarkDef[M]) */, M /* <: ErrorBar | ErrorBand */] extends StObject {
  
  var continuousAxis: x | y
  
  var continuousAxisChannelDef: PositionFieldDef[String]
  
  var encodingWithoutContinuousAxis: ErrorEncoding[String]
  
  var groupby: js.Array[String]
  
  var markDef: MD
  
  var outerSpec: Height
  
  var ticksOrient: Orientation
  
  var tooltipEncoding: ErrorEncoding[String]
  
  var transform: js.Array[Transform]
}
object ContinuousAxisChannelDef {
  
  inline def apply[MD /* <: (ErrorBarDef & GenericCompositeMarkDef[M]) | (ErrorBandDef & GenericCompositeMarkDef[M]) */, M /* <: ErrorBar | ErrorBand */](
    continuousAxis: x | y,
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: ErrorEncoding[String],
    groupby: js.Array[String],
    markDef: MD,
    outerSpec: Height,
    ticksOrient: Orientation,
    tooltipEncoding: ErrorEncoding[String],
    transform: js.Array[Transform]
  ): ContinuousAxisChannelDef[MD, M] = {
    val __obj = js.Dynamic.literal(continuousAxis = continuousAxis.asInstanceOf[js.Any], continuousAxisChannelDef = continuousAxisChannelDef.asInstanceOf[js.Any], encodingWithoutContinuousAxis = encodingWithoutContinuousAxis.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], outerSpec = outerSpec.asInstanceOf[js.Any], ticksOrient = ticksOrient.asInstanceOf[js.Any], tooltipEncoding = tooltipEncoding.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousAxisChannelDef[MD, M]]
  }
  
  extension [Self <: ContinuousAxisChannelDef[?, ?], MD /* <: (ErrorBarDef & GenericCompositeMarkDef[M]) | (ErrorBandDef & GenericCompositeMarkDef[M]) */, M /* <: ErrorBar | ErrorBand */](x: Self & (ContinuousAxisChannelDef[MD, M])) {
    
    inline def setContinuousAxis(value: typingsJapgolly.vegaLite.vegaLiteStrings.x | y): Self = StObject.set(x, "continuousAxis", value.asInstanceOf[js.Any])
    
    inline def setContinuousAxisChannelDef(value: PositionFieldDef[String]): Self = StObject.set(x, "continuousAxisChannelDef", value.asInstanceOf[js.Any])
    
    inline def setEncodingWithoutContinuousAxis(value: ErrorEncoding[String]): Self = StObject.set(x, "encodingWithoutContinuousAxis", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setMarkDef(value: MD): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setOuterSpec(value: Height): Self = StObject.set(x, "outerSpec", value.asInstanceOf[js.Any])
    
    inline def setTicksOrient(value: Orientation): Self = StObject.set(x, "ticksOrient", value.asInstanceOf[js.Any])
    
    inline def setTooltipEncoding(value: ErrorEncoding[String]): Self = StObject.set(x, "tooltipEncoding", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
  }
}
