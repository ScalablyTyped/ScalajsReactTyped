package typingsJapgolly.libarchiveJs

import org.scalajs.dom.File
import typingsJapgolly.libarchiveJs.srcLibarchiveMod.Archive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompressedFileMod {
  
  @JSImport("libarchive.js/src/compressed-file", "CompressedFile")
  @js.native
  open class CompressedFile protected () extends StObject {
    def this(name: String, size: Double, path: String, archiveRef: Archive) = this()
    
    var _archiveRef: Archive = js.native
    
    var _name: String = js.native
    
    var _path: String = js.native
    
    var _size: Double = js.native
    
    def extract(): js.Promise[File] = js.native
    
    def name: String = js.native
    
    def size: Double = js.native
  }
}
