package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.AlignContentProperty
import typingsJapgolly.csstype.mod.AlignItemsProperty
import typingsJapgolly.csstype.mod.AlignSelfProperty
import typingsJapgolly.csstype.mod.DisplayProperty
import typingsJapgolly.csstype.mod.FlexBasisProperty
import typingsJapgolly.csstype.mod.FlexDirectionProperty
import typingsJapgolly.csstype.mod.FlexProperty
import typingsJapgolly.csstype.mod.FlexWrapProperty
import typingsJapgolly.csstype.mod.GlobalsNumber
import typingsJapgolly.csstype.mod.JustifyContentProperty
import typingsJapgolly.csstype.mod.JustifyItemsProperty
import typingsJapgolly.csstype.mod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexboxesProps
  extends DisplayProps
     with AlignItemsProps
     with AlignContentProps
     with JustifyContentProps
     with JustifyItemsProps
     with FlexWrapProps
     with FlexBasisProps[StyledSystemLength]
     with FlexDirectionProps
     with FlexProps[StyledSystemLength]
     with JustifySelfProps
     with AlignSelfProps
     with OrderProps

object FlexboxesProps {
  @scala.inline
  def apply(
    alignContent: ResponsiveValue[AlignContentProperty] = null,
    alignItems: ResponsiveValue[AlignItemsProperty] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty] = null,
    display: ResponsiveValue[DisplayProperty] = null,
    flex: ResponsiveValue[FlexProperty[StyledSystemLength]] = null,
    flexBasis: ResponsiveValue[FlexBasisProperty[StyledSystemLength]] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty] = null,
    justifyContent: ResponsiveValue[JustifyContentProperty] = null,
    justifyItems: ResponsiveValue[JustifyItemsProperty] = null,
    justifySelf: ResponsiveValue[JustifySelfProperty] = null,
    order: ResponsiveValue[GlobalsNumber] = null
  ): FlexboxesProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexboxesProps]
  }
}

