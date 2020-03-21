package typingsJapgolly.reactFa.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFa.mod.IconSize
import typingsJapgolly.reactFa.mod.IconStackCls
import typingsJapgolly.reactFa.mod.IconStackProps
import typingsJapgolly.reactFa.mod.SizeOverrideHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconStack {
  def apply(
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[Component[IconStackProps with js.Object, js.Object]] = null,
    size: IconSize = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element] = null
  ): UnmountedWithRoot[IconStackProps, IconStackCls, Unit, IconStackProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (SizeOverrideHTMLProps != null) js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFa.mod.IconStackProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactFa.mod.IconStackCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFa.mod.IconStackProps])
  }
  @JSImport("react-fa", "IconStack")
  @js.native
  object componentImport extends js.Object
  
}

