package typingsJapgolly.reactTextMask

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    def onBlur(event: ReactFocusEventFrom[HTMLElement]): Unit
    
    def onChange(event: ReactEventFrom[HTMLElement]): Unit
  }
  object DefaultValue {
    
    inline def apply(
      onBlur: ReactFocusEventFrom[HTMLElement] => Callback,
      onChange: ReactEventFrom[HTMLElement] => Callback
    ): DefaultValue = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement]) => onBlur(t0).runNow()), onChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement]) => onChange(t0).runNow()))
      __obj.asInstanceOf[DefaultValue]
    }
    
    extension [Self <: DefaultValue](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnChange(value: ReactEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement]) => value(t0).runNow()))
    }
  }
  
  trait IndexesOfPipedChars extends StObject {
    
    var indexesOfPipedChars: js.Array[Double]
    
    var value: String
  }
  object IndexesOfPipedChars {
    
    inline def apply(indexesOfPipedChars: js.Array[Double], value: String): IndexesOfPipedChars = {
      val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexesOfPipedChars]
    }
    
    extension [Self <: IndexesOfPipedChars](x: Self) {
      
      inline def setIndexesOfPipedChars(value: js.Array[Double]): Self = StObject.set(x, "indexesOfPipedChars", value.asInstanceOf[js.Any])
      
      inline def setIndexesOfPipedCharsVarargs(value: Double*): Self = StObject.set(x, "indexesOfPipedChars", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SomeCharsRejected extends StObject {
    
    var someCharsRejected: Boolean
  }
  object SomeCharsRejected {
    
    inline def apply(someCharsRejected: Boolean): SomeCharsRejected = {
      val __obj = js.Dynamic.literal(someCharsRejected = someCharsRejected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SomeCharsRejected]
    }
    
    extension [Self <: SomeCharsRejected](x: Self) {
      
      inline def setSomeCharsRejected(value: Boolean): Self = StObject.set(x, "someCharsRejected", value.asInstanceOf[js.Any])
    }
  }
}
