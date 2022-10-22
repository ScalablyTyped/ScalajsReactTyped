package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Nibble
import typingsJapgolly.bitwise.typesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibbleReadMod {
  
  @JSImport("bitwise/nibble/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nibble: UInt4): Nibble = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nibble.asInstanceOf[js.Any]).asInstanceOf[Nibble]
}
