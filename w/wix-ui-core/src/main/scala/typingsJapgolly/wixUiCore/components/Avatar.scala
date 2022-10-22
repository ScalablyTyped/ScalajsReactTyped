package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.distEsSrcComponentsAvatarAvatarMod.AvatarProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsAvatarAvatarMod.FocusableHOCProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("wix-ui-core/dist/es/src", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Avatar.type): SharedBuilder_AvatarPropsFocusableHOCProps1614402412[typingsJapgolly.wixUiCore.distEsSrcMod.Avatar] = new SharedBuilder_AvatarPropsFocusableHOCProps1614402412[typingsJapgolly.wixUiCore.distEsSrcMod.Avatar](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarProps & FocusableHOCProps): SharedBuilder_AvatarPropsFocusableHOCProps1614402412[typingsJapgolly.wixUiCore.distEsSrcMod.Avatar] = new SharedBuilder_AvatarPropsFocusableHOCProps1614402412[typingsJapgolly.wixUiCore.distEsSrcMod.Avatar](js.Array(this.component, p.asInstanceOf[js.Any]))
}
