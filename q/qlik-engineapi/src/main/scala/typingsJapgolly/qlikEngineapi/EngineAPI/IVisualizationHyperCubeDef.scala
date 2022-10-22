package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeDef...
  */
trait IVisualizationHyperCubeDef
  extends StObject
     with IHyperCubeDef {
  
  var customErrorMessage: ICustomErrorMessage
  
  @JSName("qDimensions")
  var qDimensions_IVisualizationHyperCubeDef: js.Array[IHyperCubeDimensionDef]
  
  var qLayoutExclude: Any
  
  @JSName("qMeasures")
  var qMeasures_IVisualizationHyperCubeDef: js.Array[IHyperCubeMeasureDef]
}
object IVisualizationHyperCubeDef {
  
  inline def apply(
    customErrorMessage: ICustomErrorMessage,
    qAlwaysFullyExpanded: Boolean,
    qDimensions: js.Array[IHyperCubeDimensionDef],
    qIndentMode: Boolean,
    qInitialDataFetch: js.Array[INxPage],
    qInterColumnSortOrder: js.Array[Double],
    qLayoutExclude: Any,
    qMaxStackedCells: Double,
    qMeasures: js.Array[IHyperCubeMeasureDef],
    qMode: NxHypercubeMode,
    qNoOfLeftDims: Double,
    qPopulateMissing: Boolean,
    qPseudoDimPos: Double,
    qReductionMode: ReductionModeType,
    qShowTotalsAbove: Boolean,
    qSortbyYValue: String,
    qStateName: String,
    qSuppressMissing: Boolean,
    qSuppressZero: Boolean
  ): IVisualizationHyperCubeDef = {
    val __obj = js.Dynamic.literal(customErrorMessage = customErrorMessage.asInstanceOf[js.Any], qAlwaysFullyExpanded = qAlwaysFullyExpanded.asInstanceOf[js.Any], qDimensions = qDimensions.asInstanceOf[js.Any], qIndentMode = qIndentMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qInterColumnSortOrder = qInterColumnSortOrder.asInstanceOf[js.Any], qLayoutExclude = qLayoutExclude.asInstanceOf[js.Any], qMaxStackedCells = qMaxStackedCells.asInstanceOf[js.Any], qMeasures = qMeasures.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPopulateMissing = qPopulateMissing.asInstanceOf[js.Any], qPseudoDimPos = qPseudoDimPos.asInstanceOf[js.Any], qReductionMode = qReductionMode.asInstanceOf[js.Any], qShowTotalsAbove = qShowTotalsAbove.asInstanceOf[js.Any], qSortbyYValue = qSortbyYValue.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any], qSuppressMissing = qSuppressMissing.asInstanceOf[js.Any], qSuppressZero = qSuppressZero.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVisualizationHyperCubeDef]
  }
  
  extension [Self <: IVisualizationHyperCubeDef](x: Self) {
    
    inline def setCustomErrorMessage(value: ICustomErrorMessage): Self = StObject.set(x, "customErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setQDimensions(value: js.Array[IHyperCubeDimensionDef]): Self = StObject.set(x, "qDimensions", value.asInstanceOf[js.Any])
    
    inline def setQDimensionsVarargs(value: IHyperCubeDimensionDef*): Self = StObject.set(x, "qDimensions", js.Array(value*))
    
    inline def setQLayoutExclude(value: Any): Self = StObject.set(x, "qLayoutExclude", value.asInstanceOf[js.Any])
    
    inline def setQMeasures(value: js.Array[IHyperCubeMeasureDef]): Self = StObject.set(x, "qMeasures", value.asInstanceOf[js.Any])
    
    inline def setQMeasuresVarargs(value: IHyperCubeMeasureDef*): Self = StObject.set(x, "qMeasures", js.Array(value*))
  }
}
