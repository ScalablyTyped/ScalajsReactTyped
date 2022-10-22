package typingsJapgolly.ionicAngular

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIonicLifecycleHooksMod {
  
  trait ViewDidEnter extends StObject {
    
    /**
      * Fired when the component routing to has finished animating.
      */
    def ionViewDidEnter(): Unit
  }
  object ViewDidEnter {
    
    inline def apply(ionViewDidEnter: Callback): ViewDidEnter = {
      val __obj = js.Dynamic.literal(ionViewDidEnter = ionViewDidEnter.toJsFn)
      __obj.asInstanceOf[ViewDidEnter]
    }
    
    extension [Self <: ViewDidEnter](x: Self) {
      
      inline def setIonViewDidEnter(value: Callback): Self = StObject.set(x, "ionViewDidEnter", value.toJsFn)
    }
  }
  
  trait ViewDidLeave extends StObject {
    
    /**
      * Fired when the component routing to has finished animating.
      */
    def ionViewDidLeave(): Unit
  }
  object ViewDidLeave {
    
    inline def apply(ionViewDidLeave: Callback): ViewDidLeave = {
      val __obj = js.Dynamic.literal(ionViewDidLeave = ionViewDidLeave.toJsFn)
      __obj.asInstanceOf[ViewDidLeave]
    }
    
    extension [Self <: ViewDidLeave](x: Self) {
      
      inline def setIonViewDidLeave(value: Callback): Self = StObject.set(x, "ionViewDidLeave", value.toJsFn)
    }
  }
  
  trait ViewWillEnter extends StObject {
    
    /**
      * Fired when the component routing to is about to animate into view.
      */
    def ionViewWillEnter(): Unit
  }
  object ViewWillEnter {
    
    inline def apply(ionViewWillEnter: Callback): ViewWillEnter = {
      val __obj = js.Dynamic.literal(ionViewWillEnter = ionViewWillEnter.toJsFn)
      __obj.asInstanceOf[ViewWillEnter]
    }
    
    extension [Self <: ViewWillEnter](x: Self) {
      
      inline def setIonViewWillEnter(value: Callback): Self = StObject.set(x, "ionViewWillEnter", value.toJsFn)
    }
  }
  
  trait ViewWillLeave extends StObject {
    
    /**
      * Fired when the component routing from is about to animate.
      */
    def ionViewWillLeave(): Unit
  }
  object ViewWillLeave {
    
    inline def apply(ionViewWillLeave: Callback): ViewWillLeave = {
      val __obj = js.Dynamic.literal(ionViewWillLeave = ionViewWillLeave.toJsFn)
      __obj.asInstanceOf[ViewWillLeave]
    }
    
    extension [Self <: ViewWillLeave](x: Self) {
      
      inline def setIonViewWillLeave(value: Callback): Self = StObject.set(x, "ionViewWillLeave", value.toJsFn)
    }
  }
}
