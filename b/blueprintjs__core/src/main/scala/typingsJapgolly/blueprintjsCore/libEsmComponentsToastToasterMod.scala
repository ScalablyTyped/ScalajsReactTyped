package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsToastToastMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsToastToasterMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "OverlayToaster")
  @js.native
  open class OverlayToaster () extends Toaster
  object OverlayToaster {
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "OverlayToaster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new `Toaster` instance that can be shared around your application.
      * The `Toaster` will be rendered into a new element appended to the given container.
      */
    inline def create(): ToasterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ToasterInstance]
    inline def create(props: Unit, container: HTMLElement): ToasterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ToasterInstance]
    inline def create(props: IToasterProps): ToasterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any]).asInstanceOf[ToasterInstance]
    inline def create(props: IToasterProps, container: HTMLElement): ToasterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ToasterInstance]
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "OverlayToaster.defaultProps")
    @js.native
    def defaultProps: IToasterProps = js.native
    inline def defaultProps_=(x: IToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "OverlayToaster.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
  @js.native
  open class Toaster protected ()
    extends AbstractPureComponent2[IToasterProps, IToasterState, js.Object]
       with ToasterInstance {
    def this(props: IToasterProps) = this()
    def this(props: IToasterProps, context: Any) = this()
    
    /* private */ var createToastOptions: Any = js.native
    
    def dismiss(key: String, timeoutExpired: Boolean): Unit = js.native
    
    /* private */ var dismissIfAtLimit: Any = js.native
    
    /* private */ var getDismissHandler: Any = js.native
    
    /* private */ var getPositionClasses: Any = js.native
    
    /* private */ var handleClose: Any = js.native
    
    /* private */ var isNewToastKey: Any = js.native
    
    /* private */ var renderToast: Any = js.native
    
    /* private */ var toastId: Any = js.native
  }
  /* static members */
  object Toaster {
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new `Toaster` instance that can be shared around your application.
      * The `Toaster` will be rendered into a new element appended to the given container.
      */
    inline def create(): ToasterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ToasterInstance]
    inline def create(props: Unit, container: HTMLElement): ToasterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ToasterInstance]
    inline def create(props: IToasterProps): ToasterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any]).asInstanceOf[ToasterInstance]
    inline def create(props: IToasterProps, container: HTMLElement): ToasterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ToasterInstance]
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.defaultProps")
    @js.native
    def defaultProps: IToasterProps = js.native
    inline def defaultProps_=(x: IToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IToastOptions
    extends StObject
       with ToastProps {
    
    var key: String
  }
  object IToastOptions {
    
    inline def apply(key: String): IToastOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = null)
      __obj.asInstanceOf[IToastOptions]
    }
    
    extension [Self <: IToastOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type IToaster = ToasterInstance
  
  trait IToasterProps
    extends StObject
       with IProps {
    
    /**
      * Whether a toast should acquire application focus when it first opens.
      * This is disabled by default so that toasts do not interrupt the user's flow.
      * Note that `enforceFocus` is always disabled for `Toaster`s.
      *
      * @default false
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether pressing the `esc` key should clear all active toasts.
      *
      * @default true
      */
    var canEscapeKeyClear: js.UndefOr[Boolean] = js.undefined
    
    /** Optional toast elements. */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * The maximum number of active toasts that can be displayed at once.
      *
      * When the limit is about to be exceeded, the oldest active toast is removed.
      *
      * @default undefined
      */
    var maxToasts: js.UndefOr[Double] = js.undefined
    
    /**
      * Position of `Toaster` within its container.
      *
      * @default Position.TOP
      */
    var position: js.UndefOr[ToasterPosition] = js.undefined
    
    /**
      * Whether the toaster should be rendered into a new element attached to `document.body`.
      * If `false`, then positioning will be relative to the parent element.
      *
      * This prop is ignored by `Toaster.create()` as that method always appends a new element
      * to the container.
      *
      * @default true
      */
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object IToasterProps {
    
    inline def apply(): IToasterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToasterProps]
    }
    
    extension [Self <: IToasterProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCanEscapeKeyClear(value: Boolean): Self = StObject.set(x, "canEscapeKeyClear", value.asInstanceOf[js.Any])
      
      inline def setCanEscapeKeyClearUndefined: Self = StObject.set(x, "canEscapeKeyClear", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxToasts(value: Double): Self = StObject.set(x, "maxToasts", value.asInstanceOf[js.Any])
      
      inline def setMaxToastsUndefined: Self = StObject.set(x, "maxToasts", js.undefined)
      
      inline def setPosition(value: ToasterPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  trait IToasterState extends StObject {
    
    var toasts: js.Array[IToastOptions]
  }
  object IToasterState {
    
    inline def apply(toasts: js.Array[IToastOptions]): IToasterState = {
      val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToasterState]
    }
    
    extension [Self <: IToasterState](x: Self) {
      
      inline def setToasts(value: js.Array[IToastOptions]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
      
      inline def setToastsVarargs(value: IToastOptions*): Self = StObject.set(x, "toasts", js.Array(value*))
    }
  }
  
  type OverlayToasterProps = IToasterProps
  
  @js.native
  trait ToasterInstance extends StObject {
    
    /** Dismiss all toasts instantly. */
    def clear(): Unit = js.native
    
    /** Dismiss the given toast instantly. */
    def dismiss(key: String): Unit = js.native
    
    /** Returns the props for all current toasts. */
    def getToasts(): js.Array[IToastOptions] = js.native
    
    /**
      * Shows a new toast to the user, or updates an existing toast corresponding to the provided key (optional).
      *
      * Returns the unique key of the toast.
      */
    def show(props: ToastProps): String = js.native
    def show(props: ToastProps, key: String): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-left`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-right`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.bottom
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
  */
  trait ToasterPosition extends StObject
  object ToasterPosition {
    
    inline def bottom: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.bottom]
    
    inline def `bottom-left`: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`]
    
    inline def `bottom-right`: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`]
    
    inline def top: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top = "top".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top]
    
    inline def `top-left`: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-right`]
  }
}
