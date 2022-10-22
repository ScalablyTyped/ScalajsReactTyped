package typingsJapgolly.wordpressComponents.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.wordpressComponents.navigableContainerTabbableMod.TabbableContainer.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbableContainer {
  
  @JSImport("@wordpress/components/navigable-container", "TabbableContainer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabbableContainer.type): SharedBuilder_Props_1503559679[HTMLDivElement] = new SharedBuilder_Props_1503559679[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1503559679[HTMLDivElement] = new SharedBuilder_Props_1503559679[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
