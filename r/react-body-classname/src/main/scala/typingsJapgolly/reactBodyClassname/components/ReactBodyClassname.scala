package typingsJapgolly.reactBodyClassname.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactBodyClassname.anon.Children
import typingsJapgolly.reactBodyClassname.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBodyClassname {
  
  inline def apply(className: String): Default[^] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[^](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-body-classname", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[^] = new Default[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
