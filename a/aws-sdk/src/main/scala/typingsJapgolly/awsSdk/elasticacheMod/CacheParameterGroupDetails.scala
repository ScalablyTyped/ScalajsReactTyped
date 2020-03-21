package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupDetails extends js.Object {
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of Parameter instances.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}

object CacheParameterGroupDetails {
  @scala.inline
  def apply(
    CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList = null,
    Marker: String = null,
    Parameters: ParametersList = null
  ): CacheParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeTypeSpecificParameters != null) __obj.updateDynamic("CacheNodeTypeSpecificParameters")(CacheNodeTypeSpecificParameters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheParameterGroupDetails]
  }
}

