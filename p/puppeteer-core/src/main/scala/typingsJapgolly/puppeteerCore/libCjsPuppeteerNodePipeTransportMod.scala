package typingsJapgolly.puppeteerCore

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodePipeTransportMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/PipeTransport", "PipeTransport")
  @js.native
  open class PipeTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(pipeWrite: WritableStream, pipeRead: ReadableStream) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def send(message: String): Unit = js.native
  }
}
