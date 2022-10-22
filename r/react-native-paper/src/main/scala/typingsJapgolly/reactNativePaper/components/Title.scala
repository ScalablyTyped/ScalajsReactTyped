package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTypographyTitleMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Title {
  
  @JSImport("react-native-paper", "Title")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Title.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
