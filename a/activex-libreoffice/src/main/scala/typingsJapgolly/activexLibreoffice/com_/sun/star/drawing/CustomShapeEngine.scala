package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service is for a {@link CustomShape} */
trait CustomShapeEngine
  extends StObject
     with XInitialization
     with XCustomShapeEngine
object CustomShapeEngine {
  
  inline def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: Callback,
    getInteraction: CallbackTo[SafeArray[XCustomShapeHandle]],
    getLineGeometry: CallbackTo[PolyPolygonBezierCoords],
    getTextBounds: CallbackTo[Rectangle],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    render: CallbackTo[XShape]
  ): CustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction.asInstanceOf[js.Any], LineGeometry = LineGeometry.asInstanceOf[js.Any], TextBounds = TextBounds.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInteraction = getInteraction.toJsFn, getLineGeometry = getLineGeometry.toJsFn, getTextBounds = getTextBounds.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, render = render.toJsFn)
    __obj.asInstanceOf[CustomShapeEngine]
  }
}
