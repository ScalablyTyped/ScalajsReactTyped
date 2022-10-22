package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPAnimation {
  
  @js.native
  sealed trait Attribute extends StObject
  @JSGlobal("SPAnimation.Attribute")
  @js.native
  object Attribute extends StObject {
    
    @js.native
    sealed trait Height
      extends StObject
         with Attribute
    
    @js.native
    sealed trait Opacity
      extends StObject
         with Attribute
    
    @js.native
    sealed trait PositionX
      extends StObject
         with Attribute
    
    @js.native
    sealed trait PositionY
      extends StObject
         with Attribute
    
    @js.native
    sealed trait Width
      extends StObject
         with Attribute
  }
  
  @js.native
  sealed trait ID extends StObject
  @JSGlobal("SPAnimation.ID")
  @js.native
  object ID extends StObject {
    
    @js.native
    sealed trait Basic_Fade
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_Move
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_Opacity
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_QuickFade
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_QuickShow
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_QuickSize
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_Show
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_Size
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_SlowShow
      extends StObject
         with ID
    
    @js.native
    sealed trait Basic_StrikeThrough
      extends StObject
         with ID
    
    @js.native
    sealed trait Content_SlideInFadeInGeneric
      extends StObject
         with ID
    
    @js.native
    sealed trait Content_SlideInFadeInLeft
      extends StObject
         with ID
    
    @js.native
    sealed trait Content_SlideInFadeInLeftInc
      extends StObject
         with ID
    
    @js.native
    sealed trait Content_SlideInFadeInRight
      extends StObject
         with ID
    
    @js.native
    sealed trait Content_SlideInFadeInRightInc
      extends StObject
         with ID
    
    @js.native
    sealed trait Content_SlideOutFadeOutRight
      extends StObject
         with ID
    
    @js.native
    sealed trait SmallObject_SlideInFadeInBottom
      extends StObject
         with ID
    
    @js.native
    sealed trait SmallObject_SlideInFadeInLeft
      extends StObject
         with ID
    
    @js.native
    sealed trait SmallObject_SlideInFadeInTop
      extends StObject
         with ID
    
    @js.native
    sealed trait SmallObject_SlideOutFadeOutBottom
      extends StObject
         with ID
    
    @js.native
    sealed trait Test_Hold
      extends StObject
         with ID
    
    @js.native
    sealed trait Test_Instant
      extends StObject
         with ID
  }
  
  trait Object extends StObject {
    
    def RunAnimation(): Unit
  }
  object Object {
    
    inline def apply(RunAnimation: Callback): Object = {
      val __obj = js.Dynamic.literal(RunAnimation = RunAnimation.toJsFn)
      __obj.asInstanceOf[Object]
    }
    
    extension [Self <: Object](x: Self) {
      
      inline def setRunAnimation(value: Callback): Self = StObject.set(x, "RunAnimation", value.toJsFn)
    }
  }
  
  trait Settings extends StObject
  
  trait State extends StObject {
    
    def GetAttribute(attributeId: Attribute): Double
    
    def GetDataIndex(attributeId: Attribute): Double
    
    def SetAttribute(attributeId: Attribute, value: Double): Unit
  }
  object State {
    
    inline def apply(
      GetAttribute: Attribute => Double,
      GetDataIndex: Attribute => Double,
      SetAttribute: (Attribute, Double) => Callback
    ): State = {
      val __obj = js.Dynamic.literal(GetAttribute = js.Any.fromFunction1(GetAttribute), GetDataIndex = js.Any.fromFunction1(GetDataIndex), SetAttribute = js.Any.fromFunction2((t0: Attribute, t1: Double) => (SetAttribute(t0, t1)).runNow()))
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setGetAttribute(value: Attribute => Double): Self = StObject.set(x, "GetAttribute", js.Any.fromFunction1(value))
      
      inline def setGetDataIndex(value: Attribute => Double): Self = StObject.set(x, "GetDataIndex", js.Any.fromFunction1(value))
      
      inline def setSetAttribute(value: (Attribute, Double) => Callback): Self = StObject.set(x, "SetAttribute", js.Any.fromFunction2((t0: Attribute, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
}
