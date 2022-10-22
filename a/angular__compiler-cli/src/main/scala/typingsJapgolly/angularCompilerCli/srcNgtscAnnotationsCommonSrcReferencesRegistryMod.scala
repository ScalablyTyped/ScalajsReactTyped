package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcReferencesRegistryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/references_registry", "NoopReferencesRegistry")
  @js.native
  open class NoopReferencesRegistry ()
    extends StObject
       with ReferencesRegistry {
    
    /**
      * Register one or more references in the registry.
      * @param references A collection of references to register.
      */
    /* CompleteClass */
    override def add(source: DeclarationNode, references: Reference[DeclarationNode]*): Unit = js.native
  }
  
  trait ReferencesRegistry extends StObject {
    
    /**
      * Register one or more references in the registry.
      * @param references A collection of references to register.
      */
    def add(source: DeclarationNode, references: Reference[DeclarationNode]*): Unit
  }
  object ReferencesRegistry {
    
    inline def apply(add: (DeclarationNode, /* repeated */ Reference[DeclarationNode]) => Callback): ReferencesRegistry = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: DeclarationNode, t1: /* repeated */ Reference[DeclarationNode]) => (add(t0, t1)).runNow()))
      __obj.asInstanceOf[ReferencesRegistry]
    }
    
    extension [Self <: ReferencesRegistry](x: Self) {
      
      inline def setAdd(value: (DeclarationNode, /* repeated */ Reference[DeclarationNode]) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: DeclarationNode, t1: /* repeated */ Reference[DeclarationNode]) => (value(t0, t1)).runNow()))
    }
  }
}
