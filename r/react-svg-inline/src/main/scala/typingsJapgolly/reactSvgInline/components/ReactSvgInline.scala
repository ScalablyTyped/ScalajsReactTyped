package typingsJapgolly.reactSvgInline.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSvgInline.mod.SVGInlineProps
import typingsJapgolly.reactSvgInline.mod.^
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.comment
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.defs
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.desc
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.fill
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.height
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.sketchMSLayerGroup
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.sketchMSPage
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.sketchMSShapeGroup
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.title
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSvgInline {
  def apply(
    svg: String,
    accessibilityDesc: String = null,
    accessibilityLabel: String = null,
    className: String = null,
    classSuffix: String = null,
    cleanup: Boolean | (js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ]) = null,
    cleanupExceptions: js.Array[
      title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
    ] = null,
    component: VdomNode = null,
    fill: String = null,
    height: String = null,
    width: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SVGInlineProps, ^, Unit, SVGInlineProps] = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
  
      if (accessibilityDesc != null) __obj.updateDynamic("accessibilityDesc")(accessibilityDesc.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classSuffix != null) __obj.updateDynamic("classSuffix")(classSuffix.asInstanceOf[js.Any])
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (cleanupExceptions != null) __obj.updateDynamic("cleanupExceptions")(cleanupExceptions.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawNode.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSvgInline.mod.SVGInlineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSvgInline.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSvgInline.mod.SVGInlineProps])(children: _*)
  }
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

