package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngine {
  type TtsEngineSpeakEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* utterance */ java.lang.String, 
      /* options */ typingsJapgolly.chrome.chrome.ttsEngine.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ typingsJapgolly.chrome.chrome.tts.TtsEvent, scala.Unit], 
      scala.Unit
    ]
  ]
}
