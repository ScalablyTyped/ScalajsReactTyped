package typingsJapgolly.burns

import typingsJapgolly.burns.anon.Add
import typingsJapgolly.burns.anon.CreateBroadcaster
import typingsJapgolly.burns.anon.`0`
import typingsJapgolly.burns.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesManagersBroadcastMod {
  
  /**
    * @param {typeof import("../repositories/config")} configRepository
    * @param {typeof import("../repositories/events")} eventsRepository
    * @param {typeof import("../repositories/broadcasters")} broadcastersRepository
    */
  inline def apply(configRepository: CreateBroadcaster, eventsRepository: Add, broadcastersRepository: `0`): `1` = (^.asInstanceOf[js.Dynamic].apply(configRepository.asInstanceOf[js.Any], eventsRepository.asInstanceOf[js.Any], broadcastersRepository.asInstanceOf[js.Any])).asInstanceOf[`1`]
  
  @JSImport("burns/types/managers/broadcast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
