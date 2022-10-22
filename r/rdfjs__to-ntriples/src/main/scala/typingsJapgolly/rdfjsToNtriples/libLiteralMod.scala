package typingsJapgolly.rdfjsToNtriples

import typingsJapgolly.rdfjsTypes.dataModelMod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLiteralMod {
  
  inline def apply(literal: Literal): String = ^.asInstanceOf[js.Dynamic].apply(literal.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/literal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
