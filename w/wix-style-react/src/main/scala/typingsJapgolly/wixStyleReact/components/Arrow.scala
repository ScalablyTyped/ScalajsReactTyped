package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ClassNameUndefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arrow {
  
  inline def apply(className: Unit): Default[js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ClassNameUndefined]))
  }
  
  @JSImport("wix-style-react/dist/types/NestableList/Arrow", "Arrow")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClassNameUndefined): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
