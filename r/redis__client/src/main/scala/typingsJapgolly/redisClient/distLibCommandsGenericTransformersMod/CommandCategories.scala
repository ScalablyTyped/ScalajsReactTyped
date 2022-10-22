package typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandCategories extends StObject
@JSImport("@redis/client/dist/lib/commands/generic-transformers", "CommandCategories")
@js.native
object CommandCategories extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandCategories & String] = js.native
  
  @js.native
  sealed trait ADMIN
    extends StObject
       with CommandCategories
  /* "@admin" */ val ADMIN: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.ADMIN & String = js.native
  
  @js.native
  sealed trait BITMAP
    extends StObject
       with CommandCategories
  /* "@bitmap" */ val BITMAP: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.BITMAP & String = js.native
  
  @js.native
  sealed trait BLOCKING
    extends StObject
       with CommandCategories
  /* "@blocking" */ val BLOCKING: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.BLOCKING & String = js.native
  
  @js.native
  sealed trait CONNECTION
    extends StObject
       with CommandCategories
  /* "@connection" */ val CONNECTION: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.CONNECTION & String = js.native
  
  @js.native
  sealed trait DANGEROUS
    extends StObject
       with CommandCategories
  /* "@dangerous" */ val DANGEROUS: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.DANGEROUS & String = js.native
  
  @js.native
  sealed trait FAST
    extends StObject
       with CommandCategories
  /* "@fast" */ val FAST: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.FAST & String = js.native
  
  @js.native
  sealed trait GEO
    extends StObject
       with CommandCategories
  /* "@geo" */ val GEO: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.GEO & String = js.native
  
  @js.native
  sealed trait HASH
    extends StObject
       with CommandCategories
  /* "@hash" */ val HASH: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.HASH & String = js.native
  
  @js.native
  sealed trait HYPERLOGLOG
    extends StObject
       with CommandCategories
  /* "@hyperloglog" */ val HYPERLOGLOG: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.HYPERLOGLOG & String = js.native
  
  @js.native
  sealed trait KEYSPACE
    extends StObject
       with CommandCategories
  /* "@keyspace" */ val KEYSPACE: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.KEYSPACE & String = js.native
  
  @js.native
  sealed trait LIST
    extends StObject
       with CommandCategories
  /* "@list" */ val LIST: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.LIST & String = js.native
  
  @js.native
  sealed trait PUBSUB
    extends StObject
       with CommandCategories
  /* "@pubsub" */ val PUBSUB: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.PUBSUB & String = js.native
  
  @js.native
  sealed trait READ
    extends StObject
       with CommandCategories
  /* "@read" */ val READ: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.READ & String = js.native
  
  @js.native
  sealed trait SCRIPTING
    extends StObject
       with CommandCategories
  /* "@scripting" */ val SCRIPTING: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.SCRIPTING & String = js.native
  
  @js.native
  sealed trait SET
    extends StObject
       with CommandCategories
  /* "@set" */ val SET: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.SET & String = js.native
  
  @js.native
  sealed trait SLOW
    extends StObject
       with CommandCategories
  /* "@slow" */ val SLOW: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.SLOW & String = js.native
  
  @js.native
  sealed trait SORTEDSET
    extends StObject
       with CommandCategories
  /* "@sortedset" */ val SORTEDSET: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.SORTEDSET & String = js.native
  
  @js.native
  sealed trait STREAM
    extends StObject
       with CommandCategories
  /* "@stream" */ val STREAM: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.STREAM & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with CommandCategories
  /* "@string" */ val STRING: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.STRING & String = js.native
  
  @js.native
  sealed trait TRANSACTION
    extends StObject
       with CommandCategories
  /* "@transaction" */ val TRANSACTION: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.TRANSACTION & String = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with CommandCategories
  /* "@write" */ val WRITE: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandCategories.WRITE & String = js.native
}
