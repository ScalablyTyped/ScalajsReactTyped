package typingsJapgolly.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SignalingState")
@js.native
object SignalingState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState & String] = js.native
  
  /* "Closed" */ val Closed: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Closed & String = js.native
  
  /* "HaveLocalOffer" */ val HaveLocalOffer: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer & String = js.native
  
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer & String = js.native
  
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Initial & String = js.native
  
  /* "Stable" */ val Stable: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Stable & String = js.native
}
