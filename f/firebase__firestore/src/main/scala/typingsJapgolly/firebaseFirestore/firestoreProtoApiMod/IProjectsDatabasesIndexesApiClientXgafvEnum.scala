package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesIndexesApiClientXgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesIndexesApiClientXgafv
  var `2`: ProjectsDatabasesIndexesApiClientXgafv
  def values(): js.Array[ProjectsDatabasesIndexesApiClientXgafv]
}

object IProjectsDatabasesIndexesApiClientXgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesIndexesApiClientXgafv,
    `2`: ProjectsDatabasesIndexesApiClientXgafv,
    values: CallbackTo[js.Array[ProjectsDatabasesIndexesApiClientXgafv]]
  ): IProjectsDatabasesIndexesApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientXgafvEnum]
  }
}

