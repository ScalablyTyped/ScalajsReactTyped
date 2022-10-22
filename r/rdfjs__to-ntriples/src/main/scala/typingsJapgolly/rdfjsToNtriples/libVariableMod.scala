package typingsJapgolly.rdfjsToNtriples

import typingsJapgolly.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVariableMod {
  
  inline def apply(variable: Variable): String = ^.asInstanceOf[js.Dynamic].apply(variable.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/variable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
