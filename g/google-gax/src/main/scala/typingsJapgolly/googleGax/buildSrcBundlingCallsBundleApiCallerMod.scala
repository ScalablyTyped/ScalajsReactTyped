package typingsJapgolly.googleGax

import typingsJapgolly.googleGax.buildSrcApiCallerMod.APICaller
import typingsJapgolly.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsJapgolly.googleGax.buildSrcBundlingCallsBundleExecutorMod.BundleExecutor
import typingsJapgolly.googleGax.buildSrcCallMod.OngoingCallPromise
import typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBundlingCallsBundleApiCallerMod {
  
  @JSImport("google-gax/build/src/bundlingCalls/bundleApiCaller", "BundleApiCaller")
  @js.native
  open class BundleApiCaller protected ()
    extends StObject
       with APICaller {
    def this(bundler: BundleExecutor) = this()
    
    var bundler: BundleExecutor = js.native
    
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallSettings,
      status: OngoingCallPromise
    ): Unit = js.native
  }
}
