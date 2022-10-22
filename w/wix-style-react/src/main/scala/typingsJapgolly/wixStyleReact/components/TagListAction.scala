package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.DictxStringAnyClassNameAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagListAction {
  
  inline def apply(className: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DictxStringAnyClassNameAny]))
  }
  
  @JSImport("wix-style-react/dist/types/TagList/TagListAction", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DictxStringAnyClassNameAny): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
