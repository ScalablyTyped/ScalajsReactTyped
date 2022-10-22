package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactIntl.libSrcComponentsPluralMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plural {
  
  inline def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-intl/lib/src/components/plural", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: /* value */ Node => Element | Null): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def few(value: VdomNode): this.type = set("few", value.rawNode.asInstanceOf[js.Any])
    
    inline def fewNull: this.type = set("few", null)
    
    inline def fewVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("few", js.Array(value*))
    
    inline def fewVdomElement(value: VdomElement): this.type = set("few", value.rawElement.asInstanceOf[js.Any])
    
    inline def many(value: VdomNode): this.type = set("many", value.rawNode.asInstanceOf[js.Any])
    
    inline def manyNull: this.type = set("many", null)
    
    inline def manyVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("many", js.Array(value*))
    
    inline def manyVdomElement(value: VdomElement): this.type = set("many", value.rawElement.asInstanceOf[js.Any])
    
    inline def one(value: VdomNode): this.type = set("one", value.rawNode.asInstanceOf[js.Any])
    
    inline def oneNull: this.type = set("one", null)
    
    inline def oneVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("one", js.Array(value*))
    
    inline def oneVdomElement(value: VdomElement): this.type = set("one", value.rawElement.asInstanceOf[js.Any])
    
    inline def other(value: VdomNode): this.type = set("other", value.rawNode.asInstanceOf[js.Any])
    
    inline def otherNull: this.type = set("other", null)
    
    inline def otherVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("other", js.Array(value*))
    
    inline def otherVdomElement(value: VdomElement): this.type = set("other", value.rawElement.asInstanceOf[js.Any])
    
    inline def two(value: VdomNode): this.type = set("two", value.rawNode.asInstanceOf[js.Any])
    
    inline def twoNull: this.type = set("two", null)
    
    inline def twoVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("two", js.Array(value*))
    
    inline def twoVdomElement(value: VdomElement): this.type = set("two", value.rawElement.asInstanceOf[js.Any])
    
    inline def zero(value: VdomNode): this.type = set("zero", value.rawNode.asInstanceOf[js.Any])
    
    inline def zeroNull: this.type = set("zero", null)
    
    inline def zeroVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("zero", js.Array(value*))
    
    inline def zeroVdomElement(value: VdomElement): this.type = set("zero", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
