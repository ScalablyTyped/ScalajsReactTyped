package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.reactNativeGestureHandler.anon.ConfigminVelocityXnumberu
import typingsJapgolly.reactNativeGestureHandler.anon.DeltaRotation
import typingsJapgolly.reactNativeGestureHandler.anon.Failed
import typingsJapgolly.reactNativeGestureHandler.anon.HammerInputExtdeltaRotati
import typingsJapgolly.reactNativeGestureHandler.anon.Success
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerGestureHandlerMod.HammerInputExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHammerPanGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/PanGestureHandler", JSImport.Default)
  @js.native
  open class default () extends PanGestureHandler
  
  @js.native
  trait PanGestureHandler
    extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerDraggingGestureHandlerMod.default {
    
    def getDirection(): Double = js.native
    
    def isGestureEnabledForEvent(props: Any, _recognizer: Any, inputData: HammerInputExtdeltaRotati): Failed | Success = js.native
    
    def shouldActivateUnderCustomCriteria(hasDeltaXDeltaYVelocity: Any, criteria: Any): Boolean = js.native
    
    def shouldFailUnderCustomCriteria(hasDeltaXDeltaY: HammerInputExt, criteria: Any): Boolean = js.native
    
    def shouldMultiFingerPanFail(hasPointerLengthScaleDeltaRotation: DeltaRotation): Boolean = js.native
    
    def updateHasCustomActivationCriteria(criteria: ConfigminVelocityXnumberu): Boolean = js.native
  }
}
