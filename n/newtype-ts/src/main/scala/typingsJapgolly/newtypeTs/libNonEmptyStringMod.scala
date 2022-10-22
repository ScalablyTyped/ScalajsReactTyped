package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.mod.Newtype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonEmptyStringMod {
  
  @JSImport("newtype-ts/lib/NonEmptyString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonEmptyString(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonEmptyString")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonEmptyString", "prismNonEmptyString")
  @js.native
  val prismNonEmptyString: Prism_[String, NonEmptyString] = js.native
  
  type NonEmptyString = Newtype[typingsJapgolly.newtypeTs.anon.NonEmptyString, String]
}
