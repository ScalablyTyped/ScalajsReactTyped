package typingsJapgolly.sqlFormatter

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterInlineLayoutMod {
  
  @JSImport("sql-formatter/lib/src/formatter/InlineLayout", JSImport.Default)
  @js.native
  open class default protected () extends InlineLayout {
    def this(expressionWidth: Double) = this()
  }
  
  @JSImport("sql-formatter/lib/src/formatter/InlineLayout", "InlineLayoutError")
  @js.native
  open class InlineLayoutError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait InlineLayout
    extends typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.default {
    
    /* private */ var addToLength: Any = js.native
    
    /* private */ var expressionWidth: Any = js.native
    
    /* private */ var length: Any = js.native
    
    /* private */ var trailingSpace: Any = js.native
  }
}
