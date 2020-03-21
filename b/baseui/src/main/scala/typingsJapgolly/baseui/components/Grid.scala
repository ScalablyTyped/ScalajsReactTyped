package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.layoutGridMod.ALIGNMENT
import typingsJapgolly.baseui.layoutGridMod.BEHAVIOR
import typingsJapgolly.baseui.layoutGridMod.GridProps
import typingsJapgolly.baseui.layoutGridMod.Responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  def apply(
    align: Responsive[ALIGNMENT] = null,
    behavior: BEHAVIOR = null,
    gridColumns: Responsive[Double] = null,
    gridGaps: Responsive[Double] = null,
    gridGutters: Responsive[Double] = null,
    gridMargins: Responsive[Double] = null,
    gridMaxWidth: Int | Double = null,
    gridUnit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element]
  ): UnmountedSimple[
    GridProps, 
    MountedWithRawType[GridProps, js.Object, RawMounted[GridProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (gridColumns != null) __obj.updateDynamic("gridColumns")(gridColumns.asInstanceOf[js.Any])
    if (gridGaps != null) __obj.updateDynamic("gridGaps")(gridGaps.asInstanceOf[js.Any])
    if (gridGutters != null) __obj.updateDynamic("gridGutters")(gridGutters.asInstanceOf[js.Any])
    if (gridMargins != null) __obj.updateDynamic("gridMargins")(gridMargins.asInstanceOf[js.Any])
    if (gridMaxWidth != null) __obj.updateDynamic("gridMaxWidth")(gridMaxWidth.asInstanceOf[js.Any])
    if (gridUnit != null) __obj.updateDynamic("gridUnit")(gridUnit.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.layoutGridMod.GridProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.layoutGridMod.GridProps])
  }
  @JSImport("baseui/layout-grid", "Grid")
  @js.native
  object componentImport extends js.Object
  
}

