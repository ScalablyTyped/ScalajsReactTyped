package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CodeActionKind")
@js.native
open class CodeActionKind protected ()
  extends typingsJapgolly.vscode.mod.CodeActionKind {
  /* private */ def this(value: String) = this()
}
/* static members */
object CodeActionKind {
  
  /**
    * Empty kind.
    */
  @JSGlobal("vscode.CodeActionKind.Empty")
  @js.native
  val Empty: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for quickfix actions: `quickfix`.
    *
    * Quick fix actions address a problem in the code and are shown in the normal code action context menu.
    */
  @JSGlobal("vscode.CodeActionKind.QuickFix")
  @js.native
  val QuickFix: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for refactoring actions: `refactor`
    *
    * Refactoring actions are shown in the refactoring context menu.
    */
  @JSGlobal("vscode.CodeActionKind.Refactor")
  @js.native
  val Refactor: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for refactoring extraction actions: `refactor.extract`
    *
    * Example extract actions:
    *
    * - Extract method
    * - Extract function
    * - Extract variable
    * - Extract interface from class
    * - ...
    */
  @JSGlobal("vscode.CodeActionKind.RefactorExtract")
  @js.native
  val RefactorExtract: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for refactoring inline actions: `refactor.inline`
    *
    * Example inline actions:
    *
    * - Inline function
    * - Inline variable
    * - Inline constant
    * - ...
    */
  @JSGlobal("vscode.CodeActionKind.RefactorInline")
  @js.native
  val RefactorInline: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for refactoring move actions: `refactor.move`
    *
    * Example move actions:
    *
    * - Move a function to a new file
    * - Move a property between classes
    * - Move method to base class
    * - ...
    */
  @JSGlobal("vscode.CodeActionKind.RefactorMove")
  @js.native
  val RefactorMove: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for refactoring rewrite actions: `refactor.rewrite`
    *
    * Example rewrite actions:
    *
    * - Convert JavaScript function to class
    * - Add or remove parameter
    * - Encapsulate field
    * - Make method static
    * - ...
    */
  @JSGlobal("vscode.CodeActionKind.RefactorRewrite")
  @js.native
  val RefactorRewrite: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file. They must be explicitly requested and will not show in the
    * normal [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action) menu. Source actions
    * can be run on save using `editor.codeActionsOnSave` and are also shown in the `source` context menu.
    */
  @JSGlobal("vscode.CodeActionKind.Source")
  @js.native
  val Source: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for auto-fix source actions: `source.fixAll`.
    *
    * Fix all actions automatically fix errors that have a clear fix that do not require user input.
    * They should not suppress errors or perform unsafe fixes such as generating new types or classes.
    */
  @JSGlobal("vscode.CodeActionKind.SourceFixAll")
  @js.native
  val SourceFixAll: typingsJapgolly.vscode.mod.CodeActionKind = js.native
  
  /**
    * Base kind for an organize imports source action: `source.organizeImports`.
    */
  @JSGlobal("vscode.CodeActionKind.SourceOrganizeImports")
  @js.native
  val SourceOrganizeImports: typingsJapgolly.vscode.mod.CodeActionKind = js.native
}
