package typingsJapgolly.googleapis.storageV1Mod.storageV1

import typingsJapgolly.googleapis.AnonProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An access-control entry.
  */
@js.native
trait SchemaObjectAccessControl extends js.Object {
  /**
    * The name of the bucket.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * The domain associated with the entity, if any.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The email address associated with the entity, if any.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The entity holding the permission, in one of the following forms:  -
    * user-userId  - user-email  - group-groupId  - group-email  -
    * domain-domain  - project-team-projectId  - allUsers  -
    * allAuthenticatedUsers Examples:  - The user liz@example.com would be
    * user-liz@example.com.  - The group example@googlegroups.com would be
    * group-example@googlegroups.com.  - To refer to all members of the Google
    * Apps for Business domain example.com, the entity would be
    * domain-example.com.
    */
  var entity: js.UndefOr[String] = js.native
  /**
    * The ID for the entity, if any.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * HTTP 1.1 Entity tag for the access-control entry.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The content generation of the object, if applied to an object.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * The ID of the access-control entry.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For object access control entries, this is
    * always storage#objectAccessControl.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the object, if applied to an object.
    */
  var `object`: js.UndefOr[String] = js.native
  /**
    * The project team associated with the entity, if any.
    */
  var projectTeam: js.UndefOr[AnonProjectNumber] = js.native
  /**
    * The access permission for the entity.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The link to this access-control entry.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaObjectAccessControl {
  @scala.inline
  def apply(
    bucket: String = null,
    domain: String = null,
    email: String = null,
    entity: String = null,
    entityId: String = null,
    etag: String = null,
    generation: String = null,
    id: String = null,
    kind: String = null,
    `object`: String = null,
    projectTeam: AnonProjectNumber = null,
    role: String = null,
    selfLink: String = null
  ): SchemaObjectAccessControl = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (projectTeam != null) __obj.updateDynamic("projectTeam")(projectTeam.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectAccessControl]
  }
}

