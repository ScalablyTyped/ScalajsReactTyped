package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.Button
import typingsJapgolly.carbonComponents.anon.IconVisibilityOff
import typingsJapgolly.carbonComponents.anon.PartialTextInputOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTextInputTextInputMod {
  
  @JSImport("carbon-components/components/text-input/text-input", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TextInput {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialTextInputOptions) = this()
    
    /* CompleteClass */
    override def _setIconVisibility(
      hasIconVisibilityOnIconVisibilityOffPasswordIsVisibleSelectorPasswordVisibilityTooltip: IconVisibilityOff
    ): Unit = js.native
    
    /* CompleteClass */
    override def _toggle(hasElementButton: Button): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/text-input/text-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/text-input/text-input", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait TextInput extends StObject {
    
    def _setIconVisibility(
      hasIconVisibilityOnIconVisibilityOffPasswordIsVisibleSelectorPasswordVisibilityTooltip: IconVisibilityOff
    ): Unit
    
    def _toggle(hasElementButton: Button): Unit
  }
  object TextInput {
    
    inline def apply(_setIconVisibility: IconVisibilityOff => Callback, _toggle: Button => Callback): TextInput = {
      val __obj = js.Dynamic.literal(_setIconVisibility = js.Any.fromFunction1((t0: IconVisibilityOff) => _setIconVisibility(t0).runNow()), _toggle = js.Any.fromFunction1((t0: Button) => _toggle(t0).runNow()))
      __obj.asInstanceOf[TextInput]
    }
    
    extension [Self <: TextInput](x: Self) {
      
      inline def set_setIconVisibility(value: IconVisibilityOff => Callback): Self = StObject.set(x, "_setIconVisibility", js.Any.fromFunction1((t0: IconVisibilityOff) => value(t0).runNow()))
      
      inline def set_toggle(value: Button => Callback): Self = StObject.set(x, "_toggle", js.Any.fromFunction1((t0: Button) => value(t0).runNow()))
    }
  }
  
  trait TextInputOptions extends StObject {
    
    var passwordIsVisible: String
    
    var selectorInit: String
    
    var selectorPasswordField: String
    
    var selectorPasswordVisibilityButton: String
    
    var selectorPasswordVisibilityTooltip: String
    
    var svgIconVisibilityOff: String
    
    var svgIconVisibilityOn: String
  }
  object TextInputOptions {
    
    inline def apply(
      passwordIsVisible: String,
      selectorInit: String,
      selectorPasswordField: String,
      selectorPasswordVisibilityButton: String,
      selectorPasswordVisibilityTooltip: String,
      svgIconVisibilityOff: String,
      svgIconVisibilityOn: String
    ): TextInputOptions = {
      val __obj = js.Dynamic.literal(passwordIsVisible = passwordIsVisible.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorPasswordField = selectorPasswordField.asInstanceOf[js.Any], selectorPasswordVisibilityButton = selectorPasswordVisibilityButton.asInstanceOf[js.Any], selectorPasswordVisibilityTooltip = selectorPasswordVisibilityTooltip.asInstanceOf[js.Any], svgIconVisibilityOff = svgIconVisibilityOff.asInstanceOf[js.Any], svgIconVisibilityOn = svgIconVisibilityOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextInputOptions]
    }
    
    extension [Self <: TextInputOptions](x: Self) {
      
      inline def setPasswordIsVisible(value: String): Self = StObject.set(x, "passwordIsVisible", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorPasswordField(value: String): Self = StObject.set(x, "selectorPasswordField", value.asInstanceOf[js.Any])
      
      inline def setSelectorPasswordVisibilityButton(value: String): Self = StObject.set(x, "selectorPasswordVisibilityButton", value.asInstanceOf[js.Any])
      
      inline def setSelectorPasswordVisibilityTooltip(value: String): Self = StObject.set(x, "selectorPasswordVisibilityTooltip", value.asInstanceOf[js.Any])
      
      inline def setSvgIconVisibilityOff(value: String): Self = StObject.set(x, "svgIconVisibilityOff", value.asInstanceOf[js.Any])
      
      inline def setSvgIconVisibilityOn(value: String): Self = StObject.set(x, "svgIconVisibilityOn", value.asInstanceOf[js.Any])
    }
  }
}
