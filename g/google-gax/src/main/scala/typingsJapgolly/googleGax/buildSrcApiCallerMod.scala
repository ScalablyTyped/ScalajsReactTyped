package typingsJapgolly.googleGax

import typingsJapgolly.googleGax.buildSrcApitypesMod.APICallback
import typingsJapgolly.googleGax.buildSrcApitypesMod.CancellableStream
import typingsJapgolly.googleGax.buildSrcApitypesMod.GRPCCall
import typingsJapgolly.googleGax.buildSrcApitypesMod.ResultTuple
import typingsJapgolly.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsJapgolly.googleGax.buildSrcCallMod.CancellablePromise
import typingsJapgolly.googleGax.buildSrcCallMod.OngoingCall
import typingsJapgolly.googleGax.buildSrcCallMod.OngoingCallPromise
import typingsJapgolly.googleGax.buildSrcDescriptorMod.Descriptor
import typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings
import typingsJapgolly.googleGax.buildSrcGoogleErrorMod.GoogleError
import typingsJapgolly.googleGax.buildSrcStreamingCallsStreamingMod.StreamProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApiCallerMod {
  
  @JSImport("google-gax/build/src/apiCaller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAPICaller(settings: CallSettings): APICaller = ^.asInstanceOf[js.Dynamic].applyDynamic("createAPICaller")(settings.asInstanceOf[js.Any]).asInstanceOf[APICaller]
  inline def createAPICaller(settings: CallSettings, descriptor: Descriptor): APICaller = (^.asInstanceOf[js.Dynamic].applyDynamic("createAPICaller")(settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[APICaller]
  
  @js.native
  trait APICaller extends StObject {
    
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: OngoingCall): Unit = js.native
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: js.Object,
      canceller: OngoingCallPromise
    ): Unit = js.native
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: StreamProxy): Unit = js.native
    
    def fail(canceller: CancellableStream, err: GoogleError): Unit = js.native
    def fail(canceller: OngoingCallPromise, err: GoogleError): Unit = js.native
    def fail(canceller: OngoingCall, err: GoogleError): Unit = js.native
    
    def init(): OngoingCallPromise | OngoingCall | StreamProxy = js.native
    def init(callback: APICallback): OngoingCallPromise | OngoingCall | StreamProxy = js.native
    
    def result(canceller: CancellableStream): CancellablePromise[ResultTuple] | CancellableStream = js.native
    def result(canceller: OngoingCall): CancellablePromise[ResultTuple] | CancellableStream = js.native
    def result(canceller: OngoingCallPromise): CancellablePromise[ResultTuple] | CancellableStream = js.native
    
    def wrap(func: GRPCCall): GRPCCall = js.native
  }
}
