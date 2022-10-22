package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SsmlVoiceGender extends StObject
/** SsmlVoiceGender enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SsmlVoiceGender")
@js.native
object SsmlVoiceGender extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsmlVoiceGender & Double] = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_FEMALE
    extends StObject
       with SsmlVoiceGender
  /* 2 */ val SSML_VOICE_GENDER_FEMALE: typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_FEMALE & Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_MALE
    extends StObject
       with SsmlVoiceGender
  /* 1 */ val SSML_VOICE_GENDER_MALE: typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_MALE & Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_NEUTRAL
    extends StObject
       with SsmlVoiceGender
  /* 3 */ val SSML_VOICE_GENDER_NEUTRAL: typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_NEUTRAL & Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_UNSPECIFIED
    extends StObject
       with SsmlVoiceGender
  /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED & Double = js.native
}
