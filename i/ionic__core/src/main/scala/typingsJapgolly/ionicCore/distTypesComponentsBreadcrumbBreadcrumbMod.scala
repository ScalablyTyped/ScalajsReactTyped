package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsBreadcrumbBreadcrumbInterfaceMod.BreadcrumbCollapsedClickEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsBreadcrumbBreadcrumbMod {
  
  @JSImport("@ionic/core/dist/types/components/breadcrumb/breadcrumb", "Breadcrumb")
  @js.native
  open class Breadcrumb ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the breadcrumb will take on a different look to show that
      * it is the currently active breadcrumb. Defaults to `true` for the
      * last breadcrumb if it is not set on any.
      */
    var active: Boolean = js.native
    
    /** @internal */
    var collapsed: Boolean = js.native
    
    /**
      * Emitted when the collapsed indicator is clicked on.
      * `ion-breadcrumbs` will listen for this and emit ionCollapsedClick.
      * Normally we could just emit this as `ionCollapsedClick`
      * and let the event bubble to `ion-breadcrumbs`,
      * but if the event custom event is not set on `ion-breadcrumbs`,
      * TypeScript will throw an error in user applications.
      * @internal
      */
    var collapsedClick: EventEmitter[BreadcrumbCollapsedClickEventDetail] = js.native
    
    /* private */ var collapsedIndicatorClick: Any = js.native
    
    /* private */ var collapsedRef: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MBreadcrumb(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the breadcrumb.
      */
    var disabled: Boolean = js.native
    
    /**
      * This attribute instructs browsers to download a URL instead of navigating to
      * it, so the user will be prompted to save it as a local file. If the attribute
      * has a value, it is used as the pre-filled file name in the Save prompt
      * (the user can still change the file name if they want).
      */
    var download: js.UndefOr[String] = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Contains a URL or a URL fragment that the hyperlink points to.
      * If this property is set, an anchor tag will be rendered.
      */
    var href: js.UndefOr[String] = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /**
      * Emitted when the breadcrumb loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the breadcrumb has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /* private */ var isClickable: Any = js.native
    
    /** @internal */
    var last: Boolean = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /**
      * Specifies the relationship of the target object to the link object.
      * The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
      */
    var rel: js.UndefOr[String] = js.native
    
    @JSName("render")
    def render_MBreadcrumb(): Any = js.native
    
    /**
      * When using a router, it specifies the transition animation when navigating to
      * another page using `href`.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    
    /**
      * If true, show a separator between this breadcrumb and the next.
      * Defaults to `true` for all breadcrumbs except the last.
      */
    var separator: js.UndefOr[Boolean] = js.native
    
    /** @internal */
    var showCollapsedIndicator: Boolean = js.native
    
    /**
      * Specifies where to display the linked URL.
      * Only applies when an `href` is provided.
      * Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
      */
    var target: js.UndefOr[String] = js.native
  }
}
