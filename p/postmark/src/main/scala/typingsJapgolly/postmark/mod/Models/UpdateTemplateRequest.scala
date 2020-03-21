package typingsJapgolly.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.UpdateTemplateRequest")
@js.native
class UpdateTemplateRequest protected ()
  extends typingsJapgolly.postmark.modelsMod.UpdateTemplateRequest {
  def this(
    Name: js.UndefOr[String],
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[Null | String],
    TemplateType: js.UndefOr[typingsJapgolly.postmark.templateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}

