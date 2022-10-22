package typingsJapgolly.oracleOraclejet.ojdiagramMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.anon.H
import typingsJapgolly.oracleOraclejet.anon.Y
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.baseline
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.left
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.middle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.right
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvtDiagramLayoutContextNode extends StObject {
  
  def getBounds(): H
  
  def getChildNodes(): js.Array[Any]
  
  def getContentBounds(): H
  
  def getData(): js.Object
  
  def getId(): Any
  
  def getLabelBounds(): H
  
  def getLabelHalign(): left | center | right
  
  def getLabelPosition(): Y
  
  def getLabelRotationAngle(): Double
  
  def getLabelRotationPoint(): Y
  
  def getLabelValign(): top | middle | bottom | baseline
  
  def getPosition(): Y
  
  def getRelativePosition(containerId: Any): Y
  
  def getSelected(): Boolean
  
  def isDisclosed(): Boolean
  
  def setLabelHalign(halign: left | center | right): Unit
  
  def setLabelPosition(pos: Y): Unit
  
  def setLabelRotationAngle(angle: Double): Unit
  
  def setLabelRotationPoint(point: Y): Unit
  
  def setLabelValign(valign: top | middle | bottom | baseline): Unit
  
  def setPosition(pos: Y): Unit
}
object DvtDiagramLayoutContextNode {
  
  inline def apply(
    getBounds: CallbackTo[H],
    getChildNodes: CallbackTo[js.Array[Any]],
    getContentBounds: CallbackTo[H],
    getData: CallbackTo[js.Object],
    getId: CallbackTo[Any],
    getLabelBounds: CallbackTo[H],
    getLabelHalign: CallbackTo[left | center | right],
    getLabelPosition: CallbackTo[Y],
    getLabelRotationAngle: CallbackTo[Double],
    getLabelRotationPoint: CallbackTo[Y],
    getLabelValign: CallbackTo[top | middle | bottom | baseline],
    getPosition: CallbackTo[Y],
    getRelativePosition: Any => Y,
    getSelected: CallbackTo[Boolean],
    isDisclosed: CallbackTo[Boolean],
    setLabelHalign: left | center | right => Callback,
    setLabelPosition: Y => Callback,
    setLabelRotationAngle: Double => Callback,
    setLabelRotationPoint: Y => Callback,
    setLabelValign: top | middle | bottom | baseline => Callback,
    setPosition: Y => Callback
  ): DvtDiagramLayoutContextNode = {
    val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn, getChildNodes = getChildNodes.toJsFn, getContentBounds = getContentBounds.toJsFn, getData = getData.toJsFn, getId = getId.toJsFn, getLabelBounds = getLabelBounds.toJsFn, getLabelHalign = getLabelHalign.toJsFn, getLabelPosition = getLabelPosition.toJsFn, getLabelRotationAngle = getLabelRotationAngle.toJsFn, getLabelRotationPoint = getLabelRotationPoint.toJsFn, getLabelValign = getLabelValign.toJsFn, getPosition = getPosition.toJsFn, getRelativePosition = js.Any.fromFunction1(getRelativePosition), getSelected = getSelected.toJsFn, isDisclosed = isDisclosed.toJsFn, setLabelHalign = js.Any.fromFunction1((t0: left | center | right) => setLabelHalign(t0).runNow()), setLabelPosition = js.Any.fromFunction1((t0: Y) => setLabelPosition(t0).runNow()), setLabelRotationAngle = js.Any.fromFunction1((t0: Double) => setLabelRotationAngle(t0).runNow()), setLabelRotationPoint = js.Any.fromFunction1((t0: Y) => setLabelRotationPoint(t0).runNow()), setLabelValign = js.Any.fromFunction1((t0: top | middle | bottom | baseline) => setLabelValign(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Y) => setPosition(t0).runNow()))
    __obj.asInstanceOf[DvtDiagramLayoutContextNode]
  }
  
  extension [Self <: DvtDiagramLayoutContextNode](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[H]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetChildNodes(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getChildNodes", value.toJsFn)
    
    inline def setGetContentBounds(value: CallbackTo[H]): Self = StObject.set(x, "getContentBounds", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[js.Object]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLabelBounds(value: CallbackTo[H]): Self = StObject.set(x, "getLabelBounds", value.toJsFn)
    
    inline def setGetLabelHalign(value: CallbackTo[left | center | right]): Self = StObject.set(x, "getLabelHalign", value.toJsFn)
    
    inline def setGetLabelPosition(value: CallbackTo[Y]): Self = StObject.set(x, "getLabelPosition", value.toJsFn)
    
    inline def setGetLabelRotationAngle(value: CallbackTo[Double]): Self = StObject.set(x, "getLabelRotationAngle", value.toJsFn)
    
    inline def setGetLabelRotationPoint(value: CallbackTo[Y]): Self = StObject.set(x, "getLabelRotationPoint", value.toJsFn)
    
    inline def setGetLabelValign(value: CallbackTo[top | middle | bottom | baseline]): Self = StObject.set(x, "getLabelValign", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Y]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetRelativePosition(value: Any => Y): Self = StObject.set(x, "getRelativePosition", js.Any.fromFunction1(value))
    
    inline def setGetSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSelected", value.toJsFn)
    
    inline def setIsDisclosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisclosed", value.toJsFn)
    
    inline def setSetLabelHalign(value: left | center | right => Callback): Self = StObject.set(x, "setLabelHalign", js.Any.fromFunction1((t0: left | center | right) => value(t0).runNow()))
    
    inline def setSetLabelPosition(value: Y => Callback): Self = StObject.set(x, "setLabelPosition", js.Any.fromFunction1((t0: Y) => value(t0).runNow()))
    
    inline def setSetLabelRotationAngle(value: Double => Callback): Self = StObject.set(x, "setLabelRotationAngle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLabelRotationPoint(value: Y => Callback): Self = StObject.set(x, "setLabelRotationPoint", js.Any.fromFunction1((t0: Y) => value(t0).runNow()))
    
    inline def setSetLabelValign(value: top | middle | bottom | baseline => Callback): Self = StObject.set(x, "setLabelValign", js.Any.fromFunction1((t0: top | middle | bottom | baseline) => value(t0).runNow()))
    
    inline def setSetPosition(value: Y => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Y) => value(t0).runNow()))
  }
}
