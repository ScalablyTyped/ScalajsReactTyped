package typingsJapgolly.reactScrolllock.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactScrolllock.mod.OneChildrenElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TouchScrollable {
  
  @JSImport("react-scrolllock", "TouchScrollable")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TouchScrollable.type): Default[typingsJapgolly.reactScrolllock.mod.TouchScrollable] = new Default[typingsJapgolly.reactScrolllock.mod.TouchScrollable](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OneChildrenElement): Default[typingsJapgolly.reactScrolllock.mod.TouchScrollable] = new Default[typingsJapgolly.reactScrolllock.mod.TouchScrollable](js.Array(this.component, p.asInstanceOf[js.Any]))
}
