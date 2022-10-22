package typingsJapgolly.sirenParser

import typingsJapgolly.sirenParser.actionMod.Action
import typingsJapgolly.sirenParser.mod.Entity
import typingsJapgolly.superagent.mod.Response
import typingsJapgolly.superagent.mod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object superagentMod {
  
  @JSImport("siren-parser/superagent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(res: String): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(res.asInstanceOf[js.Any]).asInstanceOf[Entity]
  inline def parse(res: Response, fn: js.Function2[/* err */ js.Error | Null, /* body */ Entity, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(res.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def perform(request: Any, action: Action): SuperAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("perform")(request.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[SuperAgentRequest]
}
