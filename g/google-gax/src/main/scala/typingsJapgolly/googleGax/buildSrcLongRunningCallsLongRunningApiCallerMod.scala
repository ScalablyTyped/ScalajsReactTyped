package typingsJapgolly.googleGax

import typingsJapgolly.googleGax.buildSrcApiCallerMod.APICaller
import typingsJapgolly.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsJapgolly.googleGax.buildSrcCallMod.OngoingCallPromise
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLongRunningCallsLongRunningApiCallerMod {
  
  @JSImport("google-gax/build/src/longRunningCalls/longRunningApiCaller", "LongrunningApiCaller")
  @js.native
  open class LongrunningApiCaller protected ()
    extends StObject
       with APICaller {
    /**
      * Creates an API caller that performs polling on a long running operation.
      *
      * @private
      * @constructor
      * @param {LongRunningDescriptor} longrunningDescriptor - Holds the
      * decoders used for unpacking responses and the operationsClient
      * used for polling the operation.
      */
    def this(longrunningDescriptor: LongRunningDescriptor) = this()
    
    /* private */ var _wrapOperation: Any = js.native
    
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallOptions,
      canceller: OngoingCallPromise
    ): Unit = js.native
    
    var longrunningDescriptor: LongRunningDescriptor = js.native
  }
}
