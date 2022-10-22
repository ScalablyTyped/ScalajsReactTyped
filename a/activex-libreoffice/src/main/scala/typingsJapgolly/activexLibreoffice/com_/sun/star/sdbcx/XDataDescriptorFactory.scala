package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the creation of a descriptor for a definition object. */
trait XDataDescriptorFactory
  extends StObject
     with XInterface {
  
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): XPropertySet
}
object XDataDescriptorFactory {
  
  inline def apply(
    acquire: Callback,
    createDataDescriptor: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createDataDescriptor = createDataDescriptor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
  
  extension [Self <: XDataDescriptorFactory](x: Self) {
    
    inline def setCreateDataDescriptor(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "createDataDescriptor", value.toJsFn)
  }
}
