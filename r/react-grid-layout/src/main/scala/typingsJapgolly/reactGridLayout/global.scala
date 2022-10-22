package typingsJapgolly.reactGridLayout

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactGridLayout.mod.ResponsiveProps
import typingsJapgolly.reactGridLayout.mod.WidthProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactGridLayout {
    
    @JSGlobal("ReactGridLayout")
    @js.native
    open class ^ ()
      extends typingsJapgolly.reactGridLayout.mod.^
    
    @JSGlobal("ReactGridLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ReactGridLayout.Responsive")
    @js.native
    open class Responsive protected ()
      extends typingsJapgolly.reactGridLayout.mod.Responsive {
      def this(props: ResponsiveProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ResponsiveProps, context: Any) = this()
    }
    
    inline def WidthProvider[P](component: ComponentClassP[P & js.Object]): ComponentClassP[P & WidthProviderProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("WidthProvider")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & WidthProviderProps & js.Object]]
    inline def WidthProvider[P](component: FunctionComponent[P]): ComponentClassP[P & WidthProviderProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("WidthProvider")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & WidthProviderProps & js.Object]]
  }
}
