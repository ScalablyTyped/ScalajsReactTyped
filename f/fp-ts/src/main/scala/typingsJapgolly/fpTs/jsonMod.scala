package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libJsonMod.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object jsonMod {
  
  @JSImport("fp-ts/Json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(s: String): Either_[Any, Json] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[Either_[Any, Json]]
  
  inline def stringify[A](a: A): Either_[Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[Any, String]]
}
