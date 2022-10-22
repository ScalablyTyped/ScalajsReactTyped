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

trait DvtDiagramLayoutContextLink extends StObject {
  
  def getCoordinateSpace(): Any
  
  def getData(): js.Object | js.Array[Any]
  
  def getEndConnectorOffset(): Double
  
  def getEndId(): Any
  
  def getId(): Any
  
  def getLabelBounds(): H
  
  def getLabelHalign(): left | center | right
  
  def getLabelPosition(): Y
  
  def getLabelRotationAngle(): Double
  
  def getLabelRotationPoint(): Y
  
  def getLabelValign(): top | middle | bottom | baseline
  
  def getLinkWidth(): Double
  
  def getPoints(): js.Array[Any]
  
  def getSelected(): Boolean
  
  def getStartConnectorOffset(): Double
  
  def getStartId(): Any
  
  def isPromoted(): Boolean
  
  def setCoordinateSpace(containerId: Any): Unit
  
  def setLabelHalign(halign: left | center | right): Unit
  
  def setLabelPosition(pos: Y): Unit
  
  def setLabelRotationAngle(angle: Double): Unit
  
  def setLabelRotationPoint(point: Y): Unit
  
  def setLabelValign(valign: top | middle | bottom | baseline): Unit
  
  def setPoints(points: js.Array[Any]): Unit
}
object DvtDiagramLayoutContextLink {
  
  inline def apply(
    getCoordinateSpace: CallbackTo[Any],
    getData: CallbackTo[js.Object | js.Array[Any]],
    getEndConnectorOffset: CallbackTo[Double],
    getEndId: CallbackTo[Any],
    getId: CallbackTo[Any],
    getLabelBounds: CallbackTo[H],
    getLabelHalign: CallbackTo[left | center | right],
    getLabelPosition: CallbackTo[Y],
    getLabelRotationAngle: CallbackTo[Double],
    getLabelRotationPoint: CallbackTo[Y],
    getLabelValign: CallbackTo[top | middle | bottom | baseline],
    getLinkWidth: CallbackTo[Double],
    getPoints: CallbackTo[js.Array[Any]],
    getSelected: CallbackTo[Boolean],
    getStartConnectorOffset: CallbackTo[Double],
    getStartId: CallbackTo[Any],
    isPromoted: CallbackTo[Boolean],
    setCoordinateSpace: Any => Callback,
    setLabelHalign: left | center | right => Callback,
    setLabelPosition: Y => Callback,
    setLabelRotationAngle: Double => Callback,
    setLabelRotationPoint: Y => Callback,
    setLabelValign: top | middle | bottom | baseline => Callback,
    setPoints: js.Array[Any] => Callback
  ): DvtDiagramLayoutContextLink = {
    val __obj = js.Dynamic.literal(getCoordinateSpace = getCoordinateSpace.toJsFn, getData = getData.toJsFn, getEndConnectorOffset = getEndConnectorOffset.toJsFn, getEndId = getEndId.toJsFn, getId = getId.toJsFn, getLabelBounds = getLabelBounds.toJsFn, getLabelHalign = getLabelHalign.toJsFn, getLabelPosition = getLabelPosition.toJsFn, getLabelRotationAngle = getLabelRotationAngle.toJsFn, getLabelRotationPoint = getLabelRotationPoint.toJsFn, getLabelValign = getLabelValign.toJsFn, getLinkWidth = getLinkWidth.toJsFn, getPoints = getPoints.toJsFn, getSelected = getSelected.toJsFn, getStartConnectorOffset = getStartConnectorOffset.toJsFn, getStartId = getStartId.toJsFn, isPromoted = isPromoted.toJsFn, setCoordinateSpace = js.Any.fromFunction1((t0: Any) => setCoordinateSpace(t0).runNow()), setLabelHalign = js.Any.fromFunction1((t0: left | center | right) => setLabelHalign(t0).runNow()), setLabelPosition = js.Any.fromFunction1((t0: Y) => setLabelPosition(t0).runNow()), setLabelRotationAngle = js.Any.fromFunction1((t0: Double) => setLabelRotationAngle(t0).runNow()), setLabelRotationPoint = js.Any.fromFunction1((t0: Y) => setLabelRotationPoint(t0).runNow()), setLabelValign = js.Any.fromFunction1((t0: top | middle | bottom | baseline) => setLabelValign(t0).runNow()), setPoints = js.Any.fromFunction1((t0: js.Array[Any]) => setPoints(t0).runNow()))
    __obj.asInstanceOf[DvtDiagramLayoutContextLink]
  }
  
  extension [Self <: DvtDiagramLayoutContextLink](x: Self) {
    
    inline def setGetCoordinateSpace(value: CallbackTo[Any]): Self = StObject.set(x, "getCoordinateSpace", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[js.Object | js.Array[Any]]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetEndConnectorOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getEndConnectorOffset", value.toJsFn)
    
    inline def setGetEndId(value: CallbackTo[Any]): Self = StObject.set(x, "getEndId", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLabelBounds(value: CallbackTo[H]): Self = StObject.set(x, "getLabelBounds", value.toJsFn)
    
    inline def setGetLabelHalign(value: CallbackTo[left | center | right]): Self = StObject.set(x, "getLabelHalign", value.toJsFn)
    
    inline def setGetLabelPosition(value: CallbackTo[Y]): Self = StObject.set(x, "getLabelPosition", value.toJsFn)
    
    inline def setGetLabelRotationAngle(value: CallbackTo[Double]): Self = StObject.set(x, "getLabelRotationAngle", value.toJsFn)
    
    inline def setGetLabelRotationPoint(value: CallbackTo[Y]): Self = StObject.set(x, "getLabelRotationPoint", value.toJsFn)
    
    inline def setGetLabelValign(value: CallbackTo[top | middle | bottom | baseline]): Self = StObject.set(x, "getLabelValign", value.toJsFn)
    
    inline def setGetLinkWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getLinkWidth", value.toJsFn)
    
    inline def setGetPoints(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getPoints", value.toJsFn)
    
    inline def setGetSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSelected", value.toJsFn)
    
    inline def setGetStartConnectorOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getStartConnectorOffset", value.toJsFn)
    
    inline def setGetStartId(value: CallbackTo[Any]): Self = StObject.set(x, "getStartId", value.toJsFn)
    
    inline def setIsPromoted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPromoted", value.toJsFn)
    
    inline def setSetCoordinateSpace(value: Any => Callback): Self = StObject.set(x, "setCoordinateSpace", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLabelHalign(value: left | center | right => Callback): Self = StObject.set(x, "setLabelHalign", js.Any.fromFunction1((t0: left | center | right) => value(t0).runNow()))
    
    inline def setSetLabelPosition(value: Y => Callback): Self = StObject.set(x, "setLabelPosition", js.Any.fromFunction1((t0: Y) => value(t0).runNow()))
    
    inline def setSetLabelRotationAngle(value: Double => Callback): Self = StObject.set(x, "setLabelRotationAngle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLabelRotationPoint(value: Y => Callback): Self = StObject.set(x, "setLabelRotationPoint", js.Any.fromFunction1((t0: Y) => value(t0).runNow()))
    
    inline def setSetLabelValign(value: top | middle | bottom | baseline => Callback): Self = StObject.set(x, "setLabelValign", js.Any.fromFunction1((t0: top | middle | bottom | baseline) => value(t0).runNow()))
    
    inline def setSetPoints(value: js.Array[Any] => Callback): Self = StObject.set(x, "setPoints", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
