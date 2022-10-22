package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ScannerUtilities")
@js.native
open class ScannerUtilities ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.ScannerUtilities
object ScannerUtilities {
  
  @JSImport("typescript-services", "ScannerUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def identifierKind(array: js.Array[Double], startIndex: Double, length: Double): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = (^.asInstanceOf[js.Dynamic].applyDynamic("identifierKind")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxKind]
}
