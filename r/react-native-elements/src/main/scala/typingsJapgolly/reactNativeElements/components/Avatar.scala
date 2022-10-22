package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.AvatarPropsPartialThemePr
import typingsJapgolly.reactNativeElements.anon.PartialImageProps
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullTheme
import typingsJapgolly.reactNativeElements.anon.ThemeAvatarProps
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distAvatarAvatarMod.AvatarIcon
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.large
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.medium
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.small
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("react-native-elements/dist/avatar/Avatar", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def Component(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
        ])
    ): this.type = set("Component", value.asInstanceOf[js.Any])
    
    inline def ImageComponent(value: ComponentClassP[js.Object]): this.type = set("ImageComponent", value.asInstanceOf[js.Any])
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def avatarStyle(value: ImageStyle): this.type = set("avatarStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def icon(value: AvatarIcon): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: StyleProp[TextStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def iconStyleNull: this.type = set("iconStyle", null)
    
    inline def imageProps(value: PartialImageProps): this.type = set("imageProps", value.asInstanceOf[js.Any])
    
    inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def overlayContainerStyle(value: StyleProp[TextStyle]): this.type = set("overlayContainerStyle", value.asInstanceOf[js.Any])
    
    inline def overlayContainerStyleNull: this.type = set("overlayContainerStyle", null)
    
    inline def placeholderStyle(value: StyleProp[ViewStyle]): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
    
    inline def placeholderStyleNull: this.type = set("placeholderStyle", null)
    
    inline def renderPlaceholderContent(value: VdomElement): this.type = set("renderPlaceholderContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def replaceTheme(value: /* updates */ RecursivePartialFullTheme => Callback): this.type = set("replaceTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullTheme) => value(t0).runNow()))
    
    inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | xlarge | Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def source(value: ImageSourcePropType): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def sourceVarargs(value: ImageURISource*): this.type = set("source", js.Array(value*))
    
    inline def theme(value: ThemeAvatarProps): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleStyleNull: this.type = set("titleStyle", null)
    
    inline def updateTheme(value: /* updates */ RecursivePartialFullTheme => Callback): this.type = set("updateTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullTheme) => value(t0).runNow()))
  }
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarPropsPartialThemePr): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
