package typingsJapgolly.sqlQueryIdentifier

import typingsJapgolly.sqlQueryIdentifier.libDefinesMod.Dialect
import typingsJapgolly.sqlQueryIdentifier.libDefinesMod.State
import typingsJapgolly.sqlQueryIdentifier.libDefinesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokenizerMod {
  
  @JSImport("sql-query-identifier/lib/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scanToken(state: State): Token = ^.asInstanceOf[js.Dynamic].applyDynamic("scanToken")(state.asInstanceOf[js.Any]).asInstanceOf[Token]
  inline def scanToken(state: State, dialect: Dialect): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("scanToken")(state.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any])).asInstanceOf[Token]
}
