package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.single
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileSrcTileGroupMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/TileGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTileGroup(
    hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest: InnerTileGroupProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileGroup")(hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/TileGroup", "TileGroup")
  @js.native
  val TileGroup: OrbitComponent[HTMLElement, InnerTileGroupProps] = js.native
  
  trait InnerTileGroupProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Whether or not the first tile of the group should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * The initial value of `value`.
      */
    var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not the tiles are disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when any of the children is checked or unchecked..
      * @param {SyntheticEvent} event - React's original event.
      * @param {string[]} value - The new value.
      * @returns {void}
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* value */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The orientation of the group tiles.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The number of tiles per row.
      */
    var rowSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of selection that is allowed.
      */
    var selectionMode: js.UndefOr[none | single | multiple] = js.undefined
    
    /**
      * The value of the tile group.
      */
    var value: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object InnerTileGroupProps {
    
    inline def apply(): InnerTileGroupProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerTileGroupProps]
    }
    
    extension [Self <: InnerTileGroupProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ js.Array[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      inline def setSelectionMode(value: none | single | multiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type TileGroupProps = ComponentProps[OrbitComponent[HTMLElement, InnerTileGroupProps]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.OrbitComponent<std.HTMLElement, @orbit-ui/react-components.@orbit-ui/react-components/dist/group/src/Group.InnerGroupProps> extends react.react.JSXElementConstructor<infer P> ? P : @orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.OrbitComponent<std.HTMLElement, @orbit-ui/react-components.@orbit-ui/react-components/dist/group/src/Group.InnerGroupProps> extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ? react.react.<global>.JSX.IntrinsicElements[@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.OrbitComponent<std.HTMLElement, @orbit-ui/react-components.@orbit-ui/react-components/dist/group/src/Group.InnerGroupProps>] : {} */ trait UnselectableGroupProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
  }
  object UnselectableGroupProps {
    
    inline def apply(): UnselectableGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnselectableGroupProps]
    }
    
    extension [Self <: UnselectableGroupProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    }
  }
}
