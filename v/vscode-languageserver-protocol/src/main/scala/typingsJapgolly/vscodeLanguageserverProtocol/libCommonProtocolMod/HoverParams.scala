package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverParams
  extends StObject
     with TextDocumentPositionParams
     with WorkDoneProgressParams
object HoverParams {
  
  inline def apply(position: Position, textDocument: TextDocumentIdentifier): HoverParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverParams]
  }
}
