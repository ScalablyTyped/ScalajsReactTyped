package typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Codec extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "Codec")
@js.native
object Codec extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Codec & Double] = js.native
  
  /** celt mono (mono, 16bit, 48kHz) */
  @js.native
  sealed trait CELT_MONO
    extends StObject
       with Codec
  /* 3 */ val CELT_MONO: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.CELT_MONO & Double = js.native
  
  @js.native
  sealed trait OPUS_MUSIC
    extends StObject
       with Codec
  /* 5 */ val OPUS_MUSIC: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.OPUS_MUSIC & Double = js.native
  
  @js.native
  sealed trait OPUS_VOICE
    extends StObject
       with Codec
  /* 4 */ val OPUS_VOICE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.OPUS_VOICE & Double = js.native
  
  /** speex narrowband (mono, 16bit, 8kHz) */
  @js.native
  sealed trait SPEEX_NARROWBAND
    extends StObject
       with Codec
  /* 0 */ val SPEEX_NARROWBAND: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.SPEEX_NARROWBAND & Double = js.native
  
  /** speex ultra-wideband (mono, 16bit, 32kHz) */
  @js.native
  sealed trait SPEEX_ULTRAWIDEBAND
    extends StObject
       with Codec
  /* 2 */ val SPEEX_ULTRAWIDEBAND: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.SPEEX_ULTRAWIDEBAND & Double = js.native
  
  /** speex wideband (mono, 16bit, 16kHz) */
  @js.native
  sealed trait SPEEX_WIDEBAND
    extends StObject
       with Codec
  /* 1 */ val SPEEX_WIDEBAND: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.SPEEX_WIDEBAND & Double = js.native
}
