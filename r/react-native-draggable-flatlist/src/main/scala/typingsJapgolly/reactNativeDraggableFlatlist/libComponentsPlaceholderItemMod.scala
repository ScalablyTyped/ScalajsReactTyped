package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.anon.Index
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.RenderPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPlaceholderItemMod {
  
  @JSImport("react-native-draggable-flatlist/lib/components/PlaceholderItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof PlaceholderItem` */
  inline def default[T](hasRenderPlaceholder: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRenderPlaceholder.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T] extends StObject {
    
    var renderPlaceholder: js.UndefOr[RenderPlaceholder[T]] = js.undefined
  }
  object Props {
    
    inline def apply[T](): Props[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
      inline def setRenderPlaceholder(value: /* params */ Index[T] => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
      
      inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    }
  }
}
