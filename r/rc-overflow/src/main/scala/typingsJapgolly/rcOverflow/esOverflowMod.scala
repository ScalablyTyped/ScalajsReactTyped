package typingsJapgolly.rcOverflow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcOverflow.anon.ClassName
import typingsJapgolly.rcOverflow.anon.Ref
import typingsJapgolly.rcOverflow.esRawItemMod.RawItemProps
import typingsJapgolly.rcOverflow.rcOverflowStrings.full
import typingsJapgolly.rcOverflow.rcOverflowStrings.invalidate
import typingsJapgolly.rcOverflow.rcOverflowStrings.responsive
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOverflowMod extends Shortcut {
  
  @JSImport("rc-overflow/es/Overflow", JSImport.Default)
  @js.native
  val default: FilledOverflowType = js.native
  
  @JSImport("rc-overflow/es/Overflow", "OverflowContext")
  @js.native
  val OverflowContext: Context[ClassName] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.react.mod.ComponentType[scala.Any]
    - typingsJapgolly.react.mod.ForwardRefExoticComponent[scala.Any]
    - typingsJapgolly.react.mod.FC[scala.Any]
    - typingsJapgolly.rcOverflow.rcOverflowStrings.a
    - typingsJapgolly.rcOverflow.rcOverflowStrings.abbr
    - typingsJapgolly.rcOverflow.rcOverflowStrings.address
    - typingsJapgolly.rcOverflow.rcOverflowStrings.area
    - typingsJapgolly.rcOverflow.rcOverflowStrings.article
    - typingsJapgolly.rcOverflow.rcOverflowStrings.aside
    - typingsJapgolly.rcOverflow.rcOverflowStrings.audio
    - typingsJapgolly.rcOverflow.rcOverflowStrings.b
    - typingsJapgolly.rcOverflow.rcOverflowStrings.base
    - typingsJapgolly.rcOverflow.rcOverflowStrings.bdi
    - typingsJapgolly.rcOverflow.rcOverflowStrings.bdo
    - typingsJapgolly.rcOverflow.rcOverflowStrings.big
    - typingsJapgolly.rcOverflow.rcOverflowStrings.blockquote
    - typingsJapgolly.rcOverflow.rcOverflowStrings.body
    - typingsJapgolly.rcOverflow.rcOverflowStrings.br
    - typingsJapgolly.rcOverflow.rcOverflowStrings.button
    - typingsJapgolly.rcOverflow.rcOverflowStrings.canvas
    - typingsJapgolly.rcOverflow.rcOverflowStrings.caption
    - typingsJapgolly.rcOverflow.rcOverflowStrings.cite
    - typingsJapgolly.rcOverflow.rcOverflowStrings.code
    - typingsJapgolly.rcOverflow.rcOverflowStrings.col
    - typingsJapgolly.rcOverflow.rcOverflowStrings.colgroup
    - typingsJapgolly.rcOverflow.rcOverflowStrings.data
    - typingsJapgolly.rcOverflow.rcOverflowStrings.datalist
    - typingsJapgolly.rcOverflow.rcOverflowStrings.dd
    - typingsJapgolly.rcOverflow.rcOverflowStrings.del
    - typingsJapgolly.rcOverflow.rcOverflowStrings.details
    - typingsJapgolly.rcOverflow.rcOverflowStrings.dfn
    - typingsJapgolly.rcOverflow.rcOverflowStrings.dialog
    - typingsJapgolly.rcOverflow.rcOverflowStrings.div
    - typingsJapgolly.rcOverflow.rcOverflowStrings.dl
    - typingsJapgolly.rcOverflow.rcOverflowStrings.dt
    - typingsJapgolly.rcOverflow.rcOverflowStrings.em
    - typingsJapgolly.rcOverflow.rcOverflowStrings.embed
    - typingsJapgolly.rcOverflow.rcOverflowStrings.fieldset
    - typingsJapgolly.rcOverflow.rcOverflowStrings.figcaption
    - typingsJapgolly.rcOverflow.rcOverflowStrings.figure
    - typingsJapgolly.rcOverflow.rcOverflowStrings.footer
    - typingsJapgolly.rcOverflow.rcOverflowStrings.form
    - typingsJapgolly.rcOverflow.rcOverflowStrings.h1
    - typingsJapgolly.rcOverflow.rcOverflowStrings.h2
    - typingsJapgolly.rcOverflow.rcOverflowStrings.h3
    - typingsJapgolly.rcOverflow.rcOverflowStrings.h4
    - typingsJapgolly.rcOverflow.rcOverflowStrings.h5
    - typingsJapgolly.rcOverflow.rcOverflowStrings.h6
    - typingsJapgolly.rcOverflow.rcOverflowStrings.head
    - typingsJapgolly.rcOverflow.rcOverflowStrings.header
    - typingsJapgolly.rcOverflow.rcOverflowStrings.hgroup
    - typingsJapgolly.rcOverflow.rcOverflowStrings.hr
    - typingsJapgolly.rcOverflow.rcOverflowStrings.html
    - typingsJapgolly.rcOverflow.rcOverflowStrings.i
    - typingsJapgolly.rcOverflow.rcOverflowStrings.iframe
    - typingsJapgolly.rcOverflow.rcOverflowStrings.img
    - typingsJapgolly.rcOverflow.rcOverflowStrings.input
    - typingsJapgolly.rcOverflow.rcOverflowStrings.ins
    - typingsJapgolly.rcOverflow.rcOverflowStrings.kbd
    - typingsJapgolly.rcOverflow.rcOverflowStrings.keygen
    - typingsJapgolly.rcOverflow.rcOverflowStrings.label
    - typingsJapgolly.rcOverflow.rcOverflowStrings.legend
    - typingsJapgolly.rcOverflow.rcOverflowStrings.li
    - typingsJapgolly.rcOverflow.rcOverflowStrings.link
    - typingsJapgolly.rcOverflow.rcOverflowStrings.main
    - typingsJapgolly.rcOverflow.rcOverflowStrings.map
    - typingsJapgolly.rcOverflow.rcOverflowStrings.mark
    - typingsJapgolly.rcOverflow.rcOverflowStrings.menu
    - typingsJapgolly.rcOverflow.rcOverflowStrings.menuitem
    - typingsJapgolly.rcOverflow.rcOverflowStrings.meta
    - typingsJapgolly.rcOverflow.rcOverflowStrings.meter
    - typingsJapgolly.rcOverflow.rcOverflowStrings.nav
    - typingsJapgolly.rcOverflow.rcOverflowStrings.noscript
    - typingsJapgolly.rcOverflow.rcOverflowStrings.`object`
    - typingsJapgolly.rcOverflow.rcOverflowStrings.ol
    - typingsJapgolly.rcOverflow.rcOverflowStrings.optgroup
    - typingsJapgolly.rcOverflow.rcOverflowStrings.option
    - typingsJapgolly.rcOverflow.rcOverflowStrings.output
    - typingsJapgolly.rcOverflow.rcOverflowStrings.p
    - typingsJapgolly.rcOverflow.rcOverflowStrings.param
    - typingsJapgolly.rcOverflow.rcOverflowStrings.picture
    - typingsJapgolly.rcOverflow.rcOverflowStrings.pre
    - typingsJapgolly.rcOverflow.rcOverflowStrings.progress
    - typingsJapgolly.rcOverflow.rcOverflowStrings.q
    - typingsJapgolly.rcOverflow.rcOverflowStrings.rp
    - typingsJapgolly.rcOverflow.rcOverflowStrings.rt
    - typingsJapgolly.rcOverflow.rcOverflowStrings.ruby
    - typingsJapgolly.rcOverflow.rcOverflowStrings.s
    - typingsJapgolly.rcOverflow.rcOverflowStrings.samp
    - typingsJapgolly.rcOverflow.rcOverflowStrings.slot
    - typingsJapgolly.rcOverflow.rcOverflowStrings.script
    - typingsJapgolly.rcOverflow.rcOverflowStrings.section
    - typingsJapgolly.rcOverflow.rcOverflowStrings.select
    - typingsJapgolly.rcOverflow.rcOverflowStrings.small
    - typingsJapgolly.rcOverflow.rcOverflowStrings.source
    - typingsJapgolly.rcOverflow.rcOverflowStrings.span
    - typingsJapgolly.rcOverflow.rcOverflowStrings.strong
    - typingsJapgolly.rcOverflow.rcOverflowStrings.style
    - typingsJapgolly.rcOverflow.rcOverflowStrings.sub
    - typingsJapgolly.rcOverflow.rcOverflowStrings.summary
    - typingsJapgolly.rcOverflow.rcOverflowStrings.sup
    - typingsJapgolly.rcOverflow.rcOverflowStrings.table
    - typingsJapgolly.rcOverflow.rcOverflowStrings.template
    - typingsJapgolly.rcOverflow.rcOverflowStrings.tbody
    - typingsJapgolly.rcOverflow.rcOverflowStrings.td
    - typingsJapgolly.rcOverflow.rcOverflowStrings.textarea
    - typingsJapgolly.rcOverflow.rcOverflowStrings.tfoot
    - typingsJapgolly.rcOverflow.rcOverflowStrings.th
    - typingsJapgolly.rcOverflow.rcOverflowStrings.thead
    - typingsJapgolly.rcOverflow.rcOverflowStrings.time
    - typingsJapgolly.rcOverflow.rcOverflowStrings.title
    - typingsJapgolly.rcOverflow.rcOverflowStrings.tr
    - typingsJapgolly.rcOverflow.rcOverflowStrings.track
    - typingsJapgolly.rcOverflow.rcOverflowStrings.u
    - typingsJapgolly.rcOverflow.rcOverflowStrings.ul
    - typingsJapgolly.rcOverflow.rcOverflowStrings.`var`
    - typingsJapgolly.rcOverflow.rcOverflowStrings.video
    - typingsJapgolly.rcOverflow.rcOverflowStrings.wbr
    - typingsJapgolly.rcOverflow.rcOverflowStrings.webview
  */
  type ComponentType = _ComponentType | typingsJapgolly.react.mod.ComponentType[Any] | ForwardRefExoticComponent[Any] | FC[Any]
  
  @js.native
  trait FilledOverflowType extends ForwardOverflowType {
    
    /** Will work as normal `component`. Skip patch props like `prefixCls`. */
    var INVALIDATE: invalidate = js.native
    
    var Item: ForwardRefExoticComponent[RawItemProps & RefAttributes[Any]] = js.native
    
    var RESPONSIVE: responsive = js.native
  }
  
  type ForwardOverflowType = js.Function1[/* props */ PropsWithChildren[OverflowProps[Any]] & Ref, Element]
  
  trait OverflowProps[ItemType]
    extends StObject
       with HTMLAttributes[Any] {
    
    var component: js.UndefOr[ComponentType] = js.undefined
    
    var data: js.UndefOr[js.Array[ItemType]] = js.undefined
    
    var itemComponent: js.UndefOr[ComponentType] = js.undefined
    
    var itemKey: js.UndefOr[Key | (js.Function1[/* item */ ItemType, Key])] = js.undefined
    
    /** Used for `responsive`. It will limit render node to avoid perf issue */
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    var maxCount: js.UndefOr[Double | responsive | invalidate] = js.undefined
    
    /** @private This API may be refactor since not well design */
    var onVisibleChange: js.UndefOr[js.Function1[/* visibleCount */ Double, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* item */ ItemType, Node]] = js.undefined
    
    /** @private Do not use in your production. Render raw node that need wrap Item by developer self */
    var renderRawItem: js.UndefOr[js.Function2[/* item */ ItemType, /* index */ Double, Element]] = js.undefined
    
    /** @private Do not use in your production. Render raw node that need wrap Item by developer self */
    var renderRawRest: js.UndefOr[js.Function1[/* omittedItems */ js.Array[ItemType], Element]] = js.undefined
    
    var renderRest: js.UndefOr[Node | (js.Function1[/* omittedItems */ js.Array[ItemType], Node])] = js.undefined
    
    /** When set to `full`, ssr will render full items by default and remove at client side */
    var ssr: js.UndefOr[full] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
  }
  object OverflowProps {
    
    inline def apply[ItemType](): OverflowProps[ItemType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowProps[ItemType]]
    }
    
    extension [Self <: OverflowProps[?], ItemType](x: Self & OverflowProps[ItemType]) {
      
      inline def setComponent(value: ComponentType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: js.Array[ItemType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: ItemType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setItemComponent(value: ComponentType): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      inline def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      inline def setItemKey(value: Key | (js.Function1[/* item */ ItemType, Key])): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setItemKeyFunction1(value: /* item */ ItemType => Key): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
      
      inline def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setMaxCount(value: Double | responsive | invalidate): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setOnVisibleChange(value: /* visibleCount */ Double => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visibleCount */ Double) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderItem(value: /* item */ ItemType => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRenderRawItem(value: (/* item */ ItemType, /* index */ Double) => Element): Self = StObject.set(x, "renderRawItem", js.Any.fromFunction2(value))
      
      inline def setRenderRawItemUndefined: Self = StObject.set(x, "renderRawItem", js.undefined)
      
      inline def setRenderRawRest(value: /* omittedItems */ js.Array[ItemType] => Element): Self = StObject.set(x, "renderRawRest", js.Any.fromFunction1(value))
      
      inline def setRenderRawRestUndefined: Self = StObject.set(x, "renderRawRest", js.undefined)
      
      inline def setRenderRest(value: Node | (js.Function1[/* omittedItems */ js.Array[ItemType], Node])): Self = StObject.set(x, "renderRest", value.asInstanceOf[js.Any])
      
      inline def setRenderRestFunction1(value: /* omittedItems */ js.Array[ItemType] => Node): Self = StObject.set(x, "renderRest", js.Any.fromFunction1(value))
      
      inline def setRenderRestNull: Self = StObject.set(x, "renderRest", null)
      
      inline def setRenderRestUndefined: Self = StObject.set(x, "renderRest", js.undefined)
      
      inline def setRenderRestVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "renderRest", js.Array(value*))
      
      inline def setRenderRestVdomElement(value: VdomElement): Self = StObject.set(x, "renderRest", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSsr(value: full): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait _ComponentType extends StObject
  
  type _To = FilledOverflowType
  
  /* This means you don't have to write `default`, but can instead just say `esOverflowMod.foo` */
  override def _to: FilledOverflowType = default
}
