package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.listGridExampleMod.IListGridExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListGridExample {
  def apply(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IListGridExampleProps, 
    typingsJapgolly.officeUiFabricReact.listGridExampleMod.ListGridExample, 
    Unit, 
    IListGridExampleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.listGridExampleMod.IListGridExampleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.listGridExampleMod.ListGridExample](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.listGridExampleMod.IListGridExampleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/List/examples/List.Grid.Example", "ListGridExample")
  @js.native
  object componentImport extends js.Object
  
}

