package typingsJapgolly.styledDashComponents

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
@js.native
trait PickStyledComponentBaseanyanyanyneverkeyofStyledCo extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var $$typeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, scala.Nothing]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]]] = js.native
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ] = js.native
}

