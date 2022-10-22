package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsJapgolly.reactNative.mod.ImagePropertiesSourceOptions
import typingsJapgolly.reactNative.mod.ImageURISource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultPropsTypeMod {
  
  trait ResultPropsType extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var buttonType: js.UndefOr[primary | ghost] = js.undefined
    
    var img: js.UndefOr[Node] = js.undefined
    
    var imgUrl: js.UndefOr[ImagePropertiesSourceOptions] = js.undefined
    
    var message: js.UndefOr[Node] = js.undefined
    
    var onButtonClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object ResultPropsType {
    
    inline def apply(): ResultPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultPropsType]
    }
    
    extension [Self <: ResultPropsType](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setButtonType(value: primary | ghost): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setImg(value: VdomNode): Self = StObject.set(x, "img", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImgNull: Self = StObject.set(x, "img", null)
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setImgUrl(value: ImagePropertiesSourceOptions): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
      
      inline def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
      
      inline def setImgUrlVarargs(value: ImageURISource*): Self = StObject.set(x, "imgUrl", js.Array(value*))
      
      inline def setImgVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "img", js.Array(value*))
      
      inline def setImgVdomElement(value: VdomElement): Self = StObject.set(x, "img", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMessage(value: VdomNode): Self = StObject.set(x, "message", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnButtonClick(value: /* e */ Any => Callback): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
      
      inline def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
