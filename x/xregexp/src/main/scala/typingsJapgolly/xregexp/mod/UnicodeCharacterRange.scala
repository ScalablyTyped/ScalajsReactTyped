package typingsJapgolly.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Unicode character range.
  *
  * All properties but `name` are optional, although one of `bmp` or `astral` is required (unless `inverseOf` is set).
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharac
  - typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharacAlias
  - typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharacAstral
*/
trait UnicodeCharacterRange extends StObject
object UnicodeCharacterRange {
  
  inline def PickRequiredUnicodeCharac(astral: js.UndefOr[String] & String, name: String): typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharac = {
    val __obj = js.Dynamic.literal(astral = astral.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharac]
  }
  
  inline def PickRequiredUnicodeCharacAlias(bmp: js.UndefOr[String] & String, name: String): typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharacAlias = {
    val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharacAlias]
  }
  
  inline def PickRequiredUnicodeCharacAstral(inverseOf: js.UndefOr[String] & String, name: String): typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharacAstral = {
    val __obj = js.Dynamic.literal(inverseOf = inverseOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xregexp.anon.PickRequiredUnicodeCharacAstral]
  }
}
