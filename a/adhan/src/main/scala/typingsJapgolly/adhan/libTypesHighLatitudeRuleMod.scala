package typingsJapgolly.adhan

import typingsJapgolly.adhan.adhanStrings.middleofthenight
import typingsJapgolly.adhan.adhanStrings.seventhofthenight
import typingsJapgolly.adhan.adhanStrings.twilightangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesHighLatitudeRuleMod {
  
  object default {
    
    @JSImport("adhan/lib/types/HighLatitudeRule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("adhan/lib/types/HighLatitudeRule", "default.MiddleOfTheNight")
    @js.native
    val MiddleOfTheNight: middleofthenight = js.native
    
    @JSImport("adhan/lib/types/HighLatitudeRule", "default.SeventhOfTheNight")
    @js.native
    val SeventhOfTheNight: seventhofthenight = js.native
    
    @JSImport("adhan/lib/types/HighLatitudeRule", "default.TwilightAngle")
    @js.native
    val TwilightAngle: twilightangle = js.native
    
    inline def recommended(coordinates: typingsJapgolly.adhan.libTypesCoordinatesMod.default): middleofthenight | seventhofthenight = ^.asInstanceOf[js.Dynamic].applyDynamic("recommended")(coordinates.asInstanceOf[js.Any]).asInstanceOf[middleofthenight | seventhofthenight]
  }
}
