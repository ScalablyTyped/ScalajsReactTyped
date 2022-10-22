package typingsJapgolly.reactMdTree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdList.typesListMod.ListElement
import typingsJapgolly.reactMdTree.anon.NestedTreeItemUnknownTree
import typingsJapgolly.reactMdTree.typesTypesMod.ExpandedIds
import typingsJapgolly.reactMdTree.typesTypesMod.SelectedIds
import typingsJapgolly.reactMdTree.typesTypesMod.TreeData
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemId
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemSorter
import typingsJapgolly.reactMdTree.typesTypesMod.UnknownTreeItem
import typingsJapgolly.reactMdTree.typesUseFlattenedTreeListMod.MetadataRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseTreeMovementMod {
  
  @JSImport("@react-md/tree/types/useTreeMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTreeMovement(
    hasIdDataRootIdSortOnBlurOnFocusOnKeyDownMultiSelectSelectedIdsOnItemSelectOnMultiItemSelectExpandedIdsOnItemExpansionOnMultiItemExpansionValueKeyGetItemValue: Options
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMovement")(hasIdDataRootIdSortOnBlurOnFocusOnKeyDownMultiSelectSelectedIdsOnItemSelectOnMultiItemSelectExpandedIdsOnItemExpansionOnMultiItemExpansionValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  /* Inlined std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'id' | 'data' | 'sort' | 'onBlur' | 'onFocus' | 'onKeyDown' | 'multiSelect' | 'selectedIds' | 'onItemSelect' | 'onMultiItemSelect' | 'expandedIds' | 'onItemExpansion' | 'onMultiItemExpansion'> & std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue' | 'rootId'>> */
  trait Options extends StObject {
    
    var data: TreeData[UnknownTreeItem]
    
    var expandedIds: ExpandedIds
    
    var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String]
    
    var id: String
    
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[ListElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[ListElement]] = js.undefined
    
    var onItemExpansion: js.Function2[/* itemId */ TreeItemId, /* expanded */ Boolean, Unit]
    
    var onItemSelect: js.Function1[/* itemId */ TreeItemId, Unit]
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[ListElement]] = js.undefined
    
    var onMultiItemExpansion: Dispatch[SetStateAction[ExpandedIds]]
    
    var onMultiItemSelect: js.Function1[/* itemIds */ SelectedIds, Unit]
    
    var rootId: TreeItemId
    
    var selectedIds: SelectedIds
    
    var sort: js.UndefOr[TreeItemSorter[UnknownTreeItem]] = js.undefined
    
    var valueKey: String
  }
  object Options {
    
    inline def apply(
      data: TreeData[UnknownTreeItem],
      expandedIds: ExpandedIds,
      getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
      id: String,
      onItemExpansion: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Callback,
      onItemSelect: /* itemId */ TreeItemId => Callback,
      onMultiItemExpansion: SetStateAction[ExpandedIds] => Callback,
      onMultiItemSelect: /* itemIds */ SelectedIds => Callback,
      rootId: TreeItemId,
      selectedIds: SelectedIds,
      valueKey: String
    ): Options = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2((t0: /* itemId */ TreeItemId, t1: /* expanded */ Boolean) => (onItemExpansion(t0, t1)).runNow()), onItemSelect = js.Any.fromFunction1((t0: /* itemId */ TreeItemId) => onItemSelect(t0).runNow()), onMultiItemExpansion = js.Any.fromFunction1((t0: SetStateAction[ExpandedIds]) => onMultiItemExpansion(t0).runNow()), onMultiItemSelect = js.Any.fromFunction1((t0: /* itemIds */ SelectedIds) => onMultiItemSelect(t0).runNow()), rootId = rootId.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setData(value: TreeData[UnknownTreeItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExpandedIds(value: ExpandedIds): Self = StObject.set(x, "expandedIds", value.asInstanceOf[js.Any])
      
      inline def setExpandedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "expandedIds", js.Array(value*))
      
      inline def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[ListElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[ListElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[ListElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[ListElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnItemExpansion(value: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Callback): Self = StObject.set(x, "onItemExpansion", js.Any.fromFunction2((t0: /* itemId */ TreeItemId, t1: /* expanded */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnItemSelect(value: /* itemId */ TreeItemId => Callback): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1((t0: /* itemId */ TreeItemId) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[ListElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[ListElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMultiItemExpansion(value: SetStateAction[ExpandedIds] => Callback): Self = StObject.set(x, "onMultiItemExpansion", js.Any.fromFunction1((t0: SetStateAction[ExpandedIds]) => value(t0).runNow()))
      
      inline def setOnMultiItemSelect(value: /* itemIds */ SelectedIds => Callback): Self = StObject.set(x, "onMultiItemSelect", js.Any.fromFunction1((t0: /* itemIds */ SelectedIds) => value(t0).runNow()))
      
      inline def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIds(value: SelectedIds): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "selectedIds", js.Array(value*))
      
      inline def setSort(value: /* items */ js.Array[UnknownTreeItem] => js.Array[UnknownTreeItem]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnValue extends StObject {
    
    /**
      * The current treeitem's DOM id that is currently keyboard focused.
      */
    var activeId: String
    
    /**
      * A blur handler that should be passed to the tree list element that handles
      * removing the `aria-activedescendant` when the tree is no longer within
      * focus. This will also call the optional `onBlur` prop.
      */
    var handleBlur: FocusEventHandler[ListElement]
    
    /**
      * A focus handler that should be passed to the tree element that handles
      * conditionally setting the default `aria-activedescendant` id on first
      * focus. This will also call the optional `onFocus` prop.
      */
    var handleFocus: FocusEventHandler[ListElement]
    
    /**
      * The keydown handler that should be passed to the tree list element that
      * handles all the keyboard functionality and movement.
      *
      * This will also call the optional `onKeyDown` prop.
      */
    var handleKeyDown: KeyboardEventHandler[ListElement]
    
    /**
      * A record containing the DOM ids for each tree item along with a ref object
      * to provide to the itemRenderer for that item. This is just for a quick
      * lookup to help with all the tree traversal and keyboard movement.
      */
    var itemIdRefs: MetadataRecord
    
    /**
      * A nested list representation of the provided tree data. This is used for
      * rendering all the treeitem nodes.
      */
    var items: js.Array[NestedTreeItemUnknownTree]
    
    /**
      * A function that updates the `activeId` based on the provided `itemId`. This
      * should really only be used whenever an item is clicked with a mouse or
      * touch since the `activeId` will be updated automatically for all the other
      * flows.
      */
    def setActiveId(itemId: TreeItemId): Unit
  }
  object ReturnValue {
    
    inline def apply(
      activeId: String,
      handleBlur: ReactFocusEventFrom[ListElement & Element] => Callback,
      handleFocus: ReactFocusEventFrom[ListElement & Element] => Callback,
      handleKeyDown: ReactKeyboardEventFrom[ListElement & Element] => Callback,
      itemIdRefs: MetadataRecord,
      items: js.Array[NestedTreeItemUnknownTree],
      setActiveId: TreeItemId => Callback
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], handleBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[ListElement & Element]) => handleBlur(t0).runNow()), handleFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[ListElement & Element]) => handleFocus(t0).runNow()), handleKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[ListElement & Element]) => handleKeyDown(t0).runNow()), itemIdRefs = itemIdRefs.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1((t0: TreeItemId) => setActiveId(t0).runNow()))
      __obj.asInstanceOf[ReturnValue]
    }
    
    extension [Self <: ReturnValue](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setHandleBlur(value: ReactFocusEventFrom[ListElement & Element] => Callback): Self = StObject.set(x, "handleBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[ListElement & Element]) => value(t0).runNow()))
      
      inline def setHandleFocus(value: ReactFocusEventFrom[ListElement & Element] => Callback): Self = StObject.set(x, "handleFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[ListElement & Element]) => value(t0).runNow()))
      
      inline def setHandleKeyDown(value: ReactKeyboardEventFrom[ListElement & Element] => Callback): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[ListElement & Element]) => value(t0).runNow()))
      
      inline def setItemIdRefs(value: MetadataRecord): Self = StObject.set(x, "itemIdRefs", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSetActiveId(value: TreeItemId => Callback): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1((t0: TreeItemId) => value(t0).runNow()))
    }
  }
}
