package typingsJapgolly.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileDownloadSession extends StObject {
  
  val DownloadID: Double
  
  val FileSize: Double
  
  val FileSize32: Double
}
object IFileDownloadSession {
  
  inline def apply(DownloadID: Double, FileSize: Double, FileSize32: Double): IFileDownloadSession = {
    val __obj = js.Dynamic.literal(DownloadID = DownloadID.asInstanceOf[js.Any], FileSize = FileSize.asInstanceOf[js.Any], FileSize32 = FileSize32.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadSession]
  }
  
  extension [Self <: IFileDownloadSession](x: Self) {
    
    inline def setDownloadID(value: Double): Self = StObject.set(x, "DownloadID", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "FileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSize32(value: Double): Self = StObject.set(x, "FileSize32", value.asInstanceOf[js.Any])
  }
}
