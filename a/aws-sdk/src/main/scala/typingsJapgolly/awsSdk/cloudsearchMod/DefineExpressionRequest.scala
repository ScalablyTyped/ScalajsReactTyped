package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineExpressionRequest extends js.Object {
  var DomainName: typingsJapgolly.awsSdk.cloudsearchMod.DomainName = js.native
  var Expression: typingsJapgolly.awsSdk.cloudsearchMod.Expression = js.native
}

object DefineExpressionRequest {
  @scala.inline
  def apply(DomainName: DomainName, Expression: Expression): DefineExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineExpressionRequest]
  }
}

