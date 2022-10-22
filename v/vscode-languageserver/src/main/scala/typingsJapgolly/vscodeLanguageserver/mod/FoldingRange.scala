package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRange {
  
  @JSImport("vscode-languageserver", "FoldingRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FoldingRange literal.
    */
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: Unit,
    kind: Unit,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: Unit,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: Unit,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    kind: Unit,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: Unit,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: Unit,
    kind: Unit,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: Unit,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: Unit,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    kind: Unit,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  inline def create(
    startLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRangeKind,
    collapsedText: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange]
  
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean]
}
