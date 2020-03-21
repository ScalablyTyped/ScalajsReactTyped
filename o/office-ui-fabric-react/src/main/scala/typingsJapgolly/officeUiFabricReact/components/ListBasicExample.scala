package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.listBasicExampleMod.IListBasicExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBasicExample {
  def apply(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IListBasicExampleProps, 
    typingsJapgolly.officeUiFabricReact.listBasicExampleMod.ListBasicExample, 
    Unit, 
    IListBasicExampleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.listBasicExampleMod.IListBasicExampleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.listBasicExampleMod.ListBasicExample](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.listBasicExampleMod.IListBasicExampleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/List/examples/List.Basic.Example", "ListBasicExample")
  @js.native
  object componentImport extends js.Object
  
}

