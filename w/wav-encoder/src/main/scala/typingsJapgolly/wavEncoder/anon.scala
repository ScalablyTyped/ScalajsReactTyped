package typingsJapgolly.wavEncoder

import typingsJapgolly.wavEncoder.mod.AudioData
import typingsJapgolly.wavEncoder.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(audioData: AudioData): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def apply(audioData: AudioData, opts: Options): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def sync(audioData: AudioData): js.typedarray.ArrayBuffer = js.native
    def sync(audioData: AudioData, opts: Options): js.typedarray.ArrayBuffer = js.native
  }
}
