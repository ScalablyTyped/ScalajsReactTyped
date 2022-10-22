package typingsJapgolly.gliderJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.gliderJs.gliderJsStrings.arrow
import typingsJapgolly.gliderJs.gliderJsStrings.dot
import typingsJapgolly.gliderJs.gliderJsStrings.slide
import typingsJapgolly.gliderJs.mod.Arrow
import typingsJapgolly.gliderJs.mod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Next extends StObject {
    
    var next: js.UndefOr[Arrow] = js.undefined
    
    var prev: js.UndefOr[Arrow] = js.undefined
  }
  object Next {
    
    inline def apply(): Next = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: Arrow): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: Arrow): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
  
  trait Prev extends StObject {
    
    var next: Selector | Null
    
    var prev: Selector | Null
  }
  object Prev {
    
    inline def apply(): Prev = {
      val __obj = js.Dynamic.literal(next = null, prev = null)
      __obj.asInstanceOf[Prev]
    }
    
    extension [Self <: Prev](x: Self) {
      
      inline def setNext(value: Selector): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: Selector): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
  
  trait Scroll extends StObject {
    
    def scroll(): Unit
  }
  object Scroll {
    
    inline def apply(scroll: Callback): Scroll = {
      val __obj = js.Dynamic.literal(scroll = scroll.toJsFn)
      __obj.asInstanceOf[Scroll]
    }
    
    extension [Self <: Scroll](x: Self) {
      
      inline def setScroll(value: Callback): Self = StObject.set(x, "scroll", value.toJsFn)
    }
  }
  
  trait Slide extends StObject {
    
    var slide: Double
  }
  object Slide {
    
    inline def apply(slide: Double): Slide = {
      val __obj = js.Dynamic.literal(slide = slide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slide]
    }
    
    extension [Self <: Slide](x: Self) {
      
      inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: arrow | dot | slide
    
    var value: String | Double
  }
  object Type {
    
    inline def apply(`type`: arrow | dot | slide, value: String | Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: arrow | dot | slide): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
