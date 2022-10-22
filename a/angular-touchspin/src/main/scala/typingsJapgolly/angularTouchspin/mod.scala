package typingsJapgolly.angularTouchspin

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-touchspin", JSImport.Default)
  @js.native
  val default: String = js.native
  
  object angularTouchspin {
    
    @js.native
    sealed trait StepDivisibilityType extends StObject
    @JSImport("angular-touchspin", "angularTouchspin.StepDivisibilityType")
    @js.native
    object StepDivisibilityType extends StObject {
      
      @js.native
      sealed trait ceil
        extends StObject
           with StepDivisibilityType
      
      @js.native
      sealed trait floor
        extends StObject
           with StepDivisibilityType
      
      @js.native
      sealed trait none
        extends StObject
           with StepDivisibilityType
      
      @js.native
      sealed trait round
        extends StObject
           with StepDivisibilityType
    }
    
    type ITouchSpinConfig = typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions
    
    trait ITouchSpinConfigProvider extends StObject {
      
      def defaults(touchSpinOptions: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions): Unit
    }
    object ITouchSpinConfigProvider {
      
      inline def apply(defaults: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions => Callback): typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider = {
        val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1((t0: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions) => defaults(t0).runNow()))
        __obj.asInstanceOf[typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider]
      }
      
      extension [Self <: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider](x: Self) {
        
        inline def setDefaults(value: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions => Callback): Self = StObject.set(x, "defaults", js.Any.fromFunction1((t0: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions) => value(t0).runNow()))
      }
    }
    
    trait ITouchSpinOptions extends StObject {
      
      var buttonDownClass: js.UndefOr[String] = js.undefined
      
      var buttonDownShow: js.UndefOr[Boolean] = js.undefined
      
      var buttonDownTxt: js.UndefOr[String] = js.undefined
      
      var buttonUpClass: js.UndefOr[String] = js.undefined
      
      var buttonUpShow: js.UndefOr[Boolean] = js.undefined
      
      var buttonUpTxt: js.UndefOr[String] = js.undefined
      
      var decimals: js.UndefOr[Double] = js.undefined
      
      var decimalsDelimiter: js.UndefOr[String] = js.undefined
      
      var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.undefined
      
      // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
      var inputReadOnly: js.UndefOr[Boolean] = js.undefined
      
      var max: js.UndefOr[Double] = js.undefined
      
      var min: js.UndefOr[Double] = js.undefined
      
      var mousewheel: js.UndefOr[Boolean] = js.undefined
      
      var postfix: js.UndefOr[String] = js.undefined
      
      var postfixExtraClass: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var prefixExtraClass: js.UndefOr[String] = js.undefined
      
      var step: js.UndefOr[Double] = js.undefined
      
      var stepInterval: js.UndefOr[Double] = js.undefined
      
      var stepIntervalDelay: js.UndefOr[Double] = js.undefined
      
      var verticalButtons: js.UndefOr[Boolean] = js.undefined
      
      var verticalDownClass: js.UndefOr[String] = js.undefined
      
      var verticalUpClass: js.UndefOr[String] = js.undefined
    }
    object ITouchSpinOptions {
      
      inline def apply(): typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions]
      }
      
      extension [Self <: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions](x: Self) {
        
        inline def setButtonDownClass(value: String): Self = StObject.set(x, "buttonDownClass", value.asInstanceOf[js.Any])
        
        inline def setButtonDownClassUndefined: Self = StObject.set(x, "buttonDownClass", js.undefined)
        
        inline def setButtonDownShow(value: Boolean): Self = StObject.set(x, "buttonDownShow", value.asInstanceOf[js.Any])
        
        inline def setButtonDownShowUndefined: Self = StObject.set(x, "buttonDownShow", js.undefined)
        
        inline def setButtonDownTxt(value: String): Self = StObject.set(x, "buttonDownTxt", value.asInstanceOf[js.Any])
        
        inline def setButtonDownTxtUndefined: Self = StObject.set(x, "buttonDownTxt", js.undefined)
        
        inline def setButtonUpClass(value: String): Self = StObject.set(x, "buttonUpClass", value.asInstanceOf[js.Any])
        
        inline def setButtonUpClassUndefined: Self = StObject.set(x, "buttonUpClass", js.undefined)
        
        inline def setButtonUpShow(value: Boolean): Self = StObject.set(x, "buttonUpShow", value.asInstanceOf[js.Any])
        
        inline def setButtonUpShowUndefined: Self = StObject.set(x, "buttonUpShow", js.undefined)
        
        inline def setButtonUpTxt(value: String): Self = StObject.set(x, "buttonUpTxt", value.asInstanceOf[js.Any])
        
        inline def setButtonUpTxtUndefined: Self = StObject.set(x, "buttonUpTxt", js.undefined)
        
        inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
        
        inline def setDecimalsDelimiter(value: String): Self = StObject.set(x, "decimalsDelimiter", value.asInstanceOf[js.Any])
        
        inline def setDecimalsDelimiterUndefined: Self = StObject.set(x, "decimalsDelimiter", js.undefined)
        
        inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
        
        inline def setForceStepDivisibility(value: StepDivisibilityType): Self = StObject.set(x, "forceStepDivisibility", value.asInstanceOf[js.Any])
        
        inline def setForceStepDivisibilityUndefined: Self = StObject.set(x, "forceStepDivisibility", js.undefined)
        
        inline def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
        
        inline def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
        
        inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
        
        inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
        
        inline def setPostfixExtraClass(value: String): Self = StObject.set(x, "postfixExtraClass", value.asInstanceOf[js.Any])
        
        inline def setPostfixExtraClassUndefined: Self = StObject.set(x, "postfixExtraClass", js.undefined)
        
        inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixExtraClass(value: String): Self = StObject.set(x, "prefixExtraClass", value.asInstanceOf[js.Any])
        
        inline def setPrefixExtraClassUndefined: Self = StObject.set(x, "prefixExtraClass", js.undefined)
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        inline def setStepInterval(value: Double): Self = StObject.set(x, "stepInterval", value.asInstanceOf[js.Any])
        
        inline def setStepIntervalDelay(value: Double): Self = StObject.set(x, "stepIntervalDelay", value.asInstanceOf[js.Any])
        
        inline def setStepIntervalDelayUndefined: Self = StObject.set(x, "stepIntervalDelay", js.undefined)
        
        inline def setStepIntervalUndefined: Self = StObject.set(x, "stepInterval", js.undefined)
        
        inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        inline def setVerticalButtons(value: Boolean): Self = StObject.set(x, "verticalButtons", value.asInstanceOf[js.Any])
        
        inline def setVerticalButtonsUndefined: Self = StObject.set(x, "verticalButtons", js.undefined)
        
        inline def setVerticalDownClass(value: String): Self = StObject.set(x, "verticalDownClass", value.asInstanceOf[js.Any])
        
        inline def setVerticalDownClassUndefined: Self = StObject.set(x, "verticalDownClass", js.undefined)
        
        inline def setVerticalUpClass(value: String): Self = StObject.set(x, "verticalUpClass", value.asInstanceOf[js.Any])
        
        inline def setVerticalUpClassUndefined: Self = StObject.set(x, "verticalUpClass", js.undefined)
      }
    }
  }
  
  type ITouchSpinConfig = typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinConfig
  
  type ITouchSpinConfigProvider = typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider
  
  type ITouchSpinOptions = typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions
  
  type _To = String
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: String = default
}
