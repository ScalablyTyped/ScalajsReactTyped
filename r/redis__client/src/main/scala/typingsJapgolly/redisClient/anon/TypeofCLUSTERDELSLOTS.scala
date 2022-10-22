package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLUSTERDELSLOTS extends StObject {
  
  def transformArguments(slots: js.Array[Double]): RedisCommandArguments = js.native
  def transformArguments(slots: Double): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
