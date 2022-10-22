package typingsJapgolly.activexLibreoffice.com_.sun.star.rdf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a set of named RDF graphs.
  * @see XRepository
  * @see XRepositorySupplier
  * @since OOo 3.0
  */
trait Repository
  extends StObject
     with XRepository {
  
  /** constructs repository with in-memory storage. */
  def create(): Unit
}
object Repository {
  
  inline def apply(
    GraphNames: SafeArray[XURI],
    create: Callback,
    createBlankNode: CallbackTo[XBlankNode],
    createGraph: XURI => XNamedGraph,
    destroyGraph: XURI => Callback,
    exportGraph: (Double, XOutputStream, XURI, XURI) => Callback,
    getGraph: XURI => XNamedGraph,
    getGraphNames: CallbackTo[SafeArray[XURI]],
    getStatements: (XResource, XURI, XNode) => XEnumeration,
    importGraph: (Double, XInputStream, XURI, XURI) => XNamedGraph,
    queryAsk: String => Boolean,
    queryConstruct: String => XEnumeration,
    querySelect: String => XQuerySelectResult
  ): Repository = {
    val __obj = js.Dynamic.literal(GraphNames = GraphNames.asInstanceOf[js.Any], create = create.toJsFn, createBlankNode = createBlankNode.toJsFn, createGraph = js.Any.fromFunction1(createGraph), destroyGraph = js.Any.fromFunction1((t0: XURI) => destroyGraph(t0).runNow()), exportGraph = js.Any.fromFunction4((t0: Double, t1: XOutputStream, t2: XURI, t3: XURI) => (exportGraph(t0, t1, t2, t3)).runNow()), getGraph = js.Any.fromFunction1(getGraph), getGraphNames = getGraphNames.toJsFn, getStatements = js.Any.fromFunction3(getStatements), importGraph = js.Any.fromFunction4(importGraph), queryAsk = js.Any.fromFunction1(queryAsk), queryConstruct = js.Any.fromFunction1(queryConstruct), querySelect = js.Any.fromFunction1(querySelect))
    __obj.asInstanceOf[Repository]
  }
  
  extension [Self <: Repository](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
