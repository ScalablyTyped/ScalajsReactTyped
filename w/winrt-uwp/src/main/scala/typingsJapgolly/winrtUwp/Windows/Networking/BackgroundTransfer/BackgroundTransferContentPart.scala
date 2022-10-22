package typingsJapgolly.winrtUwp.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
trait BackgroundTransferContentPart extends StObject {
  
  /**
    * Sets the source file for a BackgroundTransferContentPart containing the file for upload.
    * @param value The source file.
    */
  def setFile(value: IStorageFile): Unit
  
  /**
    * Sets content disposition header values that indicate the nature of the information that this BackgroundTransferContentPart represents.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  def setHeader(headerName: String, headerValue: String): Unit
  
  /**
    * Use this method to set text information that the BackgroundTransferContentPart represents.
    * @param value A string value used to represent text information. (e.g. api_sig, api_key, auth_token, etc...)
    */
  def setText(value: String): Unit
}
object BackgroundTransferContentPart {
  
  inline def apply(
    setFile: IStorageFile => Callback,
    setHeader: (String, String) => Callback,
    setText: String => Callback
  ): BackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1((t0: IStorageFile) => setFile(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[BackgroundTransferContentPart]
  }
  
  extension [Self <: BackgroundTransferContentPart](x: Self) {
    
    inline def setSetFile(value: IStorageFile => Callback): Self = StObject.set(x, "setFile", js.Any.fromFunction1((t0: IStorageFile) => value(t0).runNow()))
    
    inline def setSetHeader(value: (String, String) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
