package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.reactstrap.paginationLinkMod.PaginationLinkProps
import typingsJapgolly.reactstrap.paginationLinkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PaginationLink {
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    first: js.UndefOr[Boolean] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    next: js.UndefOr[Boolean] = js.undefined,
    previous: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PaginationLinkProps, default[T], Unit, PaginationLinkProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.paginationLinkMod.PaginationLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.paginationLinkMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.paginationLinkMod.PaginationLinkProps])(children: _*)
  }
  @JSImport("reactstrap/lib/PaginationLink", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

