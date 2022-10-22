package typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `synthesize` operation. */
object SynthesizeConstants {
  
  @js.native
  sealed trait Accept extends StObject
  /** The requested format (MIME type) of the audio. You can use the `Accept` header or the `accept` parameter to specify the audio format. For more information about specifying an audio format, see **Audio formats (accept types)** in the method description. Default: `audio/ogg;codecs=opus`. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "SynthesizeConstants.Accept")
  @js.native
  object Accept extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Accept & String] = js.native
    
    @js.native
    sealed trait AUDIO_BASIC
      extends StObject
         with Accept
    /* "audio/basic" */ val AUDIO_BASIC: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_BASIC & String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC
      extends StObject
         with Accept
    /* "audio/flac" */ val AUDIO_FLAC: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_FLAC & String = js.native
    
    @js.native
    sealed trait AUDIO_L16
      extends StObject
         with Accept
    /* "audio/l16" */ val AUDIO_L16: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_L16 & String = js.native
    
    @js.native
    sealed trait AUDIO_MP3
      extends StObject
         with Accept
    /* "audio/mp3" */ val AUDIO_MP3: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_MP3 & String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG
      extends StObject
         with Accept
    /* "audio/mpeg" */ val AUDIO_MPEG: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_MPEG & String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW
      extends StObject
         with Accept
    /* "audio/mulaw" */ val AUDIO_MULAW: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_MULAW & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG
      extends StObject
         with Accept
    /* "audio/ogg" */ val AUDIO_OGG: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS
      extends StObject
         with Accept
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS
      extends StObject
         with Accept
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG_CODECS_VORBIS & String = js.native
    
    @js.native
    sealed trait AUDIO_WAV
      extends StObject
         with Accept
    /* "audio/wav" */ val AUDIO_WAV: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WAV & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM
      extends StObject
         with Accept
    /* "audio/webm" */ val AUDIO_WEBM: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS
      extends StObject
         with Accept
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS
      extends StObject
         with Accept
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM_CODECS_VORBIS & String = js.native
  }
  
  @js.native
  sealed trait Voice extends StObject
  /** The voice to use for synthesis. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "SynthesizeConstants.Voice")
  @js.native
  object Voice extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice & String
      ] = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITV2VOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_BirgitV2Voice" */ val DE_DE_BIRGITV2VOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_BIRGITV2VOICE & String = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_BirgitVoice" */ val DE_DE_BIRGITVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_BIRGITVOICE & String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERV2VOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_DieterV2Voice" */ val DE_DE_DIETERV2VOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_DIETERV2VOICE & String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_DieterVoice" */ val DE_DE_DIETERVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_DIETERVOICE & String = js.native
    
    @js.native
    sealed trait EN_GB_KATEVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-GB_KateVoice" */ val EN_GB_KATEVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_GB_KATEVOICE & String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONV2VOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_AllisonV2Voice" */ val EN_US_ALLISONV2VOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_ALLISONV2VOICE & String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_AllisonVoice" */ val EN_US_ALLISONVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_ALLISONVOICE & String = js.native
    
    @js.native
    sealed trait EN_US_LISAV2VOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_LisaV2Voice" */ val EN_US_LISAV2VOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_LISAV2VOICE & String = js.native
    
    @js.native
    sealed trait EN_US_LISAVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_LisaVoice" */ val EN_US_LISAVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_LISAVOICE & String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELV2VOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_MichaelV2Voice" */ val EN_US_MICHAELV2VOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_MICHAELV2VOICE & String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_MichaelVoice" */ val EN_US_MICHAELVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_MICHAELVOICE & String = js.native
    
    @js.native
    sealed trait ES_ES_ENRIQUEVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-ES_EnriqueVoice" */ val ES_ES_ENRIQUEVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_ES_ENRIQUEVOICE & String = js.native
    
    @js.native
    sealed trait ES_ES_LAURAVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-ES_LauraVoice" */ val ES_ES_LAURAVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_ES_LAURAVOICE & String = js.native
    
    @js.native
    sealed trait ES_LA_SOFIAVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-LA_SofiaVoice" */ val ES_LA_SOFIAVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_LA_SOFIAVOICE & String = js.native
    
    @js.native
    sealed trait ES_US_SOFIAVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-US_SofiaVoice" */ val ES_US_SOFIAVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_US_SOFIAVOICE & String = js.native
    
    @js.native
    sealed trait FR_FR_RENEEVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "fr-FR_ReneeVoice" */ val FR_FR_RENEEVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.FR_FR_RENEEVOICE & String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAV2VOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "it-IT_FrancescaV2Voice" */ val IT_IT_FRANCESCAV2VOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.IT_IT_FRANCESCAV2VOICE & String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "it-IT_FrancescaVoice" */ val IT_IT_FRANCESCAVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.IT_IT_FRANCESCAVOICE & String = js.native
    
    @js.native
    sealed trait JA_JP_EMIVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "ja-JP_EmiVoice" */ val JA_JP_EMIVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.JA_JP_EMIVOICE & String = js.native
    
    @js.native
    sealed trait PT_BR_ISABELAVOICE
      extends StObject
         with typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "pt-BR_IsabelaVoice" */ val PT_BR_ISABELAVOICE: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.PT_BR_ISABELAVOICE & String = js.native
  }
}
