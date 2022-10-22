package typingsJapgolly.afUtilsReactVirtualHeadless

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@af-utils/react-virtual-headless", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "EVT_ALL")
  @js.native
  val EVT_ALL: js.Array[EventType] = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "EVT_FROM")
  @js.native
  val EVT_FROM: /* 0 */ Double = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "EVT_SCROLL_SIZE")
  @js.native
  val EVT_SCROLL_SIZE: /* 2 */ Double = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "EVT_SIZES")
  @js.native
  val EVT_SIZES: /* 3 */ Double = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "EVT_TO")
  @js.native
  val EVT_TO: /* 1 */ Double = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "Subscription")
  @js.native
  val Subscription: FC[PropsWithChildren[SubscriptionProps]] = js.native
  
  inline def mapVisibleRange(model: Model, callback: js.Function2[/* from */ Double, /* delta */ js.UndefOr[Double], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapVisibleRange")(model.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapVisibleRange(
    model: Model,
    callback: js.Function2[/* from */ Double, /* delta */ js.UndefOr[Double], Unit],
    countOffset: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapVisibleRange")(model.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], countOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useComponentSubscription(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useComponentSubscription")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useComponentSubscription(model: Model, events: js.Array[EventType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useComponentSubscription")(model.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useOnce[T /* <: Node */](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnce")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useSubscription(model: Model, events: js.Array[EventType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(model.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useSubscription(model: Model, events: js.Array[EventType], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(model.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@af-utils/react-virtual-headless", "useVirtual")
  @js.native
  val useVirtual: VirtualModelFunction = js.native
  
  @JSImport("@af-utils/react-virtual-headless", "useVirtualModel")
  @js.native
  val useVirtualModel: VirtualModelFunction = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`0`
    - typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`1`
    - typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`2`
    - typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`3`
  */
  trait EventType extends StObject
  object EventType {
    
    inline def `0`: typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`0` = 0.asInstanceOf[typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`0`]
    
    inline def `1`: typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`1` = 1.asInstanceOf[typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`1`]
    
    inline def `2`: typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`2` = 2.asInstanceOf[typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`2`]
    
    inline def `3`: typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`3` = 3.asInstanceOf[typingsJapgolly.afUtilsReactVirtualHeadless.afUtilsReactVirtualHeadlessInts.`3`]
  }
  
  @js.native
  trait Model
    extends StObject
       with ComponentClass[js.Object, js.Object] {
    
    def el(index: Double, node: Node): Unit = js.native
    
    val from: Double = js.native
    
    def getIndex(offset: Double): Double = js.native
    
    def getOffset(index: Double): Double = js.native
    
    def getSize(index: Double): Double = js.native
    
    val scrollSize: Double = js.native
    
    def scrollTo(index: Double, smooth: Boolean): Unit = js.native
    
    def setOuterNode(node: HTMLElement): Unit = js.native
    
    val to: Double = js.native
    
    val visibleFrom: Double = js.native
  }
  
  trait SubscriptionProps extends StObject {
    
    var events: js.UndefOr[js.Array[EventType]] = js.undefined
    
    var model: Model
  }
  object SubscriptionProps {
    
    inline def apply(model: Model): SubscriptionProps = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionProps]
    }
    
    extension [Self <: SubscriptionProps](x: Self) {
      
      inline def setEvents(value: js.Array[EventType]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: EventType*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * I've created a VirtualModelFunction type because useVirtual is a utility hook that calls (and returns) useVirtualModel.
    * Both hooks accept the same props and return a model.
    */
  type VirtualModelFunction = js.Function1[/* props */ js.UndefOr[useVirtualModelProps], Model]
  
  trait useVirtualModelProps extends StObject {
    
    var estimatedWidgetSize: js.UndefOr[Double] = js.undefined
    
    // getEstimatedItemSize is not marked explicitly optional in useVirtualModel, but model implmentation gives it a default, thus making it optional.
    var getEstimatedItemSize: js.UndefOr[
        js.Function3[
          /* itemSizes */ Double, 
          /* scrollSize */ Double, 
          /* newItemCount */ js.UndefOr[Double], 
          Double
        ]
      ] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var itemCount: js.UndefOr[Double] = js.undefined
    
    var overscanCount: js.UndefOr[Double] = js.undefined
  }
  object useVirtualModelProps {
    
    inline def apply(): useVirtualModelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[useVirtualModelProps]
    }
    
    extension [Self <: useVirtualModelProps](x: Self) {
      
      inline def setEstimatedWidgetSize(value: Double): Self = StObject.set(x, "estimatedWidgetSize", value.asInstanceOf[js.Any])
      
      inline def setEstimatedWidgetSizeUndefined: Self = StObject.set(x, "estimatedWidgetSize", js.undefined)
      
      inline def setGetEstimatedItemSize(
        value: (/* itemSizes */ Double, /* scrollSize */ Double, /* newItemCount */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "getEstimatedItemSize", js.Any.fromFunction3(value))
      
      inline def setGetEstimatedItemSizeUndefined: Self = StObject.set(x, "getEstimatedItemSize", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      inline def setOverscanCount(value: Double): Self = StObject.set(x, "overscanCount", value.asInstanceOf[js.Any])
      
      inline def setOverscanCountUndefined: Self = StObject.set(x, "overscanCount", js.undefined)
    }
  }
}
