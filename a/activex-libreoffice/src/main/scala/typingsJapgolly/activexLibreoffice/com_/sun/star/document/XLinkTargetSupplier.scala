package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface is supplied by objects inside a document object model that have children that can be the target of a link inside a document.
  *
  * These targets implement the service {@link LinkTarget} .
  */
trait XLinkTargetSupplier
  extends StObject
     with XInterface {
  
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  val Links: XNameAccess
  
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  def getLinks(): XNameAccess
}
object XLinkTargetSupplier {
  
  inline def apply(
    Links: XNameAccess,
    acquire: Callback,
    getLinks: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XLinkTargetSupplier = {
    val __obj = js.Dynamic.literal(Links = Links.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLinks = getLinks.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLinkTargetSupplier]
  }
  
  extension [Self <: XLinkTargetSupplier](x: Self) {
    
    inline def setGetLinks(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getLinks", value.toJsFn)
    
    inline def setLinks(value: XNameAccess): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
  }
}
