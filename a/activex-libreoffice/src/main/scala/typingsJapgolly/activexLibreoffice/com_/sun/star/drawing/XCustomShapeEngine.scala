package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The {@link XCustomShapeEngine} */
trait XCustomShapeEngine
  extends StObject
     with XInterface {
  
  /** @returns a collection of interaction handles */
  val Interaction: SafeArray[XCustomShapeHandle]
  
  /** @returns the line geometry of the object */
  val LineGeometry: PolyPolygonBezierCoords
  
  /** @returns the text bound of the shape */
  val TextBounds: Rectangle
  
  /** @returns a collection of interaction handles */
  def getInteraction(): SafeArray[XCustomShapeHandle]
  
  /** @returns the line geometry of the object */
  def getLineGeometry(): PolyPolygonBezierCoords
  
  /** @returns the text bound of the shape */
  def getTextBounds(): Rectangle
  
  /** @returns a the shape that is representing the {@link CustomShape} */
  def render(): XShape
}
object XCustomShapeEngine {
  
  inline def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: Callback,
    getInteraction: CallbackTo[SafeArray[XCustomShapeHandle]],
    getLineGeometry: CallbackTo[PolyPolygonBezierCoords],
    getTextBounds: CallbackTo[Rectangle],
    queryInterface: `type` => Any,
    release: Callback,
    render: CallbackTo[XShape]
  ): XCustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction.asInstanceOf[js.Any], LineGeometry = LineGeometry.asInstanceOf[js.Any], TextBounds = TextBounds.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInteraction = getInteraction.toJsFn, getLineGeometry = getLineGeometry.toJsFn, getTextBounds = getTextBounds.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, render = render.toJsFn)
    __obj.asInstanceOf[XCustomShapeEngine]
  }
  
  extension [Self <: XCustomShapeEngine](x: Self) {
    
    inline def setGetInteraction(value: CallbackTo[SafeArray[XCustomShapeHandle]]): Self = StObject.set(x, "getInteraction", value.toJsFn)
    
    inline def setGetLineGeometry(value: CallbackTo[PolyPolygonBezierCoords]): Self = StObject.set(x, "getLineGeometry", value.toJsFn)
    
    inline def setGetTextBounds(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getTextBounds", value.toJsFn)
    
    inline def setInteraction(value: SafeArray[XCustomShapeHandle]): Self = StObject.set(x, "Interaction", value.asInstanceOf[js.Any])
    
    inline def setLineGeometry(value: PolyPolygonBezierCoords): Self = StObject.set(x, "LineGeometry", value.asInstanceOf[js.Any])
    
    inline def setRender(value: CallbackTo[XShape]): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setTextBounds(value: Rectangle): Self = StObject.set(x, "TextBounds", value.asInstanceOf[js.Any])
  }
}
