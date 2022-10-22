package typingsJapgolly.terraActionFooter.components

import typingsJapgolly.terraActionFooter.libActionFooterMod.ActionFooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionFooter {
  
  @JSImport("terra-action-footer/lib/ActionFooter", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ActionFooter.type): SharedBuilder_ActionFooterProps1333820664 = new SharedBuilder_ActionFooterProps1333820664(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActionFooterProps): SharedBuilder_ActionFooterProps1333820664 = new SharedBuilder_ActionFooterProps1333820664(js.Array(this.component, p.asInstanceOf[js.Any]))
}
