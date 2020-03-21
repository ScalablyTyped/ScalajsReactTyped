package typingsJapgolly.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends js.Object {
  /**
    * The clusters to be created within the instance, mapped by desired cluster
    * ID, e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`. Fields
    * marked `OutputOnly` must be left blank. Currently, at most two clusters
    * can be specified.
    */
  var clusters: js.UndefOr[StringDictionary[SchemaCluster]] = js.native
  /**
    * The instance to create. Fields marked `OutputOnly` must be left blank.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  /**
    * The ID to be used when referring to the new instance within its project,
    * e.g., just `myinstance` rather than
    * `projects/myproject/instances/myinstance`.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The unique name of the project in which to create the new instance.
    * Values are of the form `projects/&lt;project&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaCreateInstanceRequest {
  @scala.inline
  def apply(
    clusters: StringDictionary[SchemaCluster] = null,
    instance: SchemaInstance = null,
    instanceId: String = null,
    parent: String = null
  ): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
}

