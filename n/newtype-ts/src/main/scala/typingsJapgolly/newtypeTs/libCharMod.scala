package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.anon.Length
import typingsJapgolly.newtypeTs.libNonEmptyStringMod.NonEmptyString
import typingsJapgolly.newtypeTs.mod.Newtype
import typingsJapgolly.newtypeTs.mod.URIOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCharMod {
  
  @JSImport("newtype-ts/lib/Char", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isChar(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChar")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/Char", "prismChar")
  @js.native
  val prismChar: Prism_[String, Char] = js.native
  
  type Char = Newtype[URIOf[NonEmptyString] & Length, String]
}
