package typingsJapgolly.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.clientsDynamodbMod.AttributeMap
import typingsJapgolly.awsSdk.clientsDynamodbMod.AttributeValue
import typingsJapgolly.awsSdk.libDynamodbConverterMod.Converter.ConverterOptions
import typingsJapgolly.awsSdk.mod.DynamoDB.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofConverter
  extends StObject
     with Instantiable0[Converter] {
  
  def input(data: Any): AttributeValue = js.native
  def input(data: Any, options: ConverterOptions): AttributeValue = js.native
  
  def marshall(data: StringDictionary[Any]): AttributeMap = js.native
  def marshall(data: StringDictionary[Any], options: ConverterOptions): AttributeMap = js.native
  
  def output(data: AttributeValue): Any = js.native
  def output(data: AttributeValue, options: ConverterOptions): Any = js.native
  
  def unmarshall(data: AttributeMap): StringDictionary[Any] = js.native
  def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[Any] = js.native
}
