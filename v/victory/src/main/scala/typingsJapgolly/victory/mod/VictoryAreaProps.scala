package typingsJapgolly.victory.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victory.Anon1
import typingsJapgolly.victory.AnonXBoolean
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.victoryStrings.all
import typingsJapgolly.victory.victoryStrings.data
import typingsJapgolly.victory.victoryStrings.labels
import typingsJapgolly.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryAreaProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryArea events.
    * Since VictoryArea only renders a single element, the eventKey property is not used.
    * The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. an area), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @example
    * events={[
    *   {
    *     target: "data",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              target: "labels",
    *              mutation: () => {
    *                return {text: "hey"};
    *              }
    *            }
    *          ];
    *       }
    *     }
    *   }
    * ]}
    */
  var events: js.UndefOr[js.Array[EventPropTypeInterface[data | labels | parent, all]]] = js.undefined
  /**
    * The interpolation prop determines how data points should be connected when plotting a line
    * @default "linear"
    */
  var interpolation: js.UndefOr[InterpolationPropType] = js.undefined
  /**
    * The labels prop defines the labels that will appear above each point.
    * This prop should be given as an array or as a function of data.
    */
  var labels: js.UndefOr[(js.Array[Double | String]) | js.Function] = js.undefined
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    * @default 50
    */
  var samples: js.UndefOr[Double] = js.undefined
  /**
    * The style prop specifies styles for your VictoryArea. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart.
    * @example {data: {fill: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}

object VictoryAreaProps {
  @scala.inline
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    categories: CategoryPropType = null,
    containerComponent: VdomElement = null,
    data: js.Array[_] = null,
    dataComponent: VdomElement = null,
    domain: DomainPropType = null,
    events: js.Array[EventPropTypeInterface[data | labels | parent, all]] = null,
    groupComponent: VdomElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    interpolation: InterpolationPropType = null,
    label: String | (js.Function1[/* data */ js.Any, String]) = null,
    labelComponent: VdomElement = null,
    labels: (js.Array[Double | String]) | js.Function = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    padding: PaddingProps = null,
    samples: Int | Double = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    y0: DataGetterPropType = null
  ): VictoryAreaProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.rawElement.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.rawElement.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryAreaProps]
  }
}

