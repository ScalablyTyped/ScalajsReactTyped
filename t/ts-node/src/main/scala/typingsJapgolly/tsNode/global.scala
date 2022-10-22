package typingsJapgolly.tsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("messageMatch")
  @js.native
  val messageMatch: js.RegExp = js.native
  
  inline def onWarning(warning: js.Error, rest: Any*): Any = js.Dynamic.global.applyDynamic("onWarning")(scala.List(warning.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSGlobal("originalOnWarning")
  @js.native
  def originalOnWarning: js.UndefOr[js.Function] = js.native
  inline def originalOnWarning_=(x: js.UndefOr[js.Function]): Unit = js.Dynamic.global.updateDynamic("originalOnWarning")(x.asInstanceOf[js.Any])
  
  @JSGlobal("_process")
  @js.native
  val process: EventEmitterInternals = js.native
}
