package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsOverlayOverlayMod.IBackdropProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsOverlayOverlayMod.IOverlayableProps
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsDialogDialogMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog")
  @js.native
  open class Dialog protected ()
    extends AbstractPureComponent2[DialogProps, js.Object, js.Object] {
    def this(props: DialogProps) = this()
    
    /* private */ var maybeRenderCloseButton: Any = js.native
    
    /* private */ var maybeRenderHeader: Any = js.native
    
    /* private */ var titleId: Any = js.native
  }
  /* static members */
  object Dialog {
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog.defaultProps")
    @js.native
    def defaultProps: DialogProps = js.native
    inline def defaultProps_=(x: DialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type DialogProps = IDialogProps
  
  trait IDialogProps
    extends StObject
       with IOverlayableProps
       with IBackdropProps
       with IProps {
    
    /**
      * ID of an element that contains description text inside this dialog.
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * ID of the element that contains title or label text for this dialog.
      *
      * By default, if the `title` prop is supplied, this component will generate
      * a unique ID for the `<H5>` title element and use that ID here.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** Dialog contents. */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Ref supplied to the `Classes.DIALOG_CONTAINER` element.
      */
    var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    /**
      * Name of a Blueprint UI icon (or an icon element) to render in the
      * dialog's header. Note that the header will only be rendered if `title` is
      * provided.
      */
    var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /**
      * Whether to show the close button in the dialog's header.
      * Note that the header will only be rendered if `title` is provided.
      *
      * @default true
      */
    var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles the visibility of the overlay and its children.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean
    
    /**
      * CSS styles to apply to the dialog.
      *
      * @default {}
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
      * will be rendered inside the dialog before any children elements.
      */
    var title: js.UndefOr[Node] = js.undefined
    
    /**
      * Name of the transition for internal `CSSTransition`. Providing your own
      * name here will require defining new CSS transition properties.
      */
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object IDialogProps {
    
    inline def apply(isOpen: Boolean): IDialogProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogProps]
    }
    
    extension [Self <: IDialogProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "containerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
      
      inline def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
}
