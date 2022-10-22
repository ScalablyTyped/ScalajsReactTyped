package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StmtModifier extends StObject
@JSImport("@angular/compiler", "StmtModifier")
@js.native
object StmtModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StmtModifier & Double] = js.native
  
  @js.native
  sealed trait Exported
    extends StObject
       with StmtModifier
  /* 4 */ val Exported: typingsJapgolly.angularCompiler.mod.StmtModifier.Exported & Double = js.native
  
  @js.native
  sealed trait Final
    extends StObject
       with StmtModifier
  /* 1 */ val Final: typingsJapgolly.angularCompiler.mod.StmtModifier.Final & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with StmtModifier
  /* 0 */ val None: typingsJapgolly.angularCompiler.mod.StmtModifier.None & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with StmtModifier
  /* 2 */ val Private: typingsJapgolly.angularCompiler.mod.StmtModifier.Private & Double = js.native
  
  @js.native
  sealed trait Static
    extends StObject
       with StmtModifier
  /* 8 */ val Static: typingsJapgolly.angularCompiler.mod.StmtModifier.Static & Double = js.native
}
