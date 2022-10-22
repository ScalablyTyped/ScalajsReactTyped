package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticSeverity extends StObject
@JSImport("vscode", "DiagnosticSeverity")
@js.native
object DiagnosticSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticSeverity & Double] = js.native
  
  /**
    * Something not allowed by the rules of a language or other means.
    */
  @js.native
  sealed trait Error
    extends StObject
       with DiagnosticSeverity
  /* 0 */ val Error: typingsJapgolly.vscode.mod.DiagnosticSeverity.Error & Double = js.native
  
  /**
    * Something to hint to a better way of doing it, like proposing
    * a refactoring.
    */
  @js.native
  sealed trait Hint
    extends StObject
       with DiagnosticSeverity
  /* 3 */ val Hint: typingsJapgolly.vscode.mod.DiagnosticSeverity.Hint & Double = js.native
  
  /**
    * Something to inform about but not a problem.
    */
  @js.native
  sealed trait Information
    extends StObject
       with DiagnosticSeverity
  /* 2 */ val Information: typingsJapgolly.vscode.mod.DiagnosticSeverity.Information & Double = js.native
  
  /**
    * Something suspicious but allowed.
    */
  @js.native
  sealed trait Warning
    extends StObject
       with DiagnosticSeverity
  /* 1 */ val Warning: typingsJapgolly.vscode.mod.DiagnosticSeverity.Warning & Double = js.native
}
