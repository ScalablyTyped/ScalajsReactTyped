package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleExtendedAttributes
  extends StObject
     with XInterface {
  
  val ExtendedAttributes: Any
  
  def getExtendedAttributes(): Any
}
object XAccessibleExtendedAttributes {
  
  inline def apply(
    ExtendedAttributes: Any,
    acquire: Callback,
    getExtendedAttributes: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleExtendedAttributes = {
    val __obj = js.Dynamic.literal(ExtendedAttributes = ExtendedAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getExtendedAttributes = getExtendedAttributes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleExtendedAttributes]
  }
  
  extension [Self <: XAccessibleExtendedAttributes](x: Self) {
    
    inline def setExtendedAttributes(value: Any): Self = StObject.set(x, "ExtendedAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetExtendedAttributes(value: CallbackTo[Any]): Self = StObject.set(x, "getExtendedAttributes", value.toJsFn)
  }
}
