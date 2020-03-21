package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.AnonHref
import typingsJapgolly.storybookComponents.tooltipMessageMod.TooltipMessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TooltipMessage {
  def apply(
    desc: VdomNode = null,
    links: js.Array[AnonHref] = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TooltipMessageProps, 
    MountedWithRawType[TooltipMessageProps, js.Object, RawMounted[TooltipMessageProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (desc != null) __obj.updateDynamic("desc")(desc.rawNode.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.tooltipMessageMod.TooltipMessageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.tooltipMessageMod.TooltipMessageProps])(children: _*)
  }
  @JSImport("@storybook/components", "TooltipMessage")
  @js.native
  object componentImport extends js.Object
  
}

