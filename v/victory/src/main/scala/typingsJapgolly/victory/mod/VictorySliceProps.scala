package typingsJapgolly.victory.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victory.Anon1
import typingsJapgolly.victory.AnonActive
import typingsJapgolly.victory.AnonEndAngle
import typingsJapgolly.victory.AnonXBoolean
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.victoryStrings.cornerRadius
import typingsJapgolly.victory.victoryStrings.padAngle
import typingsJapgolly.victory.victoryStrings.radius
import typingsJapgolly.victory.victoryStrings.sliceEndAngle
import typingsJapgolly.victory.victoryStrings.sliceStartAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictorySliceProps extends VictoryCommonProps {
  /**
    * the corner radius to apply to this slice.
    * When this prop is given as a function
    * it will be called with the rest of the props supplied to Slice.
    */
  var cornerRadius: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsJapgolly.victory.victoryStrings.cornerRadius]
  ] = js.undefined
  /**
    * the data point corresponding to this slice
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  /**
    * the inner radius of the slice.
    * When this prop is given as a function
    * it will be called with datum and active.
    */
  var innerRadius: js.UndefOr[Double | (js.Function1[/* props */ AnonActive, Double])] = js.undefined
  /**
    * the angular padding to add to the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var padAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsJapgolly.victory.victoryStrings.padAngle]
  ] = js.undefined
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[Element] = js.undefined
  /**
    * a function that calculates the path of a given slice.
    * When given, this prop will be called with the slice object
    */
  var pathFunction: js.UndefOr[js.Function1[/* props */ VictorySliceProps, String]] = js.undefined
  /**
    * the outer radius of the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var radius: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsJapgolly.victory.victoryStrings.radius]
  ] = js.undefined
  /**
    * an object specifying the `startAngle`, `endAngle`, `padAngle`,
    * and `data` of the slice
    */
  var slice: AnonEndAngle
  /**
    * the end angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice.
    */
  var sliceEndAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsJapgolly.victory.victoryStrings.sliceEndAngle]
  ] = js.undefined
  /**
    * the start angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice
    */
  var sliceStartAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsJapgolly.victory.victoryStrings.sliceStartAngle]
  ] = js.undefined
}

object VictorySliceProps {
  @scala.inline
  def apply(
    slice: AnonEndAngle,
    animate: Boolean | AnimatePropTypeInterface = null,
    containerComponent: VdomElement = null,
    cornerRadius: SliceNumberOrCallback[VictorySliceProps, cornerRadius] = null,
    datum: js.Object = null,
    groupComponent: VdomElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    innerRadius: Double | (js.Function1[/* props */ AnonActive, Double]) = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    padAngle: SliceNumberOrCallback[VictorySliceProps, padAngle] = null,
    padding: PaddingProps = null,
    pathComponent: VdomElement = null,
    pathFunction: /* props */ VictorySliceProps => CallbackTo[String] = null,
    radius: SliceNumberOrCallback[VictorySliceProps, radius] = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    sliceEndAngle: SliceNumberOrCallback[VictorySliceProps, sliceEndAngle] = null,
    sliceStartAngle: SliceNumberOrCallback[VictorySliceProps, sliceStartAngle] = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null
  ): VictorySliceProps = {
    val __obj = js.Dynamic.literal(slice = slice.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pathComponent != null) __obj.updateDynamic("pathComponent")(pathComponent.rawElement.asInstanceOf[js.Any])
    if (pathFunction != null) __obj.updateDynamic("pathFunction")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.victory.mod.VictorySliceProps) => pathFunction(t0).runNow()))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (sliceEndAngle != null) __obj.updateDynamic("sliceEndAngle")(sliceEndAngle.asInstanceOf[js.Any])
    if (sliceStartAngle != null) __obj.updateDynamic("sliceStartAngle")(sliceStartAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictorySliceProps]
  }
}

