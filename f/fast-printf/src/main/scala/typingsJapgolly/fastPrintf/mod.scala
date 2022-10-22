package typingsJapgolly.fastPrintf

import typingsJapgolly.fastPrintf.distSrcCreatePrintfMod.Configuration
import typingsJapgolly.fastPrintf.distSrcCreatePrintfMod.Printf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-printf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPrintf(): Printf = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrintf")().asInstanceOf[Printf]
  inline def createPrintf(configuration: Configuration): Printf = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrintf")(configuration.asInstanceOf[js.Any]).asInstanceOf[Printf]
  
  inline def printf(subject: String, boundValues: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printf")(scala.List(subject.asInstanceOf[js.Any]).`++`(boundValues.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
