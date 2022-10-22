package typingsJapgolly.cucumberMessageStreams

import typingsJapgolly.cucumberMessages.mod.Envelope
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcMessageToNdjsonStreamMod {
  
  @JSImport("@cucumber/message-streams/dist/cjs/src/MessageToNdjsonStream", JSImport.Default)
  @js.native
  open class default () extends MessageToNdjsonStream
  
  @js.native
  trait MessageToNdjsonStream extends Transform {
    
    def _transform(envelope: Envelope, encoding: String, callback: TransformCallback): Unit = js.native
  }
}
