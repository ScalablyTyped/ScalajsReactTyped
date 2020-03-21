package typingsJapgolly.reactTether.mod.ReactTether

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.reactTether.mod.TetherComponent
import typingsJapgolly.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherComponentProps
  extends Props[TetherComponent]
     with ITetherOptions {
  var className: js.UndefOr[String] = js.undefined
  @JSName("constraints")
  var constraints_TetherComponentProps: js.UndefOr[js.Array[Constraints]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onRepositioned: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ UpdateEventData, Unit]] = js.undefined
  var renderElement: js.UndefOr[RenderProp] = js.undefined
  var renderElementTag: js.UndefOr[String] = js.undefined
  var renderElementTo: js.UndefOr[Element | String] = js.undefined
  var renderTarget: js.UndefOr[RenderProp] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TetherComponentProps {
  @scala.inline
  def apply(
    attachment: String,
    bodyElement: HTMLElement = null,
    children: VdomNode = null,
    className: String = null,
    classPrefix: String = null,
    classes: StringDictionary[Boolean | String] = null,
    constraints: js.Array[Constraints] = null,
    element: HTMLElement | String | js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    key: Key = null,
    offset: String = null,
    onRepositioned: js.UndefOr[Callback] = js.undefined,
    onUpdate: /* data */ UpdateEventData => Callback = null,
    optimizations: js.Any = null,
    ref: LegacyRef[TetherComponent] = null,
    renderElement: /* ref */ RefHandle[Element] => CallbackTo[Node] = null,
    renderElementTag: String = null,
    renderElementTo: Element | String = null,
    renderTarget: /* ref */ RefHandle[Element] => CallbackTo[Node] = null,
    style: CSSProperties = null,
    target: HTMLElement | String | js.Any = null,
    targetAttachment: String = null,
    targetModifier: String = null,
    targetOffset: String = null
  ): TetherComponentProps = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    if (bodyElement != null) __obj.updateDynamic("bodyElement")(bodyElement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onRepositioned.foreach(p => __obj.updateDynamic("onRepositioned")(p.toJsFn))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactTether.mod.ReactTether.UpdateEventData) => onUpdate(t0).runNow()))
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderElement != null) __obj.updateDynamic("renderElement")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.RefHandle[org.scalajs.dom.raw.Element]) => renderElement(t0).runNow()))
    if (renderElementTag != null) __obj.updateDynamic("renderElementTag")(renderElementTag.asInstanceOf[js.Any])
    if (renderElementTo != null) __obj.updateDynamic("renderElementTo")(renderElementTo.asInstanceOf[js.Any])
    if (renderTarget != null) __obj.updateDynamic("renderTarget")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.RefHandle[org.scalajs.dom.raw.Element]) => renderTarget(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment.asInstanceOf[js.Any])
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherComponentProps]
  }
}

