package typingsJapgolly.cswAasJs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cswAasJs.realmRoleMod.RealmRoleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RealmRole {
  def apply(
    realmRole: String,
    error: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    RealmRoleProps, 
    MountedWithRawType[RealmRoleProps, js.Object, RawMounted[RealmRoleProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
  
      if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.cswAasJs.realmRoleMod.RealmRoleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.cswAasJs.realmRoleMod.RealmRoleProps])(children: _*)
  }
  @JSImport("csw-aas-js/dist/components/authorization/RealmRole", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

