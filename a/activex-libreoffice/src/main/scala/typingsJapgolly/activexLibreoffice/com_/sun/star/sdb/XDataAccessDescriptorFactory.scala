package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows creating instances of the {@link DataAccessDescriptor} service.
  *
  * Data access descriptors are finally only bags of properties with a defined semantics. Depending on the context in which you use them, certain of their
  * properties are needed or unneeded. ;  The descriptor factory allows you to create instances which offer all properties potentially needed at a
  * descriptor.
  */
trait XDataAccessDescriptorFactory extends StObject {
  
  /** creates a {@link DataAccessDescriptor} which supports all properties defined for this service, even if they're normally optional only. */
  def createDataAccessDescriptor(): XPropertySet
}
object XDataAccessDescriptorFactory {
  
  inline def apply(createDataAccessDescriptor: CallbackTo[XPropertySet]): XDataAccessDescriptorFactory = {
    val __obj = js.Dynamic.literal(createDataAccessDescriptor = createDataAccessDescriptor.toJsFn)
    __obj.asInstanceOf[XDataAccessDescriptorFactory]
  }
  
  extension [Self <: XDataAccessDescriptorFactory](x: Self) {
    
    inline def setCreateDataAccessDescriptor(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "createDataAccessDescriptor", value.toJsFn)
  }
}
