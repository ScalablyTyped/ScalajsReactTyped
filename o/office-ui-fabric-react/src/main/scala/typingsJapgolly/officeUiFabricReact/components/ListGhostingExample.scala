package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.listGhostingExampleMod.IListGhostingExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListGhostingExample {
  def apply(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IListGhostingExampleProps, 
    typingsJapgolly.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample, 
    Unit, 
    IListGhostingExampleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.listGhostingExampleMod.IListGhostingExampleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.listGhostingExampleMod.IListGhostingExampleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/List/examples/List.Ghosting.Example", "ListGhostingExample")
  @js.native
  object componentImport extends js.Object
  
}

