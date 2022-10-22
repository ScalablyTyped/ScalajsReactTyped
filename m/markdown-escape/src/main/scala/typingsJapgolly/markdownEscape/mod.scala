package typingsJapgolly.markdownEscape

import typingsJapgolly.markdownEscape.markdownEscapeStrings.`angle brackets`
import typingsJapgolly.markdownEscape.markdownEscapeStrings.`number signs`
import typingsJapgolly.markdownEscape.markdownEscapeStrings.`square brackets`
import typingsJapgolly.markdownEscape.markdownEscapeStrings.asterisks
import typingsJapgolly.markdownEscape.markdownEscapeStrings.parentheses
import typingsJapgolly.markdownEscape.markdownEscapeStrings.slashes
import typingsJapgolly.markdownEscape.markdownEscapeStrings.underscores
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(string: String, skips: js.Array[CharacterSet]): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], skips.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("markdown-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CharacterSet = /* import warning: importer.ImportType#apply Failed type conversion: markdown-escape.markdown-escape.CharacterSets[number] */ js.Any
  
  type CharacterSets = js.Tuple10[
    asterisks, 
    `number signs`, 
    slashes, 
    parentheses, 
    parentheses, 
    `square brackets`, 
    `square brackets`, 
    `angle brackets`, 
    `angle brackets`, 
    underscores
  ]
}
