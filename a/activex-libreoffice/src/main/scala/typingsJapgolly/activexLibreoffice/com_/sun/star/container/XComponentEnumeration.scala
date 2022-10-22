package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a typified enumeration through components. */
trait XComponentEnumeration
  extends StObject
     with XEnumeration {
  
  /**
    * @returns the next component of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextComponent(): XComponent
}
object XComponentEnumeration {
  
  inline def apply(
    acquire: Callback,
    hasMoreElements: CallbackTo[Boolean],
    nextComponent: CallbackTo[XComponent],
    nextElement: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XComponentEnumeration = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasMoreElements = hasMoreElements.toJsFn, nextComponent = nextComponent.toJsFn, nextElement = nextElement.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XComponentEnumeration]
  }
  
  extension [Self <: XComponentEnumeration](x: Self) {
    
    inline def setNextComponent(value: CallbackTo[XComponent]): Self = StObject.set(x, "nextComponent", value.toJsFn)
  }
}
