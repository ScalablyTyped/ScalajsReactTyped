package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.distEmitterEmitterMod.Emitter
import typingsJapgolly.grammarkdown.distNodesMod.LexicalSymbol
import typingsJapgolly.grammarkdown.distOptionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterGrammarkdownMod {
  
  @JSImport("grammarkdown/dist/emitter/grammarkdown", "GrammarkdownEmitter")
  @js.native
  open class GrammarkdownEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
}
