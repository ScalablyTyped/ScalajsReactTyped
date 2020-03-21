package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.grommet.AnonLight
import typingsJapgolly.grommet.AnonLocation
import typingsJapgolly.grommet.AnonName
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.ColorType
import typingsJapgolly.grommet.utilsMod.FillType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.worldMapMod.WorldMapProps
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WorldMap {
  def apply(
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    color: ColorType = null,
    continents: js.Array[AnonName] = null,
    fill: FillType = null,
    gridArea: GridAreaType = null,
    hoverColor: String | AnonLight = null,
    margin: MarginType = null,
    onSelectPlace: /* place */ js.Array[Double] => Callback = null,
    places: js.Array[AnonLocation] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    WorldMapProps with SVGProps[SVGSVGElement], 
    typingsJapgolly.grommet.mod.WorldMap, 
    Unit, 
    WorldMapProps with SVGProps[SVGSVGElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continents != null) __obj.updateDynamic("continents")(continents.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onSelectPlace != null) __obj.updateDynamic("onSelectPlace")(js.Any.fromFunction1((t0: /* place */ js.Array[scala.Double]) => onSelectPlace(t0).runNow()))
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommet.worldMapMod.WorldMapProps with typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.grommet.mod.WorldMap](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.worldMapMod.WorldMapProps with typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement]])(children: _*)
  }
  @JSImport("grommet", "WorldMap")
  @js.native
  object componentImport extends js.Object
  
}

