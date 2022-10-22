package typingsJapgolly.ionicCore

import org.scalajs.dom.UIEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonContentElement
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.GestureDetail
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsContentContentInterfaceMod {
  
  @js.native
  trait ScrollBaseCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ScrollBaseCustomEvent: ScrollBaseDetail = js.native
    
    @JSName("target")
    var target_ScrollBaseCustomEvent: HTMLIonContentElement = js.native
  }
  
  trait ScrollBaseDetail extends StObject {
    
    var isScrolling: Boolean
  }
  object ScrollBaseDetail {
    
    inline def apply(isScrolling: Boolean): ScrollBaseDetail = {
      val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBaseDetail]
    }
    
    extension [Self <: ScrollBaseDetail](x: Self) {
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollCallback = js.Function1[/* detail */ js.UndefOr[ScrollDetail], Boolean | Unit]
  
  @js.native
  trait ScrollCustomEvent
    extends StObject
       with ScrollBaseCustomEvent {
    
    @JSName("detail")
    var detail_ScrollCustomEvent: ScrollDetail = js.native
  }
  
  trait ScrollDetail
    extends StObject
       with GestureDetail
       with ScrollBaseDetail {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object ScrollDetail {
    
    inline def apply(
      currentTime: Double,
      currentX: Double,
      currentY: Double,
      deltaX: Double,
      deltaY: Double,
      event: UIEvent,
      isScrolling: Boolean,
      scrollLeft: Double,
      scrollTop: Double,
      startTime: Double,
      startX: Double,
      startY: Double,
      `type`: String,
      velocityX: Double,
      velocityY: Double
    ): ScrollDetail = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollDetail]
    }
    
    extension [Self <: ScrollDetail](x: Self) {
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
}
