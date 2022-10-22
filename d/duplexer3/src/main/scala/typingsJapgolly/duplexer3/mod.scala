package typingsJapgolly.duplexer3

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options, writableStream: WritableStream, readableStream: ReadableStream): Duplex = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], writableStream.asInstanceOf[js.Any], readableStream.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(writableStream: WritableStream, readableStream: ReadableStream): Duplex = (^.asInstanceOf[js.Dynamic].apply(writableStream.asInstanceOf[js.Any], readableStream.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  @JSImport("duplexer3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with DuplexOptions {
    
    var bubbleErrors: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBubbleErrors(value: Boolean): Self = StObject.set(x, "bubbleErrors", value.asInstanceOf[js.Any])
      
      inline def setBubbleErrorsUndefined: Self = StObject.set(x, "bubbleErrors", js.undefined)
    }
  }
}
