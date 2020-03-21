package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typingsJapgolly.typescriptServices.TypeScript.SetAccessor): Boolean = js.native
  def typeCheck(
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    document: typingsJapgolly.typescriptServices.TypeScript.Document
  ): Unit = js.native
}

