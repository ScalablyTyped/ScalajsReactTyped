package typingsJapgolly.rdfjsToNtriples

import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQuadMod {
  
  inline def apply(quad: Quad, toNT: js.Function1[/* term */ Term, String]): String = (^.asInstanceOf[js.Dynamic].apply(quad.asInstanceOf[js.Any], toNT.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/quad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
