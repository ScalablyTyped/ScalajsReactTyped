package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.reactstrap.navMod.NavProps
import typingsJapgolly.reactstrap.navMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Nav {
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[HTMLUListElement] = null,
    ClassAttributes: ClassAttributes[HTMLUListElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    card: js.UndefOr[Boolean] = js.undefined,
    cssModule: CSSModule = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    horizontal: String = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    pills: js.UndefOr[Boolean] = js.undefined,
    tabs: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null,
    vertical: Boolean | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NavProps, default[T], Unit, NavProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(card)) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified.asInstanceOf[js.Any])
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    if (!js.isUndefined(pills)) __obj.updateDynamic("pills")(pills.asInstanceOf[js.Any])
    if (!js.isUndefined(tabs)) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.navMod.NavProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.navMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.navMod.NavProps])(children: _*)
  }
  @JSImport("reactstrap/lib/Nav", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

