package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesPhotoshopPi
import typingsJapgolly.reactColor.mod.ColorChangeHandler
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPhotoshopPhotoshopMod {
  
  @JSImport("react-color/lib/components/photoshop/Photoshop", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PhotoshopPickerProps, js.Object, Any]
  
  type PhotoshopPicker = japgolly.scalajs.react.facade.React.Component[PhotoshopPickerProps & js.Object, js.Object]
  
  trait PhotoshopPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[PhotoshopPickerProps & js.Object, js.Object]
        ] {
    
    var header: js.UndefOr[String] = js.undefined
    
    var onAccept: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var onCancel: js.UndefOr[ColorChangeHandler] = js.undefined
    
    @JSName("styles")
    var styles_PhotoshopPickerProps: js.UndefOr[PartialClassesPhotoshopPi] = js.undefined
  }
  object PhotoshopPickerProps {
    
    inline def apply(): PhotoshopPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoshopPickerProps]
    }
    
    extension [Self <: PhotoshopPickerProps](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setOnAccept(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onAccept", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnAcceptUndefined: Self = StObject.set(x, "onAccept", js.undefined)
      
      inline def setOnCancel(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setStyles(value: PartialClassesPhotoshopPi): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait PhotoshopPickerStylesProps extends StObject {
    
    var actions: CSSProperties
    
    var body: CSSProperties
    
    var controls: CSSProperties
    
    var head: CSSProperties
    
    var hue: CSSProperties
    
    var picker: CSSProperties
    
    var previews: CSSProperties
    
    var saturation: CSSProperties
    
    var top: CSSProperties
  }
  object PhotoshopPickerStylesProps {
    
    inline def apply(
      actions: CSSProperties,
      body: CSSProperties,
      controls: CSSProperties,
      head: CSSProperties,
      hue: CSSProperties,
      picker: CSSProperties,
      previews: CSSProperties,
      saturation: CSSProperties,
      top: CSSProperties
    ): PhotoshopPickerStylesProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoshopPickerStylesProps]
    }
    
    extension [Self <: PhotoshopPickerStylesProps](x: Self) {
      
      inline def setActions(value: CSSProperties): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setHead(value: CSSProperties): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHue(value: CSSProperties): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPreviews(value: CSSProperties): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: CSSProperties): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setTop(value: CSSProperties): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
