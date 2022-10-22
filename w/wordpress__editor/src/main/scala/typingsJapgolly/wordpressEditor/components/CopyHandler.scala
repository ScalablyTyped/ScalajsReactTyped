package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.componentsCopyHandlerMod.CopyHandler.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CopyHandler {
  
  @JSImport("@wordpress/editor", "CopyHandler")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CopyHandler.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
