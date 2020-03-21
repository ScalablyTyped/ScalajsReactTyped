package typingsJapgolly.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait distance extends js.Object

@JSImport("cassandra-driver/lib/types", "types.distance")
@js.native
object distance extends js.Object {
  @js.native
  sealed trait ignored extends distance
  
  @js.native
  sealed trait local extends distance
  
  @js.native
  sealed trait remote extends distance
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[distance with Double] = js.native
  /* 1 */ @js.native
  object ignored extends TopLevel[ignored with Double]
  
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 0 */ @js.native
  object remote extends TopLevel[remote with Double]
  
}

