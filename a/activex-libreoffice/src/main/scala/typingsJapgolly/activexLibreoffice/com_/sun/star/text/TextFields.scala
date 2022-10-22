package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a collection of {@link TextField} instances. */
trait TextFields
  extends StObject
     with XEnumerationAccess
     with XRefreshable
object TextFields {
  
  inline def apply(
    ElementType: `type`,
    acquire: Callback,
    addRefreshListener: XRefreshListener => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removeRefreshListener: XRefreshListener => Callback
  ): TextFields = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), createEnumeration = createEnumeration.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()))
    __obj.asInstanceOf[TextFields]
  }
}
