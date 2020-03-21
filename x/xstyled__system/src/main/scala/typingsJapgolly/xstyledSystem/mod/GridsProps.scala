package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.GridAutoColumnsProperty
import typingsJapgolly.csstype.mod.GridAutoFlowProperty
import typingsJapgolly.csstype.mod.GridAutoRowsProperty
import typingsJapgolly.csstype.mod.GridColumnGapProperty
import typingsJapgolly.csstype.mod.GridColumnProperty
import typingsJapgolly.csstype.mod.GridGapProperty
import typingsJapgolly.csstype.mod.GridRowGapProperty
import typingsJapgolly.csstype.mod.GridRowProperty
import typingsJapgolly.csstype.mod.GridTemplateAreasProperty
import typingsJapgolly.csstype.mod.GridTemplateColumnsProperty
import typingsJapgolly.csstype.mod.GridTemplateRowsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsProps
  extends GridGapProps[StyledSystemLength]
     with GridColumnGapProps[StyledSystemLength]
     with GridRowGapProps[StyledSystemLength]
     with GridColumnProps
     with GridRowProps
     with GridAutoFlowProps
     with GridAutoColumnsProps[StyledSystemLength]
     with GridAutoRowsProps[StyledSystemLength]
     with GridTemplateColumnsProps[StyledSystemLength]
     with GridTemplateRowsProps[StyledSystemLength]
     with GridTemplateAreasProps
     with GridAreaProps

object GridsProps {
  @scala.inline
  def apply(
    gridArea: ResponsiveValue[String] = null,
    gridAutoColumns: ResponsiveValue[GridAutoColumnsProperty[StyledSystemLength]] = null,
    gridAutoFlow: ResponsiveValue[GridAutoFlowProperty] = null,
    gridAutoRows: ResponsiveValue[GridAutoRowsProperty[StyledSystemLength]] = null,
    gridColumn: ResponsiveValue[GridColumnProperty] = null,
    gridColumnGap: ResponsiveValue[GridColumnGapProperty[StyledSystemLength]] = null,
    gridGap: ResponsiveValue[GridGapProperty[StyledSystemLength]] = null,
    gridRow: ResponsiveValue[GridRowProperty] = null,
    gridRowGap: ResponsiveValue[GridRowGapProperty[StyledSystemLength]] = null,
    gridTemplateAreas: ResponsiveValue[GridTemplateAreasProperty] = null,
    gridTemplateColumns: ResponsiveValue[GridTemplateColumnsProperty[StyledSystemLength]] = null,
    gridTemplateRows: ResponsiveValue[GridTemplateRowsProperty[StyledSystemLength]] = null
  ): GridsProps = {
    val __obj = js.Dynamic.literal()
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsProps]
  }
}

