package typingsJapgolly.reachCombobox.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachCombobox.mod.ComboboxOptionContextValue
import typingsJapgolly.reachCombobox.mod.ComboboxOptionProps
import typingsJapgolly.reachCombobox.reachComboboxStrings.li
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboboxOption {
  
  inline def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Merge[
    /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
    ComboboxOptionProps & As[li]
  ]]))
  }
  
  @JSImport("@reach/combobox", "ComboboxOption")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: li): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* props */ ComboboxOptionContextValue, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ ComboboxOptionContextValue => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      ComboboxOptionProps & As[li]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
