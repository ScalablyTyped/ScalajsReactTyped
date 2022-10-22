package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers some settings which are allowed even for objects which are not yet inserted into a draw page.
  * @deprecated Deprecatedreplaced by com::sun::star::lang::XServiceName
  */
trait XShapeDescriptor
  extends StObject
     with XInterface {
  
  /** @returns the programmatic name of the shape type. */
  val ShapeType: String
  
  /** @returns the programmatic name of the shape type. */
  def getShapeType(): String
}
object XShapeDescriptor {
  
  inline def apply(
    ShapeType: String,
    acquire: Callback,
    getShapeType: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getShapeType = getShapeType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XShapeDescriptor]
  }
  
  extension [Self <: XShapeDescriptor](x: Self) {
    
    inline def setGetShapeType(value: CallbackTo[String]): Self = StObject.set(x, "getShapeType", value.toJsFn)
    
    inline def setShapeType(value: String): Self = StObject.set(x, "ShapeType", value.asInstanceOf[js.Any])
  }
}
