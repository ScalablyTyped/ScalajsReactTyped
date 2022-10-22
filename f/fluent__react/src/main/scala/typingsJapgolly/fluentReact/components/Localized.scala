package typingsJapgolly.fluentReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentBundle.esmBundleMod.FluentVariable
import typingsJapgolly.fluentReact.esmLocalizedMod.LocalizedProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localized {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizedProps]))
  }
  
  @JSImport("@fluent/react", "Localized")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def attrs(value: Record[String, Boolean]): this.type = set("attrs", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def elems(value: Record[String, Element]): this.type = set("elems", value.asInstanceOf[js.Any])
    
    inline def vars(value: Record[String, FluentVariable]): this.type = set("vars", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocalizedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
