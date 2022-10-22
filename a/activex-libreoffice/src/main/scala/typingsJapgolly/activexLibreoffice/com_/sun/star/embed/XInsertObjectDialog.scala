package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to create and initialize a new embedded object using GUI dialog. */
trait XInsertObjectDialog
  extends StObject
     with XInterface {
  
  /**
    * creates a new object using GUI dialog.
    *
    * The dialog allows for user to do a number of choices that are container related. This information will be returned in the {@link InsertedObjectInfo}
    * object.
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntName a name for the entry
    * @param lObjArgs optional parameters for the object persistence initialization see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @returns the structure containing the object and container related options
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceByDialog(xStorage: XStorage, sEntName: String, lObjArgs: SeqEquiv[PropertyValue]): InsertedObjectInfo
}
object XInsertObjectDialog {
  
  inline def apply(
    acquire: Callback,
    createInstanceByDialog: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo,
    queryInterface: `type` => Any,
    release: Callback
  ): XInsertObjectDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstanceByDialog = js.Any.fromFunction3(createInstanceByDialog), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInsertObjectDialog]
  }
  
  extension [Self <: XInsertObjectDialog](x: Self) {
    
    inline def setCreateInstanceByDialog(value: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo): Self = StObject.set(x, "createInstanceByDialog", js.Any.fromFunction3(value))
  }
}
