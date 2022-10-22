package typingsJapgolly.babelTemplate

import typingsJapgolly.babelTemplate.mod.TemplateBuilderOptions
import typingsJapgolly.babelTypes.mod.Statement
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(tpl: String): Statement | js.Array[Statement] = js.native
    def apply(tpl: String, opts: TemplateBuilderOptions): Statement | js.Array[Statement] = js.native
    def apply(tpl: TemplateStringsArray, args: Any*): Statement | js.Array[Statement] = js.native
  }
}
