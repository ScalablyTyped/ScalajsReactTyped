package typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostMessageMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "HostMessageMode")
@js.native
object HostMessageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostMessageMode & Double] = js.native
  
  /** display message in chatlog */
  @js.native
  sealed trait LOG
    extends StObject
       with HostMessageMode
  /* 1 */ val LOG: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.LOG & Double = js.native
  
  /** display message in modal dialog */
  @js.native
  sealed trait MODAL
    extends StObject
       with HostMessageMode
  /* 2 */ val MODAL: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.MODAL & Double = js.native
  
  /** display message in modal dialog and close connection */
  @js.native
  sealed trait MODALQUIT
    extends StObject
       with HostMessageMode
  /* 3 */ val MODALQUIT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.MODALQUIT & Double = js.native
  
  /** don't display anything */
  @js.native
  sealed trait NONE
    extends StObject
       with HostMessageMode
  /* 0 */ val NONE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.NONE & Double = js.native
}
