package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl extends js.Object {
  /** Description of the access granted, suitable for display. */
  var description: js.UndefOr[String] = js.undefined
  /** Whether access is restricted to the domain. */
  var domainRestricted: js.UndefOr[Boolean] = js.undefined
  /** The list of access entries. */
  var items: js.UndefOr[js.Array[PlusDomainsAclentryResource]] = js.undefined
  /** Identifies this resource as a collection of access controls. Value: "plus#acl". */
  var kind: js.UndefOr[String] = js.undefined
}

object Acl {
  @scala.inline
  def apply(
    description: String = null,
    domainRestricted: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[PlusDomainsAclentryResource] = null,
    kind: String = null
  ): Acl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(domainRestricted)) __obj.updateDynamic("domainRestricted")(domainRestricted.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
}

