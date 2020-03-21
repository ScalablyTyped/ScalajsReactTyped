package typingsJapgolly.awsSdkClientS3Node.typesBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /**
    * <p>Date the bucket was created.</p>
    */
  var CreationDate: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The name of the bucket.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(CreationDate: js.Date | String | Double = null, Name: String = null): Bucket = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

