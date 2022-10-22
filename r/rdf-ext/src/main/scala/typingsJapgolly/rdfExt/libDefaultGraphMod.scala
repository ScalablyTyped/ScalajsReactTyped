package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.anon.Value
import typingsJapgolly.rdfjsTypes.dataModelMod.DefaultGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultGraphMod {
  
  @JSImport("rdf-ext/lib/DefaultGraph", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DefaultGraphExt
  
  @js.native
  trait DefaultGraphExt
    extends StObject
       with DefaultGraph {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Value = js.native
  }
}
