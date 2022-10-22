package typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Binding
import typingsJapgolly.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingSymbol extends StObject {
  
  var kind: Binding
  
  /**
    * The `DirectiveSymbol` or `ElementSymbol` for the Directive, Component, or `HTMLElement` with
    * the binding.
    */
  var target: DirectiveSymbol | ElementSymbol | TemplateSymbol
  
  /** The location in the shim file where the field access for the binding appears. */
  var tcbLocation: TcbLocation
  
  /** The `ts.Symbol` of the class member on the directive that is the target of the binding. */
  var tsSymbol: typingsJapgolly.typescript.mod.Symbol
  
  /** The `ts.Type` of the class member on the directive that is the target of the binding. */
  var tsType: Type
}
object BindingSymbol {
  
  inline def apply(
    kind: Binding,
    target: DirectiveSymbol | ElementSymbol | TemplateSymbol,
    tcbLocation: TcbLocation,
    tsSymbol: typingsJapgolly.typescript.mod.Symbol,
    tsType: Type
  ): BindingSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingSymbol]
  }
  
  extension [Self <: BindingSymbol](x: Self) {
    
    inline def setKind(value: Binding): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: DirectiveSymbol | ElementSymbol | TemplateSymbol): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typingsJapgolly.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
