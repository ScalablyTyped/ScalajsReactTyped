package typingsJapgolly.jqueryBootstrapWizard

import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.back
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.currentIndex
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.disable
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.display
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.enable
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.finish
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.first
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.hide
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.last
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.navigationLength
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.next
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.previous
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.remove
import typingsJapgolly.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def bootstrapWizard(): Wizard = js.native
  def bootstrapWizard(method: currentIndex | navigationLength): Double = js.native
  def bootstrapWizard(method: enable | disable | display | hide, index: Double): Unit = js.native
  def bootstrapWizard(options: WizardOptions): Wizard = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_Unit(method: next | previous | first | last | back | finish): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_remove(method: remove, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_remove(method: remove, index: Double, removeTabPane: Boolean): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_show(method: show, indexOrId: String): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_show(method: show, indexOrId: Double): Unit = js.native
}
