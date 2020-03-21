package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExtendedSelectedItem {
  def apply(
    ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps],
    onExpandItem: js.UndefOr[Callback] = js.undefined,
    renderPersonaCoin: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    renderPrimaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISelectedPeopleItemProps, 
    typingsJapgolly.officeUiFabricReact.mod.ExtendedSelectedItem, 
    Unit, 
    ISelectedPeopleItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
    onExpandItem.foreach(p => __obj.updateDynamic("onExpandItem")(p.toJsFn))
    if (renderPersonaCoin != null) __obj.updateDynamic("renderPersonaCoin")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => renderPersonaCoin(t0, t1).runNow()))
    if (renderPrimaryText != null) __obj.updateDynamic("renderPrimaryText")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => renderPrimaryText(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.ExtendedSelectedItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ExtendedSelectedItem")
  @js.native
  object componentImport extends js.Object
  
}

