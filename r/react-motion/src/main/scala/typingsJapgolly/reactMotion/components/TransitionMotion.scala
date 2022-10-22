package typingsJapgolly.reactMotion.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactMotion.mod.InterpolateFunction
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotion.mod.TransitionPlainStyle
import typingsJapgolly.reactMotion.mod.TransitionProps
import typingsJapgolly.reactMotion.mod.TransitionStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransitionMotion {
  
  inline def apply(styles: js.Array[TransitionStyle] | InterpolateFunction): Builder = {
    val __props = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransitionProps]))
  }
  
  @JSImport("react-motion", "TransitionMotion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMotion.mod.TransitionMotion] {
    
    inline def children(value: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def defaultStyles(value: js.Array[TransitionPlainStyle]): this.type = set("defaultStyles", value.asInstanceOf[js.Any])
    
    inline def defaultStylesVarargs(value: TransitionPlainStyle*): this.type = set("defaultStyles", js.Array(value*))
    
    inline def didLeave(value: /* styleThatLeft */ TransitionStyle => Callback): this.type = set("didLeave", js.Any.fromFunction1((t0: /* styleThatLeft */ TransitionStyle) => value(t0).runNow()))
    
    inline def willEnter(value: /* styleThatEntered */ TransitionStyle => PlainStyle): this.type = set("willEnter", js.Any.fromFunction1(value))
    
    inline def willLeave(value: /* styleThatLeft */ TransitionStyle => Style | Unit): this.type = set("willLeave", js.Any.fromFunction1(value))
  }
  
  def withProps(p: TransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
