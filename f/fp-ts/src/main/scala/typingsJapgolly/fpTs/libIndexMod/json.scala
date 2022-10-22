package typingsJapgolly.fpTs.libIndexMod

import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libJsonMod.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json {
  
  @JSImport("fp-ts/lib/index", "json")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(s: String): Either_[Any, Json] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[Either_[Any, Json]]
  
  inline def stringify[A](a: A): Either_[Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[Any, String]]
}
