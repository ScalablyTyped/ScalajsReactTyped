package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import typingsJapgolly.gapiClientBigquery.AnonDomain
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /**
    * [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in
    * order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following
    * entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup:
    * projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
    */
  var access: js.UndefOr[js.Array[AnonDomain]] = js.undefined
  /** [Output-only] The time when this dataset was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  /** [Required] A reference that identifies the dataset. */
  var datasetReference: js.UndefOr[DatasetReference] = js.undefined
  /**
    * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property
    * is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and
    * changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted
    * automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating
    * a table, that value takes precedence over the default expiration time indicated by this property.
    */
  var defaultTableExpirationMs: js.UndefOr[String] = js.undefined
  /** [Optional] A user-friendly description of the dataset. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output-only] A hash of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** [Optional] A descriptive name for the dataset. */
  var friendlyName: js.UndefOr[String] = js.undefined
  /**
    * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId. The dataset name without the project name is given in
    * the datasetId field. When creating a new dataset, leave this field blank, and instead specify the datasetId field.
    */
  var id: js.UndefOr[String] = js.undefined
  /** [Output-only] The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a
    * dataset. See Labeling Datasets for more information.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** [Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  /** The geographic location where the dataset should reside. Possible values include EU and US. The default value is US. */
  var location: js.UndefOr[String] = js.undefined
  /** [Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    access: js.Array[AnonDomain] = null,
    creationTime: String = null,
    datasetReference: DatasetReference = null,
    defaultTableExpirationMs: String = null,
    description: String = null,
    etag: String = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: Record[String, String] = null,
    lastModifiedTime: String = null,
    location: String = null,
    selfLink: String = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference.asInstanceOf[js.Any])
    if (defaultTableExpirationMs != null) __obj.updateDynamic("defaultTableExpirationMs")(defaultTableExpirationMs.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

