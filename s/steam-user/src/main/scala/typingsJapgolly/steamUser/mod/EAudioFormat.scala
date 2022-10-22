package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAudioFormat extends StObject
@JSImport("steam-user", "EAudioFormat")
@js.native
object EAudioFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAudioFormat & Double] = js.native
  
  @js.native
  sealed trait `16BitLittleEndian`
    extends StObject
       with EAudioFormat
  /* 1 */ val `16BitLittleEndian`: typingsJapgolly.steamUser.mod.EAudioFormat.`16BitLittleEndian` & Double = js.native
  
  @js.native
  sealed trait Float
    extends StObject
       with EAudioFormat
  /* 2 */ val Float: typingsJapgolly.steamUser.mod.EAudioFormat.Float & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EAudioFormat
  /* 0 */ val None: typingsJapgolly.steamUser.mod.EAudioFormat.None & Double = js.native
}
