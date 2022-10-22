package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.DataHookString
import typingsJapgolly.wixStyleReact.anon.`4`
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDraggableDotdriverMod {
  
  trait DraggableDriver
    extends StObject
       with BaseDriver {
    
    def beginDrag(details: DataHookString): Unit
    
    def dragOver(details: DataHookString): Unit
    
    def endDrag(details: `4`): Unit
  }
  object DraggableDriver {
    
    inline def apply(
      beginDrag: DataHookString => Callback,
      dragOver: DataHookString => Callback,
      endDrag: `4` => Callback,
      exists: CallbackTo[Boolean]
    ): DraggableDriver = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1((t0: DataHookString) => beginDrag(t0).runNow()), dragOver = js.Any.fromFunction1((t0: DataHookString) => dragOver(t0).runNow()), endDrag = js.Any.fromFunction1((t0: `4`) => endDrag(t0).runNow()), exists = exists.toJsFn)
      __obj.asInstanceOf[DraggableDriver]
    }
    
    extension [Self <: DraggableDriver](x: Self) {
      
      inline def setBeginDrag(value: DataHookString => Callback): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1((t0: DataHookString) => value(t0).runNow()))
      
      inline def setDragOver(value: DataHookString => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction1((t0: DataHookString) => value(t0).runNow()))
      
      inline def setEndDrag(value: `4` => Callback): Self = StObject.set(x, "endDrag", js.Any.fromFunction1((t0: `4`) => value(t0).runNow()))
    }
  }
}
