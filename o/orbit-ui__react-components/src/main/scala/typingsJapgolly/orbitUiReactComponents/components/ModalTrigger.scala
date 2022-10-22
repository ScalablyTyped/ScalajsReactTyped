package typingsJapgolly.orbitUiReactComponents.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalTrigger {
  
  @JSImport("@orbit-ui/react-components", "ModalTrigger")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ModalTrigger.type): SharedBuilder_MergeWithAs421531106 = new SharedBuilder_MergeWithAs421531106(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerDialogTriggerProps]): SharedBuilder_MergeWithAs421531106 = new SharedBuilder_MergeWithAs421531106(js.Array(this.component, p.asInstanceOf[js.Any]))
}
