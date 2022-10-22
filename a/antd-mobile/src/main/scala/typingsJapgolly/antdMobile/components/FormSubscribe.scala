package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsFormFormSubscribeMod.FormSubscribeProps
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSubscribe {
  
  inline def apply(
    children: (/* changedValues */ Record[String, Any], /* form */ FormInstance[Any]) => Node,
    to: js.Array[NamePath]
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), to = to.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FormSubscribeProps]))
  }
  
  @JSImport("antd-mobile/es/components/form/form-subscribe", "FormSubscribe")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormSubscribeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
