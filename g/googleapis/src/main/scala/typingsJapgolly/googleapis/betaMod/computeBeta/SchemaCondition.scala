package typingsJapgolly.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition to be met.
  */
@js.native
trait SchemaCondition extends js.Object {
  /**
    * Trusted attributes supplied by the IAM system.
    */
  var iam: js.UndefOr[String] = js.native
  /**
    * An operator to apply the subject with.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * Trusted attributes discharged by the service.
    */
  var svc: js.UndefOr[String] = js.native
  /**
    * Trusted attributes supplied by any service that owns resources and uses
    * the IAM system for access control.
    */
  var sys: js.UndefOr[String] = js.native
  /**
    * The objects of the condition.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCondition {
  @scala.inline
  def apply(
    iam: String = null,
    op: String = null,
    svc: String = null,
    sys: String = null,
    values: js.Array[String] = null
  ): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    if (iam != null) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (svc != null) __obj.updateDynamic("svc")(svc.asInstanceOf[js.Any])
    if (sys != null) __obj.updateDynamic("sys")(sys.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCondition]
  }
}

