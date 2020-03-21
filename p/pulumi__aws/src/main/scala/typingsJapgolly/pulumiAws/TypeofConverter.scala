package typingsJapgolly.pulumiAws

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.converterMod.Converter.ConverterOptions
import typingsJapgolly.awsSdk.dynamodbMod.AttributeMap
import typingsJapgolly.awsSdk.dynamodbMod.AttributeValue
import typingsJapgolly.awsSdk.mod.DynamoDB.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofConverter extends Instantiable0[Converter] {
  def input(data: js.Any): AttributeValue = js.native
  def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
  def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
  def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
  def output(data: AttributeValue): js.Any = js.native
  def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
  def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
  def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
}

