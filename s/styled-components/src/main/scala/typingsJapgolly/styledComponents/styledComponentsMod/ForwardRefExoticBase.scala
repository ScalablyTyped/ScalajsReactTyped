package typingsJapgolly.styledComponents.styledComponentsMod

import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
@js.native
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[typingsJapgolly.styledComponents.styledComponentsStrings.defaultProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[
    WeakValidationMap[typingsJapgolly.styledComponents.styledComponentsStrings.propTypes]
  ] = js.native
}

