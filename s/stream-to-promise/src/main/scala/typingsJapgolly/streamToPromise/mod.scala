package typingsJapgolly.streamToPromise

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return a promise which resolves when the input stream ends
    * @param stream The input stream
    * @returns A promise containing the stream output as a buffer
    */
  inline def apply(stream: ReadableStream): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  /**
    * Return s promise which resolves when the input stream ends
    * @param stream The input stream
    */
  inline def apply(stream: WritableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(stream: Writable): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("stream-to-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
