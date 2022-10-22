package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatMemberStateChange extends StObject
@JSImport("steam-client", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange & Double] = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EChatMemberStateChange
  /* 0x10 */ val Banned: typingsJapgolly.steamClient.mod.EChatMemberStateChange.Banned & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with EChatMemberStateChange
  /* 0x04 */ val Disconnected: typingsJapgolly.steamClient.mod.EChatMemberStateChange.Disconnected & Double = js.native
  
  @js.native
  sealed trait Entered
    extends StObject
       with EChatMemberStateChange
  /* 0x01 */ val Entered: typingsJapgolly.steamClient.mod.EChatMemberStateChange.Entered & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EChatMemberStateChange
  /* 0x08 */ val Kicked: typingsJapgolly.steamClient.mod.EChatMemberStateChange.Kicked & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with EChatMemberStateChange
  /* 0x02 */ val Left: typingsJapgolly.steamClient.mod.EChatMemberStateChange.Left & Double = js.native
  
  @js.native
  sealed trait VoiceDoneSpeaking
    extends StObject
       with EChatMemberStateChange
  /* 0x2000 */ val VoiceDoneSpeaking: typingsJapgolly.steamClient.mod.EChatMemberStateChange.VoiceDoneSpeaking & Double = js.native
  
  @js.native
  sealed trait VoiceSpeaking
    extends StObject
       with EChatMemberStateChange
  /* 0x1000 */ val VoiceSpeaking: typingsJapgolly.steamClient.mod.EChatMemberStateChange.VoiceSpeaking & Double = js.native
}
