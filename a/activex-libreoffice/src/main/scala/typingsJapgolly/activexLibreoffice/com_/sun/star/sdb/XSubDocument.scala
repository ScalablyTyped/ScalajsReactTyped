package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows operating on a sub document of an {@link OfficeDatabaseDocument}
  * @since OOo 3.1
  */
trait XSubDocument extends StObject {
  
  /**
    * closes the sub document, if it had previously been opened in either mode
    * @returns `TRUE` if and only if the document could be closed, `FALSE` otherwise, e.g. if the closing has been vetoed by the user.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during closing the document
    */
  def close(): Boolean
  
  /**
    * opens the sub document
    *
    * Note that opening the document means it is displayed in an own top-level frame on the desktop.
    * @returns the sub document, usually an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the sub document does not have a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during opening the document
    */
  def open(): XComponent
  
  /**
    * opens the sub document in design mode
    * @returns the sub document, usually an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the sub document does not have a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during opening the document
    */
  def openDesign(): XComponent
  
  /**
    * stores the sub document, if it had previously been opened in either mode
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing the document
    */
  def store(): Unit
}
object XSubDocument {
  
  inline def apply(
    close: CallbackTo[Boolean],
    open: CallbackTo[XComponent],
    openDesign: CallbackTo[XComponent],
    store: Callback
  ): XSubDocument = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, open = open.toJsFn, openDesign = openDesign.toJsFn, store = store.toJsFn)
    __obj.asInstanceOf[XSubDocument]
  }
  
  extension [Self <: XSubDocument](x: Self) {
    
    inline def setClose(value: CallbackTo[Boolean]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setOpen(value: CallbackTo[XComponent]): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setOpenDesign(value: CallbackTo[XComponent]): Self = StObject.set(x, "openDesign", value.toJsFn)
    
    inline def setStore(value: Callback): Self = StObject.set(x, "store", value.toJsFn)
  }
}
