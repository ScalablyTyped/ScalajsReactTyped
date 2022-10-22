package typingsJapgolly.reactClipboardjsCopy.components

import typingsJapgolly.reactClipboardjsCopy.mod.ReactClipboard.Props
import typingsJapgolly.reactClipboardjsCopy.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactClipboardjsCopy {
  
  object ReactClipboard {
    
    @JSImport("react-clipboardjs-copy", "default.ReactClipboard")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ReactClipboard.type): SharedBuilder_Props_2074302965[typingsJapgolly.reactClipboardjsCopy.mod.default.ReactClipboard] = new SharedBuilder_Props_2074302965[typingsJapgolly.reactClipboardjsCopy.mod.default.ReactClipboard](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Props): SharedBuilder_Props_2074302965[typingsJapgolly.reactClipboardjsCopy.mod.default.ReactClipboard] = new SharedBuilder_Props_2074302965[typingsJapgolly.reactClipboardjsCopy.mod.default.ReactClipboard](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-clipboardjs-copy", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactClipboardjsCopy.type): SharedBuilder_Props_2074302965[default] = new SharedBuilder_Props_2074302965[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_2074302965[default] = new SharedBuilder_Props_2074302965[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
