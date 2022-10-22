package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonAlignment
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonContent
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonProps
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonSpacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Skeleton {
  
  inline def apply(content: js.Array[SkeletonContent]): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SkeletonProps]))
  }
  
  @JSImport("wix-style-react", "Skeleton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Skeleton] {
    
    inline def alignment(value: SkeletonAlignment): this.type = set("alignment", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def spacing(value: SkeletonSpacing): this.type = set("spacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
