package typingsJapgolly.pizzicato.mod

import org.scalajs.dom.AudioContext
import org.scalajs.dom.GainNode
import typingsJapgolly.pizzicato.mod.^
import typingsJapgolly.std.AudioProcessingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def context: AudioContext = ^.asInstanceOf[js.Dynamic].selectDynamic("context").asInstanceOf[AudioContext]

inline def masterGainNode: GainNode = ^.asInstanceOf[js.Dynamic].selectDynamic("masterGainNode").asInstanceOf[GainNode]

inline def volume: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("volume").asInstanceOf[Double]
inline def volume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volume")(x.asInstanceOf[js.Any])

type AudioFunction = js.Function1[/* e */ AudioProcessingEvent, Unit]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.pizzicato.mod.AudioFunction
  - typingsJapgolly.pizzicato.anon.Options
  - typingsJapgolly.pizzicato.anon.Source
  - typingsJapgolly.pizzicato.anon.OptionsSource
  - typingsJapgolly.pizzicato.anon.OptionsScriptSoundOptions
*/
type SoundDescription = _SoundDescription | String | AudioFunction
