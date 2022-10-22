package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsCompactCompactMod.CompactPickerProps
import typingsJapgolly.reactColor.libComponentsCompactCompactMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compact {
  
  @JSImport("react-color/lib/components/compact/Compact", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Compact.type): SharedBuilder_CompactPickerProps1441634544[default] = new SharedBuilder_CompactPickerProps1441634544[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CompactPickerProps): SharedBuilder_CompactPickerProps1441634544[default] = new SharedBuilder_CompactPickerProps1441634544[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
