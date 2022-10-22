package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a method to add a DDE link to a spreadsheet.
  * @see com.sun.star.sheet.DDELinks
  * @since OOo 3.0
  */
trait XDDELinks
  extends StObject
     with XNameAccess {
  
  /**
    * adds a DDE link to the spreadsheet without updating it.
    *
    * If a DDE link with the specified parameters already exists, the existing DDE link will be returned. Otherwise a new DDE link will be created.
    * @param aApplication the DDE server application from which data are requested.
    * @param aTopic the DDE topic from which data are requested.
    * @param aItem the DDE item from which data are requested.
    * @param nMode the DDE link mode.
    * @returns the DDE link.
    */
  def addDDELink(aApplication: String, aTopic: String, aItem: String, nMode: DDELinkMode): XDDELink
}
object XDDELinks {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addDDELink: (String, String, String, DDELinkMode) => XDDELink,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XDDELinks = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDDELink = js.Any.fromFunction4(addDDELink), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDDELinks]
  }
  
  extension [Self <: XDDELinks](x: Self) {
    
    inline def setAddDDELink(value: (String, String, String, DDELinkMode) => XDDELink): Self = StObject.set(x, "addDDELink", js.Any.fromFunction4(value))
  }
}
