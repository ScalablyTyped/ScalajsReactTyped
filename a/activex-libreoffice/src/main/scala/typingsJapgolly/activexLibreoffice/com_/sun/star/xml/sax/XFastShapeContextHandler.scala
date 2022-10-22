package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XDocumentProperties
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
trait XFastShapeContextHandler
  extends StObject
     with XFastContextHandler {
  
  var DocumentProperties: XDocumentProperties
  
  var DrawPage: XDrawPage
  
  var MediaDescriptor: SafeArray[PropertyValue]
  
  var Model: XModel
  
  var Position: Point
  
  var RelationFragmentPath: String
  
  var Shape: XShape
  
  var StartToken: Double
}
object XFastShapeContextHandler {
  
  inline def apply(
    DocumentProperties: XDocumentProperties,
    DrawPage: XDrawPage,
    MediaDescriptor: SafeArray[PropertyValue],
    Model: XModel,
    Position: Point,
    RelationFragmentPath: String,
    Shape: XShape,
    StartToken: Double,
    acquire: Callback,
    characters: String => Callback,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endFastElement: Double => Callback,
    endUnknownElement: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    startFastElement: (Double, XFastAttributeList) => Callback,
    startUnknownElement: (String, String, XFastAttributeList) => Callback
  ): XFastShapeContextHandler = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties.asInstanceOf[js.Any], DrawPage = DrawPage.asInstanceOf[js.Any], MediaDescriptor = MediaDescriptor.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], RelationFragmentPath = RelationFragmentPath.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], StartToken = StartToken.asInstanceOf[js.Any], acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1((t0: Double) => endFastElement(t0).runNow()), endUnknownElement = js.Any.fromFunction2((t0: String, t1: String) => (endUnknownElement(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startFastElement = js.Any.fromFunction2((t0: Double, t1: XFastAttributeList) => (startFastElement(t0, t1)).runNow()), startUnknownElement = js.Any.fromFunction3((t0: String, t1: String, t2: XFastAttributeList) => (startUnknownElement(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
  
  extension [Self <: XFastShapeContextHandler](x: Self) {
    
    inline def setDocumentProperties(value: XDocumentProperties): Self = StObject.set(x, "DocumentProperties", value.asInstanceOf[js.Any])
    
    inline def setDrawPage(value: XDrawPage): Self = StObject.set(x, "DrawPage", value.asInstanceOf[js.Any])
    
    inline def setMediaDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "MediaDescriptor", value.asInstanceOf[js.Any])
    
    inline def setModel(value: XModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setRelationFragmentPath(value: String): Self = StObject.set(x, "RelationFragmentPath", value.asInstanceOf[js.Any])
    
    inline def setShape(value: XShape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setStartToken(value: Double): Self = StObject.set(x, "StartToken", value.asInstanceOf[js.Any])
  }
}
