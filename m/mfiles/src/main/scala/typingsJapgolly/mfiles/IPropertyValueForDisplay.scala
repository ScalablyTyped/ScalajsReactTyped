package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import typingsJapgolly.mfiles.MFiles.MFContentType
import typingsJapgolly.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueForDisplay extends js.Object {
  val ContentType: MFContentType
  val DataType: MFDataType
  val DisplayValue: String
  val PropertyDef: MFBuiltInPropertyDef | Double
  val PropertyDefName: String
  val PropertyValue: IPropertyValue
  val ReadOnly: Boolean
  def Clone(): IPropertyValueForDisplay
}

object IPropertyValueForDisplay {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValueForDisplay],
    ContentType: MFContentType,
    DataType: MFDataType,
    DisplayValue: String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    PropertyDefName: String,
    PropertyValue: IPropertyValue,
    ReadOnly: Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName.asInstanceOf[js.Any], PropertyValue = PropertyValue.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
}

