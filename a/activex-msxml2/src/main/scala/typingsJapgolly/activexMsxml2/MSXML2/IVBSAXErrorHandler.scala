package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXErrorHandler interface */
trait IVBSAXErrorHandler extends StObject {
  
  /* private */ @JSName("MSXML2.IVBSAXErrorHandler_typekey")
  var MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler
  
  /** Receive notification of a recoverable error. */
  def error(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit
  
  /** Receive notification of a non-recoverable error. */
  def fatalError(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit
  
  /** Receive notification of an ignorable warning. */
  def ignorableWarning(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit
}
object IVBSAXErrorHandler {
  
  inline def apply(
    MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler,
    error: (IVBSAXLocator, String, Double) => Callback,
    fatalError: (IVBSAXLocator, String, Double) => Callback,
    ignorableWarning: (IVBSAXLocator, String, Double) => Callback
  ): IVBSAXErrorHandler = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction3((t0: IVBSAXLocator, t1: String, t2: Double) => (error(t0, t1, t2)).runNow()), fatalError = js.Any.fromFunction3((t0: IVBSAXLocator, t1: String, t2: Double) => (fatalError(t0, t1, t2)).runNow()), ignorableWarning = js.Any.fromFunction3((t0: IVBSAXLocator, t1: String, t2: Double) => (ignorableWarning(t0, t1, t2)).runNow()))
    __obj.updateDynamic("MSXML2.IVBSAXErrorHandler_typekey")(MSXML2DotIVBSAXErrorHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXErrorHandler]
  }
  
  extension [Self <: IVBSAXErrorHandler](x: Self) {
    
    inline def setError(value: (IVBSAXLocator, String, Double) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction3((t0: IVBSAXLocator, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setFatalError(value: (IVBSAXLocator, String, Double) => Callback): Self = StObject.set(x, "fatalError", js.Any.fromFunction3((t0: IVBSAXLocator, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setIgnorableWarning(value: (IVBSAXLocator, String, Double) => Callback): Self = StObject.set(x, "ignorableWarning", js.Any.fromFunction3((t0: IVBSAXLocator, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setMSXML2DotIVBSAXErrorHandler_typekey(value: IVBSAXErrorHandler): Self = StObject.set(x, "MSXML2.IVBSAXErrorHandler_typekey", value.asInstanceOf[js.Any])
  }
}
