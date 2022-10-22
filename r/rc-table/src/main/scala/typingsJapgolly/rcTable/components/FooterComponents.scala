package typingsJapgolly.rcTable.components

import typingsJapgolly.rcTable.libFooterSummaryMod.SummaryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FooterComponents {
  
  @JSImport("rc-table/lib/Footer", "FooterComponents")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FooterComponents.type): SharedBuilder_SummaryProps458023166 = new SharedBuilder_SummaryProps458023166(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SummaryProps): SharedBuilder_SummaryProps458023166 = new SharedBuilder_SummaryProps458023166(js.Array(this.component, p.asInstanceOf[js.Any]))
}
