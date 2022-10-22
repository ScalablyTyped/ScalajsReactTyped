package typingsJapgolly.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceGcs extends StObject {
  
  /**
    * name of GCS bucket you want to ingest from
    * @type {string}
    * @memberof SourceGcs
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix that selects keys to ingest.
    * @type {string}
    * @memberof SourceGcs
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object SourceGcs {
  
  inline def apply(): SourceGcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGcs]
  }
  
  extension [Self <: SourceGcs](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
