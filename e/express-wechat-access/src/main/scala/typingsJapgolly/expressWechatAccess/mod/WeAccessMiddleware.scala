package typingsJapgolly.expressWechatAccess.mod

import org.scalajs.dom.experimental.Response
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined  */ @js.native
trait WeAccessMiddleware
  extends WeMiddleware
     with EventEmitter {
  /* InferMemberOverrides */
  override def apply(T0: /* req */ js.Any, T1: /* res */ Response | ServerResponse, T2: /* next */ NextFunction): js.Any = js.native
}

