package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.rcTreeSelect.interfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/OptionList", JSImport.Namespace)
@js.native
object optionListMod extends js.Object {
  @js.native
  trait OptionListProps[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
    var childrenAsData: Boolean = js.native
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    var flattenOptions: js.Array[FlattenDataNode] = js.native
    var height: Double = js.native
    var id: String = js.native
    var itemHeight: Double = js.native
    var menuItemSelectedIcon: js.UndefOr[js.Any] = js.native
    var multiple: Boolean = js.native
    var notFoundContent: js.UndefOr[Node] = js.native
    var onScroll: UIEventHandler[HTMLDivElement] = js.native
    var open: Boolean = js.native
    var options: OptionsType = js.native
    var prefixCls: String = js.native
    var searchValue: String = js.native
    var values: Set[RawValueType] = js.native
    /** Tell Select that some value is now active to make accessibility work */
    def onActiveValue(value: RawValueType, index: Double): Unit = js.native
    def onSelect(value: RawValueType, option: AnonSelected): Unit = js.native
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
  }
  
  val default: ForwardRefExoticComponent[
    OptionListProps[js.Array[DataNode]] with (RefAttributes[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefOptionListProps */ _
    ])
  ] = js.native
}

