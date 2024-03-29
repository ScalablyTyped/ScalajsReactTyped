package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libTfTypesMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsTermValueMod {
  
  @JSImport("rdflib/lib/utils/termValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def termValue(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termValue")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def termValue(node: Term): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termValue")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
