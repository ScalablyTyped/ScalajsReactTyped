package typingsJapgolly.reactToastify

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactToastify.distTypesMod.Theme
import typingsJapgolly.reactToastify.distTypesMod.ToastProps
import typingsJapgolly.reactToastify.distTypesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsIconsMod {
  
  @JSImport("react-toastify/dist/components/Icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Icons {
    
    @JSImport("react-toastify/dist/components/Icons", "Icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify/dist/components/Icons", "Icons.error")
    @js.native
    def error: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def error_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components/Icons", "Icons.info")
    @js.native
    def info: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def info_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components/Icons", "Icons.spinner")
    @js.native
    def spinner: js.Function0[Element] = js.native
    inline def spinner_=(x: js.Function0[Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinner")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components/Icons", "Icons.success")
    @js.native
    def success: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def success_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components/Icons", "Icons.warning")
    @js.native
    def warning: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def warning_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  inline def getIcon(hasThemeTypeIsLoadingIcon: ToastProps): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")(hasThemeTypeIsLoadingIcon.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reactToastify.distComponentsIconsMod.IconProps because var conflicts: `type`. Inlined theme */ trait BuiltInIconProps
    extends StObject
       with SVGProps[SVGSVGElement] {
    
    var theme: Theme
  }
  object BuiltInIconProps {
    
    inline def apply(theme: Theme): BuiltInIconProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltInIconProps]
    }
    
    extension [Self <: BuiltInIconProps](x: Self) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconProps extends StObject {
    
    var theme: Theme
    
    var `type`: TypeOptions
  }
  object IconProps {
    
    inline def apply(theme: Theme, `type`: TypeOptions): IconProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
