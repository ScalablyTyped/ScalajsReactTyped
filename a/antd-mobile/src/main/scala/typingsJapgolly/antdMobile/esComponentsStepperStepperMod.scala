package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.antdMobileBooleans.`false`
import typingsJapgolly.antdMobile.antdMobileBooleans.`true`
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsStepperStepperMod {
  
  @JSImport("antd-mobile/es/components/stepper/stepper", "Stepper")
  @js.native
  val Stepper: FC[StepperProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.anon.ValuePropsWithNullPickInp
    - typingsJapgolly.antdMobile.anon.ValuePropsPickInputPropso
  */
  trait StepperProps extends StObject
  object StepperProps {
    
    inline def ValuePropsPickInputPropso(): typingsJapgolly.antdMobile.anon.ValuePropsPickInputPropso = {
      val __obj = js.Dynamic.literal(allowEmpty = true)
      __obj.asInstanceOf[typingsJapgolly.antdMobile.anon.ValuePropsPickInputPropso]
    }
    
    inline def ValuePropsWithNullPickInp(): typingsJapgolly.antdMobile.anon.ValuePropsWithNullPickInp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.antdMobile.anon.ValuePropsWithNullPickInp]
    }
  }
  
  trait ValueProps extends StObject {
    
    var allowEmpty: `true`
    
    var defaultValue: js.UndefOr[Double | Null] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double | Null, Unit]] = js.undefined
    
    var value: js.UndefOr[Double | Null] = js.undefined
  }
  object ValueProps {
    
    inline def apply(): ValueProps = {
      val __obj = js.Dynamic.literal(allowEmpty = true)
      __obj.asInstanceOf[ValueProps]
    }
    
    extension [Self <: ValueProps](x: Self) {
      
      inline def setAllowEmpty(value: `true`): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: /* value */ Double | Null => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double | Null) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ValuePropsWithNull extends StObject {
    
    var allowEmpty: js.UndefOr[`false`] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object ValuePropsWithNull {
    
    inline def apply(): ValuePropsWithNull = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValuePropsWithNull]
    }
    
    extension [Self <: ValuePropsWithNull](x: Self) {
      
      inline def setAllowEmpty(value: `false`): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
