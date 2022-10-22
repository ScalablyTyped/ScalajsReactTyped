package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to get the shape of o annotation
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.CellAnnotationShape
  */
trait XSheetAnnotationShapeSupplier
  extends StObject
     with XInterface {
  
  /** returns the shape of the annotation */
  val AnnotationShape: XShape
  
  /** returns the shape of the annotation */
  def getAnnotationShape(): XShape
}
object XSheetAnnotationShapeSupplier {
  
  inline def apply(
    AnnotationShape: XShape,
    acquire: Callback,
    getAnnotationShape: CallbackTo[XShape],
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetAnnotationShapeSupplier = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAnnotationShape = getAnnotationShape.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetAnnotationShapeSupplier]
  }
  
  extension [Self <: XSheetAnnotationShapeSupplier](x: Self) {
    
    inline def setAnnotationShape(value: XShape): Self = StObject.set(x, "AnnotationShape", value.asInstanceOf[js.Any])
    
    inline def setGetAnnotationShape(value: CallbackTo[XShape]): Self = StObject.set(x, "getAnnotationShape", value.toJsFn)
  }
}
