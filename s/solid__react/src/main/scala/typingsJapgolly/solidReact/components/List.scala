package typingsJapgolly.solidReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.solidReact.mod.LDflexValue
import typingsJapgolly.solidReact.mod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
  
  @JSImport("@solid/react", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.solidReact.mod.List] {
    
    inline def children(value: (/* listItem */ LDflexValue, /* index */ Double) => Element): this.type = set("children", js.Any.fromFunction2(value))
    
    inline def container(value: /* items */ Element => Element): this.type = set("container", js.Any.fromFunction1(value))
    
    inline def filter(
      value: (/* item */ LDflexValue, /* index */ Double, /* array */ js.Array[LDflexValue]) => /* is @solid/react.@solid/react.LDflexValue */ Boolean
    ): this.type = set("filter", js.Any.fromFunction3(value))
    
    inline def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
