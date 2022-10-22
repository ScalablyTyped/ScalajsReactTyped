package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImgProps extends StObject {
  
  var className: js.Array[Label]
  
  var imgProps: js.Array[LabelValue]
  
  var initialsLimit: js.Array[LabelNumber]
  
  def onClick(): Unit
  
  var placeholder: js.Array[Value]
}
object ImgProps {
  
  inline def apply(
    className: js.Array[Label],
    imgProps: js.Array[LabelValue],
    initialsLimit: js.Array[LabelNumber],
    onClick: Callback,
    placeholder: js.Array[Value]
  ): ImgProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], imgProps = imgProps.asInstanceOf[js.Any], initialsLimit = initialsLimit.asInstanceOf[js.Any], onClick = onClick.toJsFn, placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgProps]
  }
  
  extension [Self <: ImgProps](x: Self) {
    
    inline def setClassName(value: js.Array[Label]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameVarargs(value: Label*): Self = StObject.set(x, "className", js.Array(value*))
    
    inline def setImgProps(value: js.Array[LabelValue]): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
    
    inline def setImgPropsVarargs(value: LabelValue*): Self = StObject.set(x, "imgProps", js.Array(value*))
    
    inline def setInitialsLimit(value: js.Array[LabelNumber]): Self = StObject.set(x, "initialsLimit", value.asInstanceOf[js.Any])
    
    inline def setInitialsLimitVarargs(value: LabelNumber*): Self = StObject.set(x, "initialsLimit", js.Array(value*))
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setPlaceholder(value: js.Array[Value]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderVarargs(value: Value*): Self = StObject.set(x, "placeholder", js.Array(value*))
  }
}
