package typingsJapgolly.officeUiFabricReact.selectedPeopleListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedPeopleItemProps extends ISelectedItemProps[IExtendedPersonaProps] {
  var onExpandItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  var renderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
}

object ISelectedPeopleItemProps {
  @scala.inline
  def apply(
    ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps],
    onExpandItem: js.UndefOr[Callback] = js.undefined,
    renderPersonaCoin: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    renderPrimaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => CallbackTo[Element | Null] = null
  ): ISelectedPeopleItemProps = {
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
    __obj.asInstanceOf[ISelectedPeopleItemProps]
  }
}

