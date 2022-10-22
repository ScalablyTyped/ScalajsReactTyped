package typingsJapgolly.parse5.distCommonTokenMod

import typingsJapgolly.parse5.distCommonHtmlMod.TAG_ID
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.CHARACTER
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.COMMENT
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.DOCTYPE
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.END_TAG
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.EOF
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.NULL_CHARACTER
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.START_TAG
import typingsJapgolly.parse5.distCommonTokenMod.TokenType.WHITESPACE_CHARACTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parse5.distCommonTokenMod.DoctypeToken
  - typingsJapgolly.parse5.distCommonTokenMod.TagToken
  - typingsJapgolly.parse5.distCommonTokenMod.CommentToken
  - typingsJapgolly.parse5.distCommonTokenMod.EOFToken
  - typingsJapgolly.parse5.distCommonTokenMod.CharacterToken
*/
trait Token extends StObject
object Token {
  
  inline def CharacterToken(chars: String, `type`: CHARACTER | NULL_CHARACTER | WHITESPACE_CHARACTER): typingsJapgolly.parse5.distCommonTokenMod.CharacterToken = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parse5.distCommonTokenMod.CharacterToken]
  }
  
  inline def CommentToken(data: String, `type`: COMMENT): typingsJapgolly.parse5.distCommonTokenMod.CommentToken = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parse5.distCommonTokenMod.CommentToken]
  }
  
  inline def DoctypeToken(forceQuirks: Boolean, `type`: DOCTYPE): typingsJapgolly.parse5.distCommonTokenMod.DoctypeToken = {
    val __obj = js.Dynamic.literal(forceQuirks = forceQuirks.asInstanceOf[js.Any], location = null, name = null, publicId = null, systemId = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parse5.distCommonTokenMod.DoctypeToken]
  }
  
  inline def EOFToken(`type`: EOF): typingsJapgolly.parse5.distCommonTokenMod.EOFToken = {
    val __obj = js.Dynamic.literal(location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parse5.distCommonTokenMod.EOFToken]
  }
  
  inline def TagToken(
    ackSelfClosing: Boolean,
    attrs: js.Array[Attribute],
    selfClosing: Boolean,
    tagID: TAG_ID,
    tagName: String,
    `type`: START_TAG | END_TAG
  ): typingsJapgolly.parse5.distCommonTokenMod.TagToken = {
    val __obj = js.Dynamic.literal(ackSelfClosing = ackSelfClosing.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagID = tagID.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parse5.distCommonTokenMod.TagToken]
  }
}
