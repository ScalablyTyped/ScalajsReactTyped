package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberMetadata extends Metadata {
  var ImeMode: typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
  var MaxValue: Double
  var MinValue: Double
}

object NumberMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxValue: Double,
    MinValue: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): NumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberMetadata]
  }
}

