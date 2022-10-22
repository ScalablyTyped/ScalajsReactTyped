package typingsJapgolly.cucumberGherkinUtils

import typingsJapgolly.cucumberGherkinUtils.distSrcGherkinDocumentHandlersMod.GherkinDocumentHandlers
import typingsJapgolly.cucumberMessages.mod.GherkinDocument
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWalkGherkinDocumentMod {
  
  @JSImport("@cucumber/gherkin-utils/dist/src/walkGherkinDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walkGherkinDocument[Acc](
    gherkinDocument: GherkinDocument,
    initialValue: Acc,
    handlers: Partial[GherkinDocumentHandlers[Acc]]
  ): Acc = (^.asInstanceOf[js.Dynamic].applyDynamic("walkGherkinDocument")(gherkinDocument.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Acc]
}
