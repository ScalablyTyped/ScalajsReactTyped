package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcVirtualList.anon.Style
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type GetKey[T] = js.Function1[/* item */ T, Key]
  
  type RenderFunc[T] = js.Function3[/* item */ T, /* index */ Double, /* props */ Style, Node]
  
  trait SharedConfig[T] extends StObject {
    
    def getKey(item: T): Key
  }
  object SharedConfig {
    
    inline def apply[T](getKey: T => Key): SharedConfig[T] = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey))
      __obj.asInstanceOf[SharedConfig[T]]
    }
    
    extension [Self <: SharedConfig[?], T](x: Self & SharedConfig[T]) {
      
      inline def setGetKey(value: T => Key): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    }
  }
}
