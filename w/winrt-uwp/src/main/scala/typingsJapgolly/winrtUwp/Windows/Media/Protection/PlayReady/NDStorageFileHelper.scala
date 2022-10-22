package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages PlayReady-ND storage files. */
trait NDStorageFileHelper extends StObject {
  
  /**
    * Gets transmitter settings from the URLs associated with a StorageFile object if the URLs contain PlayReady-ND metadata.
    * @param file A storage file object that a media server has discovered.
    * @return The transmitter settings found in the storage file.
    */
  def getFileURLs(file: IStorageFile): IVector[String]
}
object NDStorageFileHelper {
  
  inline def apply(getFileURLs: IStorageFile => IVector[String]): NDStorageFileHelper = {
    val __obj = js.Dynamic.literal(getFileURLs = js.Any.fromFunction1(getFileURLs))
    __obj.asInstanceOf[NDStorageFileHelper]
  }
  
  extension [Self <: NDStorageFileHelper](x: Self) {
    
    inline def setGetFileURLs(value: IStorageFile => IVector[String]): Self = StObject.set(x, "getFileURLs", js.Any.fromFunction1(value))
  }
}
