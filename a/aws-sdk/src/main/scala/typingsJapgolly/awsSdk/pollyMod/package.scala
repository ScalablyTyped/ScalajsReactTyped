package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pollyMod {
  type Alphabet = java.lang.String
  type AudioStream = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.pollyMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.pollyMod.ClientApiVersions
  type ContentType = java.lang.String
  type DateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - typingsJapgolly.awsSdk.awsSdkStrings.neural
    - java.lang.String
  */
  type Engine = typingsJapgolly.awsSdk.pollyMod._Engine | java.lang.String
  type EngineList = js.Array[typingsJapgolly.awsSdk.pollyMod.Engine]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Female
    - typingsJapgolly.awsSdk.awsSdkStrings.Male
    - java.lang.String
  */
  type Gender = typingsJapgolly.awsSdk.pollyMod._Gender | java.lang.String
  type IncludeAdditionalLanguageCodes = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.arb
    - typingsJapgolly.awsSdk.awsSdkStrings.`cmn-CN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cy-GB`
    - typingsJapgolly.awsSdk.awsSdkStrings.`da-DK`
    - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB-WLS`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-IN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
    - typingsJapgolly.awsSdk.awsSdkStrings.`es-ES`
    - typingsJapgolly.awsSdk.awsSdkStrings.`es-MX`
    - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
    - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
    - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`is-IS`
    - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
    - typingsJapgolly.awsSdk.awsSdkStrings.`hi-IN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`nb-NO`
    - typingsJapgolly.awsSdk.awsSdkStrings.`nl-NL`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pl-PL`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pt-BR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pt-PT`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ro-RO`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ru-RU`
    - typingsJapgolly.awsSdk.awsSdkStrings.`sv-SE`
    - typingsJapgolly.awsSdk.awsSdkStrings.`tr-TR`
    - java.lang.String
  */
  type LanguageCode = typingsJapgolly.awsSdk.pollyMod._LanguageCode | java.lang.String
  type LanguageCodeList = js.Array[typingsJapgolly.awsSdk.pollyMod.LanguageCode]
  type LanguageName = java.lang.String
  type LastModified = js.Date
  type LexemesCount = scala.Double
  type LexiconArn = java.lang.String
  type LexiconContent = java.lang.String
  type LexiconDescriptionList = js.Array[typingsJapgolly.awsSdk.pollyMod.LexiconDescription]
  type LexiconName = java.lang.String
  type LexiconNameList = js.Array[typingsJapgolly.awsSdk.pollyMod.LexiconName]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.json_
    - typingsJapgolly.awsSdk.awsSdkStrings.mp3_
    - typingsJapgolly.awsSdk.awsSdkStrings.ogg_vorbis
    - typingsJapgolly.awsSdk.awsSdkStrings.pcm
    - java.lang.String
  */
  type OutputFormat = typingsJapgolly.awsSdk.pollyMod._OutputFormat | java.lang.String
  type OutputS3BucketName = java.lang.String
  type OutputS3KeyPrefix = java.lang.String
  type OutputUri = java.lang.String
  type RequestCharacters = scala.Double
  type SampleRate = java.lang.String
  type Size = scala.Double
  type SnsTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.sentence
    - typingsJapgolly.awsSdk.awsSdkStrings.ssml_
    - typingsJapgolly.awsSdk.awsSdkStrings.viseme
    - typingsJapgolly.awsSdk.awsSdkStrings.word_
    - java.lang.String
  */
  type SpeechMarkType = typingsJapgolly.awsSdk.pollyMod._SpeechMarkType | java.lang.String
  type SpeechMarkTypeList = js.Array[typingsJapgolly.awsSdk.pollyMod.SpeechMarkType]
  type SynthesisTasks = js.Array[typingsJapgolly.awsSdk.pollyMod.SynthesisTask]
  type TaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.scheduled__
    - typingsJapgolly.awsSdk.awsSdkStrings.inProgress__
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type TaskStatus = typingsJapgolly.awsSdk.pollyMod._TaskStatus | java.lang.String
  type TaskStatusReason = java.lang.String
  type Text = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ssml_
    - typingsJapgolly.awsSdk.awsSdkStrings.text_
    - java.lang.String
  */
  type TextType = typingsJapgolly.awsSdk.pollyMod._TextType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Aditi
    - typingsJapgolly.awsSdk.awsSdkStrings.Amy
    - typingsJapgolly.awsSdk.awsSdkStrings.Astrid
    - typingsJapgolly.awsSdk.awsSdkStrings.Bianca
    - typingsJapgolly.awsSdk.awsSdkStrings.Brian
    - typingsJapgolly.awsSdk.awsSdkStrings.Camila
    - typingsJapgolly.awsSdk.awsSdkStrings.Carla
    - typingsJapgolly.awsSdk.awsSdkStrings.Carmen
    - typingsJapgolly.awsSdk.awsSdkStrings.Celine
    - typingsJapgolly.awsSdk.awsSdkStrings.Chantal
    - typingsJapgolly.awsSdk.awsSdkStrings.Conchita
    - typingsJapgolly.awsSdk.awsSdkStrings.Cristiano
    - typingsJapgolly.awsSdk.awsSdkStrings.Dora
    - typingsJapgolly.awsSdk.awsSdkStrings.Emma
    - typingsJapgolly.awsSdk.awsSdkStrings.Enrique
    - typingsJapgolly.awsSdk.awsSdkStrings.Ewa
    - typingsJapgolly.awsSdk.awsSdkStrings.Filiz
    - typingsJapgolly.awsSdk.awsSdkStrings.Geraint
    - typingsJapgolly.awsSdk.awsSdkStrings.Giorgio
    - typingsJapgolly.awsSdk.awsSdkStrings.Gwyneth
    - typingsJapgolly.awsSdk.awsSdkStrings.Hans_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ines
    - typingsJapgolly.awsSdk.awsSdkStrings.Ivy
    - typingsJapgolly.awsSdk.awsSdkStrings.Jacek
    - typingsJapgolly.awsSdk.awsSdkStrings.Jan
    - typingsJapgolly.awsSdk.awsSdkStrings.Joanna
    - typingsJapgolly.awsSdk.awsSdkStrings.Joey
    - typingsJapgolly.awsSdk.awsSdkStrings.Justin
    - typingsJapgolly.awsSdk.awsSdkStrings.Karl
    - typingsJapgolly.awsSdk.awsSdkStrings.Kendra
    - typingsJapgolly.awsSdk.awsSdkStrings.Kimberly
    - typingsJapgolly.awsSdk.awsSdkStrings.Lea
    - typingsJapgolly.awsSdk.awsSdkStrings.Liv
    - typingsJapgolly.awsSdk.awsSdkStrings.Lotte
    - typingsJapgolly.awsSdk.awsSdkStrings.Lucia
    - typingsJapgolly.awsSdk.awsSdkStrings.Lupe
    - typingsJapgolly.awsSdk.awsSdkStrings.Mads
    - typingsJapgolly.awsSdk.awsSdkStrings.Maja
    - typingsJapgolly.awsSdk.awsSdkStrings.Marlene
    - typingsJapgolly.awsSdk.awsSdkStrings.Mathieu
    - typingsJapgolly.awsSdk.awsSdkStrings.Matthew
    - typingsJapgolly.awsSdk.awsSdkStrings.Maxim
    - typingsJapgolly.awsSdk.awsSdkStrings.Mia
    - typingsJapgolly.awsSdk.awsSdkStrings.Miguel
    - typingsJapgolly.awsSdk.awsSdkStrings.Mizuki
    - typingsJapgolly.awsSdk.awsSdkStrings.Naja
    - typingsJapgolly.awsSdk.awsSdkStrings.Nicole
    - typingsJapgolly.awsSdk.awsSdkStrings.Penelope
    - typingsJapgolly.awsSdk.awsSdkStrings.Raveena
    - typingsJapgolly.awsSdk.awsSdkStrings.Ricardo
    - typingsJapgolly.awsSdk.awsSdkStrings.Ruben
    - typingsJapgolly.awsSdk.awsSdkStrings.Russell
    - typingsJapgolly.awsSdk.awsSdkStrings.Salli
    - typingsJapgolly.awsSdk.awsSdkStrings.Seoyeon
    - typingsJapgolly.awsSdk.awsSdkStrings.Takumi
    - typingsJapgolly.awsSdk.awsSdkStrings.Tatyana
    - typingsJapgolly.awsSdk.awsSdkStrings.Vicki
    - typingsJapgolly.awsSdk.awsSdkStrings.Vitoria
    - typingsJapgolly.awsSdk.awsSdkStrings.Zeina
    - typingsJapgolly.awsSdk.awsSdkStrings.Zhiyu
    - java.lang.String
  */
  type VoiceId = typingsJapgolly.awsSdk.pollyMod._VoiceId | java.lang.String
  type VoiceList = js.Array[typingsJapgolly.awsSdk.pollyMod.Voice]
  type VoiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-06-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.pollyMod._apiVersion | java.lang.String
}
