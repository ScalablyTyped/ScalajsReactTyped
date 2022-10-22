package typingsJapgolly.reachDialog.components

import typingsJapgolly.reachDialog.mod.DialogOverlayProps
import typingsJapgolly.reachDialog.reachDialogStrings.div
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogOverlay {
  
  @JSImport("@reach/dialog", "DialogOverlay")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DialogOverlay.type): SharedBuilder_Merge_1713583902 = new SharedBuilder_Merge_1713583902(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      DialogOverlayProps & As[div]
    ]
  ): SharedBuilder_Merge_1713583902 = new SharedBuilder_Merge_1713583902(js.Array(this.component, p.asInstanceOf[js.Any]))
}
