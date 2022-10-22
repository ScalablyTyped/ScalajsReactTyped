package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeoXmlCompressedFormat extends StObject
@JSGlobal("Microsoft.Maps.GeoXmlCompressedFormat")
@js.native
object GeoXmlCompressedFormat extends StObject {
  
  /** XML data compressed into an ArrayBuffer. */
  @js.native
  sealed trait arrayBuffer
    extends StObject
       with GeoXmlCompressedFormat
  
  /** XML data compressed into a Base64 Data URI. */
  @js.native
  sealed trait base64
    extends StObject
       with GeoXmlCompressedFormat
  
  /** XML data compressed into a Blob. */
  @js.native
  sealed trait blob
    extends StObject
       with GeoXmlCompressedFormat
}
