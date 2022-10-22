package typingsJapgolly.maximMazurokGapiClientStorage.gapi.client.storage

import typingsJapgolly.maximMazurokGapiClientStorage.anon.BucketPolicyOnly
import typingsJapgolly.maximMazurokGapiClientStorage.anon.DataLocations
import typingsJapgolly.maximMazurokGapiClientStorage.anon.DefaultKmsKeyName
import typingsJapgolly.maximMazurokGapiClientStorage.anon.EffectiveTime
import typingsJapgolly.maximMazurokGapiClientStorage.anon.Enabled
import typingsJapgolly.maximMazurokGapiClientStorage.anon.Entity
import typingsJapgolly.maximMazurokGapiClientStorage.anon.LogBucket
import typingsJapgolly.maximMazurokGapiClientStorage.anon.MainPageSuffix
import typingsJapgolly.maximMazurokGapiClientStorage.anon.MaxAgeSeconds
import typingsJapgolly.maximMazurokGapiClientStorage.anon.RequesterPays
import typingsJapgolly.maximMazurokGapiClientStorage.anon.Rule
import typingsJapgolly.maximMazurokGapiClientStorage.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /** Access controls on the bucket. */
  var acl: js.UndefOr[js.Array[BucketAccessControl]] = js.undefined
  
  /** The bucket's Autoclass configuration. */
  var autoclass: js.UndefOr[Enabled] = js.undefined
  
  /** The bucket's billing configuration. */
  var billing: js.UndefOr[RequesterPays] = js.undefined
  
  /** The bucket's Cross-Origin Resource Sharing (CORS) configuration. */
  var cors: js.UndefOr[js.Array[MaxAgeSeconds]] = js.undefined
  
  /** The bucket's custom placement configuration for Custom Dual Regions. */
  var customPlacementConfig: js.UndefOr[DataLocations] = js.undefined
  
  /**
    * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the
    * hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at
    * least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for
    * any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins
    * from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
    */
  var defaultEventBasedHold: js.UndefOr[Boolean] = js.undefined
  
  /** Default access controls to apply to new objects when no ACL is provided. */
  var defaultObjectAcl: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  
  /** Encryption configuration for a bucket. */
  var encryption: js.UndefOr[DefaultKmsKeyName] = js.undefined
  
  /** HTTP 1.1 Entity tag for the bucket. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The bucket's IAM configuration. */
  var iamConfiguration: js.UndefOr[BucketPolicyOnly] = js.undefined
  
  /** The ID of the bucket. For buckets, the id and name properties are the same. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of item this is. For buckets, this is always storage#bucket. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** User-provided labels, in key/value pairs. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The bucket's lifecycle configuration. See lifecycle management for more information. */
  var lifecycle: js.UndefOr[Rule] = js.undefined
  
  /**
    * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative
    * list.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** The type of the bucket location. */
  var locationType: js.UndefOr[String] = js.undefined
  
  /** The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs. */
  var logging: js.UndefOr[LogBucket] = js.undefined
  
  /** The metadata generation of this bucket. */
  var metageneration: js.UndefOr[String] = js.undefined
  
  /** The name of the bucket. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The owner of the bucket. This is always the project team's owner group. */
  var owner: js.UndefOr[Entity] = js.undefined
  
  /** The project number of the project the bucket belongs to. */
  var projectNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite
    * or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a
    * storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a
    * locked retention policy will result in a PERMISSION_DENIED error.
    */
  var retentionPolicy: js.UndefOr[EffectiveTime] = js.undefined
  
  /** The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket. */
  var rpo: js.UndefOr[String] = js.undefined
  
  /** Reserved for future use. */
  var satisfiesPZS: js.UndefOr[Boolean] = js.undefined
  
  /** The URI of this bucket. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA
    * and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the
    * bucket is created, it will default to STANDARD. For more information, see storage classes.
    */
  var storageClass: js.UndefOr[String] = js.undefined
  
  /** The creation time of the bucket in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.undefined
  
  /** The modification time of the bucket in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** The bucket's versioning configuration. */
  var versioning: js.UndefOr[`0`] = js.undefined
  
  /** The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information. */
  var website: js.UndefOr[MainPageSuffix] = js.undefined
}
object Bucket {
  
  inline def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  extension [Self <: Bucket](x: Self) {
    
    inline def setAcl(value: js.Array[BucketAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setAclVarargs(value: BucketAccessControl*): Self = StObject.set(x, "acl", js.Array(value*))
    
    inline def setAutoclass(value: Enabled): Self = StObject.set(x, "autoclass", value.asInstanceOf[js.Any])
    
    inline def setAutoclassUndefined: Self = StObject.set(x, "autoclass", js.undefined)
    
    inline def setBilling(value: RequesterPays): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setCors(value: js.Array[MaxAgeSeconds]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setCorsVarargs(value: MaxAgeSeconds*): Self = StObject.set(x, "cors", js.Array(value*))
    
    inline def setCustomPlacementConfig(value: DataLocations): Self = StObject.set(x, "customPlacementConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomPlacementConfigUndefined: Self = StObject.set(x, "customPlacementConfig", js.undefined)
    
    inline def setDefaultEventBasedHold(value: Boolean): Self = StObject.set(x, "defaultEventBasedHold", value.asInstanceOf[js.Any])
    
    inline def setDefaultEventBasedHoldUndefined: Self = StObject.set(x, "defaultEventBasedHold", js.undefined)
    
    inline def setDefaultObjectAcl(value: js.Array[ObjectAccessControl]): Self = StObject.set(x, "defaultObjectAcl", value.asInstanceOf[js.Any])
    
    inline def setDefaultObjectAclUndefined: Self = StObject.set(x, "defaultObjectAcl", js.undefined)
    
    inline def setDefaultObjectAclVarargs(value: ObjectAccessControl*): Self = StObject.set(x, "defaultObjectAcl", js.Array(value*))
    
    inline def setEncryption(value: DefaultKmsKeyName): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIamConfiguration(value: BucketPolicyOnly): Self = StObject.set(x, "iamConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIamConfigurationUndefined: Self = StObject.set(x, "iamConfiguration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLifecycle(value: Rule): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLogging(value: LogBucket): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    inline def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setRetentionPolicy(value: EffectiveTime): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    inline def setRpo(value: String): Self = StObject.set(x, "rpo", value.asInstanceOf[js.Any])
    
    inline def setRpoUndefined: Self = StObject.set(x, "rpo", js.undefined)
    
    inline def setSatisfiesPZS(value: Boolean): Self = StObject.set(x, "satisfiesPZS", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPZSUndefined: Self = StObject.set(x, "satisfiesPZS", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVersioning(value: `0`): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    inline def setWebsite(value: MainPageSuffix): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
