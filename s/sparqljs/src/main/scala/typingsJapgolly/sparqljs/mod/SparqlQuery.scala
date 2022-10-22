package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.Query
  - typingsJapgolly.sparqljs.mod.Update
*/
trait SparqlQuery extends StObject
object SparqlQuery {
  
  inline def AskQuery(prefixes: StringDictionary[String]): typingsJapgolly.sparqljs.mod.AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "ASK")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.AskQuery]
  }
  
  inline def ConstructQuery(prefixes: StringDictionary[String]): typingsJapgolly.sparqljs.mod.ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "CONSTRUCT")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.ConstructQuery]
  }
  
  inline def DescribeQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typingsJapgolly.sparqljs.mod.DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "DESCRIBE", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.DescribeQuery]
  }
  
  inline def SelectQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typingsJapgolly.sparqljs.mod.SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "SELECT", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.SelectQuery]
  }
  
  inline def Update(prefixes: StringDictionary[String], updates: js.Array[UpdateOperation]): typingsJapgolly.sparqljs.mod.Update = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.Update]
  }
}
