package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.leading
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  def highlight(): Unit
  
  def unhighlight(): Unit
  
  def updateProps(select: leading | trailing, newProps: Any): Unit
}
object Highlight {
  
  inline def apply(highlight: Callback, unhighlight: Callback, updateProps: (leading | trailing, Any) => Callback): Highlight = {
    val __obj = js.Dynamic.literal(highlight = highlight.toJsFn, unhighlight = unhighlight.toJsFn, updateProps = js.Any.fromFunction2((t0: leading | trailing, t1: Any) => (updateProps(t0, t1)).runNow()))
    __obj.asInstanceOf[Highlight]
  }
  
  extension [Self <: Highlight](x: Self) {
    
    inline def setHighlight(value: Callback): Self = StObject.set(x, "highlight", value.toJsFn)
    
    inline def setUnhighlight(value: Callback): Self = StObject.set(x, "unhighlight", value.toJsFn)
    
    inline def setUpdateProps(value: (leading | trailing, Any) => Callback): Self = StObject.set(x, "updateProps", js.Any.fromFunction2((t0: leading | trailing, t1: Any) => (value(t0, t1)).runNow()))
  }
}
