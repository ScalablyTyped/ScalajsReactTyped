package typingsJapgolly.reactDynamicNumber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.Space
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings._empty
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.onChange
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.placeholder
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.ref
import typingsJapgolly.reactDynamicNumber.reactDynamicNumberStrings.value
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dynamic-number", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DynamicNumberProps, js.Object, Any]
  
  type BaseInputProps = Partial[
    Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      ref | value | onChange | placeholder
    ]
  ]
  
  type DynamicNumber = japgolly.scalajs.react.facade.React.Component[DynamicNumberProps & js.Object, js.Object]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'> ]:? react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'>[P]} */ trait DynamicNumberProps extends StObject {
    
    var fraction: js.UndefOr[Double] = js.undefined
    
    var integer: js.UndefOr[Double] = js.undefined
    
    var negative: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[HTMLInputElement], 
          /* modelValue */ Double, 
          /* viewValue */ String, 
          Unit
        ]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[Dot | Comma] = js.undefined
    
    var thousand: js.UndefOr[Boolean | Space] = js.undefined
    
    var value: js.UndefOr[Double | _empty] = js.undefined
  }
  object DynamicNumberProps {
    
    inline def apply(): DynamicNumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicNumberProps]
    }
    
    extension [Self <: DynamicNumberProps](x: Self) {
      
      inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setInteger(value: Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ ReactEventFrom[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* modelValue */ Double, t2: /* viewValue */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSeparator(value: Dot | Comma): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setThousand(value: Boolean | Space): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      inline def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
      
      inline def setValue(value: Double | _empty): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
