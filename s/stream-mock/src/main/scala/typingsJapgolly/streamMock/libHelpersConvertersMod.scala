package typingsJapgolly.streamMock

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.streamMock.libTypesChunkMod.IChunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersConvertersMod {
  
  @JSImport("stream-mock/lib/helpers/converters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chunk2Buffer(chunk: IChunk): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("chunk2Buffer")(chunk.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
