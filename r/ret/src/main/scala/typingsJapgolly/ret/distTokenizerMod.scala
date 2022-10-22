package typingsJapgolly.ret

import typingsJapgolly.ret.distTypesTokensMod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenizerMod {
  
  @JSImport("ret/dist/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenizer(regexpStr: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(regexpStr.asInstanceOf[js.Any]).asInstanceOf[Root]
}
