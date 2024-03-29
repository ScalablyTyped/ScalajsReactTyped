package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
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

trait Conv2DBackpropFilterAttrs extends StObject {
  
  var dataFormat: NHWC | NCHW
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  
  var filterShape: js.Tuple4[Double, Double, Double, Double]
  
  var pad: valid_ | same_ | Double | ExplicitPadding
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object Conv2DBackpropFilterAttrs {
  
  inline def apply(
    dataFormat: NHWC | NCHW,
    filterShape: js.Tuple4[Double, Double, Double, Double],
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): Conv2DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv2DBackpropFilterAttrs]
  }
  
  extension [Self <: Conv2DBackpropFilterAttrs](x: Self) {
    
    inline def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    inline def setFilterShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
