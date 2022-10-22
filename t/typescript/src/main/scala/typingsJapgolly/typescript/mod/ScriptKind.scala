package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptKind extends StObject
@JSImport("typescript", "ScriptKind")
@js.native
object ScriptKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind & Double] = js.native
  
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with ScriptKind
  /* 7 */ val Deferred: typingsJapgolly.typescript.mod.ScriptKind.Deferred & Double = js.native
  
  @js.native
  sealed trait External
    extends StObject
       with ScriptKind
  /* 5 */ val External: typingsJapgolly.typescript.mod.ScriptKind.External & Double = js.native
  
  @js.native
  sealed trait JS
    extends StObject
       with ScriptKind
  /* 1 */ val JS: typingsJapgolly.typescript.mod.ScriptKind.JS & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with ScriptKind
  /* 6 */ val JSON: typingsJapgolly.typescript.mod.ScriptKind.JSON & Double = js.native
  
  @js.native
  sealed trait JSX
    extends StObject
       with ScriptKind
  /* 2 */ val JSX: typingsJapgolly.typescript.mod.ScriptKind.JSX & Double = js.native
  
  @js.native
  sealed trait TS
    extends StObject
       with ScriptKind
  /* 3 */ val TS: typingsJapgolly.typescript.mod.ScriptKind.TS & Double = js.native
  
  @js.native
  sealed trait TSX
    extends StObject
       with ScriptKind
  /* 4 */ val TSX: typingsJapgolly.typescript.mod.ScriptKind.TSX & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ScriptKind
  /* 0 */ val Unknown: typingsJapgolly.typescript.mod.ScriptKind.Unknown & Double = js.native
}
