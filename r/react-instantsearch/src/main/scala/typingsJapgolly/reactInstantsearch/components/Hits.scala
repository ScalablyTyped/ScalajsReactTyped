package typingsJapgolly.reactInstantsearch.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactInstantsearchDom.anon.Hit
import typingsJapgolly.reactInstantsearchDom.mod.HitsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hits {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[HitsProps[T]]))
  }
  
  @JSImport("react-instantsearch/dom", "Hits")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearch.domMod.Hits[T]] {
    
    inline def hitComponent(value: ComponentType[Hit[T]]): this.type = set("hitComponent", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: Hits.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: HitsProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
