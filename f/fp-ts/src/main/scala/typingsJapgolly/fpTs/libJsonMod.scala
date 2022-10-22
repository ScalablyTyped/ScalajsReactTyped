package typingsJapgolly.fpTs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonMod {
  
  @JSImport("fp-ts/lib/Json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(s: String): Either_[Any, Json] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[Either_[Any, Json]]
  
  inline def stringify[A](a: A): Either_[Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[Any, String]]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typingsJapgolly.fpTs.libJsonMod.JsonArray
    - typingsJapgolly.fpTs.libJsonMod.JsonRecord
  */
  type Json = _Json | Boolean | Double | String | Null
  
  @js.native
  trait JsonArray
    extends StObject
       with ReadonlyArray[Json]
       with _Json
  
  trait JsonRecord
    extends StObject
       with /* key */ StringDictionary[Json]
       with _Json
  object JsonRecord {
    
    inline def apply(): JsonRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonRecord]
    }
  }
  
  trait _Json extends StObject
}
