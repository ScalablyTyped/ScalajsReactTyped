package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.hammerjs.HammerInput
import typingsJapgolly.reactNativeGestureHandler.anon.MaxDelayMs
import typingsJapgolly.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerGestureHandlerMod.HammerInputExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHammerTapGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/TapGestureHandler", JSImport.Default)
  @js.native
  open class default () extends TapGestureHandler
  
  @js.native
  trait TapGestureHandler
    extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerDiscreteGestureHandlerMod.default {
    
    /* private */ var _multiTapTimer: Any = js.native
    
    /* private */ var _shouldFireEndEvent: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    def maxDelayMs: Any = js.native
    
    def onGestureEnded(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param props because its type any is not an array type */ props: Any
    ): Unit = js.native
    
    def onRawEvent(ev: HammerInput): Unit = js.native
    
    def onSuccessfulTap(ev: HammerInputExt): Unit = js.native
    
    def onWaitingEnded(_gesture: Any): Unit = js.native
    
    def simulateCancelEvent(inputData: HammerInputExt): Unit = js.native
    
    def updateGestureConfig(
      hasShouldCancelWhenOutsideMaxDeltaXMaxDeltaYNumberOfTapsMinDurationMsMaxDelayMsMaxDurationMsMaxDistMinPointersMaxPointersProps: MaxDelayMs
    ): PartialenabledbooleanminP = js.native
  }
}
