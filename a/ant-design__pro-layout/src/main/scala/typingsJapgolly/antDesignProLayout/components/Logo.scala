package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Logo {
  
  @JSImport("@ant-design/pro-layout/es/assert/Logo", "Logo")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Logo.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
