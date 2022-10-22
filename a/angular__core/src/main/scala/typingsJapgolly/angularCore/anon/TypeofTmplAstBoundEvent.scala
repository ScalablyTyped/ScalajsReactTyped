package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.Instantiable8
import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.ParsedEvent
import typingsJapgolly.angularCompiler.mod.ParsedEventType
import typingsJapgolly.angularCompiler.mod.TmplAstBoundEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTmplAstBoundEvent
  extends StObject
     with Instantiable8[
      /* name */ String, 
      /* type */ ParsedEventType, 
      /* handler */ AST, 
      /* target */ String, 
      /* phase */ String, 
      /* sourceSpan */ ParseSourceSpan, 
      /* handlerSpan */ ParseSourceSpan, 
      /* keySpan */ ParseSourceSpan, 
      TmplAstBoundEvent
    ] {
  
  def fromParsedEvent(event: ParsedEvent): TmplAstBoundEvent = js.native
}
