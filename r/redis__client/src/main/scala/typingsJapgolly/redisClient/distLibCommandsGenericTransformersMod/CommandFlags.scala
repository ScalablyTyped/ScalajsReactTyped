package typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandFlags extends StObject
@JSImport("@redis/client/dist/lib/commands/generic-transformers", "CommandFlags")
@js.native
object CommandFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandFlags & String] = js.native
  
  @js.native
  sealed trait ADMIN
    extends StObject
       with CommandFlags
  /* "admin" */ val ADMIN: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.ADMIN & String = js.native
  
  @js.native
  sealed trait ASKING
    extends StObject
       with CommandFlags
  /* "asking" */ val ASKING: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.ASKING & String = js.native
  
  @js.native
  sealed trait DENYOOM
    extends StObject
       with CommandFlags
  /* "denyoom" */ val DENYOOM: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.DENYOOM & String = js.native
  
  @js.native
  sealed trait FAST
    extends StObject
       with CommandFlags
  /* "fast" */ val FAST: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.FAST & String = js.native
  
  @js.native
  sealed trait LOADING
    extends StObject
       with CommandFlags
  /* "loading" */ val LOADING: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.LOADING & String = js.native
  
  @js.native
  sealed trait MOVABLEKEYS
    extends StObject
       with CommandFlags
  /* "movablekeys" */ val MOVABLEKEYS: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.MOVABLEKEYS & String = js.native
  
  @js.native
  sealed trait NOSCRIPT
    extends StObject
       with CommandFlags
  /* "noscript" */ val NOSCRIPT: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.NOSCRIPT & String = js.native
  
  @js.native
  sealed trait PUBSUB
    extends StObject
       with CommandFlags
  /* "pubsub" */ val PUBSUB: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.PUBSUB & String = js.native
  
  @js.native
  sealed trait RANDOM
    extends StObject
       with CommandFlags
  /* "random" */ val RANDOM: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.RANDOM & String = js.native
  
  @js.native
  sealed trait READONLY
    extends StObject
       with CommandFlags
  /* "readonly" */ val READONLY: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.READONLY & String = js.native
  
  @js.native
  sealed trait SKIP_MONITOR
    extends StObject
       with CommandFlags
  /* "skip_monitor" */ val SKIP_MONITOR: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.SKIP_MONITOR & String = js.native
  
  @js.native
  sealed trait SORT_FOR_SCRIPT
    extends StObject
       with CommandFlags
  /* "sort_for_script" */ val SORT_FOR_SCRIPT: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.SORT_FOR_SCRIPT & String = js.native
  
  @js.native
  sealed trait STALE
    extends StObject
       with CommandFlags
  /* "stale" */ val STALE: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.STALE & String = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with CommandFlags
  /* "write" */ val WRITE: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandFlags.WRITE & String = js.native
}
