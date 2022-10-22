package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.scale0
import typingsJapgolly.baseui.baseuiStrings.scale100
import typingsJapgolly.baseui.baseuiStrings.scale1000
import typingsJapgolly.baseui.baseuiStrings.scale1200
import typingsJapgolly.baseui.baseuiStrings.scale1400
import typingsJapgolly.baseui.baseuiStrings.scale1600
import typingsJapgolly.baseui.baseuiStrings.scale200
import typingsJapgolly.baseui.baseuiStrings.scale2400
import typingsJapgolly.baseui.baseuiStrings.scale300
import typingsJapgolly.baseui.baseuiStrings.scale3200
import typingsJapgolly.baseui.baseuiStrings.scale400
import typingsJapgolly.baseui.baseuiStrings.scale4800
import typingsJapgolly.baseui.baseuiStrings.scale500
import typingsJapgolly.baseui.baseuiStrings.scale550
import typingsJapgolly.baseui.baseuiStrings.scale600
import typingsJapgolly.baseui.baseuiStrings.scale650
import typingsJapgolly.baseui.baseuiStrings.scale700
import typingsJapgolly.baseui.baseuiStrings.scale750
import typingsJapgolly.baseui.baseuiStrings.scale800
import typingsJapgolly.baseui.baseuiStrings.scale850
import typingsJapgolly.baseui.baseuiStrings.scale900
import typingsJapgolly.baseui.baseuiStrings.scale950
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $height :number,   $width :number} & baseui.baseui/spinner.SpinnerProps */
trait heightnumberwidthnumberSp extends StObject {
  
  /** Width of the progress indicator "stroke".  */
  @JSName("$borderWidth")
  var $borderWidth: js.UndefOr[
    Double | String | scale0 | scale100 | scale200 | scale300 | scale400 | scale500 | scale550 | scale600 | scale650 | scale700 | scale750 | scale800 | scale850 | scale900 | scale950 | scale1000 | scale1200 | scale1400 | scale1600 | scale2400 | scale3200 | scale4800 | typingsJapgolly.baseui.spinnerTypesMod.Size
  ] = js.undefined
  
  /** Color of progress indicator */
  @JSName("$color")
  var $color: js.UndefOr[String] = js.undefined
  
  @JSName("$height")
  var $height: Double
  
  /** Height/width of the box the indicator will appear in. */
  @JSName("$size")
  var $size: js.UndefOr[
    Double | String | scale0 | scale100 | scale200 | scale300 | scale400 | scale500 | scale550 | scale600 | scale650 | scale700 | scale750 | scale800 | scale850 | scale900 | scale950 | scale1000 | scale1200 | scale1400 | scale1600 | scale2400 | scale3200 | scale4800 | typingsJapgolly.baseui.spinnerTypesMod.Size
  ] = js.undefined
  
  @JSName("$width")
  var $width: Double
}
object heightnumberwidthnumberSp {
  
  inline def apply($height: Double, $width: Double): heightnumberwidthnumberSp = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[heightnumberwidthnumberSp]
  }
  
  extension [Self <: heightnumberwidthnumberSp](x: Self) {
    
    inline def set$borderWidth(
      value: Double | String | scale0 | scale100 | scale200 | scale300 | scale400 | scale500 | scale550 | scale600 | scale650 | scale700 | scale750 | scale800 | scale850 | scale900 | scale950 | scale1000 | scale1200 | scale1400 | scale1600 | scale2400 | scale3200 | scale4800 | typingsJapgolly.baseui.spinnerTypesMod.Size
    ): Self = StObject.set(x, "$borderWidth", value.asInstanceOf[js.Any])
    
    inline def set$borderWidthUndefined: Self = StObject.set(x, "$borderWidth", js.undefined)
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
    
    inline def set$height(value: Double): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$size(
      value: Double | String | scale0 | scale100 | scale200 | scale300 | scale400 | scale500 | scale550 | scale600 | scale650 | scale700 | scale750 | scale800 | scale850 | scale900 | scale950 | scale1000 | scale1200 | scale1400 | scale1600 | scale2400 | scale3200 | scale4800 | typingsJapgolly.baseui.spinnerTypesMod.Size
    ): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    inline def set$width(value: Double): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
  }
}
