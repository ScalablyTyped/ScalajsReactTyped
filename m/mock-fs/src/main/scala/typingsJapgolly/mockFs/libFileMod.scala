package typingsJapgolly.mockFs

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileMod {
  
  @JSImport("mock-fs/lib/file", JSImport.Namespace)
  @js.native
  open class ^ () extends File
  
  @js.native
  trait File
    extends typingsJapgolly.mockFs.libItemMod.^ {
    
    /** Get the file contents. */
    def getContent(): Buffer = js.native
    
    /** Set the file contents. */
    def setContent(content: String): Unit = js.native
    def setContent(content: Buffer): Unit = js.native
  }
}
