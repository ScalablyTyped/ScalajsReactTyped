package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICachedFileUpdaterStatics extends StObject {
  
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit
}
object ICachedFileUpdaterStatics {
  
  inline def apply(
    setUpdateInformation: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Callback
  ): ICachedFileUpdaterStatics = {
    val __obj = js.Dynamic.literal(setUpdateInformation = js.Any.fromFunction5((t0: IStorageFile, t1: String, t2: ReadActivationMode, t3: WriteActivationMode, t4: CachedFileOptions) => (setUpdateInformation(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[ICachedFileUpdaterStatics]
  }
  
  extension [Self <: ICachedFileUpdaterStatics](x: Self) {
    
    inline def setSetUpdateInformation(
      value: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Callback
    ): Self = StObject.set(x, "setUpdateInformation", js.Any.fromFunction5((t0: IStorageFile, t1: String, t2: ReadActivationMode, t3: WriteActivationMode, t4: CachedFileOptions) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
