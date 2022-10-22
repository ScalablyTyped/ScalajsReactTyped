package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSink
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.LineCap
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.LineDash
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.LineJoint
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorBar
  extends StObject
     with LineProperties
     with XDataSink
     with XDataSource {
  
  /** @see com.sun.star.chart.ErrorBarStyle */
  var ErrorBarStyle: Double
  
  var NegativeError: Double
  
  var PositiveError: Double
  
  var ShowNegativeError: Boolean
  
  var ShowPositiveError: Boolean
  
  /** The weight for the standard deviation. */
  var Weight: Double
}
object ErrorBar {
  
  inline def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    ErrorBarStyle: Double,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    NegativeError: Double,
    PositiveError: Double,
    ShowNegativeError: Boolean,
    ShowPositiveError: Boolean,
    Weight: Double,
    acquire: Callback,
    getDataSequences: CallbackTo[SafeArray[XLabeledDataSequence]],
    queryInterface: `type` => Any,
    release: Callback,
    setData: SeqEquiv[XLabeledDataSequence] => Callback
  ): ErrorBar = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], NegativeError = NegativeError.asInstanceOf[js.Any], PositiveError = PositiveError.asInstanceOf[js.Any], ShowNegativeError = ShowNegativeError.asInstanceOf[js.Any], ShowPositiveError = ShowPositiveError.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataSequences = getDataSequences.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setData = js.Any.fromFunction1((t0: SeqEquiv[XLabeledDataSequence]) => setData(t0).runNow()))
    __obj.asInstanceOf[ErrorBar]
  }
  
  extension [Self <: ErrorBar](x: Self) {
    
    inline def setErrorBarStyle(value: Double): Self = StObject.set(x, "ErrorBarStyle", value.asInstanceOf[js.Any])
    
    inline def setNegativeError(value: Double): Self = StObject.set(x, "NegativeError", value.asInstanceOf[js.Any])
    
    inline def setPositiveError(value: Double): Self = StObject.set(x, "PositiveError", value.asInstanceOf[js.Any])
    
    inline def setShowNegativeError(value: Boolean): Self = StObject.set(x, "ShowNegativeError", value.asInstanceOf[js.Any])
    
    inline def setShowPositiveError(value: Boolean): Self = StObject.set(x, "ShowPositiveError", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
