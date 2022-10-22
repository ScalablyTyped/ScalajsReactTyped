package typingsJapgolly.reactAce.components

import typingsJapgolly.reactAce.libAceMod.IAceEditorProps
import typingsJapgolly.reactAce.libAceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ace {
  
  @JSImport("react-ace/lib/ace", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ace.type): SharedBuilder_IAceEditorProps1108614424[default] = new SharedBuilder_IAceEditorProps1108614424[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IAceEditorProps): SharedBuilder_IAceEditorProps1108614424[default] = new SharedBuilder_IAceEditorProps1108614424[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
