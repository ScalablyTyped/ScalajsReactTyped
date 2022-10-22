package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.skeletonTypesMod.SkeletonOverrides
import typingsJapgolly.baseui.skeletonTypesMod.SkeletonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Skeleton {
  
  inline def apply(animation: Boolean): Builder = {
    val __props = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SkeletonProps]))
  }
  
  @JSImport("baseui/skeleton", "Skeleton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.skeletonMod.Skeleton] {
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def overrides(value: SkeletonOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
