package typingsJapgolly.jqueryNotifybar

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryNotifyBar {
  
  trait NotifyBarOptions extends StObject {
    
    /**
      * How long this bar will be slided up and down.
      *
      * Default: "normal"
      */
    var animationSpeed: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If set to true close button will be displayed.
      */
    var close: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If enabled, user can hide notify bar just by click on it.
      */
    var closeOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If enabled, user can hide notify bar just by moving mouse cursor on it.
      */
    var closeOnOver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the text to close button.
      */
    var closeText: js.UndefOr[String] = js.undefined
    
    /**
      * You can define own CSS class for Notify bar. There are too premade classes "error", "warning" and "success".
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /**
      * How long bar will be delayed, doesn't count animation time.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * What text will be inside bar. Can be HTML or just text.
      */
    var html: js.UndefOr[String] = js.undefined
    
    /**
      * Custom jQuery object for notify bar.
      */
    var jqObject: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Callback on before hide.
      */
    var onBeforeHide: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Callback on before show.
      */
    var onBeforeShow: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Callback on hide.
      */
    var onHide: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Callback on show.
      */
    var onShow: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Set the position of notify bar. Possible values are "top", "bottom".
      */
    var position: js.UndefOr[String] = js.undefined
  }
  object NotifyBarOptions {
    
    inline def apply(): NotifyBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyBarOptions]
    }
    
    extension [Self <: NotifyBarOptions](x: Self) {
      
      inline def setAnimationSpeed(value: String | Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      inline def setCloseOnOver(value: Boolean): Self = StObject.set(x, "closeOnOver", value.asInstanceOf[js.Any])
      
      inline def setCloseOnOverUndefined: Self = StObject.set(x, "closeOnOver", js.undefined)
      
      inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJqObject(value: JQuery[HTMLElement]): Self = StObject.set(x, "jqObject", value.asInstanceOf[js.Any])
      
      inline def setJqObjectUndefined: Self = StObject.set(x, "jqObject", js.undefined)
      
      inline def setOnBeforeHide(value: CallbackTo[Any]): Self = StObject.set(x, "onBeforeHide", value.toJsFn)
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: CallbackTo[Any]): Self = StObject.set(x, "onBeforeShow", value.toJsFn)
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: CallbackTo[Any]): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: CallbackTo[Any]): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait NotifyBarOptionsForAnimationSpeedNumber
    extends StObject
       with NotifyBarOptions {
    
    /**
      * How long this bar will be slided up and down.
      */
    @JSName("animationSpeed")
    var animationSpeed_NotifyBarOptionsForAnimationSpeedNumber: js.UndefOr[Double] = js.undefined
  }
  object NotifyBarOptionsForAnimationSpeedNumber {
    
    inline def apply(): NotifyBarOptionsForAnimationSpeedNumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedNumber]
    }
    
    extension [Self <: NotifyBarOptionsForAnimationSpeedNumber](x: Self) {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
    }
  }
  
  trait NotifyBarOptionsForAnimationSpeedString
    extends StObject
       with NotifyBarOptions {
    
    /**
      * How long this bar will be slided up and down. Possible values are "slow", "default", "normal", "fast".
      */
    @JSName("animationSpeed")
    var animationSpeed_NotifyBarOptionsForAnimationSpeedString: js.UndefOr[String] = js.undefined
  }
  object NotifyBarOptionsForAnimationSpeedString {
    
    inline def apply(): NotifyBarOptionsForAnimationSpeedString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedString]
    }
    
    extension [Self <: NotifyBarOptionsForAnimationSpeedString](x: Self) {
      
      inline def setAnimationSpeed(value: String): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
    }
  }
}
