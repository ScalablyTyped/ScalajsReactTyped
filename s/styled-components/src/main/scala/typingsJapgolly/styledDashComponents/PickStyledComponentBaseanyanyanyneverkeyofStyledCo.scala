package typingsJapgolly.styledDashComponents

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.reactMod.WeakValidationMap
import typingsJapgolly.std.Partial
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponent
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInnerAttrs
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInnerComponent
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInnerOtherProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInterpolation
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, never>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait PickStyledComponentBaseanyanyanyneverkeyofStyledCo extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var $$typeof: js.Symbol
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, scala.Nothing]]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]]] = js.undefined
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ]
}

object PickStyledComponentBaseanyanyanyneverkeyofStyledCo {
  @scala.inline
  def apply(
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
  ): PickStyledComponentBaseanyanyanyneverkeyofStyledCo = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any])
    __obj.updateDynamic("withComponent")(js.Any.fromFunction1((t0: /* component */ typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyStyledComponent) => withComponent(t0).runNow()))
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBaseanyanyanyneverkeyofStyledCo]
  }
}

