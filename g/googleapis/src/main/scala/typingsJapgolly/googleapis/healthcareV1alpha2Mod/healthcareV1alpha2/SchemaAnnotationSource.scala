package typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AnnotationSource holds the source information of the annotation.
  */
@js.native
trait SchemaAnnotationSource extends js.Object {
  /**
    * Cloud Healthcare API resource.
    */
  var cloudHealthcareSource: js.UndefOr[SchemaCloudHealthcareSource] = js.native
}

object SchemaAnnotationSource {
  @scala.inline
  def apply(cloudHealthcareSource: SchemaCloudHealthcareSource = null): SchemaAnnotationSource = {
    val __obj = js.Dynamic.literal()
    if (cloudHealthcareSource != null) __obj.updateDynamic("cloudHealthcareSource")(cloudHealthcareSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotationSource]
  }
}

