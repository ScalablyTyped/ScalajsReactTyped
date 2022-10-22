package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupProps
import typingsJapgolly.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkeletonGroup {
  
  @JSImport("wix-style-react", "SkeletonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SkeletonGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def skin(value: SkeletonGroupSkin): this.type = set("skin", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SkeletonGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
