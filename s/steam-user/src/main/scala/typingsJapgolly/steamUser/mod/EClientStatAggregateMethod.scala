package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStatAggregateMethod extends StObject
@JSImport("steam-user", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStatAggregateMethod & Double] = js.native
  
  @js.native
  sealed trait Event
    extends StObject
       with EClientStatAggregateMethod
  /* 2 */ val Event: typingsJapgolly.steamUser.mod.EClientStatAggregateMethod.Event & Double = js.native
  
  @js.native
  sealed trait LatestOnly
    extends StObject
       with EClientStatAggregateMethod
  /* 0 */ val LatestOnly: typingsJapgolly.steamUser.mod.EClientStatAggregateMethod.LatestOnly & Double = js.native
  
  @js.native
  sealed trait Scalar
    extends StObject
       with EClientStatAggregateMethod
  /* 3 */ val Scalar: typingsJapgolly.steamUser.mod.EClientStatAggregateMethod.Scalar & Double = js.native
  
  @js.native
  sealed trait Sum
    extends StObject
       with EClientStatAggregateMethod
  /* 1 */ val Sum: typingsJapgolly.steamUser.mod.EClientStatAggregateMethod.Sum & Double = js.native
}
