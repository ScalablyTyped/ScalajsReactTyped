package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to create and initialize a new embedded object from clipboard.
  *
  * This interface contains methods that can help to create and initialize an embedded object based on system clipboard.
  */
trait XEmbedObjectClipboardCreator
  extends StObject
     with XInterface {
  
  /**
    * creates a new object and initializes it from the system clipboard.
    *
    * In case specified entry exists it's contents are ignored and will be overwritten on storing.
    *
    * The clipboard can provide a number of choices that are container related. This information will be returned in the {@link InsertedObjectInfo} object.
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntryName a name for the entry
    * @param aObjectArgs optional parameters for the object persistence initialization see also {@link EmbeddedObjectDescriptor}
    * @returns the structure containing the object and container related options
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitFromClipboard(xStorage: XStorage, sEntryName: String, aObjectArgs: SeqEquiv[PropertyValue]): InsertedObjectInfo
}
object XEmbedObjectClipboardCreator {
  
  inline def apply(
    acquire: Callback,
    createInstanceInitFromClipboard: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo,
    queryInterface: `type` => Any,
    release: Callback
  ): XEmbedObjectClipboardCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstanceInitFromClipboard = js.Any.fromFunction3(createInstanceInitFromClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEmbedObjectClipboardCreator]
  }
  
  extension [Self <: XEmbedObjectClipboardCreator](x: Self) {
    
    inline def setCreateInstanceInitFromClipboard(value: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo): Self = StObject.set(x, "createInstanceInitFromClipboard", js.Any.fromFunction3(value))
  }
}
