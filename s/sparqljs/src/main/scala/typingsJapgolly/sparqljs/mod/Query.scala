package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.SelectQuery
  - typingsJapgolly.sparqljs.mod.ConstructQuery
  - typingsJapgolly.sparqljs.mod.AskQuery
  - typingsJapgolly.sparqljs.mod.DescribeQuery
*/
trait Query
  extends StObject
     with SparqlQuery
object Query {
  
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
}
