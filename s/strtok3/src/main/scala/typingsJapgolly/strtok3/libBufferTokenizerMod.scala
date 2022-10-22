package typingsJapgolly.strtok3

import typingsJapgolly.strtok3.libAbstractTokenizerMod.AbstractTokenizer
import typingsJapgolly.strtok3.libTypesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBufferTokenizerMod {
  
  @JSImport("strtok3/lib/BufferTokenizer", "BufferTokenizer")
  @js.native
  open class BufferTokenizer protected () extends AbstractTokenizer {
    /**
      * Construct BufferTokenizer
      * @param uint8Array - Uint8Array to tokenize
      * @param fileInfo - Pass additional file information to the tokenizer
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
    def this(uint8Array: js.typedarray.Uint8Array, fileInfo: IFileInfo) = this()
    
    /* private */ var uint8Array: Any = js.native
  }
}
