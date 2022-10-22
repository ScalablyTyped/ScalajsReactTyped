package typingsJapgolly.nivoSlider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoSlider.nivoSliderStrings.sliceDown
    - typingsJapgolly.nivoSlider.nivoSliderStrings.sliceDownLeft
    - typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUp
    - typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpLeft
    - typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpDown
    - typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpDownLeft
    - typingsJapgolly.nivoSlider.nivoSliderStrings.fold
    - typingsJapgolly.nivoSlider.nivoSliderStrings.fade
    - typingsJapgolly.nivoSlider.nivoSliderStrings.random
    - typingsJapgolly.nivoSlider.nivoSliderStrings.slideInRight
    - typingsJapgolly.nivoSlider.nivoSliderStrings.slideInLeft
    - typingsJapgolly.nivoSlider.nivoSliderStrings.boxRandom
    - typingsJapgolly.nivoSlider.nivoSliderStrings.boxRain
    - typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainReverse
    - typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainGrow
    - typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainGrowReverse
  */
  trait EffectType extends StObject
  object EffectType {
    
    inline def boxRain: typingsJapgolly.nivoSlider.nivoSliderStrings.boxRain = "boxRain".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.boxRain]
    
    inline def boxRainGrow: typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainGrow = "boxRainGrow".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainGrow]
    
    inline def boxRainGrowReverse: typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainGrowReverse = "boxRainGrowReverse".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainGrowReverse]
    
    inline def boxRainReverse: typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainReverse = "boxRainReverse".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.boxRainReverse]
    
    inline def boxRandom: typingsJapgolly.nivoSlider.nivoSliderStrings.boxRandom = "boxRandom".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.boxRandom]
    
    inline def fade: typingsJapgolly.nivoSlider.nivoSliderStrings.fade = "fade".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.fade]
    
    inline def fold: typingsJapgolly.nivoSlider.nivoSliderStrings.fold = "fold".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.fold]
    
    inline def random: typingsJapgolly.nivoSlider.nivoSliderStrings.random = "random".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.random]
    
    inline def sliceDown: typingsJapgolly.nivoSlider.nivoSliderStrings.sliceDown = "sliceDown".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.sliceDown]
    
    inline def sliceDownLeft: typingsJapgolly.nivoSlider.nivoSliderStrings.sliceDownLeft = "sliceDownLeft".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.sliceDownLeft]
    
    inline def sliceUp: typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUp = "sliceUp".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUp]
    
    inline def sliceUpDown: typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpDown = "sliceUpDown".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpDown]
    
    inline def sliceUpDownLeft: typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpDownLeft = "sliceUpDownLeft".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpDownLeft]
    
    inline def sliceUpLeft: typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpLeft = "sliceUpLeft".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.sliceUpLeft]
    
    inline def slideInLeft: typingsJapgolly.nivoSlider.nivoSliderStrings.slideInLeft = "slideInLeft".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.slideInLeft]
    
    inline def slideInRight: typingsJapgolly.nivoSlider.nivoSliderStrings.slideInRight = "slideInRight".asInstanceOf[typingsJapgolly.nivoSlider.nivoSliderStrings.slideInRight]
  }
  
  trait Options extends StObject {
    
    var afterChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var animSpeed: js.UndefOr[Double] = js.undefined
    
    var beforeChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var boxCols: js.UndefOr[Double] = js.undefined
    
    var boxRows: js.UndefOr[Double] = js.undefined
    
    var controlNav: js.UndefOr[Boolean] = js.undefined
    
    var controlNavThumbs: js.UndefOr[Boolean] = js.undefined
    
    var directionNav: js.UndefOr[Boolean] = js.undefined
    
    var effect: js.UndefOr[EffectType] = js.undefined
    
    var lastSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var manualAdvance: js.UndefOr[Boolean] = js.undefined
    
    var nextText: js.UndefOr[String] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    var pauseTime: js.UndefOr[Double] = js.undefined
    
    var prevText: js.UndefOr[String] = js.undefined
    
    var randomStart: js.UndefOr[Boolean] = js.undefined
    
    var slices: js.UndefOr[Double] = js.undefined
    
    var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var startSlide: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfterChange(value: Callback): Self = StObject.set(x, "afterChange", value.toJsFn)
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setAfterLoad(value: Callback): Self = StObject.set(x, "afterLoad", value.toJsFn)
      
      inline def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
      inline def setAnimSpeed(value: Double): Self = StObject.set(x, "animSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimSpeedUndefined: Self = StObject.set(x, "animSpeed", js.undefined)
      
      inline def setBeforeChange(value: Callback): Self = StObject.set(x, "beforeChange", value.toJsFn)
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setBoxCols(value: Double): Self = StObject.set(x, "boxCols", value.asInstanceOf[js.Any])
      
      inline def setBoxColsUndefined: Self = StObject.set(x, "boxCols", js.undefined)
      
      inline def setBoxRows(value: Double): Self = StObject.set(x, "boxRows", value.asInstanceOf[js.Any])
      
      inline def setBoxRowsUndefined: Self = StObject.set(x, "boxRows", js.undefined)
      
      inline def setControlNav(value: Boolean): Self = StObject.set(x, "controlNav", value.asInstanceOf[js.Any])
      
      inline def setControlNavThumbs(value: Boolean): Self = StObject.set(x, "controlNavThumbs", value.asInstanceOf[js.Any])
      
      inline def setControlNavThumbsUndefined: Self = StObject.set(x, "controlNavThumbs", js.undefined)
      
      inline def setControlNavUndefined: Self = StObject.set(x, "controlNav", js.undefined)
      
      inline def setDirectionNav(value: Boolean): Self = StObject.set(x, "directionNav", value.asInstanceOf[js.Any])
      
      inline def setDirectionNavUndefined: Self = StObject.set(x, "directionNav", js.undefined)
      
      inline def setEffect(value: EffectType): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setLastSlide(value: Callback): Self = StObject.set(x, "lastSlide", value.toJsFn)
      
      inline def setLastSlideUndefined: Self = StObject.set(x, "lastSlide", js.undefined)
      
      inline def setManualAdvance(value: Boolean): Self = StObject.set(x, "manualAdvance", value.asInstanceOf[js.Any])
      
      inline def setManualAdvanceUndefined: Self = StObject.set(x, "manualAdvance", js.undefined)
      
      inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setPauseTime(value: Double): Self = StObject.set(x, "pauseTime", value.asInstanceOf[js.Any])
      
      inline def setPauseTimeUndefined: Self = StObject.set(x, "pauseTime", js.undefined)
      
      inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      inline def setRandomStart(value: Boolean): Self = StObject.set(x, "randomStart", value.asInstanceOf[js.Any])
      
      inline def setRandomStartUndefined: Self = StObject.set(x, "randomStart", js.undefined)
      
      inline def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
      
      inline def setSlideshowEnd(value: Callback): Self = StObject.set(x, "slideshowEnd", value.toJsFn)
      
      inline def setSlideshowEndUndefined: Self = StObject.set(x, "slideshowEnd", js.undefined)
      
      inline def setStartSlide(value: Double): Self = StObject.set(x, "startSlide", value.asInstanceOf[js.Any])
      
      inline def setStartSlideUndefined: Self = StObject.set(x, "startSlide", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def nivoSlider(): JQuery = js.native
      def nivoSlider(options: Options): JQuery = js.native
    }
  }
}
