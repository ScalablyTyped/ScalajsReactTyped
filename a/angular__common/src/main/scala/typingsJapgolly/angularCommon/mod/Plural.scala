package typingsJapgolly.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Plural extends StObject
@JSImport("@angular/common", "Plural")
@js.native
object Plural extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural & Double] = js.native
  
  @js.native
  sealed trait Few
    extends StObject
       with Plural
  /* 3 */ val Few: typingsJapgolly.angularCommon.mod.Plural.Few & Double = js.native
  
  @js.native
  sealed trait Many
    extends StObject
       with Plural
  /* 4 */ val Many: typingsJapgolly.angularCommon.mod.Plural.Many & Double = js.native
  
  @js.native
  sealed trait One
    extends StObject
       with Plural
  /* 1 */ val One: typingsJapgolly.angularCommon.mod.Plural.One & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with Plural
  /* 5 */ val Other: typingsJapgolly.angularCommon.mod.Plural.Other & Double = js.native
  
  @js.native
  sealed trait Two
    extends StObject
       with Plural
  /* 2 */ val Two: typingsJapgolly.angularCommon.mod.Plural.Two & Double = js.native
  
  @js.native
  sealed trait Zero
    extends StObject
       with Plural
  /* 0 */ val Zero: typingsJapgolly.angularCommon.mod.Plural.Zero & Double = js.native
}
