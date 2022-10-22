package typingsJapgolly.semanticUiEmbed.anon

import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl>> */
trait PickImplmethodPartialPick
  extends StObject
     with Param {
  
  var method: String & js.UndefOr[String]
  
  var noURL: js.UndefOr[String] = js.undefined
}
object PickImplmethodPartialPick {
  
  inline def apply(method: String & js.UndefOr[String]): PickImplmethodPartialPick = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmethodPartialPick]
  }
  
  extension [Self <: PickImplmethodPartialPick](x: Self) {
    
    inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
    
    inline def setNoURLUndefined: Self = StObject.set(x, "noURL", js.undefined)
  }
}
