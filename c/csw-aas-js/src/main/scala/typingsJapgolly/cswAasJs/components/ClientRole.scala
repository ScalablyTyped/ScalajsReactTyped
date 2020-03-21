package typingsJapgolly.cswAasJs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cswAasJs.clientRoleMod.ClientRoleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClientRole {
  def apply(
    clientRole: String,
    client: String = null,
    error: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ClientRoleProps, 
    MountedWithRawType[ClientRoleProps, js.Object, RawMounted[ClientRoleProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(clientRole = clientRole.asInstanceOf[js.Any])
  
      if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.cswAasJs.clientRoleMod.ClientRoleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.cswAasJs.clientRoleMod.ClientRoleProps])(children: _*)
  }
  @JSImport("csw-aas-js/dist/components/authorization/ClientRole", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

