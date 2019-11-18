package typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompileSummaryKind extends js.Object

@JSImport("@angular/compiler/src/compile_metadata", "CompileSummaryKind")
@js.native
object CompileSummaryKind extends js.Object {
  @js.native
  sealed trait Directive extends CompileSummaryKind
  
  @js.native
  sealed trait Injectable extends CompileSummaryKind
  
  @js.native
  sealed trait NgModule extends CompileSummaryKind
  
  @js.native
  sealed trait Pipe extends CompileSummaryKind
  
  /* 1 */ val Directive: typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileSummaryKind.Directive with Double = js.native
  /* 3 */ val Injectable: typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileSummaryKind.Injectable with Double = js.native
  /* 2 */ val NgModule: typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileSummaryKind.NgModule with Double = js.native
  /* 0 */ val Pipe: typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileSummaryKind.Pipe with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompileSummaryKind with Double] = js.native
}

