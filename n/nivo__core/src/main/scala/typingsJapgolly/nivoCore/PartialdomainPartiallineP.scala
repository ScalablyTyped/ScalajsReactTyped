package typingsJapgolly.nivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  domain  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>}>,   ticks  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>,   text  :std.Partial<react.react.CSSProperties>}>,   legend  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>}> */
trait PartialdomainPartiallineP extends js.Object {
  var domain: js.UndefOr[PartiallinePartialCSSProp] = js.undefined
  var legend: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var ticks: js.UndefOr[PartiallinePartialCSSPropLine] = js.undefined
}

object PartialdomainPartiallineP {
  @scala.inline
  def apply(
    domain: PartiallinePartialCSSProp = null,
    legend: PartialtextPartialCSSProp = null,
    ticks: PartiallinePartialCSSPropLine = null
  ): PartialdomainPartiallineP = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialdomainPartiallineP]
  }
}

