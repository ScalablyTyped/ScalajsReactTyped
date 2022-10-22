package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignmentPatternFinder extends StObject {
  
  /* private */ def centerFromEnd(stateCount: Double, end: Double): Double
  
  var crossCheckStateCount: js.Tuple3[Double, Double, Double]
  
  def find(): AlignmentPattern
  
  /* private */ def foundPatternCross(stateCount: Double): Boolean
  
  /* private */ def handlePossibleCenter(stateCount: Double, i: Double, j: Double): AlignmentPattern
  
  var height: Double
  
  var image: js.typedarray.Uint8Array
  
  var moduleSize: Double
  
  var possibleCenters: js.Array[AlignmentPattern]
  
  var resultPointCallback: ResultPointCallback
  
  var startX: Double
  
  var startY: Double
  
  var width: Double
}
object AlignmentPatternFinder {
  
  inline def apply(
    centerFromEnd: (Double, Double) => Double,
    crossCheckStateCount: js.Tuple3[Double, Double, Double],
    find: CallbackTo[AlignmentPattern],
    foundPatternCross: Double => Boolean,
    handlePossibleCenter: (Double, Double, Double) => AlignmentPattern,
    height: Double,
    image: js.typedarray.Uint8Array,
    moduleSize: Double,
    possibleCenters: js.Array[AlignmentPattern],
    resultPointCallback: ResultPointCallback,
    startX: Double,
    startY: Double,
    width: Double
  ): AlignmentPatternFinder = {
    val __obj = js.Dynamic.literal(centerFromEnd = js.Any.fromFunction2(centerFromEnd), crossCheckStateCount = crossCheckStateCount.asInstanceOf[js.Any], find = find.toJsFn, foundPatternCross = js.Any.fromFunction1(foundPatternCross), handlePossibleCenter = js.Any.fromFunction3(handlePossibleCenter), height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], moduleSize = moduleSize.asInstanceOf[js.Any], possibleCenters = possibleCenters.asInstanceOf[js.Any], resultPointCallback = resultPointCallback.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentPatternFinder]
  }
  
  extension [Self <: AlignmentPatternFinder](x: Self) {
    
    inline def setCenterFromEnd(value: (Double, Double) => Double): Self = StObject.set(x, "centerFromEnd", js.Any.fromFunction2(value))
    
    inline def setCrossCheckStateCount(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "crossCheckStateCount", value.asInstanceOf[js.Any])
    
    inline def setFind(value: CallbackTo[AlignmentPattern]): Self = StObject.set(x, "find", value.toJsFn)
    
    inline def setFoundPatternCross(value: Double => Boolean): Self = StObject.set(x, "foundPatternCross", js.Any.fromFunction1(value))
    
    inline def setHandlePossibleCenter(value: (Double, Double, Double) => AlignmentPattern): Self = StObject.set(x, "handlePossibleCenter", js.Any.fromFunction3(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setModuleSize(value: Double): Self = StObject.set(x, "moduleSize", value.asInstanceOf[js.Any])
    
    inline def setPossibleCenters(value: js.Array[AlignmentPattern]): Self = StObject.set(x, "possibleCenters", value.asInstanceOf[js.Any])
    
    inline def setPossibleCentersVarargs(value: AlignmentPattern*): Self = StObject.set(x, "possibleCenters", js.Array(value*))
    
    inline def setResultPointCallback(value: ResultPointCallback): Self = StObject.set(x, "resultPointCallback", value.asInstanceOf[js.Any])
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
