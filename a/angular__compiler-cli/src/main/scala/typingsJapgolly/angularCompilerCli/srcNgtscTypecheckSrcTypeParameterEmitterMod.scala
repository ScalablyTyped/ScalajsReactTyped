package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.TypeNode
import typingsJapgolly.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTypeParameterEmitterMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_parameter_emitter", "TypeParameterEmitter")
  @js.native
  open class TypeParameterEmitter protected () extends StObject {
    def this(typeParameters: Unit, reflector: ReflectionHost) = this()
    def this(typeParameters: NodeArray[TypeParameterDeclaration], reflector: ReflectionHost) = this()
    
    /**
      * Determines whether the type parameters can be emitted. If this returns true, then a call to
      * `emit` is known to succeed. Vice versa, if false is returned then `emit` should not be
      * called, as it would fail.
      */
    def canEmit(canEmitReference: js.Function1[/* ref */ Reference[Node], Boolean]): Boolean = js.native
    
    /* private */ var canEmitType: Any = js.native
    
    /**
      * Emits the type parameters using the provided emitter function for `Reference`s.
      */
    def emit(emitReference: js.Function1[/* ref */ Reference[Node], TypeNode]): js.UndefOr[js.Array[TypeParameterDeclaration]] = js.native
    
    /* private */ var isLocalTypeParameter: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    /* private */ var resolveTypeReference: Any = js.native
    
    /* private */ var translateTypeReference: Any = js.native
    
    /* private */ var typeParameters: Any = js.native
  }
}
