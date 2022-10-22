package typingsJapgolly.styledComponents.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ImageProps
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.TouchableOpacityProps
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.styledComponents.nativeDistDistConstructorsConstructWithOptionsMod.NativeStyled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var Image: NativeStyled[TypeofImageInstantiable, ImageProps, Any]
  
  var Text: NativeStyled[
    Instantiable1[/* props */ ReadonlyTextProps, typingsJapgolly.reactPrimitives.mod.Text], 
    TextProps, 
    Any
  ]
  
  var Touchable: NativeStyled[
    ComponentType[TouchableOpacityProps], 
    TouchableOpacityProps | TouchableOpacityPropschil, 
    Any
  ]
  
  var View: NativeStyled[TypeofViewInstantiable, ViewProps, Any]
}
object Image {
  
  inline def apply(
    Image: NativeStyled[TypeofImageInstantiable, ImageProps, Any],
    Text: NativeStyled[
      Instantiable1[/* props */ ReadonlyTextProps, typingsJapgolly.reactPrimitives.mod.Text], 
      TextProps, 
      Any
    ],
    Touchable: NativeStyled[
      ComponentType[TouchableOpacityProps], 
      TouchableOpacityProps | TouchableOpacityPropschil, 
      Any
    ],
    View: NativeStyled[TypeofViewInstantiable, ViewProps, Any]
  ): Image = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Touchable = Touchable.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImage(value: NativeStyled[TypeofImageInstantiable, ImageProps, Any]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setText(
      value: NativeStyled[
          Instantiable1[/* props */ ReadonlyTextProps, typingsJapgolly.reactPrimitives.mod.Text], 
          TextProps, 
          Any
        ]
    ): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTouchable(
      value: NativeStyled[
          ComponentType[TouchableOpacityProps], 
          TouchableOpacityProps | TouchableOpacityPropschil, 
          Any
        ]
    ): Self = StObject.set(x, "Touchable", value.asInstanceOf[js.Any])
    
    inline def setView(value: NativeStyled[TypeofViewInstantiable, ViewProps, Any]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
