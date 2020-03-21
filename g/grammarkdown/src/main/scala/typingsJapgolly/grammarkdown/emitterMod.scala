package typingsJapgolly.grammarkdown

import typingsJapgolly.grammarkdown.optionsMod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter", JSImport.Namespace)
@js.native
object emitterMod extends js.Object {
  @js.native
  class EcmarkupEmitter ()
    extends typingsJapgolly.grammarkdown.ecmarkupMod.EcmarkupEmitter
  
  @js.native
  class Emitter protected ()
    extends typingsJapgolly.grammarkdown.emitterEmitterMod.Emitter {
    def this(options: CompilerOptions) = this()
  }
  
  @js.native
  class HtmlEmitter ()
    extends typingsJapgolly.grammarkdown.htmlMod.HtmlEmitter
  
  @js.native
  class MarkdownEmitter ()
    extends typingsJapgolly.grammarkdown.markdownMod.MarkdownEmitter
  
}

