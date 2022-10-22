package typingsJapgolly.strtok3

import typingsJapgolly.node.nodeColonstreamMod.Readable
import typingsJapgolly.strtok3.libAbstractTokenizerMod.AbstractTokenizer
import typingsJapgolly.strtok3.libTypesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadStreamTokenizerMod {
  
  @JSImport("strtok3/lib/ReadStreamTokenizer", "ReadStreamTokenizer")
  @js.native
  open class ReadStreamTokenizer protected () extends AbstractTokenizer {
    def this(stream: Readable) = this()
    def this(stream: Readable, fileInfo: IFileInfo) = this()
    
    /**
      * Get file information, an HTTP-client may implement this doing a HEAD request
      * @return Promise with file information
      */
    def getFileInfo(): js.Promise[IFileInfo] = js.native
    
    /* private */ var streamReader: Any = js.native
  }
}
