package typingsJapgolly.ngxInfiniteScroll

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ngxInfiniteScroll.libNgxInfiniteScrollDotdirectiveMod.InfiniteScrollDirective
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollBooleans.`false`
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.`[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.alwaysCallback
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.fromRoot
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.horizontal
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.immediateCheck
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollContainer
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDisabled
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDistance
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollThrottle
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollUpDistance
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrollWindow
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolled
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolledUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysCallback extends StObject {
    
    var alwaysCallback: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.alwaysCallback
    
    var fromRoot: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.fromRoot
    
    var horizontal: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.horizontal
    
    var immediateCheck: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.immediateCheck
    
    var infiniteScrollContainer: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollContainer
    
    var infiniteScrollDisabled: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDisabled
    
    var infiniteScrollDistance: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollDistance
    
    var infiniteScrollThrottle: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollThrottle
    
    var infiniteScrollUpDistance: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.infiniteScrollUpDistance
    
    var scrollWindow: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrollWindow
  }
  object AlwaysCallback {
    
    inline def apply(): AlwaysCallback = {
      val __obj = js.Dynamic.literal(alwaysCallback = "alwaysCallback", fromRoot = "fromRoot", horizontal = "horizontal", immediateCheck = "immediateCheck", infiniteScrollContainer = "infiniteScrollContainer", infiniteScrollDisabled = "infiniteScrollDisabled", infiniteScrollDistance = "infiniteScrollDistance", infiniteScrollThrottle = "infiniteScrollThrottle", infiniteScrollUpDistance = "infiniteScrollUpDistance", scrollWindow = "scrollWindow")
      __obj.asInstanceOf[AlwaysCallback]
    }
    
    extension [Self <: AlwaysCallback](x: Self) {
      
      inline def setAlwaysCallback(value: alwaysCallback): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      inline def setFromRoot(value: fromRoot): Self = StObject.set(x, "fromRoot", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setImmediateCheck(value: immediateCheck): Self = StObject.set(x, "immediateCheck", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollContainer(value: infiniteScrollContainer): Self = StObject.set(x, "infiniteScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollDisabled(value: infiniteScrollDisabled): Self = StObject.set(x, "infiniteScrollDisabled", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollDistance(value: infiniteScrollDistance): Self = StObject.set(x, "infiniteScrollDistance", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollThrottle(value: infiniteScrollThrottle): Self = StObject.set(x, "infiniteScrollThrottle", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollUpDistance(value: infiniteScrollUpDistance): Self = StObject.set(x, "infiniteScrollUpDistance", value.asInstanceOf[js.Any])
      
      inline def setScrollWindow(value: scrollWindow): Self = StObject.set(x, "scrollWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientHeightKey extends StObject {
    
    var clientHeightKey: Any
    
    var offsetHeightKey: Any
  }
  object ClientHeightKey {
    
    inline def apply(clientHeightKey: Any, offsetHeightKey: Any): ClientHeightKey = {
      val __obj = js.Dynamic.literal(clientHeightKey = clientHeightKey.asInstanceOf[js.Any], offsetHeightKey = offsetHeightKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientHeightKey]
    }
    
    extension [Self <: ClientHeightKey](x: Self) {
      
      inline def setClientHeightKey(value: Any): Self = StObject.set(x, "clientHeightKey", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeightKey(value: Any): Self = StObject.set(x, "offsetHeightKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fire extends StObject {
    
    var fire: Boolean
    
    var scrollDown: Boolean
  }
  object Fire {
    
    inline def apply(fire: Boolean, scrollDown: Boolean): Fire = {
      val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fire]
    }
    
    extension [Self <: Fire](x: Self) {
      
      inline def setFire(value: Boolean): Self = StObject.set(x, "fire", value.asInstanceOf[js.Any])
      
      inline def setScrollDown(value: Boolean): Self = StObject.set(x, "scrollDown", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scrolled extends StObject {
    
    var scrolled: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolled
    
    var scrolledUp: typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.scrolledUp
  }
  object Scrolled {
    
    inline def apply(): Scrolled = {
      val __obj = js.Dynamic.literal(scrolled = "scrolled", scrolledUp = "scrolledUp")
      __obj.asInstanceOf[Scrolled]
    }
    
    extension [Self <: Scrolled](x: Self) {
      
      inline def setScrolled(value: scrolled): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
      
      inline def setScrolledUp(value: scrolledUp): Self = StObject.set(x, "scrolledUp", value.asInstanceOf[js.Any])
    }
  }
  
  trait TotalToScroll extends StObject {
    
    var totalToScroll: Any
  }
  object TotalToScroll {
    
    inline def apply(totalToScroll: Any): TotalToScroll = {
      val __obj = js.Dynamic.literal(totalToScroll = totalToScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotalToScroll]
    }
    
    extension [Self <: TotalToScroll](x: Self) {
      
      inline def setTotalToScroll(value: Any): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofInfiniteScrollDirec
    extends StObject
       with Instantiable2[/* element */ ElementRef[Any], /* zone */ NgZone, InfiniteScrollDirective] {
    
    var ɵdir: ɵɵDirectiveDeclaration[
        InfiniteScrollDirective, 
        `[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`, 
        scala.Nothing, 
        AlwaysCallback, 
        Scrolled, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[InfiniteScrollDirective, scala.Nothing] = js.native
  }
}
