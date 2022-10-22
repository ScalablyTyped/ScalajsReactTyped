package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialCopyButtonOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCopyButtonCopyButtonMod {
  
  @JSImport("carbon-components/components/copy-button/copy-button", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CopyButton {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialCopyButtonOptions) = this()
    
    /* CompleteClass */
    override def handleAnimationEnd(event: AnimationEvent): Unit = js.native
    
    /* CompleteClass */
    override def handleClick(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/copy-button/copy-button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/copy-button/copy-button", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CopyButton extends StObject {
    
    def handleAnimationEnd(event: AnimationEvent): Unit
    
    def handleClick(): Unit
  }
  object CopyButton {
    
    inline def apply(handleAnimationEnd: AnimationEvent => Callback, handleClick: Callback): CopyButton = {
      val __obj = js.Dynamic.literal(handleAnimationEnd = js.Any.fromFunction1((t0: AnimationEvent) => handleAnimationEnd(t0).runNow()), handleClick = handleClick.toJsFn)
      __obj.asInstanceOf[CopyButton]
    }
    
    extension [Self <: CopyButton](x: Self) {
      
      inline def setHandleAnimationEnd(value: AnimationEvent => Callback): Self = StObject.set(x, "handleAnimationEnd", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setHandleClick(value: Callback): Self = StObject.set(x, "handleClick", value.toJsFn)
    }
  }
  
  trait CopyButtonOptions extends StObject {
    
    var classAnimating: String
    
    var classFadeIn: String
    
    var classFadeOut: String
    
    var classShowFeedback: String
    
    var feedbackTooltip: String
    
    var selectorInit: String
    
    var timeoutValue: Double
  }
  object CopyButtonOptions {
    
    inline def apply(
      classAnimating: String,
      classFadeIn: String,
      classFadeOut: String,
      classShowFeedback: String,
      feedbackTooltip: String,
      selectorInit: String,
      timeoutValue: Double
    ): CopyButtonOptions = {
      val __obj = js.Dynamic.literal(classAnimating = classAnimating.asInstanceOf[js.Any], classFadeIn = classFadeIn.asInstanceOf[js.Any], classFadeOut = classFadeOut.asInstanceOf[js.Any], classShowFeedback = classShowFeedback.asInstanceOf[js.Any], feedbackTooltip = feedbackTooltip.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], timeoutValue = timeoutValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyButtonOptions]
    }
    
    extension [Self <: CopyButtonOptions](x: Self) {
      
      inline def setClassAnimating(value: String): Self = StObject.set(x, "classAnimating", value.asInstanceOf[js.Any])
      
      inline def setClassFadeIn(value: String): Self = StObject.set(x, "classFadeIn", value.asInstanceOf[js.Any])
      
      inline def setClassFadeOut(value: String): Self = StObject.set(x, "classFadeOut", value.asInstanceOf[js.Any])
      
      inline def setClassShowFeedback(value: String): Self = StObject.set(x, "classShowFeedback", value.asInstanceOf[js.Any])
      
      inline def setFeedbackTooltip(value: String): Self = StObject.set(x, "feedbackTooltip", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setTimeoutValue(value: Double): Self = StObject.set(x, "timeoutValue", value.asInstanceOf[js.Any])
    }
  }
}
