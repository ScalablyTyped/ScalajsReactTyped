package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularLocalize.mod.ɵParsedMessage
import typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.DiagnosticHandlingStrategy
import typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractDuplicatesMod {
  
  @JSImport("@angular/localize/tools/src/extract/duplicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDuplicateMessages(
    fs: PathManipulation,
    messages: js.Array[ɵParsedMessage],
    duplicateMessageHandling: DiagnosticHandlingStrategy,
    basePath: AbsoluteFsPath
  ): Diagnostics = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDuplicateMessages")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], duplicateMessageHandling.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Diagnostics]
}
