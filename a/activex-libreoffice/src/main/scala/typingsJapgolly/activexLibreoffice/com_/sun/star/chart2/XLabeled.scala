package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XLabeled extends StObject {
  
  var Label: XTitle
  
  var LabelAnchor: RectanglePoint
  
  var Offset: SafeArray[Double]
  
  var OwnAnchor: RectanglePoint
  
  def getLabel(): XTitle
  
  def getLabelAnchor(): RectanglePoint
  
  def getOffset(): SafeArray[Double]
  
  def getOwnAnchor(): RectanglePoint
  
  def setLabel(xTitle: XTitle): Unit
  
  def setLabelAnchor(aAnchorPoint: RectanglePoint): Unit
  
  def setOffset(aOffsetVector: SeqEquiv[Double]): Unit
  
  def setOwnAnchor(aAnchorPoint: RectanglePoint): Unit
}
object XLabeled {
  
  inline def apply(
    Label: XTitle,
    LabelAnchor: RectanglePoint,
    Offset: SafeArray[Double],
    OwnAnchor: RectanglePoint,
    getLabel: CallbackTo[XTitle],
    getLabelAnchor: CallbackTo[RectanglePoint],
    getOffset: CallbackTo[SafeArray[Double]],
    getOwnAnchor: CallbackTo[RectanglePoint],
    setLabel: XTitle => Callback,
    setLabelAnchor: RectanglePoint => Callback,
    setOffset: SeqEquiv[Double] => Callback,
    setOwnAnchor: RectanglePoint => Callback
  ): XLabeled = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], LabelAnchor = LabelAnchor.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], OwnAnchor = OwnAnchor.asInstanceOf[js.Any], getLabel = getLabel.toJsFn, getLabelAnchor = getLabelAnchor.toJsFn, getOffset = getOffset.toJsFn, getOwnAnchor = getOwnAnchor.toJsFn, setLabel = js.Any.fromFunction1((t0: XTitle) => setLabel(t0).runNow()), setLabelAnchor = js.Any.fromFunction1((t0: RectanglePoint) => setLabelAnchor(t0).runNow()), setOffset = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setOffset(t0).runNow()), setOwnAnchor = js.Any.fromFunction1((t0: RectanglePoint) => setOwnAnchor(t0).runNow()))
    __obj.asInstanceOf[XLabeled]
  }
  
  extension [Self <: XLabeled](x: Self) {
    
    inline def setGetLabel(value: CallbackTo[XTitle]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetLabelAnchor(value: CallbackTo[RectanglePoint]): Self = StObject.set(x, "getLabelAnchor", value.toJsFn)
    
    inline def setGetOffset(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getOffset", value.toJsFn)
    
    inline def setGetOwnAnchor(value: CallbackTo[RectanglePoint]): Self = StObject.set(x, "getOwnAnchor", value.toJsFn)
    
    inline def setLabel(value: XTitle): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelAnchor(value: RectanglePoint): Self = StObject.set(x, "LabelAnchor", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: SafeArray[Double]): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOwnAnchor(value: RectanglePoint): Self = StObject.set(x, "OwnAnchor", value.asInstanceOf[js.Any])
    
    inline def setSetLabel(value: XTitle => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: XTitle) => value(t0).runNow()))
    
    inline def setSetLabelAnchor(value: RectanglePoint => Callback): Self = StObject.set(x, "setLabelAnchor", js.Any.fromFunction1((t0: RectanglePoint) => value(t0).runNow()))
    
    inline def setSetOffset(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setOffset", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
    
    inline def setSetOwnAnchor(value: RectanglePoint => Callback): Self = StObject.set(x, "setOwnAnchor", js.Any.fromFunction1((t0: RectanglePoint) => value(t0).runNow()))
  }
}
