package typingsJapgolly.rcDialog.components

import typingsJapgolly.rcDialog.esIdialogproptypesMod.IDialogPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogWrap {
  
  @JSImport("rc-dialog/es/DialogWrap", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DialogWrap.type): SharedBuilder_IDialogPropTypes1453239975 = new SharedBuilder_IDialogPropTypes1453239975(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogPropTypes): SharedBuilder_IDialogPropTypes1453239975 = new SharedBuilder_IDialogPropTypes1453239975(js.Array(this.component, p.asInstanceOf[js.Any]))
}
