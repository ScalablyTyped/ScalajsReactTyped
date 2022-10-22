package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DocumentSelector = js.Array[String | DocumentFilter]

type InitializeErrorCodes = `1`

type PositionEncodingKind = String

type PrepareSupportDefaultBehavior = `1`

type WatchKind = uinteger

type ApplyWorkspaceEditResponse = ApplyWorkspaceEditResult

type DefinitionOptions = WorkDoneProgressOptions

type DocumentFormattingOptions = WorkDoneProgressOptions

type DocumentHighlightOptions = WorkDoneProgressOptions

type DocumentRangeFormattingOptions = WorkDoneProgressOptions

type ExecuteCommandRegistrationOptions = ExecuteCommandOptions

type GlobPattern = Pattern | RelativePattern

type HoverOptions = WorkDoneProgressOptions

type Pattern = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  - typingsJapgolly.vscodeLanguageserverProtocol.anon.Placeholder
  - typingsJapgolly.vscodeLanguageserverProtocol.anon.DefaultBehavior
*/
type PrepareRenameResult = _PrepareRenameResult | Range

type ReferenceOptions = WorkDoneProgressOptions

type WorkspaceSymbolRegistrationOptions = WorkspaceSymbolOptions
