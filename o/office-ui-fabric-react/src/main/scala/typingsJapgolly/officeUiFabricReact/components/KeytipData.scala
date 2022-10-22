package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.IKeytipDataProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricUtilities.libIrendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeytipData {
  
  inline def apply(children: js.Object => Element): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[IKeytipDataProps & IRenderComponent[js.Object]]))
  }
  
  @JSImport("office-ui-fabric-react", "KeytipData")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def keytipProps(value: IKeytipProps): this.type = set("keytipProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IKeytipDataProps & IRenderComponent[js.Object]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
