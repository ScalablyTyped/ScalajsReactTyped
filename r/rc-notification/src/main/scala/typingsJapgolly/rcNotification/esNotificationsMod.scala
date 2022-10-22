package typingsJapgolly.rcNotification

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcNotification.esNoticeMod.NoticeConfig
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationsMod extends Shortcut {
  
  @JSImport("rc-notification/es/Notifications", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[NotificationsProps & RefAttributes[NotificationsRef]] = js.native
  
  trait NotificationsProps extends StObject {
    
    var className: js.UndefOr[js.Function1[/* placement */ Placement, String]] = js.undefined
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.undefined
    
    var onAllRemoved: js.UndefOr[VoidFunction] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Function1[/* placement */ Placement, CSSProperties]] = js.undefined
  }
  object NotificationsProps {
    
    inline def apply(): NotificationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsProps]
    }
    
    extension [Self <: NotificationsProps](x: Self) {
      
      inline def setClassName(value: /* placement */ Placement => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setMotion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionFunction1(value: /* placement */ Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnAllRemoved(value: Callback): Self = StObject.set(x, "onAllRemoved", value.toJsFn)
      
      inline def setOnAllRemovedUndefined: Self = StObject.set(x, "onAllRemoved", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: /* placement */ Placement => CSSProperties): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait NotificationsRef extends StObject {
    
    def close(key: Key): Unit
    
    def destroy(): Unit
    
    def open(config: OpenConfig): Unit
  }
  object NotificationsRef {
    
    inline def apply(close: Key => Callback, destroy: Callback, open: OpenConfig => Callback): NotificationsRef = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: Key) => close(t0).runNow()), destroy = destroy.toJsFn, open = js.Any.fromFunction1((t0: OpenConfig) => open(t0).runNow()))
      __obj.asInstanceOf[NotificationsRef]
    }
    
    extension [Self <: NotificationsRef](x: Self) {
      
      inline def setClose(value: Key => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: Key) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setOpen(value: OpenConfig => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: OpenConfig) => value(t0).runNow()))
    }
  }
  
  trait OpenConfig
    extends StObject
       with NoticeConfig {
    
    var key: Key
    
    var placement: js.UndefOr[Placement] = js.undefined
  }
  object OpenConfig {
    
    inline def apply(key: Key): OpenConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenConfig]
    }
    
    extension [Self <: OpenConfig](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcNotification.rcNotificationStrings.top
    - typingsJapgolly.rcNotification.rcNotificationStrings.topLeft
    - typingsJapgolly.rcNotification.rcNotificationStrings.topRight
    - typingsJapgolly.rcNotification.rcNotificationStrings.bottom
    - typingsJapgolly.rcNotification.rcNotificationStrings.bottomLeft
    - typingsJapgolly.rcNotification.rcNotificationStrings.bottomRight
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typingsJapgolly.rcNotification.rcNotificationStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.rcNotification.rcNotificationStrings.bottom]
    
    inline def bottomLeft: typingsJapgolly.rcNotification.rcNotificationStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.rcNotification.rcNotificationStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.rcNotification.rcNotificationStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.rcNotification.rcNotificationStrings.bottomRight]
    
    inline def top: typingsJapgolly.rcNotification.rcNotificationStrings.top = "top".asInstanceOf[typingsJapgolly.rcNotification.rcNotificationStrings.top]
    
    inline def topLeft: typingsJapgolly.rcNotification.rcNotificationStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.rcNotification.rcNotificationStrings.topLeft]
    
    inline def topRight: typingsJapgolly.rcNotification.rcNotificationStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.rcNotification.rcNotificationStrings.topRight]
  }
  
  type _To = ForwardRefExoticComponent[NotificationsProps & RefAttributes[NotificationsRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esNotificationsMod.foo` */
  override def _to: ForwardRefExoticComponent[NotificationsProps & RefAttributes[NotificationsRef]] = default
}
