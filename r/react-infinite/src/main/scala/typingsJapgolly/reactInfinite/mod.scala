package typingsJapgolly.reactInfinite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[InfiniteProps, js.Object, Any]
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def containerHeightScaleFactor(n: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("containerHeightScaleFactor")(n.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type Infinite = japgolly.scalajs.react.facade.React.Component[InfiniteProps & js.Object, js.Object]
  
  trait InfiniteProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerHeight: js.UndefOr[Double] = js.undefined
    
    var displayBottomUpwards: js.UndefOr[Boolean] = js.undefined
    
    var elementHeight: Double | js.Array[Double]
    
    var handleScroll: js.UndefOr[js.Function1[/* node */ Element, Unit]] = js.undefined
    
    var infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.undefined
    
    var infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.undefined
    
    var isInfiniteLoading: js.UndefOr[Boolean] = js.undefined
    
    var loadingSpinnerDelegate: js.UndefOr[Element] = js.undefined
    
    var onInfiniteLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preloadAdditionalHeight: js.UndefOr[Double | js.Object] = js.undefined
    
    var preloadBatchSize: js.UndefOr[Double | js.Object] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[InfiniteProps & js.Object, js.Object]
        ]
      ] = js.undefined
    
    var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.undefined
    
    var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  }
  object InfiniteProps {
    
    inline def apply(elementHeight: Double | js.Array[Double]): InfiniteProps = {
      val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfiniteProps]
    }
    
    extension [Self <: InfiniteProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContainerHeightUndefined: Self = StObject.set(x, "containerHeight", js.undefined)
      
      inline def setDisplayBottomUpwards(value: Boolean): Self = StObject.set(x, "displayBottomUpwards", value.asInstanceOf[js.Any])
      
      inline def setDisplayBottomUpwardsUndefined: Self = StObject.set(x, "displayBottomUpwards", js.undefined)
      
      inline def setElementHeight(value: Double | js.Array[Double]): Self = StObject.set(x, "elementHeight", value.asInstanceOf[js.Any])
      
      inline def setElementHeightVarargs(value: Double*): Self = StObject.set(x, "elementHeight", js.Array(value*))
      
      inline def setHandleScroll(value: /* node */ Element => Callback): Self = StObject.set(x, "handleScroll", js.Any.fromFunction1((t0: /* node */ Element) => value(t0).runNow()))
      
      inline def setHandleScrollUndefined: Self = StObject.set(x, "handleScroll", js.undefined)
      
      inline def setInfiniteLoadBeginBottomOffset(value: Double): Self = StObject.set(x, "infiniteLoadBeginBottomOffset", value.asInstanceOf[js.Any])
      
      inline def setInfiniteLoadBeginBottomOffsetUndefined: Self = StObject.set(x, "infiniteLoadBeginBottomOffset", js.undefined)
      
      inline def setInfiniteLoadBeginEdgeOffset(value: Double): Self = StObject.set(x, "infiniteLoadBeginEdgeOffset", value.asInstanceOf[js.Any])
      
      inline def setInfiniteLoadBeginEdgeOffsetUndefined: Self = StObject.set(x, "infiniteLoadBeginEdgeOffset", js.undefined)
      
      inline def setIsInfiniteLoading(value: Boolean): Self = StObject.set(x, "isInfiniteLoading", value.asInstanceOf[js.Any])
      
      inline def setIsInfiniteLoadingUndefined: Self = StObject.set(x, "isInfiniteLoading", js.undefined)
      
      inline def setLoadingSpinnerDelegate(value: VdomElement): Self = StObject.set(x, "loadingSpinnerDelegate", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoadingSpinnerDelegateUndefined: Self = StObject.set(x, "loadingSpinnerDelegate", js.undefined)
      
      inline def setOnInfiniteLoad(value: Callback): Self = StObject.set(x, "onInfiniteLoad", value.toJsFn)
      
      inline def setOnInfiniteLoadUndefined: Self = StObject.set(x, "onInfiniteLoad", js.undefined)
      
      inline def setPreloadAdditionalHeight(value: Double | js.Object): Self = StObject.set(x, "preloadAdditionalHeight", value.asInstanceOf[js.Any])
      
      inline def setPreloadAdditionalHeightUndefined: Self = StObject.set(x, "preloadAdditionalHeight", js.undefined)
      
      inline def setPreloadBatchSize(value: Double | js.Object): Self = StObject.set(x, "preloadBatchSize", value.asInstanceOf[js.Any])
      
      inline def setPreloadBatchSizeUndefined: Self = StObject.set(x, "preloadBatchSize", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[InfiniteProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[InfiniteProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[InfiniteProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTimeScrollStateLastsForAfterUserScrolls(value: Double): Self = StObject.set(x, "timeScrollStateLastsForAfterUserScrolls", value.asInstanceOf[js.Any])
      
      inline def setTimeScrollStateLastsForAfterUserScrollsUndefined: Self = StObject.set(x, "timeScrollStateLastsForAfterUserScrolls", js.undefined)
      
      inline def setUseWindowAsScrollContainer(value: Boolean): Self = StObject.set(x, "useWindowAsScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setUseWindowAsScrollContainerUndefined: Self = StObject.set(x, "useWindowAsScrollContainer", js.undefined)
    }
  }
}
