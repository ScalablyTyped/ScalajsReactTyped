package typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Output
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputBindingSymbol
  extends StObject
     with Symbol {
  
  /** A single output may be bound to multiple components or directives. */
  var bindings: js.Array[BindingSymbol]
  
  var kind: Output
}
object OutputBindingSymbol {
  
  inline def apply(bindings: js.Array[BindingSymbol], kind: Output): OutputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputBindingSymbol]
  }
  
  extension [Self <: OutputBindingSymbol](x: Self) {
    
    inline def setBindings(value: js.Array[BindingSymbol]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsVarargs(value: BindingSymbol*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setKind(value: Output): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
