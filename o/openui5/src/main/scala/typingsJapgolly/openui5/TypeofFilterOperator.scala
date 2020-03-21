package typingsJapgolly.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofFilterOperator extends js.Object {
  /**
    * FilterOperator between.When used on strings, the BT operator might not behave intuitively. For
    * example,when filtering a list of Names with BT "A", "B", all Names starting with "A" will beincluded
    * as well as the name "B" itself, but no other name starting with "B".
    */
  var BT: js.Any
  /**
    * FilterOperator contains
    */
  var Contains: js.Any
  /**
    * FilterOperator equals
    */
  var EQ: js.Any
  /**
    * FilterOperator ends with
    */
  var EndsWith: js.Any
  /**
    * FilterOperator greater or equals
    */
  var GE: js.Any
  /**
    * FilterOperator greater than
    */
  var GT: js.Any
  /**
    * FilterOperator less or equals
    */
  var LE: js.Any
  /**
    * FilterOperator less than
    */
  var LT: js.Any
  /**
    * FilterOperator not equals
    */
  var NE: js.Any
  /**
    * FilterOperator starts with
    */
  var StartsWith: js.Any
}

object TypeofFilterOperator {
  @scala.inline
  def apply(
    BT: js.Any,
    Contains: js.Any,
    EQ: js.Any,
    EndsWith: js.Any,
    GE: js.Any,
    GT: js.Any,
    LE: js.Any,
    LT: js.Any,
    NE: js.Any,
    StartsWith: js.Any
  ): TypeofFilterOperator = {
    val __obj = js.Dynamic.literal(BT = BT.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EQ = EQ.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], GE = GE.asInstanceOf[js.Any], GT = GT.asInstanceOf[js.Any], LE = LE.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofFilterOperator]
  }
}

