package typingsJapgolly.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICopyrightSource extends StObject {
  
  /** The copyright string from the source. */
  var Copyright: String
  
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String
  
  /** The name of the data provider represented by this Source element. */
  var SourceName: String
}
object ICopyrightSource {
  
  inline def apply(Copyright: String, SourceID: String, SourceName: String): ICopyrightSource = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyrightSource]
  }
  
  extension [Self <: ICopyrightSource](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "Copyright", value.asInstanceOf[js.Any])
    
    inline def setSourceID(value: String): Self = StObject.set(x, "SourceID", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
  }
}
