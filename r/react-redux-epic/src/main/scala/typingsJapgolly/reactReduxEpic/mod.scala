package typingsJapgolly.reactReduxEpic

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reduxObservable.distTypesEpicMod.Epic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux-epic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToString(element: Element, wrappedEpic: Epic[Any, Any, Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any], wrappedEpic.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def wrapRootEpic[T /* <: Action */, S, D, O /* <: T */](epic: Epic[T, S, D, O]): Epic[T, S, D, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRootEpic")(epic.asInstanceOf[js.Any]).asInstanceOf[Epic[T, S, D, O]]
  
  trait Action extends StObject {
    
    var `type`: String
  }
  object Action {
    
    inline def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
