package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IBitMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BitMatrix {
  
  @JSImport("typescript-services", "BitMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBitMatrix(allowUndefinedValues: Boolean): IBitMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("getBitMatrix")(allowUndefinedValues.asInstanceOf[js.Any]).asInstanceOf[IBitMatrix]
}
