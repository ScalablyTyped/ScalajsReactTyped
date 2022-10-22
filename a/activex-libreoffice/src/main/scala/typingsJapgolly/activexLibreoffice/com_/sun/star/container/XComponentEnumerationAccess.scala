package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a factory for a typified enumeration through a collection of components. */
trait XComponentEnumerationAccess
  extends StObject
     with XEnumerationAccess {
  
  /** creates a new instance of enumeration through components. */
  def createComponentEnumeration(): XComponentEnumeration
}
object XComponentEnumerationAccess {
  
  inline def apply(
    ElementType: `type`,
    acquire: Callback,
    createComponentEnumeration: CallbackTo[XComponentEnumeration],
    createEnumeration: CallbackTo[XEnumeration],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XComponentEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createComponentEnumeration = createComponentEnumeration.toJsFn, createEnumeration = createEnumeration.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XComponentEnumerationAccess]
  }
  
  extension [Self <: XComponentEnumerationAccess](x: Self) {
    
    inline def setCreateComponentEnumeration(value: CallbackTo[XComponentEnumeration]): Self = StObject.set(x, "createComponentEnumeration", value.toJsFn)
  }
}
