package typingsJapgolly.reachCombobox.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachCombobox.mod.ComboboxContextValue
import typingsJapgolly.reachCombobox.mod.ComboboxProps
import typingsJapgolly.reachCombobox.mod.ComboboxValue
import typingsJapgolly.reachCombobox.reachComboboxStrings.div
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Combobox {
  
  @JSImport("@reach/combobox", "Combobox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* props */ ComboboxContextValue, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ ComboboxContextValue => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def onSelect(value: /* value */ ComboboxValue => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* value */ ComboboxValue) => value(t0).runNow()))
    
    inline def openOnFocus(value: Boolean): this.type = set("openOnFocus", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Combobox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      ComboboxProps & As[div]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
