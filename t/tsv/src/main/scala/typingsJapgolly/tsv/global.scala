package typingsJapgolly.tsv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.tsv.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TSV extends Shortcut {
    
    @JSGlobal("TSV")
    @js.native
    val ^ : typingsJapgolly.tsv.mod.Parser = js.native
    
    @JSGlobal("TSV.CSV")
    @js.native
    val CSV: typingsJapgolly.tsv.mod.Parser = js.native
    
    @JSGlobal("TSV.Parser")
    @js.native
    open class Parser protected ()
      extends typingsJapgolly.tsv.mod.Parser {
      def this(sep: String) = this()
      def this(sep: String, options: Header) = this()
    }
    
    @JSGlobal("TSV.TSV")
    @js.native
    val TSV: typingsJapgolly.tsv.mod.Parser = js.native
    
    type _To = typingsJapgolly.tsv.mod.Parser
    
    /* This means you don't have to write `^`, but can instead just say `TSV.foo` */
    override def _to: typingsJapgolly.tsv.mod.Parser = ^
  }
}
