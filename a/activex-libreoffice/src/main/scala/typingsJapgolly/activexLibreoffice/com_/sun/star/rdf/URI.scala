package typingsJapgolly.activexLibreoffice.com_.sun.star.rdf

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an {@link URI} node that may occur in a RDF graph.
  * @see XRepository
  * @since OOo 3.0
  */
trait URI
  extends StObject
     with XURI {
  
  /**
    * creates an {@link URI} RDF node.
    * @param Value the {@link URI} , represented as `string` .
    * @throws com::sun::star::lang::IllegalArgumentException if the argument does not represent a valid {@link URI}
    */
  def create(Value: String): Unit
  
  /**
    * creates an {@link URI} RDF node for a well-known {@link URI} .
    * @param Id the {@link URI} , represented as a constant from {@link URIs} .
    * @see URIs
    * @throws com::sun::star::lang::IllegalArgumentException if the argument is not a valid constant from {@link URIs}
    */
  def createKnown(Id: Double): Unit
  
  /**
    * creates an {@link URI} RDF node from namespace prefix and local name.
    * @param Namespace the namespace prefix of the {@link URI} , represented as `string` .
    * @param LocalName the local name of the {@link URI} , represented as `string` .
    * @throws com::sun::star::lang::IllegalArgumentException if the arguments do not represent a valid {@link URI}
    */
  def createNS(Namespace: String, LocalName: String): Unit
}
object URI {
  
  inline def apply(
    LocalName: String,
    Namespace: String,
    StringValue: String,
    create: String => Callback,
    createKnown: Double => Callback,
    createNS: (String, String) => Callback
  ): URI = {
    val __obj = js.Dynamic.literal(LocalName = LocalName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], create = js.Any.fromFunction1((t0: String) => create(t0).runNow()), createKnown = js.Any.fromFunction1((t0: Double) => createKnown(t0).runNow()), createNS = js.Any.fromFunction2((t0: String, t1: String) => (createNS(t0, t1)).runNow()))
    __obj.asInstanceOf[URI]
  }
  
  extension [Self <: URI](x: Self) {
    
    inline def setCreate(value: String => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCreateKnown(value: Double => Callback): Self = StObject.set(x, "createKnown", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCreateNS(value: (String, String) => Callback): Self = StObject.set(x, "createNS", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
