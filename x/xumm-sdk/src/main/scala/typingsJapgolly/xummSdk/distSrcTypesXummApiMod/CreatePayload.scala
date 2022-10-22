package typingsJapgolly.xummSdk.distSrcTypesXummApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyJson
  - typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyBlob
*/
trait CreatePayload extends StObject
object CreatePayload {
  
  inline def XummPostPayloadBodyBlob(txblob: String): typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyBlob = {
    val __obj = js.Dynamic.literal(txblob = txblob.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyBlob]
  }
  
  inline def XummPostPayloadBodyJson(txjson: XummJsonTransaction): typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyJson = {
    val __obj = js.Dynamic.literal(txjson = txjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyJson]
  }
}
