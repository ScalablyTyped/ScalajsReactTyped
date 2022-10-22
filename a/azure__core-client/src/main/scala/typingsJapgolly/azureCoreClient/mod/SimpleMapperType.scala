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

trait SimpleMapperType
  extends StObject
     with MapperType {
  
  /**
    * Name of the type of the property.
    */
  var name: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
}
object SimpleMapperType {
  
  inline def apply(
    name: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
  ): SimpleMapperType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMapperType]
  }
  
  extension [Self <: SimpleMapperType](x: Self) {
    
    inline def setName(
      value: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
