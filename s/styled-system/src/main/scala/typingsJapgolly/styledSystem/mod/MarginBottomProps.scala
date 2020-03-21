package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mb' | 'marginBottom'> */
trait MarginBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var marginBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsJapgolly.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var mb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsJapgolly.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object MarginBottomProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    marginBottom: ResponsiveValue[
      ThemeValue[typingsJapgolly.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    mb: ResponsiveValue[
      ThemeValue[typingsJapgolly.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): MarginBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginBottomProps[ThemeType]]
  }
}

