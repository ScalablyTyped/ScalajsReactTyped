package typingsJapgolly.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaLite.buildSrcDataMod.UrlData
  - typingsJapgolly.vegaLite.buildSrcDataMod.InlineData
  - typingsJapgolly.vegaLite.buildSrcDataMod.NamedData
*/
trait DataSource
  extends StObject
     with Data
object DataSource {
  
  inline def InlineData(values: InlineDataset): typingsJapgolly.vegaLite.buildSrcDataMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcDataMod.InlineData]
  }
  
  inline def NamedData(name: String): typingsJapgolly.vegaLite.buildSrcDataMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcDataMod.NamedData]
  }
  
  inline def UrlData(url: String): typingsJapgolly.vegaLite.buildSrcDataMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcDataMod.UrlData]
  }
}
