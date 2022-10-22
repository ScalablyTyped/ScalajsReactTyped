package typingsJapgolly.tensorflowTfjsData

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsData.distDatasetMod.Dataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStatisticsMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/statistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeDatasetStatistics(dataset: Dataset[TabularRecord]): js.Promise[DatasetStatistics] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDatasetStatistics")(dataset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DatasetStatistics]]
  inline def computeDatasetStatistics(dataset: Dataset[TabularRecord], sampleSize: Double): js.Promise[DatasetStatistics] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDatasetStatistics")(dataset.asInstanceOf[js.Any], sampleSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetStatistics]]
  inline def computeDatasetStatistics(dataset: Dataset[TabularRecord], sampleSize: Double, shuffleWindowSize: Double): js.Promise[DatasetStatistics] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDatasetStatistics")(dataset.asInstanceOf[js.Any], sampleSize.asInstanceOf[js.Any], shuffleWindowSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetStatistics]]
  inline def computeDatasetStatistics(dataset: Dataset[TabularRecord], sampleSize: Unit, shuffleWindowSize: Double): js.Promise[DatasetStatistics] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDatasetStatistics")(dataset.asInstanceOf[js.Any], sampleSize.asInstanceOf[js.Any], shuffleWindowSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetStatistics]]
  
  inline def scaleTo01(min: Double, max: Double): js.Function1[/* value */ ElementArray, ElementArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleTo01")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ ElementArray, ElementArray]]
  
  type DatasetStatistics = StringDictionary[NumericColumnStatistics]
  
  type ElementArray = Double | js.Array[Double] | Tensor[Rank] | String
  
  trait NumericColumnStatistics extends StObject {
    
    var length: Double
    
    var max: Double
    
    var mean: Double
    
    var min: Double
    
    var stddev: Double
    
    var variance: Double
  }
  object NumericColumnStatistics {
    
    inline def apply(length: Double, max: Double, mean: Double, min: Double, stddev: Double, variance: Double): NumericColumnStatistics = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericColumnStatistics]
    }
    
    extension [Self <: NumericColumnStatistics](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    }
  }
  
  type TabularRecord = StringDictionary[ElementArray]
}
