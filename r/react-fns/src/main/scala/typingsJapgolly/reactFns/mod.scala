package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.anon.PartialScrollConfig
import typingsJapgolly.reactFns.anon.PartialWindowSizeConfig
import typingsJapgolly.reactFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import typingsJapgolly.reactFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsJapgolly.reactFns.distGeoPositionGeoPositionMod.GeoPositionProps
import typingsJapgolly.reactFns.distLocalesLocalesMod.LocalesProps
import typingsJapgolly.reactFns.distNetworkNetworkMod.NetworkProps
import typingsJapgolly.reactFns.distScrollScrollMod.ScrollConfig
import typingsJapgolly.reactFns.distScrollScrollMod.ScrollProps
import typingsJapgolly.reactFns.distTypesMod.SharedRenderProps
import typingsJapgolly.reactFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typingsJapgolly.reactFns.distWindowSizeWindowSizeMod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-fns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns", "DeviceMotion")
  @js.native
  open class DeviceMotion protected ()
    extends typingsJapgolly.reactFns.distDeviceMotionMod.DeviceMotion {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: Any) = this()
  }
  
  @JSImport("react-fns", "DeviceOrientation")
  @js.native
  open class DeviceOrientation protected ()
    extends typingsJapgolly.reactFns.distDeviceOrientationMod.DeviceOrientation {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: Any) = this()
  }
  
  @JSImport("react-fns", "GeoPosition")
  @js.native
  open class GeoPosition protected ()
    extends typingsJapgolly.reactFns.distGeoPositionMod.GeoPosition {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: Any) = this()
  }
  
  @JSImport("react-fns", "Locales")
  @js.native
  open class Locales protected ()
    extends typingsJapgolly.reactFns.distLocalesMod.Locales {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: Any) = this()
  }
  
  @JSImport("react-fns", "Media")
  @js.native
  val Media: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<SharedRenderProps<MediaProps>> */ Any = js.native
  
  @JSImport("react-fns", "Network")
  @js.native
  open class Network protected ()
    extends typingsJapgolly.reactFns.distNetworkMod.Network {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: Any) = this()
  }
  
  @JSImport("react-fns", "Scroll")
  @js.native
  open class Scroll protected ()
    extends typingsJapgolly.reactFns.distScrollMod.Scroll {
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps], context: Any) = this()
  }
  /* static members */
  object Scroll {
    
    @JSImport("react-fns", "Scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns", "Scroll.defaultProps")
    @js.native
    def defaultProps: PartialScrollConfig = js.native
    inline def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-fns", "WindowSize")
  @js.native
  open class WindowSize protected ()
    extends typingsJapgolly.reactFns.distWindowSizeMod.WindowSize {
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps], context: Any) = this()
  }
  /* static members */
  object WindowSize {
    
    @JSImport("react-fns", "WindowSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns", "WindowSize.defaultProps")
    @js.native
    def defaultProps: PartialWindowSizeConfig = js.native
    inline def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def withDeviceMotion[Props](Component: ComponentType[Props & DeviceMotionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceMotion")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def withDeviceOrientation[Props](Component: ComponentType[Props & DeviceOrientationProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def withGeoPosition[Props](Component: ComponentType[Props & GeoPositionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGeoPosition")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def withLocales[Props](Component: ComponentType[Props & LocalesProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocales")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def withNetwork[Props](Component: ComponentType[Props & NetworkProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNetwork")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def withScroll[Props](Component: ComponentType[Props & ScrollProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def withWindowSize[Props](Component: ComponentType[Props & WindowSizeProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withWindowSize")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
