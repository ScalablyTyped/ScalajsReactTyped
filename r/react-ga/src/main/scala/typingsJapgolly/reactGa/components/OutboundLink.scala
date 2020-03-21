package typingsJapgolly.reactGa.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactGa.mod.OutboundLinkProps
import typingsJapgolly.reactGa.mod.OutboundLink_
import typingsJapgolly.reactGa.mod.TrackerNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OutboundLink {
  def apply(
    eventLabel: String,
    to: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    onClick: js.Function = null,
    target: String = null,
    trackerNames: TrackerNames = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OutboundLinkProps with HTMLProps[HTMLAnchorElement], 
    OutboundLink_, 
    Unit, 
    OutboundLinkProps with HTMLProps[HTMLAnchorElement]
  ] = {
    val __obj = js.Dynamic.literal(eventLabel = eventLabel.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (trackerNames != null) __obj.updateDynamic("trackerNames")(trackerNames.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGa.mod.OutboundLinkProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLAnchorElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGa.mod.OutboundLink_](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGa.mod.OutboundLinkProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLAnchorElement]])(children: _*)
  }
  @JSImport("react-ga", "OutboundLink")
  @js.native
  object componentImport extends js.Object
  
}

