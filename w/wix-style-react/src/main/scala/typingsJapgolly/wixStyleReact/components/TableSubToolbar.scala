package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.DataHookAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableSubToolbar {
  
  inline def apply(children: Any, dataHook: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DataHookAny]))
  }
  
  @JSImport("wix-style-react/dist/types/Table/components", "TableSubToolbar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DataHookAny): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
