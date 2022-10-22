package typingsJapgolly.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinesOptions
  extends StObject
     with BaseOptions {
  
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffTrimmedLines()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to treat newline characters as separate tokens. This allows for changes to the newline structure
    * to occur independently of the line content and to be treated as such. In general this is the more
    * human friendly form of `diffLines()` and `diffLines()` is better suited for patches and other computer
    * friendly output.
    */
  var newlineIsToken: js.UndefOr[Boolean] = js.undefined
}
object LinesOptions {
  
  inline def apply(): LinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinesOptions]
  }
  
  extension [Self <: LinesOptions](x: Self) {
    
    inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
    
    inline def setNewlineIsToken(value: Boolean): Self = StObject.set(x, "newlineIsToken", value.asInstanceOf[js.Any])
    
    inline def setNewlineIsTokenUndefined: Self = StObject.set(x, "newlineIsToken", js.undefined)
  }
}
