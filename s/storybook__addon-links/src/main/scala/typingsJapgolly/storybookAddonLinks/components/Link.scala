package typingsJapgolly.storybookAddonLinks.components

import typingsJapgolly.storybookAddonLinks.distTs3Dot9ReactComponentsLinkMod.Props
import typingsJapgolly.storybookAddonLinks.distTs3Dot9ReactComponentsLinkMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  inline def apply(kind: String, story: String): SharedBuilder_Props1666750416[default] = {
    val __props = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    new SharedBuilder_Props1666750416[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/addon-links/dist/ts3.9/react/components/link", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1666750416[default] = new SharedBuilder_Props1666750416[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
