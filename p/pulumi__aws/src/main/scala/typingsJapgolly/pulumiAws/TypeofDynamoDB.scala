package typingsJapgolly.pulumiAws

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.awsSdk.mod.DynamoDB.DocumentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDynamoDB extends js.Object {
  val Converter: TypeofConverter = js.native
  val DocumentClient: Instantiable0[typingsJapgolly.awsSdk.mod.DynamoDB.DocumentClient] = js.native
  val Types: this.type = js.native
}

object TypeofDynamoDB {
  @scala.inline
  def apply(Converter: TypeofConverter, DocumentClient: Instantiable0[DocumentClient], Types: TypeofDynamoDB): TypeofDynamoDB = {
    val __obj = js.Dynamic.literal(Converter = Converter.asInstanceOf[js.Any], DocumentClient = DocumentClient.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofDynamoDB]
  }
}

