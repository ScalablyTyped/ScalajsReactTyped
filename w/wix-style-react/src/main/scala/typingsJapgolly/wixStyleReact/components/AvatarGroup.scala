package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAvatarGroupMod.AvatarGroupProps
import typingsJapgolly.wixStyleReact.distTypesAvatarGroupMod.AvatarGroupSize
import typingsJapgolly.wixStyleReact.distTypesAvatarGroupMod.AvatarItemProps
import typingsJapgolly.wixStyleReact.distTypesAvatarGroupMod.GroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarGroup {
  
  inline def apply(items: js.Array[AvatarItemProps]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarGroupProps]))
  }
  
  @JSImport("wix-style-react", "AvatarGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AvatarGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def maxItems(value: Double): this.type = set("maxItems", value.asInstanceOf[js.Any])
    
    inline def showDivider(value: Boolean): this.type = set("showDivider", value.asInstanceOf[js.Any])
    
    inline def size(value: AvatarGroupSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def `type`(value: GroupType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
