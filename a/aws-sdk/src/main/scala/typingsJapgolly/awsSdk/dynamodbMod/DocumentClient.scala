package typingsJapgolly.awsSdk.dynamodbMod

import typingsJapgolly.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dynamodb", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
class DocumentClient ()
  extends typingsJapgolly.awsSdk.documentClientMod.DocumentClient {
  def this(options: DocumentClientOptions with ClientConfiguration) = this()
}

