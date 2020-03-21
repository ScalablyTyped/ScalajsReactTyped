package typingsJapgolly.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "TemplateValidationOptions")
@js.native
class TemplateValidationOptions protected ()
  extends typingsJapgolly.postmark.templateMod.TemplateValidationOptions {
  def this(
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    TestRenderModel: js.UndefOr[js.Object],
    TemplateType: js.UndefOr[typingsJapgolly.postmark.templateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String],
    InlineCssForHtmlTestRender: js.UndefOr[Boolean]
  ) = this()
}

