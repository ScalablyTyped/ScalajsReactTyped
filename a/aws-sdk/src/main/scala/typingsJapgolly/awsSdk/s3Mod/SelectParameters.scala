package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * The expression that is used to query the object.
    */
  var Expression: typingsJapgolly.awsSdk.s3Mod.Expression = js.native
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typingsJapgolly.awsSdk.s3Mod.ExpressionType = js.native
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: typingsJapgolly.awsSdk.s3Mod.InputSerialization = js.native
  /**
    * Describes how the results of the Select job are serialized.
    */
  var OutputSerialization: typingsJapgolly.awsSdk.s3Mod.OutputSerialization = js.native
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectParameters]
  }
}

