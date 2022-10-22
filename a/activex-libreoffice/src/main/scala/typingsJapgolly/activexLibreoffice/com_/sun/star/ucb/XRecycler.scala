package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an {@link XContent} to delete itself into the trash can.
  *
  * This is an additional interface the {@link XContent} representing the trash can (URL: "vnd.sun.staroffice.trashcan:///") should support.
  */
trait XRecycler
  extends StObject
     with XInterface {
  
  /**
    * Notify the trash can that an {@link XContent} is deleting itself into it.
    * @param Properties The trash can uses this interface to access the properties of the content being deleted, to copy them for later display etc. The trash
    * @param Identifier When the deleted content is later restored or ultimately deleted, the trash can will use this identifier to query an {@link XContent}
    */
  def trashContent(Properties: XCommandProcessor, Identifier: XContentIdentifier): Unit
}
object XRecycler {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    trashContent: (XCommandProcessor, XContentIdentifier) => Callback
  ): XRecycler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, trashContent = js.Any.fromFunction2((t0: XCommandProcessor, t1: XContentIdentifier) => (trashContent(t0, t1)).runNow()))
    __obj.asInstanceOf[XRecycler]
  }
  
  extension [Self <: XRecycler](x: Self) {
    
    inline def setTrashContent(value: (XCommandProcessor, XContentIdentifier) => Callback): Self = StObject.set(x, "trashContent", js.Any.fromFunction2((t0: XCommandProcessor, t1: XContentIdentifier) => (value(t0, t1)).runNow()))
  }
}
