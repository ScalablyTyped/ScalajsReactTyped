package typingsJapgolly.azureCoreHttp.typesLatestSrcSerializerMod

import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Base64Url
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Boolean
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.ByteArray
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Date
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.DateTime
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.DateTimeRfc1123
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Number
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Object
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Stream
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.String
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.TimeSpan
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.UnixTime
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.Uuid
import typingsJapgolly.azureCoreHttp.azureCoreHttpStrings.any
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
