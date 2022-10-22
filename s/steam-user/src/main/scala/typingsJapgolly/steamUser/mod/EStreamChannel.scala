package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamChannel extends StObject
@JSImport("steam-user", "EStreamChannel")
@js.native
object EStreamChannel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamChannel & Double] = js.native
  
  @js.native
  sealed trait Control
    extends StObject
       with EStreamChannel
  /* 1 */ val Control: typingsJapgolly.steamUser.mod.EStreamChannel.Control & Double = js.native
  
  @js.native
  sealed trait DataChannelStart
    extends StObject
       with EStreamChannel
  /* 3 */ val DataChannelStart: typingsJapgolly.steamUser.mod.EStreamChannel.DataChannelStart & Double = js.native
  
  @js.native
  sealed trait Discovery
    extends StObject
       with EStreamChannel
  /* 0 */ val Discovery: typingsJapgolly.steamUser.mod.EStreamChannel.Discovery & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EStreamChannel
  /* -1 */ val Invalid: typingsJapgolly.steamUser.mod.EStreamChannel.Invalid & Double = js.native
  
  @js.native
  sealed trait Stats
    extends StObject
       with EStreamChannel
  /* 2 */ val Stats: typingsJapgolly.steamUser.mod.EStreamChannel.Stats & Double = js.native
}
