package typingsJapgolly.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkupContent extends StObject {
  
  /**
    * The type of the Markup
    */
  var kind: MarkupKind
  
  /**
    * The content itself
    */
  var value: String
}
object MarkupContent {
  
  inline def apply(kind: MarkupKind, value: String): MarkupContent = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupContent]
  }
  
  @JSImport("vscode-languageserver-types", "MarkupContent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks whether the given value conforms to the [MarkupContent](#MarkupContent) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupContent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.MarkupContent */ Boolean]
  
  extension [Self <: MarkupContent](x: Self) {
    
    inline def setKind(value: MarkupKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
