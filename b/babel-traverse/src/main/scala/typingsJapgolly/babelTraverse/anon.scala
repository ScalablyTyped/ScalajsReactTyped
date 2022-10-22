package typingsJapgolly.babelTraverse

import typingsJapgolly.babelTraverse.babelTraverseStrings.`var`
import typingsJapgolly.babelTraverse.babelTraverseStrings.const
import typingsJapgolly.babelTraverse.babelTraverseStrings.let
import typingsJapgolly.babelTraverse.mod.Binding
import typingsJapgolly.babelTraverse.mod.Node
import typingsJapgolly.babelTraverse.mod.NodePath
import typingsJapgolly.babelTraverse.mod.Scope
import typingsJapgolly.babelTypes.mod.Identifier_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Confident extends StObject {
    
    var confident: Boolean
    
    var value: Any
  }
  object Confident {
    
    inline def apply(confident: Boolean, value: Any): Confident = {
      val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confident]
    }
    
    extension [Self <: Confident](x: Self) {
      
      inline def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Existing extends StObject {
    
    var existing: Binding
    
    var identifier: Identifier_
    
    var kind: `var` | let | const
    
    var path: NodePath[Node]
    
    var scope: Scope
  }
  object Existing {
    
    inline def apply(
      existing: Binding,
      identifier: Identifier_,
      kind: `var` | let | const,
      path: NodePath[Node],
      scope: Scope
    ): Existing = {
      val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Existing]
    }
    
    extension [Self <: Existing](x: Self) {
      
      inline def setExisting(value: Binding): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: NodePath[Node]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
