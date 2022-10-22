package typingsJapgolly.sharepoint.global

import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.SPAnimation.Attribute
import typingsJapgolly.sharepoint.SPAnimation.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPAnimation {
  
  @JSGlobal("SPAnimation.Attribute")
  @js.native
  object Attribute extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPAnimation.Attribute & Double] = js.native
    
    /* 2 */ val Height: typingsJapgolly.sharepoint.SPAnimation.Attribute.Height & Double = js.native
    
    /* 4 */ val Opacity: typingsJapgolly.sharepoint.SPAnimation.Attribute.Opacity & Double = js.native
    
    /* 0 */ val PositionX: typingsJapgolly.sharepoint.SPAnimation.Attribute.PositionX & Double = js.native
    
    /* 1 */ val PositionY: typingsJapgolly.sharepoint.SPAnimation.Attribute.PositionY & Double = js.native
    
    /* 3 */ val Width: typingsJapgolly.sharepoint.SPAnimation.Attribute.Width & Double = js.native
  }
  
  @JSGlobal("SPAnimation.ID")
  @js.native
  object ID extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPAnimation.ID & Double] = js.native
    
    /* 2 */ val Basic_Fade: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_Fade & Double = js.native
    
    /* 3 */ val Basic_Move: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_Move & Double = js.native
    
    /* 14 */ val Basic_Opacity: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_Opacity & Double = js.native
    
    /* 16 */ val Basic_QuickFade: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_QuickFade & Double = js.native
    
    /* 15 */ val Basic_QuickShow: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_QuickShow & Double = js.native
    
    /* 21 */ val Basic_QuickSize: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_QuickSize & Double = js.native
    
    /* 0 */ val Basic_Show: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_Show & Double = js.native
    
    /* 4 */ val Basic_Size: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_Size & Double = js.native
    
    /* 1 */ val Basic_SlowShow: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_SlowShow & Double = js.native
    
    /* 18 */ val Basic_StrikeThrough: typingsJapgolly.sharepoint.SPAnimation.ID.Basic_StrikeThrough & Double = js.native
    
    /* 17 */ val Content_SlideInFadeInGeneric: typingsJapgolly.sharepoint.SPAnimation.ID.Content_SlideInFadeInGeneric & Double = js.native
    
    /* 8 */ val Content_SlideInFadeInLeft: typingsJapgolly.sharepoint.SPAnimation.ID.Content_SlideInFadeInLeft & Double = js.native
    
    /* 9 */ val Content_SlideInFadeInLeftInc: typingsJapgolly.sharepoint.SPAnimation.ID.Content_SlideInFadeInLeftInc & Double = js.native
    
    /* 5 */ val Content_SlideInFadeInRight: typingsJapgolly.sharepoint.SPAnimation.ID.Content_SlideInFadeInRight & Double = js.native
    
    /* 6 */ val Content_SlideInFadeInRightInc: typingsJapgolly.sharepoint.SPAnimation.ID.Content_SlideInFadeInRightInc & Double = js.native
    
    /* 7 */ val Content_SlideOutFadeOutRight: typingsJapgolly.sharepoint.SPAnimation.ID.Content_SlideOutFadeOutRight & Double = js.native
    
    /* 19 */ val SmallObject_SlideInFadeInBottom: typingsJapgolly.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInBottom & Double = js.native
    
    /* 11 */ val SmallObject_SlideInFadeInLeft: typingsJapgolly.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInLeft & Double = js.native
    
    /* 10 */ val SmallObject_SlideInFadeInTop: typingsJapgolly.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInTop & Double = js.native
    
    /* 20 */ val SmallObject_SlideOutFadeOutBottom: typingsJapgolly.sharepoint.SPAnimation.ID.SmallObject_SlideOutFadeOutBottom & Double = js.native
    
    /* 13 */ val Test_Hold: typingsJapgolly.sharepoint.SPAnimation.ID.Test_Hold & Double = js.native
    
    /* 12 */ val Test_Instant: typingsJapgolly.sharepoint.SPAnimation.ID.Test_Instant & Double = js.native
  }
  
  @JSGlobal("SPAnimation.Object")
  @js.native
  open class Object protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SPAnimation.Object {
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsJapgolly.sharepoint.SPAnimation.State
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsJapgolly.sharepoint.SPAnimation.State
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsJapgolly.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ Any, Unit]
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsJapgolly.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ Any, Unit]
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsJapgolly.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ Any, Unit],
      data: Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsJapgolly.sharepoint.SPAnimation.State,
      finishFunc: Unit,
      data: Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsJapgolly.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ Any, Unit],
      data: Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsJapgolly.sharepoint.SPAnimation.State,
      finishFunc: Unit,
      data: Any
    ) = this()
    
    /* CompleteClass */
    override def RunAnimation(): Unit = js.native
  }
  
  @JSGlobal("SPAnimation.Settings")
  @js.native
  open class Settings ()
    extends StObject
       with typingsJapgolly.sharepoint.SPAnimation.Settings
  object Settings {
    
    @JSGlobal("SPAnimation.Settings")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def DisableAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DisableAnimation")().asInstanceOf[Unit]
    
    /* static member */
    inline def DisableSessionAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DisableSessionAnimation")().asInstanceOf[Unit]
    
    /* static member */
    inline def IsAnimationEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAnimationEnabled")().asInstanceOf[Boolean]
  }
  
  @JSGlobal("SPAnimation.State")
  @js.native
  open class State ()
    extends StObject
       with typingsJapgolly.sharepoint.SPAnimation.State {
    
    /* CompleteClass */
    override def GetAttribute(attributeId: Attribute): Double = js.native
    
    /* CompleteClass */
    override def GetDataIndex(attributeId: Attribute): Double = js.native
    
    /* CompleteClass */
    override def SetAttribute(attributeId: Attribute, value: Double): Unit = js.native
  }
}
