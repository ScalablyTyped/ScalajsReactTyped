package typingsJapgolly.styledDashComponents.styledDashComponentsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.reactMod.WeakValidationMap
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
/* Rewritten from type alias, can be one of: 
  - typings.styledDashComponents.PickStyledComponentBaseanyanyanyanykeyofStyledComp
  - typings.styledDashComponents.PickStyledComponentBaseanyanyanyneverkeyofStyledCo
*/
trait StyledComponentInterpolation extends _InterpolationValue

object StyledComponentInterpolation {
  @scala.inline
  def PickStyledComponentBaseanyanyanyanykeyofStyledComp(
    $$typeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => CallbackTo[
      StyledComponent[
        StyledComponentInnerComponent[AnyStyledComponent], 
        _, 
        js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
        _ | StyledComponentInnerAttrs[AnyStyledComponent]
      ]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, _]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, _]] = null
  ): StyledComponentInterpolation = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any])
    __obj.updateDynamic("withComponent")(js.Any.fromFunction1((t0: /* component */ typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyStyledComponent) => withComponent(t0).runNow()))
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentInterpolation]
  }
  @scala.inline
  def PickStyledComponentBaseanyanyanyneverkeyofStyledCo(
    $$typeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => CallbackTo[
      StyledComponent[
        StyledComponentInnerComponent[AnyStyledComponent], 
        _, 
        js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
        scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
      ]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, scala.Nothing]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]] = null
  ): StyledComponentInterpolation = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any])
    __obj.updateDynamic("withComponent")(js.Any.fromFunction1((t0: /* component */ typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyStyledComponent) => withComponent(t0).runNow()))
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentInterpolation]
  }
}

