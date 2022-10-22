package typingsJapgolly.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceLocateOptions extends StObject {
  
  var useAliases: js.UndefOr[Boolean] = js.undefined
}
object NamespaceLocateOptions {
  
  inline def apply(): NamespaceLocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceLocateOptions]
  }
  
  extension [Self <: NamespaceLocateOptions](x: Self) {
    
    inline def setUseAliases(value: Boolean): Self = StObject.set(x, "useAliases", value.asInstanceOf[js.Any])
    
    inline def setUseAliasesUndefined: Self = StObject.set(x, "useAliases", js.undefined)
  }
}
