package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EVENT extends StObject
@JSGlobal("Stronghold.EVENT")
@js.native
object EVENT extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EVENT & String] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with EVENT
  /* "error" */ val ERROR: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.EVENT.ERROR & String = js.native
  
  @js.native
  sealed trait EXIT
    extends StObject
       with EVENT
  /* "exit" */ val EXIT: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.EVENT.EXIT & String = js.native
  
  @js.native
  sealed trait READY
    extends StObject
       with EVENT
  /* "ready" */ val READY: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.EVENT.READY & String = js.native
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with EVENT
  /* "success" */ val SUCCESS: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.EVENT.SUCCESS & String = js.native
}
