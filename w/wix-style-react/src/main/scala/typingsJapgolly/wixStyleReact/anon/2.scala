package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def onClick(): Unit
}
object `2` {
  
  inline def apply(onClick: Callback): `2` = {
    val __obj = js.Dynamic.literal(onClick = onClick.toJsFn)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
  }
}
