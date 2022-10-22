package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResponsiveModeMod {
  
  @JSImport("office-ui-fabric-react/lib/ResponsiveMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/ResponsiveMode", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode & Double
      ] = js.native
    
    /* 2 */ val large: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
  
  inline def getInitialResponsiveMode(): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialResponsiveMode")().asInstanceOf[ResponsiveMode]
  
  inline def getResponsiveMode(): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveMode")().asInstanceOf[ResponsiveMode]
  inline def getResponsiveMode(currentWindow: Window): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveMode")(currentWindow.asInstanceOf[js.Any]).asInstanceOf[ResponsiveMode]
  
  inline def initializeResponsiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeResponsiveMode")().asInstanceOf[Unit]
  inline def initializeResponsiveMode(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeResponsiveMode")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setResponsiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponsiveMode")().asInstanceOf[Unit]
  inline def setResponsiveMode(responsiveMode: ResponsiveMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponsiveMode")(responsiveMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResponsiveMode(elementRef: RefHandle[HTMLElement | Null]): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveMode")(elementRef.asInstanceOf[js.Any]).asInstanceOf[ResponsiveMode]
  
  inline def withResponsiveMode[TProps /* <: typingsJapgolly.officeUiFabricReact.anon.ResponsiveMode */, TState](
    ComposedComponent: Instantiable2[
      /* props */ TProps, 
      /* args (repeated) */ Any, 
      Component[TProps & js.Object, js.Object]
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withResponsiveMode")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[Any]
}
