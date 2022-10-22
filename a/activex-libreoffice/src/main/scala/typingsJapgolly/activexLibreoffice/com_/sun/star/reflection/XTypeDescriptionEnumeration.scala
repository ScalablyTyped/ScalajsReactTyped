package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an enumeration for type descriptions.
  * @since OOo 1.1.2
  */
trait XTypeDescriptionEnumeration
  extends StObject
     with XEnumeration {
  
  /**
    * Returns the next element of the enumeration.
    * @returns the next element of this enumeration.
    * @throws com::sun::star::container::NoSuchElementException if no more elements exist.
    */
  def nextTypeDescription(): XTypeDescription
}
object XTypeDescriptionEnumeration {
  
  inline def apply(
    acquire: Callback,
    hasMoreElements: CallbackTo[Boolean],
    nextElement: CallbackTo[Any],
    nextTypeDescription: CallbackTo[XTypeDescription],
    queryInterface: `type` => Any,
    release: Callback
  ): XTypeDescriptionEnumeration = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasMoreElements = hasMoreElements.toJsFn, nextElement = nextElement.toJsFn, nextTypeDescription = nextTypeDescription.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTypeDescriptionEnumeration]
  }
  
  extension [Self <: XTypeDescriptionEnumeration](x: Self) {
    
    inline def setNextTypeDescription(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "nextTypeDescription", value.toJsFn)
  }
}
