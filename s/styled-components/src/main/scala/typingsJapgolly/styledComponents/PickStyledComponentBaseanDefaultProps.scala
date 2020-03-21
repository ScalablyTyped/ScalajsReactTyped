package typingsJapgolly.styledComponents

import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import typingsJapgolly.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponent
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInterpolation
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, never>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
@js.native
trait PickStyledComponentBaseanDefaultProps extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
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

