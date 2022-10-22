package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.DataHookString
import typingsJapgolly.wixStyleReact.anon.`4`
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDraggableDotuniDotdriverMod {
  
  trait DraggableUniDriver
    extends StObject
       with BaseUniDriver {
    
    def beginDrag(details: DataHookString): js.Promise[Unit]
    
    def dragOver(details: DataHookString): js.Promise[Unit]
    
    def endDrag(details: `4`): js.Promise[Unit]
  }
  object DraggableUniDriver {
    
    inline def apply(
      beginDrag: DataHookString => js.Promise[Unit],
      click: CallbackTo[js.Promise[Unit]],
      dragOver: DataHookString => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      endDrag: `4` => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]]
    ): DraggableUniDriver = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1(beginDrag), click = click.toJsFn, dragOver = js.Any.fromFunction1(dragOver), element = element.toJsFn, endDrag = js.Any.fromFunction1(endDrag), exists = exists.toJsFn)
      __obj.asInstanceOf[DraggableUniDriver]
    }
    
    extension [Self <: DraggableUniDriver](x: Self) {
      
      inline def setBeginDrag(value: DataHookString => js.Promise[Unit]): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1(value))
      
      inline def setDragOver(value: DataHookString => js.Promise[Unit]): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
      
      inline def setEndDrag(value: `4` => js.Promise[Unit]): Self = StObject.set(x, "endDrag", js.Any.fromFunction1(value))
    }
  }
}
