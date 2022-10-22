package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullTypeResolver")
@js.native
open class PullTypeResolver protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}
object PullTypeResolver {
  
  @JSGlobal("TypeScript.PullTypeResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullTypeResolver.globalTypeCheckPhase")
  @js.native
  def globalTypeCheckPhase: Double = js.native
  inline def globalTypeCheckPhase_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalTypeCheckPhase")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def hasSetAccessorParameterTypeAnnotation(setAccessor: typingsJapgolly.typescriptServices.TypeScript.SetAccessor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSetAccessorParameterTypeAnnotation")(setAccessor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def typeCheck(
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    document: typingsJapgolly.typescriptServices.TypeScript.Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(compilationSettings.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
