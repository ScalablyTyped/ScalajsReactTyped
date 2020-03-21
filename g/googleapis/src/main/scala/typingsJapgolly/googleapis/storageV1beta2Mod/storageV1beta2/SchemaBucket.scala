package typingsJapgolly.googleapis.storageV1beta2Mod.storageV1beta2

import typingsJapgolly.googleapis.AnonEnabledBoolean
import typingsJapgolly.googleapis.AnonEntity
import typingsJapgolly.googleapis.AnonLogBucket
import typingsJapgolly.googleapis.AnonMainPageSuffix
import typingsJapgolly.googleapis.AnonMaxAgeSeconds
import typingsJapgolly.googleapis.AnonRuleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bucket.
  */
@js.native
trait SchemaBucket extends js.Object {
  /**
    * Access controls on the bucket.
    */
  var acl: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  /**
    * The bucket&#39;s Cross-Origin Resource Sharing (CORS) configuration.
    */
  var cors: js.UndefOr[js.Array[AnonMaxAgeSeconds]] = js.native
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  /**
    * HTTP 1.1 Entity tag for the bucket.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of the bucket.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s lifecycle configuration. See object lifecycle management
    * for more information.
    */
  var lifecycle: js.UndefOr[AnonRuleArray] = js.native
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage within this region. Typical values are US and EU.
    * Defaults to US. See the developer&#39;s guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s logging configuration, which defines the destination
    * bucket and optional name prefix for the current bucket&#39;s logs.
    */
  var logging: js.UndefOr[AnonLogBucket] = js.native
  /**
    * The metadata generation of this bucket.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the bucket. This is always the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[AnonEntity] = js.native
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s storage class. This defines how objects in the bucket
    * are stored and determines the SLA and the cost of storage. Typical values
    * are STANDARD and DURABLE_REDUCED_AVAILABILITY. Defaults to STANDARD. See
    * the developer&#39;s guide for the authoritative list.
    */
  var storageClass: js.UndefOr[String] = js.native
  /**
    * Creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s versioning configuration.
    */
  var versioning: js.UndefOr[AnonEnabledBoolean] = js.native
  /**
    * The bucket&#39;s website configuration.
    */
  var website: js.UndefOr[AnonMainPageSuffix] = js.native
}

object SchemaBucket {
  @scala.inline
  def apply(
    acl: js.Array[SchemaBucketAccessControl] = null,
    cors: js.Array[AnonMaxAgeSeconds] = null,
    defaultObjectAcl: js.Array[SchemaObjectAccessControl] = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    lifecycle: AnonRuleArray = null,
    location: String = null,
    logging: AnonLogBucket = null,
    metageneration: String = null,
    name: String = null,
    owner: AnonEntity = null,
    selfLink: String = null,
    storageClass: String = null,
    timeCreated: String = null,
    versioning: AnonEnabledBoolean = null,
    website: AnonMainPageSuffix = null
  ): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (defaultObjectAcl != null) __obj.updateDynamic("defaultObjectAcl")(defaultObjectAcl.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucket]
  }
}

