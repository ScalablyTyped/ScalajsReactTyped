package typingsJapgolly.expo.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.expo.anon.Children
import typingsJapgolly.expo.buildEnvironmentDevAppContainerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DevAppContainer {
  
  @JSImport("expo/build/environment/DevAppContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DevAppContainer.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
