package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.ForwardRefExoticComponent
import typingsJapgolly.antdMobile.anon.OmitImageViewerPropsvisib
import typingsJapgolly.antdMobile.anon.PartialImageViewerProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapImageVie
import typingsJapgolly.antdMobile.esComponentsImageViewerImageViewerMod.ImageViewerProps
import typingsJapgolly.antdMobile.esComponentsImageViewerMethodsMod.ImageViewerShowHandler
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageViewerMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps> & {  Multi :react.react.ForwardRefExoticComponent<std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps, 'image' | 'renderFooter'> & {  images :std.Array<string> | undefined,   defaultIndex :number | undefined,   onIndexChange :(index : number): void | undefined,   renderFooter :(image : string, index : number): react.react.ReactNode | undefined} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/image-viewer/slides.SlidesRef>> & {  show :(props : std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.MultiImageViewerProps, 'visible'>): antd-mobile.antd-mobile/es/components/image-viewer/methods.ImageViewerShowHandler},   show :(props : std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps, 'visible'>): antd-mobile.antd-mobile/es/components/image-viewer/methods.ImageViewerShowHandler,   clear :(): void} */
  object default {
    
    inline def apply(props: ImageViewerProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: ImageViewerProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/image-viewer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.Multi")
    @js.native
    def Multi: ForwardRefExoticComponent = js.native
    inline def Multi_=(x: ForwardRefExoticComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Multi")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.clear")
    @js.native
    def clear: js.Function0[Unit] = js.native
    inline def clear_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialImageViewerProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialImageViewerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapImageVie] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapImageVie]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/image-viewer", "default.show")
    @js.native
    def show: js.Function1[/* props */ OmitImageViewerPropsvisib, ImageViewerShowHandler] = js.native
    inline def show_=(x: js.Function1[/* props */ OmitImageViewerPropsvisib, ImageViewerShowHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
  }
}
