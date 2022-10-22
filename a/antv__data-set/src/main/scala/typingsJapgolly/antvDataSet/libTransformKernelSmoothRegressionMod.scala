package typingsJapgolly.antvDataSet

import typingsJapgolly.antvDataSet.antvDataSetStrings.boxcar
import typingsJapgolly.antvDataSet.antvDataSetStrings.cosine
import typingsJapgolly.antvDataSet.antvDataSetStrings.epanechnikov
import typingsJapgolly.antvDataSet.antvDataSetStrings.gaussian
import typingsJapgolly.antvDataSet.antvDataSetStrings.quartic
import typingsJapgolly.antvDataSet.antvDataSetStrings.triangular
import typingsJapgolly.antvDataSet.antvDataSetStrings.tricube
import typingsJapgolly.antvDataSet.antvDataSetStrings.triweight
import typingsJapgolly.antvDataSet.antvDataSetStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformKernelSmoothRegressionMod {
  
  object default {
    
    @JSImport("@antv/data-set/lib/transform/kernel-smooth/regression", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/transform/kernel-smooth/regression", "default.KERNEL_METHODS")
    @js.native
    def KERNEL_METHODS: js.Array[Any] = js.native
    inline def KERNEL_METHODS_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KERNEL_METHODS")(x.asInstanceOf[js.Any])
  }
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, js.UndefOr[String]]] = js.undefined
    
    var bandwidth: js.UndefOr[Double] = js.undefined
    
    var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var fields: js.UndefOr[js.Tuple2[String, js.UndefOr[String]]] = js.undefined
    
    var method: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
  }
  object Options {
    
    inline def apply(
      method: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
    ): Options = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Tuple2[String, js.UndefOr[String]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
      
      inline def setExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFields(value: js.Tuple2[String, js.UndefOr[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setMethod(
        value: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
}
