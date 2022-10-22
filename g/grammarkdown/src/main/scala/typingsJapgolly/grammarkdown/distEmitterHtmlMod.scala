package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.distEmitterEmitterMod.Emitter
import typingsJapgolly.grammarkdown.distNodesMod.LexicalSymbol
import typingsJapgolly.grammarkdown.distOptionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterHtmlMod {
  
  @JSImport("grammarkdown/dist/emitter/html", "HtmlEmitter")
  @js.native
  open class HtmlEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    /* private */ var emitLinkAnchor: Any = js.native
    
    /* private */ var emitNodeWithLink: Any = js.native
    
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
}
