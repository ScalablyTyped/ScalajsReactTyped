package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSGlobal("TypeScript.Parser")
  @js.native
  val ^ : js.Any = js.native
  
  inline def incrementalParse(
    oldSyntaxTree: typingsJapgolly.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typingsJapgolly.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typingsJapgolly.typescriptServices.TypeScript.SyntaxTree = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalParse")(oldSyntaxTree.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxTree]
  
  inline def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typingsJapgolly.typescriptServices.TypeScript.ParseOptions
  ): typingsJapgolly.typescriptServices.TypeScript.SyntaxTree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fileName.asInstanceOf[js.Any], text.asInstanceOf[js.Any], isDeclaration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxTree]
}
