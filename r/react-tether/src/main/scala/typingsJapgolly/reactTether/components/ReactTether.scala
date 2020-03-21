package typingsJapgolly.reactTether.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactTether.mod.ReactTether.Constraints
import typingsJapgolly.reactTether.mod.ReactTether.TetherComponentProps
import typingsJapgolly.reactTether.mod.ReactTether.UpdateEventData
import typingsJapgolly.reactTether.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTether {
  def apply(
    attachment: String,
    bodyElement: HTMLElement = null,
    className: String = null,
    classPrefix: String = null,
    classes: StringDictionary[Boolean | String] = null,
    constraints: js.Array[Constraints] = null,
    element: HTMLElement | String | js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    offset: String = null,
    onRepositioned: js.UndefOr[Callback] = js.undefined,
    onUpdate: /* data */ UpdateEventData => Callback = null,
    optimizations: js.Any = null,
    renderElement: /* ref */ RefHandle[Element] => CallbackTo[Node] = null,
    renderElementTag: String = null,
    renderElementTo: Element | String = null,
    renderTarget: /* ref */ RefHandle[Element] => CallbackTo[Node] = null,
    style: CSSProperties = null,
    target: HTMLElement | String | js.Any = null,
    targetAttachment: String = null,
    targetModifier: String = null,
    targetOffset: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TetherComponentProps, default, Unit, TetherComponentProps] = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
  
      if (bodyElement != null) __obj.updateDynamic("bodyElement")(bodyElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onRepositioned.foreach(p => __obj.updateDynamic("onRepositioned")(p.toJsFn))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactTether.mod.ReactTether.UpdateEventData) => onUpdate(t0).runNow()))
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations.asInstanceOf[js.Any])
    if (renderElement != null) __obj.updateDynamic("renderElement")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.RefHandle[org.scalajs.dom.raw.Element]) => renderElement(t0).runNow()))
    if (renderElementTag != null) __obj.updateDynamic("renderElementTag")(renderElementTag.asInstanceOf[js.Any])
    if (renderElementTo != null) __obj.updateDynamic("renderElementTo")(renderElementTo.asInstanceOf[js.Any])
    if (renderTarget != null) __obj.updateDynamic("renderTarget")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.RefHandle[org.scalajs.dom.raw.Element]) => renderTarget(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment.asInstanceOf[js.Any])
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTether.mod.ReactTether.TetherComponentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTether.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTether.mod.ReactTether.TetherComponentProps])(children: _*)
  }
  @JSImport("react-tether", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

