package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptOperation extends StObject
@JSImport("azdata", "ScriptOperation")
@js.native
object ScriptOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptOperation & Double] = js.native
  
  @js.native
  sealed trait Alter
    extends StObject
       with ScriptOperation
  /* 6 */ val Alter: typingsJapgolly.azdata.mod.ScriptOperation.Alter & Double = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with ScriptOperation
  /* 1 */ val Create: typingsJapgolly.azdata.mod.ScriptOperation.Create & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with ScriptOperation
  /* 4 */ val Delete: typingsJapgolly.azdata.mod.ScriptOperation.Delete & Double = js.native
  
  @js.native
  sealed trait Execute
    extends StObject
       with ScriptOperation
  /* 5 */ val Execute: typingsJapgolly.azdata.mod.ScriptOperation.Execute & Double = js.native
  
  @js.native
  sealed trait Insert
    extends StObject
       with ScriptOperation
  /* 2 */ val Insert: typingsJapgolly.azdata.mod.ScriptOperation.Insert & Double = js.native
  
  @js.native
  sealed trait Select
    extends StObject
       with ScriptOperation
  /* 0 */ val Select: typingsJapgolly.azdata.mod.ScriptOperation.Select & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ScriptOperation
  /* 3 */ val Update: typingsJapgolly.azdata.mod.ScriptOperation.Update & Double = js.native
}
