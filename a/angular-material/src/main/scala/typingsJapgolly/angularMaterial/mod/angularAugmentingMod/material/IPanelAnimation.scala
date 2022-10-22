package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.angularMaterial.anon.Close
import typingsJapgolly.angularMaterial.anon.Left
import typingsJapgolly.angularMaterial.anon.Open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelAnimation extends StObject {
  
  def closeTo(to: String): IPanelAnimation = js.native
  def closeTo(to: Element): IPanelAnimation = js.native
  def closeTo(to: Left): IPanelAnimation = js.native
  
  def duration(duration: Double): IPanelAnimation = js.native
  def duration(duration: Open): IPanelAnimation = js.native
  
  def openFrom(from: String): IPanelAnimation = js.native
  def openFrom(from: Element): IPanelAnimation = js.native
  def openFrom(from: Event): IPanelAnimation = js.native
  def openFrom(from: Left): IPanelAnimation = js.native
  
  def withAnimation(cssClass: String): IPanelAnimation = js.native
  def withAnimation(cssClass: Close): IPanelAnimation = js.native
}
