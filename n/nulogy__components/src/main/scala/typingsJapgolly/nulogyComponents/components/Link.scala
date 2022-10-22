package typingsJapgolly.nulogyComponents.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @JSImport("@nulogy/components", "Link")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Link.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StringDictionary[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
