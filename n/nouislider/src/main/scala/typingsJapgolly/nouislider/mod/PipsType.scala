package typingsJapgolly.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipsType extends StObject
@JSImport("nouislider", "PipsType")
@js.native
object PipsType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PipsType & Double] = js.native
  
  @js.native
  sealed trait LargeValue
    extends StObject
       with PipsType
  /* 1 */ val LargeValue: typingsJapgolly.nouislider.mod.PipsType.LargeValue & Double = js.native
  
  @js.native
  sealed trait NoValue
    extends StObject
       with PipsType
  /* 0 */ val NoValue: typingsJapgolly.nouislider.mod.PipsType.NoValue & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with PipsType
  /* -1 */ val None: typingsJapgolly.nouislider.mod.PipsType.None & Double = js.native
  
  @js.native
  sealed trait SmallValue
    extends StObject
       with PipsType
  /* 2 */ val SmallValue: typingsJapgolly.nouislider.mod.PipsType.SmallValue & Double = js.native
}
