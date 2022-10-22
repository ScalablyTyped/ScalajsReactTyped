package typingsJapgolly.typescriptServices.global.TypeScript.Services

import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breakpoints {
  
  @JSGlobal("TypeScript.Services.Breakpoints")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBreakpointLocation(syntaxTree: SyntaxTree, askedPos: Double): typingsJapgolly.typescriptServices.TypeScript.Services.SpanInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getBreakpointLocation")(syntaxTree.asInstanceOf[js.Any], askedPos.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.SpanInfo]
}
