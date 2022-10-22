package typingsJapgolly.bufferSplit

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buf: Buffer, splitBuf: Buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], splitBuf.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  inline def apply(buf: Buffer, splitBuf: Buffer, includeDelim: Boolean): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], splitBuf.asInstanceOf[js.Any], includeDelim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  @JSImport("buffer-split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
