package typingsJapgolly.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g., GitHub).
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext extends js.Object {
  /**
    * Required. Git commit hash.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext {
  @scala.inline
  def apply(revisionId: String = null, url: String = null): SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext = {
    val __obj = js.Dynamic.literal()
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext]
  }
}

