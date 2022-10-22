package typingsJapgolly.shexj.mod

import typingsJapgolly.shexj.shexjStrings.bnode
import typingsJapgolly.shexj.shexjStrings.iri
import typingsJapgolly.shexj.shexjStrings.literal
import typingsJapgolly.shexj.shexjStrings.nonliteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConstraint
  extends StObject
     with xsFacets
     with semactsAndAnnotations
     with shapeExpr {
  
  /**
    * The <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-datatype-iri">RDF Literal datatype IRITerm</a> expected for a conformant RDF node.
    * @see <a href="http://shex.io/shex-semantics/#datatype">ShEx datatype definition</a>
    */
  var datatype: js.UndefOr[IRIREF] = js.undefined
  
  /**
    * Type of <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-node">RDF Term</a> expected for a conformant RDF node.
    * @see <a href="http://shex.io/shex-semantics/#nodeKind">ShEx nodeKind definition</a>
    */
  var nodeKind: js.UndefOr[iri | bnode | nonliteral | literal] = js.undefined
  
  /**
    * Mandatory type "NodeConstraint".
    */
  var `type`: typingsJapgolly.shexj.shexjStrings.NodeConstraint
  
  /**
    * The set of permissible values.
    * @see <a href="http://shex.io/shex-semantics/#values">ShEx values definition</a>
    */
  var values: js.UndefOr[js.Array[valueSetValue]] = js.undefined
}
object NodeConstraint {
  
  inline def apply(): NodeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NodeConstraint")
    __obj.asInstanceOf[NodeConstraint]
  }
  
  extension [Self <: NodeConstraint](x: Self) {
    
    inline def setDatatype(value: IRIREF): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setNodeKind(value: iri | bnode | nonliteral | literal): Self = StObject.set(x, "nodeKind", value.asInstanceOf[js.Any])
    
    inline def setNodeKindUndefined: Self = StObject.set(x, "nodeKind", js.undefined)
    
    inline def setType(value: typingsJapgolly.shexj.shexjStrings.NodeConstraint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[valueSetValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: valueSetValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
