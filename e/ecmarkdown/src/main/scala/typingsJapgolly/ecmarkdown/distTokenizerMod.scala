package typingsJapgolly.ecmarkdown

import typingsJapgolly.ecmarkdown.distNodeTypesMod.AttrToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.EOFToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.Format
import typingsJapgolly.ecmarkdown.distNodeTypesMod.FormatToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.LinebreakToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.ParabreakToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.Position
import typingsJapgolly.ecmarkdown.distNodeTypesMod.TagToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.TextToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.Token
import typingsJapgolly.ecmarkdown.distNodeTypesMod.Unlocated
import typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListToken
import typingsJapgolly.ecmarkdown.distNodeTypesMod.WhitespaceToken
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.EOF
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.comment
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.linebreak
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.ol
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.opaqueTag
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.parabreak
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.tag
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.text
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.ul
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.whitespace
import typingsJapgolly.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenizerMod {
  
  @JSImport("ecmarkdown/dist/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer protected () extends StObject {
    def this(str: String) = this()
    
    var _eof: Boolean = js.native
    
    var _lookahead: js.Array[Token] = js.native
    
    var _newline: Boolean = js.native
    
    var column: Double = js.native
    
    def dequeue(): js.UndefOr[
        EOFToken | FormatToken | ParabreakToken | LinebreakToken | WhitespaceToken | TextToken | CommentToken | OpaqueTagToken | TagToken | UnorderedListToken | OrderedListToken
      ] = js.native
    
    def enqueue(tok: Unlocated[Token], pos: Position): Unit = js.native
    
    def expect(name: EOF | parabreak | linebreak | whitespace | text | comment | tag | ul | ol | opaqueTag): Unit = js.native
    def expect(name: Format): Unit = js.native
    
    def getLocation(): Position = js.native
    
    var line: Double = js.native
    
    def locate(tok: Unlocated[AttrToken | Token], startPos: Position): /* asserts tok is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(ecmarkdown), TsIdentModule(None,List(ecmarkdown, dist, node-types)), TsIdentSimple(Token))),IArray())*/ Boolean = js.native
    
    def matchToken(): Unit = js.native
    
    def next(): Token = js.native
    
    def peek(): Token = js.native
    def peek(dist: Double): Token = js.native
    
    var pos: Double = js.native
    
    var previous: js.UndefOr[Token] = js.native
    
    var queue: js.Array[Token] = js.native
    
    def raise(message: String, pos: Position): Unit = js.native
    
    def scanChars(): String = js.native
    
    def scanDigits(): String = js.native
    
    def scanEscape(): String = js.native
    
    def scanToEndTag(endTag: String): String = js.native
    
    def scanWhitespace(): String = js.native
    
    var str: String = js.native
    
    def tryScanComment(): js.UndefOr[String] = js.native
    
    def tryScanListItemAttributes(): js.Array[AttrToken] = js.native
    
    def tryScanTag(): js.UndefOr[RegExpMatchArray] = js.native
  }
}
