package typingsJapgolly.storybookAddonNotes.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonNotes.distGiphyMod.Props
import typingsJapgolly.storybookAddonNotes.distGiphyMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Giphy {
  
  inline def apply(query: String): Default[default] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/addon-notes/dist/giphy", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
