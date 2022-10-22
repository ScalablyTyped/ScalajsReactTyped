package typingsJapgolly.storybookAddonNotes.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonNotes.distPanelMod.NotesLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotesLink {
  
  inline def apply(href: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[NotesLinkProps]))
  }
  
  @JSImport("@storybook/addon-notes/dist/Panel", "NotesLink")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NotesLinkProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
