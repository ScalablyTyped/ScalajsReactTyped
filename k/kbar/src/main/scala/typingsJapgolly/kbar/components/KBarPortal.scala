package typingsJapgolly.kbar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.kbar.libKbarportalMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KBarPortal {
  
  @JSImport("kbar", "KBarPortal")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: KBarPortal.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
