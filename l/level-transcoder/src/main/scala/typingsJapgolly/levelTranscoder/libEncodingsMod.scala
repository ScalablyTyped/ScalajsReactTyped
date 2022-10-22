package typingsJapgolly.levelTranscoder

import typingsJapgolly.levelTranscoder.libEncodingMod.KnownEncodingInput
import typingsJapgolly.levelTranscoder.libEncodingMod.KnownEncodingOutput
import typingsJapgolly.levelTranscoder.libFormatsMod.BufferFormat
import typingsJapgolly.levelTranscoder.libFormatsMod.UTF8Format
import typingsJapgolly.levelTranscoder.libFormatsMod.ViewFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingsMod {
  
  @JSImport("level-transcoder/lib/encodings", "base64")
  @js.native
  val base64: BufferFormat[
    KnownEncodingInput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.base64], 
    KnownEncodingOutput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.base64]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "buffer")
  @js.native
  val buffer: BufferFormat[
    KnownEncodingInput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.buffer], 
    KnownEncodingOutput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.buffer]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "hex")
  @js.native
  val hex: BufferFormat[
    KnownEncodingInput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.hex], 
    KnownEncodingOutput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.hex]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "json")
  @js.native
  val json: UTF8Format[
    KnownEncodingInput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.json], 
    KnownEncodingOutput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.json]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "utf8")
  @js.native
  val utf8: UTF8Format[
    KnownEncodingInput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.utf8], 
    KnownEncodingOutput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.utf8]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "view")
  @js.native
  val view: ViewFormat[
    KnownEncodingInput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.view], 
    KnownEncodingOutput[typingsJapgolly.levelTranscoder.levelTranscoderStrings.view]
  ] = js.native
}
