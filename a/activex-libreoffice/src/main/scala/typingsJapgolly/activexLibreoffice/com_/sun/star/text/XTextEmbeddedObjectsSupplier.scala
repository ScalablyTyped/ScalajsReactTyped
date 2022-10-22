package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the collection of all embedded objects within this context (i.e. this document). */
trait XTextEmbeddedObjectsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: XNameAccess
  
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): XNameAccess
}
object XTextEmbeddedObjectsSupplier {
  
  inline def apply(
    EmbeddedObjects: XNameAccess,
    acquire: Callback,
    getEmbeddedObjects: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextEmbeddedObjectsSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObjects = EmbeddedObjects.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEmbeddedObjects = getEmbeddedObjects.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextEmbeddedObjectsSupplier]
  }
  
  extension [Self <: XTextEmbeddedObjectsSupplier](x: Self) {
    
    inline def setEmbeddedObjects(value: XNameAccess): Self = StObject.set(x, "EmbeddedObjects", value.asInstanceOf[js.Any])
    
    inline def setGetEmbeddedObjects(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getEmbeddedObjects", value.toJsFn)
  }
}
