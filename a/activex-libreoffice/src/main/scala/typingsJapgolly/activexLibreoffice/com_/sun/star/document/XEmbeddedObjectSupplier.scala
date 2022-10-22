package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier
  extends StObject
     with XInterface {
  
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: XComponent
  
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): XComponent
}
object XEmbeddedObjectSupplier {
  
  inline def apply(
    EmbeddedObject: XComponent,
    acquire: Callback,
    getEmbeddedObject: CallbackTo[XComponent],
    queryInterface: `type` => Any,
    release: Callback
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEmbeddedObject = getEmbeddedObject.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
  
  extension [Self <: XEmbeddedObjectSupplier](x: Self) {
    
    inline def setEmbeddedObject(value: XComponent): Self = StObject.set(x, "EmbeddedObject", value.asInstanceOf[js.Any])
    
    inline def setGetEmbeddedObject(value: CallbackTo[XComponent]): Self = StObject.set(x, "getEmbeddedObject", value.toJsFn)
  }
}
