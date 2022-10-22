package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distMessageSrcMessageMod.InnerMessageProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.informative
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.negative
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.positive
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.warning
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerMessage {
  
  @JSImport("@orbit-ui/react-components", "InnerMessage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def onDismiss(value: /* event */ ReactMouseEventFrom[Element] => Callback): this.type = set("onDismiss", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def variant(value: informative | warning | positive | negative): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerMessage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerMessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
