package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamAudioCodec extends StObject
@JSImport("steam-user", "EStreamAudioCodec")
@js.native
object EStreamAudioCodec extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamAudioCodec & Double] = js.native
  
  @js.native
  sealed trait AAC
    extends StObject
       with EStreamAudioCodec
  /* 5 */ val AAC: typingsJapgolly.steamUser.mod.EStreamAudioCodec.AAC & Double = js.native
  
  @js.native
  sealed trait MP3
    extends StObject
       with EStreamAudioCodec
  /* 4 */ val MP3: typingsJapgolly.steamUser.mod.EStreamAudioCodec.MP3 & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EStreamAudioCodec
  /* 0 */ val None: typingsJapgolly.steamUser.mod.EStreamAudioCodec.None & Double = js.native
  
  @js.native
  sealed trait Opus
    extends StObject
       with EStreamAudioCodec
  /* 3 */ val Opus: typingsJapgolly.steamUser.mod.EStreamAudioCodec.Opus & Double = js.native
  
  @js.native
  sealed trait Raw
    extends StObject
       with EStreamAudioCodec
  /* 1 */ val Raw: typingsJapgolly.steamUser.mod.EStreamAudioCodec.Raw & Double = js.native
  
  @js.native
  sealed trait Vorbis
    extends StObject
       with EStreamAudioCodec
  /* 2 */ val Vorbis: typingsJapgolly.steamUser.mod.EStreamAudioCodec.Vorbis & Double = js.native
}
