package typingsJapgolly.reactScrollableAnchor

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrollable-anchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-scrollable-anchor", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScrollableAnchorProps, js.Object, Any]
  
  inline def configureAnchors(options: ConfigureAnchorsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureAnchors")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goToAnchor(anchorId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToAnchor")(anchorId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def goToAnchor(anchorId: String, saveHashUpdate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goToAnchor")(anchorId.asInstanceOf[js.Any], saveHashUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def goToTop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToTop")().asInstanceOf[Unit]
  
  inline def removeHash(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHash")().asInstanceOf[Unit]
  
  trait ConfigureAnchorsOptions extends StObject {
    
    var keepLastAnchorHash: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var scrollDuration: js.UndefOr[Double] = js.undefined
  }
  object ConfigureAnchorsOptions {
    
    inline def apply(): ConfigureAnchorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureAnchorsOptions]
    }
    
    extension [Self <: ConfigureAnchorsOptions](x: Self) {
      
      inline def setKeepLastAnchorHash(value: Boolean): Self = StObject.set(x, "keepLastAnchorHash", value.asInstanceOf[js.Any])
      
      inline def setKeepLastAnchorHashUndefined: Self = StObject.set(x, "keepLastAnchorHash", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
    }
  }
  
  type ScrollableAnchor = japgolly.scalajs.react.facade.React.Component[ScrollableAnchorProps & js.Object, js.Object]
  
  trait ScrollableAnchorProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var id: String
  }
  object ScrollableAnchorProps {
    
    inline def apply(id: String): ScrollableAnchorProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollableAnchorProps]
    }
    
    extension [Self <: ScrollableAnchorProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
