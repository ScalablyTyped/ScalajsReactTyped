package typingsJapgolly.reactNavigationDrawer.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsResourceSavingSceneMod.Props
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsResourceSavingSceneMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResourceSavingScene {
  
  inline def apply(enabled: Boolean, isVisible: Boolean): Builder = {
    val __props = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/ResourceSavingScene", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
