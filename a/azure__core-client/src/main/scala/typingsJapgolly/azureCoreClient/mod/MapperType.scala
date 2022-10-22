package typingsJapgolly.azureCoreClient.mod

import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Base64Url
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Boolean
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.ByteArray
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Date
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.DateTime
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.DateTimeRfc1123
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Number
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Object
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Stream
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.String
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.TimeSpan
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.UnixTime
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.Uuid
import typingsJapgolly.azureCoreClient.azureCoreClientStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azureCoreClient.mod.SimpleMapperType
  - typingsJapgolly.azureCoreClient.mod.CompositeMapperType
  - typingsJapgolly.azureCoreClient.mod.SequenceMapperType
  - typingsJapgolly.azureCoreClient.mod.DictionaryMapperType
  - typingsJapgolly.azureCoreClient.mod.EnumMapperType
*/
trait MapperType extends StObject
object MapperType {
  
  inline def CompositeMapperType(): typingsJapgolly.azureCoreClient.mod.CompositeMapperType = {
    val __obj = js.Dynamic.literal(name = "Composite")
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.CompositeMapperType]
  }
  
  inline def DictionaryMapperType(value: Mapper): typingsJapgolly.azureCoreClient.mod.DictionaryMapperType = {
    val __obj = js.Dynamic.literal(name = "Dictionary", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.DictionaryMapperType]
  }
  
  inline def EnumMapperType(allowedValues: js.Array[Any]): typingsJapgolly.azureCoreClient.mod.EnumMapperType = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], name = "Enum")
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.EnumMapperType]
  }
  
  inline def SequenceMapperType(element: Mapper): typingsJapgolly.azureCoreClient.mod.SequenceMapperType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = "Sequence")
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.SequenceMapperType]
  }
  
  inline def SimpleMapperType(
    name: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
  ): typingsJapgolly.azureCoreClient.mod.SimpleMapperType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.SimpleMapperType]
  }
}
