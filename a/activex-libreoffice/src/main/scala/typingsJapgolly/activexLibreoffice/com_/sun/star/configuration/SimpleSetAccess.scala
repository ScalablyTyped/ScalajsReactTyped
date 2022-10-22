package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XStringEscape
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a dynamic, homogeneous, nonhierarchical set of values or objects.
  *
  * Also provides information about the template for elements. Allows normalizing externally generated names.
  *
  * **Sets** are dynamic containers.
  *
  * The number and names of contained elements is not fixed in advance, but all elements have to be of one predetermined type.
  */
trait SimpleSetAccess
  extends StObject
     with XNameAccess
     with XTemplateContainer
     with XStringEscape
     with XContainer
object SimpleSetAccess {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementTemplateName: String,
    ElementType: `type`,
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    escapeString: String => String,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementTemplateName: CallbackTo[String],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeContainerListener: XContainerListener => Callback,
    unescapeString: String => String
  ): SimpleSetAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), escapeString = js.Any.fromFunction1(escapeString), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementTemplateName = getElementTemplateName.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), unescapeString = js.Any.fromFunction1(unescapeString))
    __obj.asInstanceOf[SimpleSetAccess]
  }
}
