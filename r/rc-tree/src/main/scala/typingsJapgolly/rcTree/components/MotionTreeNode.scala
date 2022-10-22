package typingsJapgolly.rcTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.FlattenNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.esMotionTreeNodeMod.MotionTreeNodeProps
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTree.esUtilsTreeUtilMod.TreeNodeRequiredProps
import typingsJapgolly.rcTree.rcTreeStrings.hide
import typingsJapgolly.rcTree.rcTreeStrings.show
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MotionTreeNode {
  
  inline def apply(
    active: Boolean,
    onMotionEnd: Callback,
    onMotionStart: Callback,
    treeNodeRequiredProps: TreeNodeRequiredProps[DataNode]
  ): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onMotionEnd = onMotionEnd.toJsFn, onMotionStart = onMotionStart.toJsFn, treeNodeRequiredProps = treeNodeRequiredProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MotionTreeNodeProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tree/es/MotionTreeNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def data(value: DataNode): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dragOver(value: Boolean): this.type = set("dragOver", value.asInstanceOf[js.Any])
    
    inline def dragOverGapBottom(value: Boolean): this.type = set("dragOverGapBottom", value.asInstanceOf[js.Any])
    
    inline def dragOverGapTop(value: Boolean): this.type = set("dragOverGapTop", value.asInstanceOf[js.Any])
    
    inline def eventKey(value: Key): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    
    inline def halfChecked(value: Boolean): this.type = set("halfChecked", value.asInstanceOf[js.Any])
    
    inline def icon(value: IconType): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): this.type = set("icon", js.Any.fromFunction1(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isEnd(value: js.Array[Boolean]): this.type = set("isEnd", value.asInstanceOf[js.Any])
    
    inline def isEndVarargs(value: Boolean*): this.type = set("isEnd", js.Array(value*))
    
    inline def isLeaf(value: Boolean): this.type = set("isLeaf", value.asInstanceOf[js.Any])
    
    inline def isStart(value: js.Array[Boolean]): this.type = set("isStart", value.asInstanceOf[js.Any])
    
    inline def isStartVarargs(value: Boolean*): this.type = set("isStart", js.Array(value*))
    
    inline def loaded(value: Boolean): this.type = set("loaded", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def motion(value: Any): this.type = set("motion", value.asInstanceOf[js.Any])
    
    inline def motionNodes(value: js.Array[FlattenNode[DataNode]]): this.type = set("motionNodes", value.asInstanceOf[js.Any])
    
    inline def motionNodesVarargs(value: FlattenNode[DataNode]*): this.type = set("motionNodes", js.Array(value*))
    
    inline def motionType(value: show | hide): this.type = set("motionType", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pos(value: String): this.type = set("pos", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def switcherIcon(value: IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    inline def switcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): this.type = set("switcherIcon", js.Any.fromFunction1(value))
    
    inline def switcherIconNull: this.type = set("switcherIcon", null)
    
    inline def switcherIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("switcherIcon", js.Array(value*))
    
    inline def switcherIconVdomElement(value: VdomElement): this.type = set("switcherIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: Node | (js.Function1[/* data */ DataNode, Node])): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleFunction1(value: /* data */ DataNode => Node): this.type = set("title", js.Any.fromFunction1(value))
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: MotionTreeNodeProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
