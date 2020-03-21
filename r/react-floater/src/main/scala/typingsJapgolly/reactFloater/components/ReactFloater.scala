package typingsJapgolly.reactFloater.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.popperJs.mod.Data
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactFloater.AnonOffset
import typingsJapgolly.reactFloater.PartialStyles
import typingsJapgolly.reactFloater.mod.Action
import typingsJapgolly.reactFloater.mod.Placement
import typingsJapgolly.reactFloater.mod.PropsWithComponent
import typingsJapgolly.reactFloater.mod.PropsWithContent
import typingsJapgolly.reactFloater.mod.RenderProps
import typingsJapgolly.reactFloater.mod.default
import typingsJapgolly.reactFloater.reactFloaterStrings.click
import typingsJapgolly.reactFloater.reactFloaterStrings.floater
import typingsJapgolly.reactFloater.reactFloaterStrings.hover
import typingsJapgolly.reactFloater.reactFloaterStrings.wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFloater {
  def PropsWithComponent(
    component: RenderProps => CallbackTo[Node],
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    callback: (/* action */ Action, /* props */ typingsJapgolly.reactFloater.mod.PropsWithComponent | PropsWithContent) => Callback = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableFlip: js.UndefOr[Boolean] = js.undefined,
    disableHoverToClick: js.UndefOr[Boolean] = js.undefined,
    event: click | hover = null,
    eventDelay: Int | Double = null,
    footer: VdomNode = null,
    getPopper: (/* popper */ Data, /* origin */ floater | wrapper) => Callback = null,
    hideArrow: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    offset: Int | Double = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: Modifiers = null,
    placement: Placement = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: PartialStyles = null,
    target: String | HTMLElement = null,
    title: VdomNode = null,
    wrapperOptions: AnonOffset = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactFloater.mod.PropsWithComponent, 
    default, 
    Unit, 
    typingsJapgolly.reactFloater.mod.PropsWithComponent
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("component")(js.Any.fromFunction1((t0: typingsJapgolly.reactFloater.mod.RenderProps) => component(t0).runNow()))
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* action */ typingsJapgolly.reactFloater.mod.Action, t1: /* props */ typingsJapgolly.reactFloater.mod.PropsWithComponent | typingsJapgolly.reactFloater.mod.PropsWithContent) => callback(t0, t1).runNow()))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFlip)) __obj.updateDynamic("disableFlip")(disableFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverToClick)) __obj.updateDynamic("disableHoverToClick")(disableHoverToClick.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventDelay != null) __obj.updateDynamic("eventDelay")(eventDelay.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (getPopper != null) __obj.updateDynamic("getPopper")(js.Any.fromFunction2((t0: /* popper */ typingsJapgolly.popperJs.mod.Data, t1: /* origin */ typingsJapgolly.reactFloater.reactFloaterStrings.floater | typingsJapgolly.reactFloater.reactFloaterStrings.wrapper) => getPopper(t0, t1).runNow()))
    if (!js.isUndefined(hideArrow)) __obj.updateDynamic("hideArrow")(hideArrow.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFloater.mod.PropsWithComponent, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFloater.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFloater.mod.PropsWithComponent])(children: _*)
  }
  def PropsWithContent(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    callback: (/* action */ Action, /* props */ PropsWithComponent | typingsJapgolly.reactFloater.mod.PropsWithContent) => Callback = null,
    content: VdomNode = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableFlip: js.UndefOr[Boolean] = js.undefined,
    disableHoverToClick: js.UndefOr[Boolean] = js.undefined,
    event: click | hover = null,
    eventDelay: Int | Double = null,
    footer: VdomNode = null,
    getPopper: (/* popper */ Data, /* origin */ floater | wrapper) => Callback = null,
    hideArrow: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    offset: Int | Double = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: Modifiers = null,
    placement: Placement = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: PartialStyles = null,
    target: String | HTMLElement = null,
    title: VdomNode = null,
    wrapperOptions: AnonOffset = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactFloater.mod.PropsWithContent, 
    default, 
    Unit, 
    typingsJapgolly.reactFloater.mod.PropsWithContent
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* action */ typingsJapgolly.reactFloater.mod.Action, t1: /* props */ typingsJapgolly.reactFloater.mod.PropsWithComponent | typingsJapgolly.reactFloater.mod.PropsWithContent) => callback(t0, t1).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFlip)) __obj.updateDynamic("disableFlip")(disableFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverToClick)) __obj.updateDynamic("disableHoverToClick")(disableHoverToClick.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventDelay != null) __obj.updateDynamic("eventDelay")(eventDelay.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (getPopper != null) __obj.updateDynamic("getPopper")(js.Any.fromFunction2((t0: /* popper */ typingsJapgolly.popperJs.mod.Data, t1: /* origin */ typingsJapgolly.reactFloater.reactFloaterStrings.floater | typingsJapgolly.reactFloater.reactFloaterStrings.wrapper) => getPopper(t0, t1).runNow()))
    if (!js.isUndefined(hideArrow)) __obj.updateDynamic("hideArrow")(hideArrow.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFloater.mod.PropsWithContent, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFloater.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFloater.mod.PropsWithContent])(children: _*)
  }
  @JSImport("react-floater", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

