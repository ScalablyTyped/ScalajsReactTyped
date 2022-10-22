package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows initiating an update of linked parts of a document. */
trait XLinkUpdate
  extends StObject
     with XInterface {
  
  /** initiates the reloading of all linked document content like linked graphics, linked text sections. */
  def updateLinks(): Unit
}
object XLinkUpdate {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, updateLinks: Callback): XLinkUpdate = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateLinks = updateLinks.toJsFn)
    __obj.asInstanceOf[XLinkUpdate]
  }
  
  extension [Self <: XLinkUpdate](x: Self) {
    
    inline def setUpdateLinks(value: Callback): Self = StObject.set(x, "updateLinks", value.toJsFn)
  }
}
