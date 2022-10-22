package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsAclGETUSERMod.AclGetUserRawReply
import typingsJapgolly.redisClient.distLibCommandsAclGETUSERMod.AclUser
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLGETUSER extends StObject {
  
  def transformArguments(username: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(reply: AclGetUserRawReply): AclUser
}
object TypeofACLGETUSER {
  
  inline def apply(
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: AclGetUserRawReply => AclUser
  ): TypeofACLGETUSER = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofACLGETUSER]
  }
  
  extension [Self <: TypeofACLGETUSER](x: Self) {
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: AclGetUserRawReply => AclUser): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
