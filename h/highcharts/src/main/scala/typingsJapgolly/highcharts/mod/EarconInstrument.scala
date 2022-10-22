package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define an Instrument and the options for playing it.
  */
trait EarconInstrument extends StObject {
  
  /**
    * An instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typingsJapgolly.highcharts.modulesSonificationMod.highchartsAugmentingMod.Instrument
  
  /**
    * The options to pass to Instrument.play.
    */
  var playOptions: typingsJapgolly.highcharts.modulesSonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
}
object EarconInstrument {
  
  inline def apply(
    instrument: String | typingsJapgolly.highcharts.modulesSonificationMod.highchartsAugmentingMod.Instrument,
    playOptions: typingsJapgolly.highcharts.modulesSonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
  ): EarconInstrument = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], playOptions = playOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconInstrument]
  }
  
  extension [Self <: EarconInstrument](x: Self) {
    
    inline def setInstrument(
      value: String | typingsJapgolly.highcharts.modulesSonificationMod.highchartsAugmentingMod.Instrument
    ): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    inline def setPlayOptions(
      value: typingsJapgolly.highcharts.modulesSonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
    ): Self = StObject.set(x, "playOptions", value.asInstanceOf[js.Any])
  }
}
