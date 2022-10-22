package typingsJapgolly.jsoneditorForReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.jsoneditorForReact.mod.ReactJsonEditorProps
import typingsJapgolly.jsoneditorForReact.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsoneditorForReact {
  
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: JsoneditorForReact.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactJsonEditorProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
