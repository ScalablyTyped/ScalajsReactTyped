package typingsJapgolly.parse5SaxParser

import typingsJapgolly.parse5.distCommonTokenMod.CharacterToken
import typingsJapgolly.parse5.distCommonTokenMod.CommentToken
import typingsJapgolly.parse5.distCommonTokenMod.DoctypeToken
import typingsJapgolly.parse5.distCommonTokenMod.EOFToken
import typingsJapgolly.parse5.distCommonTokenMod.TagToken
import typingsJapgolly.parse5.distTokenizerMod.TokenHandler
import typingsJapgolly.parse5.distTokenizerMod.TokenizerOptions
import typingsJapgolly.parse5.mod.Tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserFeedbackSimulatorMod {
  
  @JSImport("parse5-sax-parser/dist/parser-feedback-simulator", "ParserFeedbackSimulator")
  @js.native
  open class ParserFeedbackSimulator protected ()
    extends StObject
       with TokenHandler {
    def this(options: TokenizerOptions, handler: TokenHandler) = this()
    
    /* private */ var _ensureTokenizerMode: Any = js.native
    
    /* private */ var _enterNamespace: Any = js.native
    
    /* private */ var _leaveCurrentNamespace: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    var inForeignContent: Boolean = js.native
    
    /* private */ var namespaceStack: Any = js.native
    
    /* CompleteClass */
    override def onCharacter(token: CharacterToken): Unit = js.native
    
    /* CompleteClass */
    override def onComment(token: CommentToken): Unit = js.native
    
    /* CompleteClass */
    override def onDoctype(token: DoctypeToken): Unit = js.native
    
    /* CompleteClass */
    override def onEndTag(token: TagToken): Unit = js.native
    
    /* CompleteClass */
    override def onEof(token: EOFToken): Unit = js.native
    
    /* CompleteClass */
    override def onNullCharacter(token: CharacterToken): Unit = js.native
    
    /* CompleteClass */
    override def onStartTag(token: TagToken): Unit = js.native
    
    /* CompleteClass */
    override def onWhitespaceCharacter(token: CharacterToken): Unit = js.native
    
    var skipNextNewLine: Boolean = js.native
    
    var tokenizer: Tokenizer = js.native
  }
}
