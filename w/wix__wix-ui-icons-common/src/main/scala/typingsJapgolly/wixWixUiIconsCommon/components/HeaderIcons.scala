package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesComponentsHeaderIconsHeaderIconsMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderIcons {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/header-icons", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: HeaderIcons.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
