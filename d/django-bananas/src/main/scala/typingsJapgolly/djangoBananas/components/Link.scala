package typingsJapgolly.djangoBananas.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.djangoBananas.mod.LinkProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @JSImport("django-bananas", "Link")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.djangoBananas.mod.Link] {
    
    inline def children(value: String | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def hash(value: String): this.type = set("hash", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def params(value: Record[String, String | Double]): this.type = set("params", value.asInstanceOf[js.Any])
    
    inline def passHref(value: Boolean): this.type = set("passHref", value.asInstanceOf[js.Any])
    
    inline def patch(value: Boolean): this.type = set("patch", value.asInstanceOf[js.Any])
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def query(value: String | (Record[String, String | Double])): this.type = set("query", value.asInstanceOf[js.Any])
    
    inline def route(value: String): this.type = set("route", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Link.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
