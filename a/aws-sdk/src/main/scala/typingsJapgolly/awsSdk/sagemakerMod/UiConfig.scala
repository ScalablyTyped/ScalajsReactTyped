package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiConfig extends js.Object {
  /**
    * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see  Creating Your Custom Labeling Task Template.
    */
  var UiTemplateS3Uri: S3Uri = js.native
}

object UiConfig {
  @scala.inline
  def apply(UiTemplateS3Uri: S3Uri): UiConfig = {
    val __obj = js.Dynamic.literal(UiTemplateS3Uri = UiTemplateS3Uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UiConfig]
  }
}

