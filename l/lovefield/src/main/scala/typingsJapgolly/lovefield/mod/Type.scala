package typingsJapgolly.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSImport("lovefield", "Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type & Double] = js.native
  
  @js.native
  sealed trait ARRAY_BUFFER
    extends StObject
       with Type
  /* 0 */ val ARRAY_BUFFER: typingsJapgolly.lovefield.mod.Type.ARRAY_BUFFER & Double = js.native
  
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with Type
  /* 1 */ val BOOLEAN: typingsJapgolly.lovefield.mod.Type.BOOLEAN & Double = js.native
  
  @js.native
  sealed trait DATE_TIME
    extends StObject
       with Type
  /* 2 */ val DATE_TIME: typingsJapgolly.lovefield.mod.Type.DATE_TIME & Double = js.native
  
  @js.native
  sealed trait INTEGER
    extends StObject
       with Type
  /* 3 */ val INTEGER: typingsJapgolly.lovefield.mod.Type.INTEGER & Double = js.native
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with Type
  /* 4 */ val NUMBER: typingsJapgolly.lovefield.mod.Type.NUMBER & Double = js.native
  
  @js.native
  sealed trait OBJECT
    extends StObject
       with Type
  /* 5 */ val OBJECT: typingsJapgolly.lovefield.mod.Type.OBJECT & Double = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with Type
  /* 6 */ val STRING: typingsJapgolly.lovefield.mod.Type.STRING & Double = js.native
}
