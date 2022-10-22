package typingsJapgolly.inkGradient

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.inkGradient.anon.Children
import typingsJapgolly.inkGradient.inkGradientStrings.atlas
import typingsJapgolly.inkGradient.inkGradientStrings.cristal
import typingsJapgolly.inkGradient.inkGradientStrings.fruit
import typingsJapgolly.inkGradient.inkGradientStrings.instagram
import typingsJapgolly.inkGradient.inkGradientStrings.mind
import typingsJapgolly.inkGradient.inkGradientStrings.morning
import typingsJapgolly.inkGradient.inkGradientStrings.passion
import typingsJapgolly.inkGradient.inkGradientStrings.pastel
import typingsJapgolly.inkGradient.inkGradientStrings.rainbow
import typingsJapgolly.inkGradient.inkGradientStrings.retro
import typingsJapgolly.inkGradient.inkGradientStrings.summer
import typingsJapgolly.inkGradient.inkGradientStrings.teen
import typingsJapgolly.inkGradient.inkGradientStrings.vice
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-gradient", JSImport.Namespace)
  @js.native
  val ^ : FC[GradientProps] = js.native
  
  type GradientProps = (XOR[PropsName, PropsColor]) & Children
  
  // note, object[] in this case refers to objects interpretable by tinycolor2
  trait PropsColor extends StObject {
    
    var colors: js.Array[js.Object | String]
  }
  object PropsColor {
    
    inline def apply(colors: js.Array[js.Object | String]): PropsColor = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsColor]
    }
    
    extension [Self <: PropsColor](x: Self) {
      
      inline def setColors(value: js.Array[js.Object | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "colors", js.Array(value*))
    }
  }
  
  trait PropsName extends StObject {
    
    var name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
  }
  object PropsName {
    
    inline def apply(
      name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
    ): PropsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsName]
    }
    
    extension [Self <: PropsName](x: Self) {
      
      inline def setName(
        value: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  // This needs to be updated when TypeScript enhances their support for mutual
  // exclusivity in properties. This edit I made will now throw errors when
  // a user gives both of the mutually exclusive props.
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    }}}
    */
  @js.native
  trait Without[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T | U extends object ? ink-gradient.ink-gradient.Without<T, U> & U | ink-gradient.ink-gradient.Without<U, T> & T : T | U
    }}}
    */
  @js.native
  trait XOR[T, U] extends StObject
  
  type _To = FC[GradientProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[GradientProps] = ^
}
