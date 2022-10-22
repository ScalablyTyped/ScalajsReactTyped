package typingsJapgolly.reactPrimitives.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNative.mod.SectionListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SectionList {
  
  inline def apply[ItemT, SectionT](): Builder[ItemT, SectionT] = {
    val __props = js.Dynamic.literal()
    new Builder[ItemT, SectionT](js.Array(this.component, __props.asInstanceOf[AnimatedProps[SectionListProps[ItemT, SectionT]]]))
  }
  
  @JSImport("react-primitives", "Animated.SectionList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[ItemT, SectionT] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPrimitives.mod.Animated.SectionList[ItemT, SectionT]]
  
  implicit def make[ItemT, SectionT](companion: SectionList.type): Builder[ItemT, SectionT] = new Builder[ItemT, SectionT](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[ItemT, SectionT](p: AnimatedProps[SectionListProps[ItemT, SectionT]]): Builder[ItemT, SectionT] = new Builder[ItemT, SectionT](js.Array(this.component, p.asInstanceOf[js.Any]))
}
