package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typingsJapgolly.awsSdk.dynamodbMod.ClientConfiguration
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/dynamodb", JSImport.Namespace)
@js.native
object servicesDynamodbMod extends js.Object {
  @js.native
  class DynamoDBCustomizations () extends Service
  
  /* static members */
  @js.native
  object DynamoDBCustomizations extends js.Object {
    /**
      * The document client simplifies working with items in Amazon DynamoDB by abstracting away the notion of attribute values.
      * This abstraction annotates native JavaScript types supplied as input parameters, as well as converts annotated response data to native JavaScript types.
      */
    var DocumentClient: Instantiable1[
        js.UndefOr[/* options */ DocumentClientOptions with ClientConfiguration], 
        typingsJapgolly.awsSdk.documentClientMod.DocumentClient
      ] = js.native
  }
  
}

