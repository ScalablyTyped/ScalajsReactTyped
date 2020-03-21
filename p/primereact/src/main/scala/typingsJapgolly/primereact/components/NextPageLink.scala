package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.nextPageLinkMod.NextPageLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NextPageLink {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NextPageLinkProps, 
    typingsJapgolly.primereact.nextPageLinkMod.NextPageLink, 
    Unit, 
    NextPageLinkProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.nextPageLinkMod.NextPageLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.nextPageLinkMod.NextPageLink](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.nextPageLinkMod.NextPageLinkProps])(children: _*)
  }
  @JSImport("primereact/components/paginator/NextPageLink", "NextPageLink")
  @js.native
  object componentImport extends js.Object
  
}

