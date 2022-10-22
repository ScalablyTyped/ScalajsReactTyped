package typingsJapgolly.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageSeverity extends StObject
@JSImport("primereact/api/api", "MessageSeverity")
@js.native
object MessageSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageSeverity & String] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with MessageSeverity
  /* "error" */ val ERROR: typingsJapgolly.primereact.apiApiMod.MessageSeverity.ERROR & String = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with MessageSeverity
  /* "info" */ val INFO: typingsJapgolly.primereact.apiApiMod.MessageSeverity.INFO & String = js.native
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with MessageSeverity
  /* "success" */ val SUCCESS: typingsJapgolly.primereact.apiApiMod.MessageSeverity.SUCCESS & String = js.native
  
  @js.native
  sealed trait WARN
    extends StObject
       with MessageSeverity
  /* "warn" */ val WARN: typingsJapgolly.primereact.apiApiMod.MessageSeverity.WARN & String = js.native
}
