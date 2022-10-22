package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHammerFlingGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/FlingGestureHandler", JSImport.Default)
  @js.native
  open class default () extends FlingGestureHandler
  
  @js.native
  trait FlingGestureHandler
    extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerDraggingGestureHandlerMod.default {
    
    def getDirection(): Double = js.native
    
    def getTargetDirections(direction: Double): js.Array[Double] = js.native
    
    def updateGestureConfig(hasNumberOfPointersDirectionProps: Any): PartialenabledbooleanminP = js.native
  }
}
