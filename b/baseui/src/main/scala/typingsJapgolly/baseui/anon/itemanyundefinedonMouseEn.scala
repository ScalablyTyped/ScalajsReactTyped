package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.listTypesMod.ArtworkSizes
import typingsJapgolly.baseui.listTypesMod.ListOverrides
import typingsJapgolly.baseui.listTypesMod.Shape
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  item :any | undefined,   onMouseEnter :(a : std.MouseEvent): unknown | undefined,   onClick :(a : std.MouseEvent): unknown | undefined,   $size :string | undefined,   $isHighlighted :boolean | undefined,   $disabled :boolean | undefined} & baseui.baseui/list/types.ListProps & react.react.RefAttributes<std.HTMLLIElement> */
trait itemanyundefinedonMouseEn extends StObject {
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[String] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  
  var artwork: js.UndefOr[ComponentType[sizeIconPropssizeIconProp]] = js.undefined
  
  var artworkSize: js.UndefOr[ArtworkSizes | Double] = js.undefined
  
  var children: Node
  
  var endEnhancer: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var item: js.UndefOr[Any] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key | Null] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* a */ MouseEvent, Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* a */ MouseEvent, Any]] = js.undefined
  
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[HTMLLIElement]] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var shape: js.UndefOr[Shape] = js.undefined
  
  var sublist: js.UndefOr[Boolean] = js.undefined
}
object itemanyundefinedonMouseEn {
  
  inline def apply(): itemanyundefinedonMouseEn = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[itemanyundefinedonMouseEn]
  }
  
  extension [Self <: itemanyundefinedonMouseEn](x: Self) {
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    inline def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def setArtwork(value: ComponentType[sizeIconPropssizeIconProp]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkSize(value: ArtworkSizes | Double): Self = StObject.set(x, "artworkSize", value.asInstanceOf[js.Any])
    
    inline def setArtworkSizeUndefined: Self = StObject.set(x, "artworkSize", js.undefined)
    
    inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setEndEnhancer(value: ComponentType[js.Object]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnClick(value: /* a */ MouseEvent => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: /* a */ MouseEvent => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[HTMLLIElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLLIElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLLIElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSublist(value: Boolean): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
    
    inline def setSublistUndefined: Self = StObject.set(x, "sublist", js.undefined)
  }
}
