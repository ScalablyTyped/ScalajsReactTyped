package typingsJapgolly.reachAlertDialog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachAlertDialog.mod.AlertDialogContentProps
import typingsJapgolly.reachAlertDialog.reachAlertDialogStrings.div
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlertDialogContent {
  
  @JSImport("@reach/alert-dialog", "AlertDialogContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AlertDialogContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      AlertDialogContentProps & As[div]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
