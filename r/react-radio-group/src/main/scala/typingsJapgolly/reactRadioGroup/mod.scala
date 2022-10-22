package typingsJapgolly.reactRadioGroup

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.reactRadioGroup.anon.Value
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.`aria-checked`
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.`type`
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.name
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.onChange
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.role
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.value
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Radio extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-radio-group", "Radio")
    @js.native
    open class ^ protected ()
      extends Component[RadioProps, js.Object, Any] {
      def this(props: RadioProps) = this()
      def this(props: RadioProps, context: Any) = this()
    }
    
    @JSImport("react-radio-group", "Radio")
    @js.native
    val ^ : js.Object & (ComponentClass[RadioProps, js.Object]) = js.native
    
    type RadioProps = (Omit[
        InputHTMLAttributes[HTMLInputElement], 
        value | name | role | `type` | `aria-checked`
      ]) & Value
    
    type _To = js.Object & (ComponentClass[RadioProps, js.Object])
    
    /* This means you don't have to write `^`, but can instead just say `Radio.foo` */
    override def _to: js.Object & (ComponentClass[RadioProps, js.Object]) = ^
  }
  
  object RadioGroup extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-radio-group", "RadioGroup")
    @js.native
    open class ^ protected ()
      extends Component[RadioGroupProps, js.Object, Any] {
      def this(props: RadioGroupProps) = this()
      def this(props: RadioGroupProps, context: Any) = this()
    }
    
    @JSImport("react-radio-group", "RadioGroup")
    @js.native
    val ^ : js.Object & (ComponentClass[RadioGroupProps, js.Object]) = js.native
    
    type RadioGroupProps = (Omit[HTMLProps[Any], onChange]) & typingsJapgolly.reactRadioGroup.anon.Component
    
    type _To = js.Object & (ComponentClass[RadioGroupProps, js.Object])
    
    /* This means you don't have to write `^`, but can instead just say `RadioGroup.foo` */
    override def _to: js.Object & (ComponentClass[RadioGroupProps, js.Object]) = ^
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
