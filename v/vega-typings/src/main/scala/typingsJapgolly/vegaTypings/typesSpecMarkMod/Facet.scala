package typingsJapgolly.vegaTypings.typesSpecMarkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.anon.Name
  - typingsJapgolly.vegaTypings.anon.Aggregate
*/
trait Facet extends StObject
object Facet {
  
  inline def Aggregate(data: String, groupby: String | js.Array[String], name: String): typingsJapgolly.vegaTypings.anon.Aggregate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Aggregate]
  }
  
  inline def Name(data: String, field: String, name: String): typingsJapgolly.vegaTypings.anon.Name = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Name]
  }
}
