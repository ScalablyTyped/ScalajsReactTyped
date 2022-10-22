package typingsJapgolly.fluentuiReactComponentRef.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactComponentRef.distEsRefMod.RefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ref {
  
  @JSImport("@fluentui/react-component-ref", "Ref")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fluentuiReactComponentRef.mod.Ref] {
    
    inline def innerRef(value: typingsJapgolly.react.mod.Ref[HTMLElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: HTMLElement | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
  }
  
  implicit def make(companion: Ref.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RefProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
