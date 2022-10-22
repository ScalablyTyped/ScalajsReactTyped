package typingsJapgolly.popoto

import japgolly.scalajs.react.Callback
import typingsJapgolly.popoto.anon.Id
import typingsJapgolly.popoto.anon.ReadonlyKEYWORD0NODE1SEPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cypherviewerMod {
  
  trait CypherViewer extends StObject {
    
    var MATCH: String
    
    var QueryElementTypes: ReadonlyKEYWORD0NODE1SEPE
    
    var RETURN: String
    
    var WHERE: String
    
    def clickSpan(): Unit
    
    var containerId: String
    
    /**
      * Create the Cypher viewer area.
      *
      */
    def createQueryArea(): Unit
    
    /**
      * Generate the data from graph to use in cypher query viewer.
      * The returned data is a list of elements representing the current query.
      * Example:
      *
      * MATCH
      * (person:`Person`),
      * (person:`Person`)-[:`FOLLOWS`]->(person1:`Person`{`name`:\"Jessica Thompson\"}),
      * (person1:`Person`)-[:`REVIEWED`]->(movie5:`Movie`{`title`:\"The Replacements\"})
      * RETURN person
      *
      * @param links
      * @returns an array of generated data
      */
    def generateData(links: js.Array[Any]): js.Array[Id]
    
    def mouseOutSpan(): Unit
    
    def mouseOverSpan(): Unit
    
    def rightClickSpan(): Unit
    
    /**
      * Update all the elements displayed on the cypher viewer based on current graph.
      */
    def updateQuery(): Unit
  }
  object CypherViewer {
    
    inline def apply(
      MATCH: String,
      QueryElementTypes: ReadonlyKEYWORD0NODE1SEPE,
      RETURN: String,
      WHERE: String,
      clickSpan: Callback,
      containerId: String,
      createQueryArea: Callback,
      generateData: js.Array[Any] => js.Array[Id],
      mouseOutSpan: Callback,
      mouseOverSpan: Callback,
      rightClickSpan: Callback,
      updateQuery: Callback
    ): CypherViewer = {
      val __obj = js.Dynamic.literal(MATCH = MATCH.asInstanceOf[js.Any], QueryElementTypes = QueryElementTypes.asInstanceOf[js.Any], RETURN = RETURN.asInstanceOf[js.Any], WHERE = WHERE.asInstanceOf[js.Any], clickSpan = clickSpan.toJsFn, containerId = containerId.asInstanceOf[js.Any], createQueryArea = createQueryArea.toJsFn, generateData = js.Any.fromFunction1(generateData), mouseOutSpan = mouseOutSpan.toJsFn, mouseOverSpan = mouseOverSpan.toJsFn, rightClickSpan = rightClickSpan.toJsFn, updateQuery = updateQuery.toJsFn)
      __obj.asInstanceOf[CypherViewer]
    }
    
    extension [Self <: CypherViewer](x: Self) {
      
      inline def setClickSpan(value: Callback): Self = StObject.set(x, "clickSpan", value.toJsFn)
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setCreateQueryArea(value: Callback): Self = StObject.set(x, "createQueryArea", value.toJsFn)
      
      inline def setGenerateData(value: js.Array[Any] => js.Array[Id]): Self = StObject.set(x, "generateData", js.Any.fromFunction1(value))
      
      inline def setMATCH(value: String): Self = StObject.set(x, "MATCH", value.asInstanceOf[js.Any])
      
      inline def setMouseOutSpan(value: Callback): Self = StObject.set(x, "mouseOutSpan", value.toJsFn)
      
      inline def setMouseOverSpan(value: Callback): Self = StObject.set(x, "mouseOverSpan", value.toJsFn)
      
      inline def setQueryElementTypes(value: ReadonlyKEYWORD0NODE1SEPE): Self = StObject.set(x, "QueryElementTypes", value.asInstanceOf[js.Any])
      
      inline def setRETURN(value: String): Self = StObject.set(x, "RETURN", value.asInstanceOf[js.Any])
      
      inline def setRightClickSpan(value: Callback): Self = StObject.set(x, "rightClickSpan", value.toJsFn)
      
      inline def setUpdateQuery(value: Callback): Self = StObject.set(x, "updateQuery", value.toJsFn)
      
      inline def setWHERE(value: String): Self = StObject.set(x, "WHERE", value.asInstanceOf[js.Any])
    }
  }
}
