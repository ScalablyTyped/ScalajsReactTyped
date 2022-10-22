package typingsJapgolly.reactPrimitives.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNative.mod.FlatListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlatList {
  
  inline def apply[ItemT](): Builder[ItemT] = {
    val __props = js.Dynamic.literal()
    new Builder[ItemT](js.Array(this.component, __props.asInstanceOf[AnimatedProps[FlatListProps[ItemT]]]))
  }
  
  @JSImport("react-primitives", "Animated.FlatList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[ItemT] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPrimitives.mod.Animated.FlatList[ItemT]]
  
  implicit def make[ItemT](companion: FlatList.type): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[ItemT](p: AnimatedProps[FlatListProps[ItemT]]): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, p.asInstanceOf[js.Any]))
}
