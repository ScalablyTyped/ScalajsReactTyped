package typingsJapgolly.reactVirtualizedAutoSizer.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizerProps extends js.Object {
  /** Optional custom CSS class name to attach to root AutoSizer element.    */
  var className: js.UndefOr[String] = js.undefined
  /** Default height to use for initial render; useful for SSR */
  var defaultHeight: js.UndefOr[Double] = js.undefined
  /** Default width to use for initial render; useful for SSR */
  var defaultWidth: js.UndefOr[Double] = js.undefined
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[Boolean] = js.undefined
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[Boolean] = js.undefined
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[String] = js.undefined
  /** Callback to be invoked on-resize */
  var onResize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Function responsible for rendering children. */
  def children(size: Size): Node
}

object AutoSizerProps {
  @scala.inline
  def apply(
    children: Size => CallbackTo[Node],
    className: String = null,
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    disableHeight: js.UndefOr[Boolean] = js.undefined,
    disableWidth: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onResize: /* size */ Size => Callback = null,
    style: CSSProperties = null
  ): AutoSizerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualizedAutoSizer.mod.Size) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* size */ typingsJapgolly.reactVirtualizedAutoSizer.mod.Size) => onResize(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSizerProps]
  }
}

