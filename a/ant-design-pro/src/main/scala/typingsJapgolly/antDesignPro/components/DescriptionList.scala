package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.antDesignProStrings.horizontal
import typingsJapgolly.antDesignPro.antDesignProStrings.large
import typingsJapgolly.antDesignPro.antDesignProStrings.small
import typingsJapgolly.antDesignPro.antDesignProStrings.vertical
import typingsJapgolly.antDesignPro.descriptionListMod.DescriptionListProps
import typingsJapgolly.antDesignPro.descriptionListMod.default
import typingsJapgolly.antDesignPro.descriptionMod.DescriptionProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DescriptionList {
  def apply(
    className: String = null,
    col: Int | Double = null,
    description: js.Array[DescriptionProps] = null,
    gutter: Int | Double = null,
    layout: horizontal | vertical = null,
    size: large | small = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DescriptionListProps, default, Unit, DescriptionListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.descriptionListMod.DescriptionListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.descriptionListMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.descriptionListMod.DescriptionListProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/DescriptionList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

