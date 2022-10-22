package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.IResizeGroupProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeGroupBase {
  
  inline def apply(data: Any, onReduceData: Any => Any, onRenderData: Any => Element): SharedBuilder_IResizeGroupProps_2057686430[typingsJapgolly.officeUiFabricReact.mod.ResizeGroupBase] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onReduceData = js.Any.fromFunction1(onReduceData), onRenderData = js.Any.fromFunction1(onRenderData))
    new SharedBuilder_IResizeGroupProps_2057686430[typingsJapgolly.officeUiFabricReact.mod.ResizeGroupBase](js.Array(this.component, __props.asInstanceOf[IResizeGroupProps]))
  }
  
  @JSImport("office-ui-fabric-react", "ResizeGroupBase")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IResizeGroupProps): SharedBuilder_IResizeGroupProps_2057686430[typingsJapgolly.officeUiFabricReact.mod.ResizeGroupBase] = new SharedBuilder_IResizeGroupProps_2057686430[typingsJapgolly.officeUiFabricReact.mod.ResizeGroupBase](js.Array(this.component, p.asInstanceOf[js.Any]))
}
