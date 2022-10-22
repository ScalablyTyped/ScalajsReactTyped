package typingsJapgolly.rcSlider

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  type AriaValueFormat = js.Function1[/* value */ Double, String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcSlider.rcSliderStrings.rtl
    - typingsJapgolly.rcSlider.rcSliderStrings.ltr
    - typingsJapgolly.rcSlider.rcSliderStrings.ttb
    - typingsJapgolly.rcSlider.rcSliderStrings.btt
  */
  trait Direction extends StObject
  object Direction {
    
    inline def btt: typingsJapgolly.rcSlider.rcSliderStrings.btt = "btt".asInstanceOf[typingsJapgolly.rcSlider.rcSliderStrings.btt]
    
    inline def ltr: typingsJapgolly.rcSlider.rcSliderStrings.ltr = "ltr".asInstanceOf[typingsJapgolly.rcSlider.rcSliderStrings.ltr]
    
    inline def rtl: typingsJapgolly.rcSlider.rcSliderStrings.rtl = "rtl".asInstanceOf[typingsJapgolly.rcSlider.rcSliderStrings.rtl]
    
    inline def ttb: typingsJapgolly.rcSlider.rcSliderStrings.ttb = "ttb".asInstanceOf[typingsJapgolly.rcSlider.rcSliderStrings.ttb]
  }
  
  type OnStartMove = js.Function2[
    /* e */ ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element], 
    /* valueIndex */ Double, 
    Unit
  ]
}
