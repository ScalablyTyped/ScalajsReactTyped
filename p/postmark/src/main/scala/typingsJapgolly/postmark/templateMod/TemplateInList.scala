package typingsJapgolly.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateInList extends js.Object {
  var Active: Boolean
  var Alias: String | Null
  var LayoutTemplate: String | Null
  var Name: String
  var TemplateId: Double
  var TemplateType: TemplateTypes
}

object TemplateInList {
  @scala.inline
  def apply(
    Active: Boolean,
    Name: String,
    TemplateId: Double,
    TemplateType: TemplateTypes,
    Alias: String = null,
    LayoutTemplate: String = null
  ): TemplateInList = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    if (LayoutTemplate != null) __obj.updateDynamic("LayoutTemplate")(LayoutTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateInList]
  }
}

