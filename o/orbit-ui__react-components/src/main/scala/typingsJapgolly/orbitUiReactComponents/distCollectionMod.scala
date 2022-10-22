package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.Content
import typingsJapgolly.orbitUiReactComponents.anon.IsLoading
import typingsJapgolly.orbitUiReactComponents.anon.Style
import typingsJapgolly.orbitUiReactComponents.anon.StyleHeight
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcItemMod.InnerItemProps
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcSectionMod.InnerSectionProps
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionItem
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionSearchMod.UseCollectionSearchOptions
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseScrollableCollectionMod.UseScrollableCollectionOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/collection", "CollectionBuilder")
  @js.native
  open class CollectionBuilder ()
    extends typingsJapgolly.orbitUiReactComponents.distCollectionSrcMod.CollectionBuilder
  
  inline def InnerItem(props: InnerItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSection(props: InnerSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSection")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/collection", "Item")
  @js.native
  val Item: OrbitComponent[HTMLElement, InnerItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/collection", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType & String
      ] = js.native
    
    /* "divider" */ val divider: typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.divider & String = js.native
    
    /* "item" */ val item: typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.item & String = js.native
    
    /* "section" */ val section: typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.section & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/collection", "Section")
  @js.native
  val Section: OrbitComponent[HTMLElement, InnerSectionProps] = js.native
  
  inline def createCollectionItem(hasKeyIndexElementTypeRefContentProps: CollectionItem): Content = ^.asInstanceOf[js.Dynamic].applyDynamic("createCollectionItem")(hasKeyIndexElementTypeRefContentProps.asInstanceOf[js.Any]).asInstanceOf[Content]
  
  inline def getItemText(item: CollectionNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemText")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isDivider(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDivider")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean]
  
  inline def isItem(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItem")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean]
  
  inline def isSection(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSection")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean]
  
  inline def reduceCollection(nodes: js.Array[CollectionNode], acceptItem: js.Function1[/* item */ CollectionItem, Boolean]): js.Array[CollectionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceCollection")(nodes.asInstanceOf[js.Any], acceptItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[CollectionItem]]
  
  inline def useAsyncSearch[T](load: js.Function2[/* query */ String, /* signal */ AbortSignal, js.Promise[js.Array[T]]]): IsLoading[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncSearch")(load.asInstanceOf[js.Any]).asInstanceOf[IsLoading[T]]
  
  inline def useCollection(children: Node): js.Array[CollectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollection")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionNode]]
  
  inline def useCollectionSearch(children: Node, hasOnSearch: UseCollectionSearchOptions): js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ ReactEventFrom[org.scalajs.dom.Element], /* query */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectionSearch")(children.asInstanceOf[js.Any], hasOnSearch.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ ReactEventFrom[org.scalajs.dom.Element], /* query */ String, Unit]
  ]]
  
  inline def useOnlyCollectionItems(nodes: js.Array[CollectionNode]): js.Array[CollectionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnlyCollectionItems")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionItem]]
  
  inline def useScrollableCollection(containerRef: RefHandle[org.scalajs.dom.Element]): Style | StyleHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any]).asInstanceOf[Style | StyleHeight]
  inline def useScrollableCollection(
    containerRef: RefHandle[org.scalajs.dom.Element],
    hasMaxHeightBorderHeightPaddingHeightItemSelectorSectionSelectorDividerSelectorDisabled: UseScrollableCollectionOptions
  ): Style | StyleHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any], hasMaxHeightBorderHeightPaddingHeightItemSelectorSectionSelectorDividerSelectorDisabled.asInstanceOf[js.Any])).asInstanceOf[Style | StyleHeight]
}
