package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.SortOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSORTSTORE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(source: String, destination: String): RedisCommandArguments = js.native
  def transformArguments(source: String, destination: String, options: SortOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
