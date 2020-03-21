package typingsJapgolly.antdMobile

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/list-view/PropsType", JSImport.Namespace)
@js.native
object listViewPropsTypeMod extends js.Object {
  @js.native
  trait ListViewPropsType extends js.Object {
    var className: js.UndefOr[String] = js.native
    /** The following is new added and does not exist in react-native */
    var contentContainerStyle: js.UndefOr[CSSProperties] = js.native
    var dataSource: js.Any = js.native
    var horizontal: js.UndefOr[Boolean] = js.native
    var initialListSize: js.UndefOr[Double] = js.native
    var listPrefixCls: js.UndefOr[String] = js.native
    var listViewPrefixCls: js.UndefOr[String] = js.native
    var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.native
    var onEndReached: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    var onEndReachedThreshold: js.UndefOr[Double] = js.native
    var onLayout: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
    var onScroll: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    var pageSize: js.UndefOr[Double] = js.native
    var prefixCls: js.UndefOr[String] = js.native
    var pullToRefresh: js.UndefOr[Node] = js.native
    var renderBodyComponent: js.UndefOr[js.Function0[Element]] = js.native
    var renderFooter: js.UndefOr[js.Function0[Element]] = js.native
    var renderHeader: js.UndefOr[js.Function0[Element]] = js.native
    var renderScrollComponent: js.UndefOr[js.Function1[/* p */ js.Any, Element]] = js.native
    var renderSectionBodyWrapper: js.UndefOr[js.Function0[Element]] = js.native
    var renderSectionHeader: js.UndefOr[js.Function2[/* sectionData */ js.Any, /* sectionId */ String | Double, Element]] = js.native
    var renderSectionWrapper: js.UndefOr[js.Function0[Element]] = js.native
    var renderSeparator: js.UndefOr[
        js.Function3[
          /* sectionID */ String | Double, 
          /* rowID */ String | Double, 
          /* adjacentRowHighlighted */ js.UndefOr[Boolean], 
          Element
        ]
      ] = js.native
    var scrollEventThrottle: js.UndefOr[Double] = js.native
    var scrollRenderAheadDistance: js.UndefOr[Double] = js.native
    var sectionBodyClassName: js.UndefOr[String] = js.native
    var style: js.UndefOr[CSSProperties] = js.native
    var useBodyScroll: js.UndefOr[Boolean] = js.native
    def renderRow(rowData: js.Any, sectionID: String, rowID: String): Element = js.native
    def renderRow(rowData: js.Any, sectionID: String, rowID: String, highlightRow: Boolean): Element = js.native
    def renderRow(rowData: js.Any, sectionID: String, rowID: Double): Element = js.native
    def renderRow(rowData: js.Any, sectionID: String, rowID: Double, highlightRow: Boolean): Element = js.native
    def renderRow(rowData: js.Any, sectionID: Double, rowID: String): Element = js.native
    def renderRow(rowData: js.Any, sectionID: Double, rowID: String, highlightRow: Boolean): Element = js.native
    def renderRow(rowData: js.Any, sectionID: Double, rowID: Double): Element = js.native
    def renderRow(rowData: js.Any, sectionID: Double, rowID: Double, highlightRow: Boolean): Element = js.native
  }
  
}

