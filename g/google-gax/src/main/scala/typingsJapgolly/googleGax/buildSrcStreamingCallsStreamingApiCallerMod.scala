package typingsJapgolly.googleGax

import typingsJapgolly.googleGax.buildSrcApiCallerMod.APICaller
import typingsJapgolly.googleGax.buildSrcApitypesMod.CancellableStream
import typingsJapgolly.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings
import typingsJapgolly.googleGax.buildSrcStreamingCallsStreamDescriptorMod.StreamDescriptor
import typingsJapgolly.googleGax.buildSrcStreamingCallsStreamingMod.StreamProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStreamingCallsStreamingApiCallerMod {
  
  @JSImport("google-gax/build/src/streamingCalls/streamingApiCaller", "StreamingApiCaller")
  @js.native
  open class StreamingApiCaller protected ()
    extends StObject
       with APICaller {
    /**
      * An API caller for methods of gRPC streaming.
      * @private
      * @constructor
      * @param {StreamDescriptor} descriptor - the descriptor of the method structure.
      */
    def this(descriptor: StreamDescriptor) = this()
    
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: CallSettings, stream: StreamProxy): Unit = js.native
    
    var descriptor: StreamDescriptor = js.native
    
    def fail(stream: CancellableStream, err: js.Error): Unit = js.native
  }
}
