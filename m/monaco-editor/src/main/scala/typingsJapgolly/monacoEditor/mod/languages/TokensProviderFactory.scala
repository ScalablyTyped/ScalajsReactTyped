package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokensProviderFactory extends StObject {
  
  def create(): ProviderResult[TokensProvider | EncodedTokensProvider | IMonarchLanguage]
}
object TokensProviderFactory {
  
  inline def apply(create: CallbackTo[ProviderResult[TokensProvider | EncodedTokensProvider | IMonarchLanguage]]): TokensProviderFactory = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[TokensProviderFactory]
  }
  
  extension [Self <: TokensProviderFactory](x: Self) {
    
    inline def setCreate(value: CallbackTo[ProviderResult[TokensProvider | EncodedTokensProvider | IMonarchLanguage]]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
