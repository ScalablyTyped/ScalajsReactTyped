package typingsJapgolly.antDesignProProvider.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigProviderWrap {
  
  @JSImport("@ant-design/pro-provider", "ConfigProviderWrap")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ConfigProviderWrap.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StringDictionary[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
