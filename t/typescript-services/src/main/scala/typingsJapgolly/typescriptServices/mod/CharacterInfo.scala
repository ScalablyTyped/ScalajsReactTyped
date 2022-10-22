package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "CharacterInfo")
@js.native
open class CharacterInfo ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.CharacterInfo
object CharacterInfo {
  
  @JSImport("typescript-services", "CharacterInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def hexValue(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def isDecimalDigit(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalDigit")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isHexDigit(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexDigit")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isLineTerminator(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineTerminator")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isOctalDigit(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOctalDigit")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isWhitespace(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhitespace")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
