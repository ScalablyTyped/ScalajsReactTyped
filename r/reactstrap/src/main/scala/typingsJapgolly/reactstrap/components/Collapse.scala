package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.AnonHide
import typingsJapgolly.reactstrap.collapseMod.CollapseProps
import typingsJapgolly.reactstrap.collapseMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    classNames: String = null,
    cssModule: CSSModule = null,
    delay: AnonHide = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    onClosed: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    onOpened: js.UndefOr[Callback] = js.undefined,
    tag: String | ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapseProps, default[T], Unit, CollapseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    onClosed.foreach(p => __obj.updateDynamic("onClosed")(p.toJsFn))
    onEntered.foreach(p => __obj.updateDynamic("onEntered")(p.toJsFn))
    onEntering.foreach(p => __obj.updateDynamic("onEntering")(p.toJsFn))
    onExit.foreach(p => __obj.updateDynamic("onExit")(p.toJsFn))
    onExited.foreach(p => __obj.updateDynamic("onExited")(p.toJsFn))
    onExiting.foreach(p => __obj.updateDynamic("onExiting")(p.toJsFn))
    onOpened.foreach(p => __obj.updateDynamic("onOpened")(p.toJsFn))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.collapseMod.CollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.collapseMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.collapseMod.CollapseProps])(children: _*)
  }
  @JSImport("reactstrap/lib/Collapse", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

