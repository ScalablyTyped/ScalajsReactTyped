package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsJapgolly.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsJapgolly.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsJapgolly.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typingsJapgolly.blueprintjsSelect.omnibarMod.IOmnibarProps
import typingsJapgolly.blueprintjsSelect.queryListMod.IQueryListProps
import typingsJapgolly.blueprintjsSelect.selectMod.ISelectProps
import typingsJapgolly.blueprintjsSelect.suggestMod.ISuggestProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MultiSelect[T] ()
    extends typingsJapgolly.blueprintjsSelect.componentsMod.MultiSelect[T]
  
  @js.native
  class Omnibar[T] ()
    extends typingsJapgolly.blueprintjsSelect.componentsMod.Omnibar[T]
  
  @js.native
  class QueryList[T] protected ()
    extends typingsJapgolly.blueprintjsSelect.componentsMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  
  @js.native
  class Select[T] ()
    extends typingsJapgolly.blueprintjsSelect.componentsMod.Select[T]
  
  @js.native
  class Suggest[T] ()
    extends typingsJapgolly.blueprintjsSelect.componentsMod.Suggest[T]
  
  def executeItemsEqual[T](): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: js.UndefOr[scala.Nothing], itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: Null, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  def getActiveItem[T](): T | Null = js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  def getCreateNewItem(): ICreateNewItem = js.native
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: String): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: String, direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def renderFilteredItems(props: IItemListRendererProps[_]): Node = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: Node): Node = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: Node, initialContent: Node): Node = js.native
  @js.native
  object Classes extends js.Object {
    val MULTISELECT: String = js.native
    val MULTISELECT_POPOVER: String = js.native
    val MULTISELECT_TAG_INPUT_INPUT: String = js.native
    val OMNIBAR: String = js.native
    val OMNIBAR_OVERLAY: String = js.native
    val SELECT: String = js.native
    val SELECT_POPOVER: String = js.native
  }
  
  /* static members */
  @js.native
  object MultiSelect extends js.Object {
    var defaultProps: AnonFill = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IMultiSelectProps[T], 
        typingsJapgolly.blueprintjsSelect.multiSelectMod.MultiSelect[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IOmnibarProps[T], 
        typingsJapgolly.blueprintjsSelect.omnibarMod.Omnibar[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object QueryList extends js.Object {
    var defaultProps: AnonDisabled = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IQueryListProps[T], 
        typingsJapgolly.blueprintjsSelect.queryListMod.QueryList[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Select extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ ISelectProps[T], typingsJapgolly.blueprintjsSelect.selectMod.Select[T]] = js.native
  }
  
  /* static members */
  @js.native
  object Suggest extends js.Object {
    var defaultProps: PartialISuggestPropsany = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ ISuggestProps[T], 
        typingsJapgolly.blueprintjsSelect.suggestMod.Suggest[T]
      ] = js.native
  }
  
}

