package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typingsJapgolly.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedConv2DAttrs extends StObject {
  
  var activation: Activation
  
  var dataFormat: NHWC | NCHW
  
  var dilations: (js.Tuple2[Double, Double]) | Double
  
  var dimRoundingMode: floor | round | ceil
  
  var leakyreluAlpha: js.UndefOr[Double] = js.undefined
  
  var pad: valid_ | same_ | Double | ExplicitPadding
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object FusedConv2DAttrs {
  
  inline def apply(
    activation: Activation,
    dataFormat: NHWC | NCHW,
    dilations: (js.Tuple2[Double, Double]) | Double,
    dimRoundingMode: floor | round | ceil,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): FusedConv2DAttrs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilations = dilations.asInstanceOf[js.Any], dimRoundingMode = dimRoundingMode.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DAttrs]
  }
  
  extension [Self <: FusedConv2DAttrs](x: Self) {
    
    inline def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
    
    inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
    
    inline def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
