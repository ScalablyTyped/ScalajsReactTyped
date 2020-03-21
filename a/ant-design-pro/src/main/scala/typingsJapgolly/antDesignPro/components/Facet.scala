package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bizcharts.AnonOffsetX
import typingsJapgolly.bizcharts.AnonOffsetY
import typingsJapgolly.bizcharts.mod.FacetProps
import typingsJapgolly.bizcharts.mod.FacetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Facet {
  def apply(
    autoSetAxis: js.UndefOr[Boolean] = js.undefined,
    colTitle: AnonOffsetY = null,
    eachView: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Callback = null,
    fields: String | js.Array[_] = null,
    margin: Double | js.Array[Double] = null,
    padding: Double | js.Array[Double] = null,
    rowTitle: AnonOffsetX = null,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    `type`: FacetType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FacetProps, typingsJapgolly.antDesignPro.bizchartsMod.Facet, Unit, FacetProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoSetAxis)) __obj.updateDynamic("autoSetAxis")(autoSetAxis.asInstanceOf[js.Any])
    if (colTitle != null) __obj.updateDynamic("colTitle")(colTitle.asInstanceOf[js.Any])
    if (eachView != null) __obj.updateDynamic("eachView")(js.Any.fromFunction2((t0: /* view */ js.UndefOr[js.Any], t1: /* facet */ js.UndefOr[js.Any]) => eachView(t0, t1).runNow()))
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowTitle != null) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.FacetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Facet](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.FacetProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Facet")
  @js.native
  object componentImport extends js.Object
  
}

