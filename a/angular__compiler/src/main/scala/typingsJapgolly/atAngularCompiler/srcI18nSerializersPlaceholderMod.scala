package typingsJapgolly.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/placeholder", JSImport.Namespace)
@js.native
object srcI18nSerializersPlaceholderMod extends js.Object {
  @js.native
  class PlaceholderRegistry () extends js.Object {
    var _generateUniqueName: js.Any = js.native
    var _hashClosingTag: js.Any = js.native
    var _hashTag: js.Any = js.native
    var _placeHolderNameCounts: js.Any = js.native
    var _signatureToName: js.Any = js.native
    def getCloseTagPlaceholderName(tag: String): String = js.native
    def getPlaceholderName(name: String, content: String): String = js.native
    def getStartTagPlaceholderName(tag: String, attrs: StringDictionary[String], isVoid: Boolean): String = js.native
    def getUniquePlaceholder(name: String): String = js.native
  }
  
}

