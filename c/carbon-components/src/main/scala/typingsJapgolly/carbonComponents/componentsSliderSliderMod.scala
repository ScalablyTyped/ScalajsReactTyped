package typingsJapgolly.carbonComponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.carbonComponents.anon.Max
import typingsJapgolly.carbonComponents.anon.NewValue
import typingsJapgolly.carbonComponents.anon.PartialSliderOptions
import typingsJapgolly.carbonComponents.anon.Value
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSliderSliderMod {
  
  @JSImport("carbon-components/components/slider/slider", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Slider {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialSliderOptions) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/slider/slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/slider/slider", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Slider extends StObject {
    
    def _calcValue(): NewValue = js.native
    def _calcValue(evt: MouseEvent): NewValue = js.native
    
    def _changeState(state: String, detail: Value): Unit = js.native
    def _changeState(state: String, detail: Value, callback: js.Function0[Unit]): Unit = js.native
    
    def _updateInput(): Unit = js.native
    
    def _updatePosition(): Unit = js.native
    def _updatePosition(evt: MouseEvent): Unit = js.native
    
    def getInputProps(): Max = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: Double): Unit = js.native
    
    def stepDown(): Unit = js.native
    
    def stepUp(): Unit = js.native
  }
  
  trait SliderOptions extends StObject {
    
    var classDisabled: String
    
    var classThumbClicked: String
    
    var eventAfterSliderValueChange: String
    
    var eventBeforeSliderValueChange: String
    
    var selectorFilledTrack: String
    
    var selectorInit: String
    
    var selectorInput: String
    
    var selectorThumb: String
    
    var selectorTrack: String
    
    var stepMultiplier: Double
  }
  object SliderOptions {
    
    inline def apply(
      classDisabled: String,
      classThumbClicked: String,
      eventAfterSliderValueChange: String,
      eventBeforeSliderValueChange: String,
      selectorFilledTrack: String,
      selectorInit: String,
      selectorInput: String,
      selectorThumb: String,
      selectorTrack: String,
      stepMultiplier: Double
    ): SliderOptions = {
      val __obj = js.Dynamic.literal(classDisabled = classDisabled.asInstanceOf[js.Any], classThumbClicked = classThumbClicked.asInstanceOf[js.Any], eventAfterSliderValueChange = eventAfterSliderValueChange.asInstanceOf[js.Any], eventBeforeSliderValueChange = eventBeforeSliderValueChange.asInstanceOf[js.Any], selectorFilledTrack = selectorFilledTrack.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorInput = selectorInput.asInstanceOf[js.Any], selectorThumb = selectorThumb.asInstanceOf[js.Any], selectorTrack = selectorTrack.asInstanceOf[js.Any], stepMultiplier = stepMultiplier.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderOptions]
    }
    
    extension [Self <: SliderOptions](x: Self) {
      
      inline def setClassDisabled(value: String): Self = StObject.set(x, "classDisabled", value.asInstanceOf[js.Any])
      
      inline def setClassThumbClicked(value: String): Self = StObject.set(x, "classThumbClicked", value.asInstanceOf[js.Any])
      
      inline def setEventAfterSliderValueChange(value: String): Self = StObject.set(x, "eventAfterSliderValueChange", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeSliderValueChange(value: String): Self = StObject.set(x, "eventBeforeSliderValueChange", value.asInstanceOf[js.Any])
      
      inline def setSelectorFilledTrack(value: String): Self = StObject.set(x, "selectorFilledTrack", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorInput(value: String): Self = StObject.set(x, "selectorInput", value.asInstanceOf[js.Any])
      
      inline def setSelectorThumb(value: String): Self = StObject.set(x, "selectorThumb", value.asInstanceOf[js.Any])
      
      inline def setSelectorTrack(value: String): Self = StObject.set(x, "selectorTrack", value.asInstanceOf[js.Any])
      
      inline def setStepMultiplier(value: Double): Self = StObject.set(x, "stepMultiplier", value.asInstanceOf[js.Any])
    }
  }
}
