package typingsJapgolly.storybookAddonNotes.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookAddonNotes.distPanelMod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SyntaxHighlighter {
  
  @JSImport("@storybook/addon-notes/dist/Panel", "SyntaxHighlighter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SyntaxHighlighter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SyntaxHighlighterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
