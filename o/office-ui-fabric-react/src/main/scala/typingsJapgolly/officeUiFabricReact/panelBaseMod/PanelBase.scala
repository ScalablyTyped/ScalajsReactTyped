package typingsJapgolly.officeUiFabricReact.panelBaseMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.PartialIPanelState
import typingsJapgolly.officeUiFabricReact.ReadonlyIPanelProps
import typingsJapgolly.officeUiFabricReact.ReadonlyIPanelState
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanel
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
class PanelBase protected ()
  extends BaseComponent[IPanelProps, IPanelState]
     with IPanel {
  def this(props: IPanelProps) = this()
  var _allowScrollOnPanel: js.Any = js.native
  var _allowTouchBodyScroll: js.Any = js.native
  var _animateTo: js.Any = js.native
  var _animationCallback: js.Any = js.native
  var _classNames: js.Any = js.native
  var _clearExistingAnimationTimer: js.Any = js.native
  var _dismissOnOuterClick: js.Any = js.native
  var _hasCustomNavigation: js.Any = js.native
  var _headerTextId: js.Any = js.native
  var _onPanelClick: js.Any = js.native
  var _onRenderBody: js.Any = js.native
  var _onRenderFooter: js.Any = js.native
  var _onRenderHeader: js.Any = js.native
  var _onRenderNavigation: js.Any = js.native
  var _onRenderNavigationContent: js.Any = js.native
  var _onTransitionComplete: js.Any = js.native
  var _panel: js.Any = js.native
  var _scrollableContent: js.Any = js.native
  var _shouldListenForOuterClick: js.Any = js.native
  var _updateFooterPosition: js.Any = js.native
  /** isActive is true when panel is open or opening. */
  val isActive: Boolean = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPanelBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPanelBase(previousProps: IPanelProps, previousState: IPanelState): Unit = js.native
  def dismiss(ev: ReactEventFrom[HTMLElement]): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
object PanelBase extends js.Object {
  var defaultProps: IPanelProps = js.native
  def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
}

