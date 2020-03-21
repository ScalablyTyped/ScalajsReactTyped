package typingsJapgolly.awsSdkClientS3Node.typesSelectParametersMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsJapgolly.awsSdkClientS3Node.typesInputSerializationMod.UnmarshalledInputSerialization
import typingsJapgolly.awsSdkClientS3Node.typesOutputSerializationMod.UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSelectParameters extends SelectParameters {
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization_UnmarshalledSelectParameters: UnmarshalledInputSerialization
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization_UnmarshalledSelectParameters: UnmarshalledOutputSerialization
}

object UnmarshalledSelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: UnmarshalledInputSerialization,
    OutputSerialization: UnmarshalledOutputSerialization
  ): UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmarshalledSelectParameters]
  }
}

