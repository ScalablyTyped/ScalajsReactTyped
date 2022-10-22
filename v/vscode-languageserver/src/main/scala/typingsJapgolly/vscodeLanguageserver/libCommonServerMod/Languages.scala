package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typingsJapgolly.vscodeLanguageserver.anon.On
import typingsJapgolly.vscodeLanguageserver.anon.OnDelta
import typingsJapgolly.vscodeLanguageserver.anon.OnIncomingCalls
import typingsJapgolly.vscodeLanguageserver.anon.OnPrepare
import typingsJapgolly.vscodeLanguageserver.anon.OnRefresh
import typingsJapgolly.vscodeLanguageserver.anon.Refresh
import typingsJapgolly.vscodeLanguageserver.anon.`0`
import typingsJapgolly.vscodeLanguageserver.libCommonCallHierarchyMod.CallHierarchy
import typingsJapgolly.vscodeLanguageserver.libCommonDiagnosticMod.DiagnosticFeatureShape
import typingsJapgolly.vscodeLanguageserver.libCommonInlayHintMod.InlayHintFeatureShape
import typingsJapgolly.vscodeLanguageserver.libCommonInlineValueMod.InlineValueFeatureShape
import typingsJapgolly.vscodeLanguageserver.libCommonLinkedEditingRangeMod.LinkedEditingRangeFeatureShape
import typingsJapgolly.vscodeLanguageserver.libCommonMonikerMod.MonikerFeatureShape
import typingsJapgolly.vscodeLanguageserver.libCommonProgressMod.ResultProgressReporter
import typingsJapgolly.vscodeLanguageserver.libCommonProgressMod.WorkDoneProgressReporter
import typingsJapgolly.vscodeLanguageserver.libCommonSemanticTokensMod.SemanticTokensFeatureShape
import typingsJapgolly.vscodeLanguageserver.libCommonTypeHierarchyMod.TypeHierarchyFeatureShape
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRangeParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRanges
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProgressType
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Languages
  extends StObject
     with _Languages
     with CallHierarchy
     with SemanticTokensFeatureShape
     with LinkedEditingRangeFeatureShape
     with TypeHierarchyFeatureShape
     with InlineValueFeatureShape
     with InlayHintFeatureShape
     with DiagnosticFeatureShape
     with MonikerFeatureShape
object Languages {
  
  inline def apply(
    attachPartialResultProgress: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => WorkDoneProgressReporter,
    callHierarchy: OnIncomingCalls,
    connection: Connection,
    diagnostics: On,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Callback,
    initialize: ClientCapabilities => Callback,
    inlayHint: Refresh,
    inlineValue: OnRefresh,
    moniker: `0`,
    onLinkedEditingRange: ServerRequestHandler[
      LinkedEditingRangeParams, 
      js.UndefOr[LinkedEditingRanges | Null], 
      scala.Nothing, 
      scala.Nothing
    ] => Disposable,
    semanticTokens: OnDelta,
    typeHierarchy: OnPrepare
  ): Languages = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), callHierarchy = callHierarchy.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => fillServerCapabilities(t0).runNow()), initialize = js.Any.fromFunction1((t0: ClientCapabilities) => initialize(t0).runNow()), inlayHint = inlayHint.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], onLinkedEditingRange = js.Any.fromFunction1(onLinkedEditingRange), semanticTokens = semanticTokens.asInstanceOf[js.Any], typeHierarchy = typeHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
}
