package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialTooltipSimpleOptio
import typingsJapgolly.carbonComponents.anon.Visible
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTooltipTooltipSimpleMod {
  
  @JSImport("carbon-components/components/tooltip/tooltip--simple", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TooltipSimple {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialTooltipSimpleOptio) = this()
    
    /* CompleteClass */
    override def allowTooltipVisibility(hasVisible: Visible): Unit = js.native
    
    /* CompleteClass */
    override def getTooltipTriggerButton(): Element = js.native
    
    /* CompleteClass */
    override def tooltipFadeOut(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/tooltip/tooltip--simple", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/tooltip/tooltip--simple", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait TooltipSimple extends StObject {
    
    def allowTooltipVisibility(hasVisible: Visible): Unit
    
    def getTooltipTriggerButton(): Element
    
    def tooltipFadeOut(): Unit
  }
  object TooltipSimple {
    
    inline def apply(
      allowTooltipVisibility: Visible => Callback,
      getTooltipTriggerButton: CallbackTo[Element],
      tooltipFadeOut: Callback
    ): TooltipSimple = {
      val __obj = js.Dynamic.literal(allowTooltipVisibility = js.Any.fromFunction1((t0: Visible) => allowTooltipVisibility(t0).runNow()), getTooltipTriggerButton = getTooltipTriggerButton.toJsFn, tooltipFadeOut = tooltipFadeOut.toJsFn)
      __obj.asInstanceOf[TooltipSimple]
    }
    
    extension [Self <: TooltipSimple](x: Self) {
      
      inline def setAllowTooltipVisibility(value: Visible => Callback): Self = StObject.set(x, "allowTooltipVisibility", js.Any.fromFunction1((t0: Visible) => value(t0).runNow()))
      
      inline def setGetTooltipTriggerButton(value: CallbackTo[Element]): Self = StObject.set(x, "getTooltipTriggerButton", value.toJsFn)
      
      inline def setTooltipFadeOut(value: Callback): Self = StObject.set(x, "tooltipFadeOut", value.toJsFn)
    }
  }
  
  trait TooltipSimpleOptions extends StObject {
    
    var classTooltipHidden: String
    
    var classTooltipVisible: String
    
    var selectorInit: String
    
    var selectorTriggerButton: String
  }
  object TooltipSimpleOptions {
    
    inline def apply(
      classTooltipHidden: String,
      classTooltipVisible: String,
      selectorInit: String,
      selectorTriggerButton: String
    ): TooltipSimpleOptions = {
      val __obj = js.Dynamic.literal(classTooltipHidden = classTooltipHidden.asInstanceOf[js.Any], classTooltipVisible = classTooltipVisible.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorTriggerButton = selectorTriggerButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipSimpleOptions]
    }
    
    extension [Self <: TooltipSimpleOptions](x: Self) {
      
      inline def setClassTooltipHidden(value: String): Self = StObject.set(x, "classTooltipHidden", value.asInstanceOf[js.Any])
      
      inline def setClassTooltipVisible(value: String): Self = StObject.set(x, "classTooltipVisible", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorTriggerButton(value: String): Self = StObject.set(x, "selectorTriggerButton", value.asInstanceOf[js.Any])
    }
  }
}
