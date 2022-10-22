package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileStorageLobFileStorageMod {
  
  inline def apply(classKey: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/file-storage/LobFileStorage", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LobFileStorage {
    def this(classKey: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/file-storage/LobFileStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait LobFileStorage extends StObject {
    
    def addFile(fileName: String, content: String): Double = js.native
    def addFile(fileName: String, content: typingsJapgolly.nginstackEngine.libIoFileMod.^): Double = js.native
    def addFile(fileName: String, content: typingsJapgolly.nginstackEngine.libIoMemoryStreamMod.^): Double = js.native
    
    /* private */ var classKey_ : Any = js.native
    
    def findFileByName(fileName: String): typingsJapgolly.nginstackEngine.libFileStorageFileInfoMod.^ = js.native
    
    def getExtraFileAttributes(fileKey: Double): Any = js.native
    
    def getFilesSize(fileKeys: js.Array[Double]): Double = js.native
    
    /* private */ var lobStorage_ : Any = js.native
    
    def setExtraFileAttributes(fileKey: Double, attributes: Any): Unit = js.native
    
    def tryGetFileInfo(fileKey: Double): typingsJapgolly.nginstackEngine.libFileStorageFileInfoMod.^ = js.native
    
    def updateFile(fileKey: Double, content: String): Unit = js.native
    def updateFile(fileKey: Double, content: typingsJapgolly.nginstackEngine.libIoFileMod.^): Unit = js.native
    def updateFile(fileKey: Double, content: typingsJapgolly.nginstackEngine.libIoMemoryStreamMod.^): Unit = js.native
  }
}
