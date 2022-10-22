package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersDownlevelDecoratorsTransformDownlevelDecoratorsTransformMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/downlevel_decorators_transform/downlevel_decorators_transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDownlevelDecoratorsTransform(
    typeChecker: TypeChecker,
    host: ReflectionHost,
    diagnostics: js.Array[Diagnostic],
    isCore: Boolean,
    isClosureCompilerEnabled: Boolean,
    skipClassDecorators: Boolean
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDownlevelDecoratorsTransform")(typeChecker.asInstanceOf[js.Any], host.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isClosureCompilerEnabled.asInstanceOf[js.Any], skipClassDecorators.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
