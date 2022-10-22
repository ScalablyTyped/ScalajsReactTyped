package typingsJapgolly.reachAlertDialog.components

import typingsJapgolly.reachAlertDialog.mod.AlertDialogProps
import typingsJapgolly.reachAlertDialog.reachAlertDialogStrings.div
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlertDialogOverlay {
  
  @JSImport("@reach/alert-dialog", "AlertDialogOverlay")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AlertDialogOverlay.type): SharedBuilder_Merge_1356725188 = new SharedBuilder_Merge_1356725188(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      AlertDialogProps & As[div]
    ]
  ): SharedBuilder_Merge_1356725188 = new SharedBuilder_Merge_1356725188(js.Array(this.component, p.asInstanceOf[js.Any]))
}
