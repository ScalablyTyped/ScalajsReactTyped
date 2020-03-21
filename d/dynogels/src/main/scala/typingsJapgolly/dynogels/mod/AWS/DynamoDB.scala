package typingsJapgolly.dynogels.mod.AWS

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.converterMod.Converter.ConverterOptions
import typingsJapgolly.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typingsJapgolly.awsSdk.dynamodbMod.AttributeMap
import typingsJapgolly.awsSdk.dynamodbMod.AttributeValue
import typingsJapgolly.awsSdk.dynamodbMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class DynamoDB ()
  extends typingsJapgolly.awsSdk.mod.DynamoDB {
  def this(options: ClientConfiguration) = this()
}

@JSImport("dynogels", "AWS.DynamoDB")
@js.native
object DynamoDB extends js.Object {
  @js.native
  class Converter ()
    extends typingsJapgolly.awsSdk.mod.DynamoDB.Converter
  
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends typingsJapgolly.awsSdk.mod.DynamoDB.DocumentClient {
    def this(options: DocumentClientOptions with ClientConfiguration) = this()
  }
  
  /* static members */
  @js.native
  object Converter extends js.Object {
    def input(data: js.Any): AttributeValue = js.native
    def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
    def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
    def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
    def output(data: AttributeValue): js.Any = js.native
    def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
    def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
    def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
  }
  
}

