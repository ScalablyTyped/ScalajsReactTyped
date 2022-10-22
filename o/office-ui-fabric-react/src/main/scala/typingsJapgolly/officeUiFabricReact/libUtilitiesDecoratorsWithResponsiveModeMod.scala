package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesDecoratorsWithResponsiveModeMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ResponsiveMode extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponsiveMode & Double] = js.native
    
    @js.native
    sealed trait large
      extends StObject
         with ResponsiveMode
    /* 2 */ val large: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    @js.native
    sealed trait medium
      extends StObject
         with ResponsiveMode
    /* 1 */ val medium: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    @js.native
    sealed trait small
      extends StObject
         with ResponsiveMode
    /* 0 */ val small: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    @js.native
    sealed trait unknown
      extends StObject
         with ResponsiveMode
    /* 999 */ val unknown: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    @js.native
    sealed trait xLarge
      extends StObject
         with ResponsiveMode
    /* 3 */ val xLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    @js.native
    sealed trait xxLarge
      extends StObject
         with ResponsiveMode
    /* 4 */ val xxLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    @js.native
    sealed trait xxxLarge
      extends StObject
         with ResponsiveMode
    /* 5 */ val xxxLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
  
  inline def getInitialResponsiveMode(): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialResponsiveMode")().asInstanceOf[ResponsiveMode]
  
  inline def getResponsiveMode(): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveMode")().asInstanceOf[ResponsiveMode]
  inline def getResponsiveMode(currentWindow: Window): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveMode")(currentWindow.asInstanceOf[js.Any]).asInstanceOf[ResponsiveMode]
  
  inline def initializeResponsiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeResponsiveMode")().asInstanceOf[Unit]
  inline def initializeResponsiveMode(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeResponsiveMode")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setResponsiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponsiveMode")().asInstanceOf[Unit]
  inline def setResponsiveMode(responsiveMode: ResponsiveMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponsiveMode")(responsiveMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withResponsiveMode[TProps /* <: typingsJapgolly.officeUiFabricReact.anon.ResponsiveMode */, TState](
    ComposedComponent: Instantiable2[
      /* props */ TProps, 
      /* args (repeated) */ Any, 
      Component[TProps & js.Object, js.Object]
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withResponsiveMode")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait IWithResponsiveModeState extends StObject {
    
    var responsiveMode: js.UndefOr[ResponsiveMode] = js.undefined
  }
  object IWithResponsiveModeState {
    
    inline def apply(): IWithResponsiveModeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWithResponsiveModeState]
    }
    
    extension [Self <: IWithResponsiveModeState](x: Self) {
      
      inline def setResponsiveMode(value: ResponsiveMode): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
      
      inline def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
    }
  }
}
