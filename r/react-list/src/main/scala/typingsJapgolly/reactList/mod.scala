package typingsJapgolly.reactList

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactList.reactListStrings.x
import typingsJapgolly.reactList.reactListStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-list", JSImport.Namespace)
  @js.native
  open class ^ () extends ReactList
  
  type ItemRenderer = js.Function2[/* index */ Double, /* key */ Double | String, Element]
  
  type ItemSizeEstimator = js.Function2[/* index */ Double, /* cache */ js.Object, Double]
  
  type ItemSizeGetter = js.Function1[/* index */ Double, Double]
  
  type ItemsRenderer = js.Function2[/* items */ js.Array[Element], /* ref */ String, Element]
  
  @js.native
  trait ReactList
    extends Component[ReactListProps, js.Object, Any] {
    
    def getVisibleRange(): js.Array[Double] = js.native
    
    def scrollAround(index: Double): Unit = js.native
    
    def scrollTo(index: Double): Unit = js.native
  }
  
  trait ReactListProps extends StObject {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var itemRenderer: js.UndefOr[ItemRenderer] = js.undefined
    
    var itemSizeEstimator: js.UndefOr[ItemSizeEstimator] = js.undefined
    
    var itemSizeGetter: js.UndefOr[ItemSizeGetter] = js.undefined
    
    var itemsRenderer: js.UndefOr[ItemsRenderer] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ReactList]] = js.undefined
    
    var scrollParentGetter: js.UndefOr[ScrollParentGetter] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var useStaticSize: js.UndefOr[Boolean] = js.undefined
    
    var useTranslate3d: js.UndefOr[Boolean] = js.undefined
  }
  object ReactListProps {
    
    inline def apply(): ReactListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactListProps]
    }
    
    extension [Self <: ReactListProps](x: Self) {
      
      inline def setAxis(value: typingsJapgolly.reactList.reactListStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setItemRenderer(value: (/* index */ Double, /* key */ Double | String) => Element): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction2(value))
      
      inline def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
      
      inline def setItemSizeEstimator(value: (/* index */ Double, /* cache */ js.Object) => Double): Self = StObject.set(x, "itemSizeEstimator", js.Any.fromFunction2(value))
      
      inline def setItemSizeEstimatorUndefined: Self = StObject.set(x, "itemSizeEstimator", js.undefined)
      
      inline def setItemSizeGetter(value: /* index */ Double => Double): Self = StObject.set(x, "itemSizeGetter", js.Any.fromFunction1(value))
      
      inline def setItemSizeGetterUndefined: Self = StObject.set(x, "itemSizeGetter", js.undefined)
      
      inline def setItemsRenderer(value: (/* items */ js.Array[Element], /* ref */ String) => Element): Self = StObject.set(x, "itemsRenderer", js.Any.fromFunction2(value))
      
      inline def setItemsRendererUndefined: Self = StObject.set(x, "itemsRenderer", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRef(value: LegacyRef[ReactList]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: ReactList | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ReactList | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setScrollParentGetter(value: CallbackTo[Element]): Self = StObject.set(x, "scrollParentGetter", value.toJsFn)
      
      inline def setScrollParentGetterUndefined: Self = StObject.set(x, "scrollParentGetter", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseStaticSize(value: Boolean): Self = StObject.set(x, "useStaticSize", value.asInstanceOf[js.Any])
      
      inline def setUseStaticSizeUndefined: Self = StObject.set(x, "useStaticSize", js.undefined)
      
      inline def setUseTranslate3d(value: Boolean): Self = StObject.set(x, "useTranslate3d", value.asInstanceOf[js.Any])
      
      inline def setUseTranslate3dUndefined: Self = StObject.set(x, "useTranslate3d", js.undefined)
    }
  }
  
  type ScrollParentGetter = js.Function0[Element]
}
