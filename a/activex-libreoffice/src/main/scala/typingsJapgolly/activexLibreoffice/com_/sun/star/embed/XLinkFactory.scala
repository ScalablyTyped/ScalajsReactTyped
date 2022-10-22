package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to create and initialize a new link of specified type. */
trait XLinkFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a new link and transport parameters for persistent initialization.
    *
    * This method can be used to have a full control over persistence initialization of a link.
    * @param aClassID the class id of the new object
    * @param ClassName the class name of the new object
    * @param xStorage a parent storage the entry should be created in
    * @param sEntryName a name for the entry
    * @param aArgs The {@link com.sun.star.document.MediaDescriptor} that contains source for the link
    * @param aObjectArgs optional parameters for the object persistence initialization see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceLinkUserInit(
    aClassID: SeqEquiv[Double],
    ClassName: String,
    xStorage: XStorage,
    sEntryName: String,
    aArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface
}
object XLinkFactory {
  
  inline def apply(
    acquire: Callback,
    createInstanceLinkUserInit: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XLinkFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstanceLinkUserInit = js.Any.fromFunction6(createInstanceLinkUserInit), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLinkFactory]
  }
  
  extension [Self <: XLinkFactory](x: Self) {
    
    inline def setCreateInstanceLinkUserInit(
      value: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface
    ): Self = StObject.set(x, "createInstanceLinkUserInit", js.Any.fromFunction6(value))
  }
}
