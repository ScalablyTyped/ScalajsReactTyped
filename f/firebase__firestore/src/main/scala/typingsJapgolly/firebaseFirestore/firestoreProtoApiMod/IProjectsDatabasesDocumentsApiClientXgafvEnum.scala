package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesDocumentsApiClientXgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesDocumentsApiClientXgafv
  var `2`: ProjectsDatabasesDocumentsApiClientXgafv
  def values(): js.Array[ProjectsDatabasesDocumentsApiClientXgafv]
}

object IProjectsDatabasesDocumentsApiClientXgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesDocumentsApiClientXgafv,
    `2`: ProjectsDatabasesDocumentsApiClientXgafv,
    values: CallbackTo[js.Array[ProjectsDatabasesDocumentsApiClientXgafv]]
  ): IProjectsDatabasesDocumentsApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClientXgafvEnum]
  }
}

