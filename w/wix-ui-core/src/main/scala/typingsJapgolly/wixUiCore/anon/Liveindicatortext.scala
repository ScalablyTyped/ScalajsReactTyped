package typingsJapgolly.wixUiCore.anon

import typingsJapgolly.wixUiCore.wixUiCoreStrings.Live
import typingsJapgolly.wixUiCore.wixUiCoreStrings.`Live Ended`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Liveindicatortext extends StObject {
  
  def `live-indicator-text`(hasIsEnded: IsEnded): Live | (`Live Ended`)
  
  var `logo-tooltip`: String
  
  var `mute-control-tooltip`: String
}
object Liveindicatortext {
  
  inline def apply(
    `live-indicator-text`: IsEnded => Live | (`Live Ended`),
    `logo-tooltip`: String,
    `mute-control-tooltip`: String
  ): Liveindicatortext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("live-indicator-text")(js.Any.fromFunction1(`live-indicator-text`))
    __obj.updateDynamic("logo-tooltip")(`logo-tooltip`.asInstanceOf[js.Any])
    __obj.updateDynamic("mute-control-tooltip")(`mute-control-tooltip`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Liveindicatortext]
  }
  
  extension [Self <: Liveindicatortext](x: Self) {
    
    inline def `setLive-indicator-text`(value: IsEnded => Live | (`Live Ended`)): Self = StObject.set(x, "live-indicator-text", js.Any.fromFunction1(value))
    
    inline def `setLogo-tooltip`(value: String): Self = StObject.set(x, "logo-tooltip", value.asInstanceOf[js.Any])
    
    inline def `setMute-control-tooltip`(value: String): Self = StObject.set(x, "mute-control-tooltip", value.asInstanceOf[js.Any])
  }
}
