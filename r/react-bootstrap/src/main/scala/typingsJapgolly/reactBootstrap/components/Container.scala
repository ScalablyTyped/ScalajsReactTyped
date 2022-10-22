package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libTabContainerMod.TabContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  @JSImport("react-bootstrap/lib/Tab", "Container")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Container.type): SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.libTabMod.Container] = new SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.libTabMod.Container](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabContainerProps): SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.libTabMod.Container] = new SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.libTabMod.Container](js.Array(this.component, p.asInstanceOf[js.Any]))
}
