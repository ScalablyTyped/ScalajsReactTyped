package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersRemoveIvyJitSupportCallsMod {
  
  @JSImport("@ngtools/webpack/src/transformers/remove-ivy-jit-support-calls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeIvyJitSupportCalls(classMetadata: Boolean, ngModuleScope: Boolean, getTypeChecker: js.Function0[TypeChecker]): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIvyJitSupportCalls")(classMetadata.asInstanceOf[js.Any], ngModuleScope.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
