package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.anon.TermTypePropType
import typingsJapgolly.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVariableMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/Variable", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VariableExt {
    def this(name: String) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait VariableExt
    extends StObject
       with Variable {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypePropType = js.native
  }
}
