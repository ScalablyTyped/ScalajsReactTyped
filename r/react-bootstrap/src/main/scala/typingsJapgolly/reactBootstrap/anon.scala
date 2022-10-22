package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.click
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.keydown
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.rootClose
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveIndex extends StObject {
    
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var defaultActiveIndex: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var indicators: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double | Null] = js.undefined
    
    var nextIcon: js.UndefOr[Node] = js.undefined
    
    var onSelect: js.UndefOr[SelectCallback] = js.undefined
    
    // TODO: Add more specific type
    var onSlideEnd: js.UndefOr[js.Function] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    var prevIcon: js.UndefOr[Node] = js.undefined
    
    var slide: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object ActiveIndex {
    
    inline def apply(): ActiveIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveIndex]
    }
    
    extension [Self <: ActiveIndex](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDefaultActiveIndex(value: Double): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalNull: Self = StObject.set(x, "interval", null)
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setNextIcon(value: VdomNode): Self = StObject.set(x, "nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSlideEnd(value: js.Function): Self = StObject.set(x, "onSlideEnd", value.asInstanceOf[js.Any])
      
      inline def setOnSlideEndUndefined: Self = StObject.set(x, "onSlideEnd", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setPrevIcon(value: VdomNode): Self = StObject.set(x, "prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSlide(value: Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait BsClass extends StObject {
    
    var bsClass: js.UndefOr[Any] = js.undefined
  }
  object BsClass {
    
    inline def apply(): BsClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BsClass]
    }
    
    extension [Self <: BsClass](x: Self) {
      
      inline def setBsClass(value: Any): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
  
  trait Source extends StObject {
    
    var source: select | click | rootClose | keydown
  }
  object Source {
    
    inline def apply(source: select | click | rootClose | keydown): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: select | click | rootClose | keydown): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
