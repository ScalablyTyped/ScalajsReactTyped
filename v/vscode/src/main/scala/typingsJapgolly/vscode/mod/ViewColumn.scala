package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewColumn extends StObject
@JSImport("vscode", "ViewColumn")
@js.native
object ViewColumn extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewColumn & Double] = js.native
  
  /**
    * A *symbolic* editor column representing the currently active column. This value
    * can be used when opening editors, but the *resolved* {@link TextEditor.viewColumn viewColumn}-value
    * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`.
    */
  @js.native
  sealed trait Active
    extends StObject
       with ViewColumn
  /* -1 */ val Active: typingsJapgolly.vscode.mod.ViewColumn.Active & Double = js.native
  
  /**
    * A *symbolic* editor column representing the column to the side of the active one. This value
    * can be used when opening editors, but the *resolved* {@link TextEditor.viewColumn viewColumn}-value
    * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
    */
  @js.native
  sealed trait Beside
    extends StObject
       with ViewColumn
  /* -2 */ val Beside: typingsJapgolly.vscode.mod.ViewColumn.Beside & Double = js.native
  
  /**
    * The eighth editor column.
    */
  @js.native
  sealed trait Eight
    extends StObject
       with ViewColumn
  /* 8 */ val Eight: typingsJapgolly.vscode.mod.ViewColumn.Eight & Double = js.native
  
  /**
    * The fifth editor column.
    */
  @js.native
  sealed trait Five
    extends StObject
       with ViewColumn
  /* 5 */ val Five: typingsJapgolly.vscode.mod.ViewColumn.Five & Double = js.native
  
  /**
    * The fourth editor column.
    */
  @js.native
  sealed trait Four
    extends StObject
       with ViewColumn
  /* 4 */ val Four: typingsJapgolly.vscode.mod.ViewColumn.Four & Double = js.native
  
  /**
    * The ninth editor column.
    */
  @js.native
  sealed trait Nine
    extends StObject
       with ViewColumn
  /* 9 */ val Nine: typingsJapgolly.vscode.mod.ViewColumn.Nine & Double = js.native
  
  /**
    * The first editor column.
    */
  @js.native
  sealed trait One
    extends StObject
       with ViewColumn
  /* 1 */ val One: typingsJapgolly.vscode.mod.ViewColumn.One & Double = js.native
  
  /**
    * The seventh editor column.
    */
  @js.native
  sealed trait Seven
    extends StObject
       with ViewColumn
  /* 7 */ val Seven: typingsJapgolly.vscode.mod.ViewColumn.Seven & Double = js.native
  
  /**
    * The sixth editor column.
    */
  @js.native
  sealed trait Six
    extends StObject
       with ViewColumn
  /* 6 */ val Six: typingsJapgolly.vscode.mod.ViewColumn.Six & Double = js.native
  
  /**
    * The third editor column.
    */
  @js.native
  sealed trait Three
    extends StObject
       with ViewColumn
  /* 3 */ val Three: typingsJapgolly.vscode.mod.ViewColumn.Three & Double = js.native
  
  /**
    * The second editor column.
    */
  @js.native
  sealed trait Two
    extends StObject
       with ViewColumn
  /* 2 */ val Two: typingsJapgolly.vscode.mod.ViewColumn.Two & Double = js.native
}
