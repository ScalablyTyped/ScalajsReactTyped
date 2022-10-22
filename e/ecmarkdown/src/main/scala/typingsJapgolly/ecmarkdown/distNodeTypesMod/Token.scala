package typingsJapgolly.ecmarkdown.distNodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.EOFToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.FormatToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.ParabreakToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.LinebreakToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.WhitespaceToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.TextToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.TagToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListToken
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagToken
*/
trait Token extends StObject
object Token {
  
  inline def CommentToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentToken]
  }
  
  inline def EOFToken(location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.EOFToken = {
    val __obj = js.Dynamic.literal(done = true, location = location.asInstanceOf[js.Any], name = "EOF")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.EOFToken]
  }
  
  inline def FormatToken(contents: String, location: LocationRange, name: Format): typingsJapgolly.ecmarkdown.distNodeTypesMod.FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.FormatToken]
  }
  
  inline def LinebreakToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.LinebreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "linebreak")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.LinebreakToken]
  }
  
  inline def OpaqueTagToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagToken]
  }
  
  inline def OrderedListToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListToken]
  }
  
  inline def ParabreakToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "parabreak")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.ParabreakToken]
  }
  
  inline def TagToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.TagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.TagToken]
  }
  
  inline def TextToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.TextToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.TextToken]
  }
  
  inline def UnorderedListToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListToken]
  }
  
  inline def WhitespaceToken(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "whitespace")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.WhitespaceToken]
  }
}
