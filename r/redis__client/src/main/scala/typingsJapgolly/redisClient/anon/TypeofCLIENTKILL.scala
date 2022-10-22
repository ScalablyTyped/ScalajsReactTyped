package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsClientKILLMod.KillFilters
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLIENTKILL extends StObject {
  
  def transformArguments(filters: js.Array[KillFilters]): RedisCommandArguments = js.native
  def transformArguments(filters: KillFilters): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
