package typingsJapgolly.overlayscrollbars.mod

import typingsJapgolly.overlayscrollbars.AnonDictindex
import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayScrollbarsStatic extends js.Object {
  def apply(): js.UndefOr[OverlayScrollbars] = js.native
  def apply(elements: js.Array[Element]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: js.Array[Element],
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: JQuery,
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element], filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: NodeListOf[Element],
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(element: JQuery): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: Element): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: Element, options: Options): OverlayScrollbars = js.native
  def apply(element: Element, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def apply(element: HTMLElement): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: HTMLElement, options: Options): OverlayScrollbars = js.native
  def apply(element: HTMLElement, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def defaultOptions(): Options = js.native
  def defaultOptions(newDefaultOptions: Options): Unit = js.native
  def extension(): AnonDictindex = js.native
  def extension(extensionName: String): Unit = js.native
  def extension(
    extensionName: String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ js.Any, 
      Extension
    ]
  ): Unit = js.native
  def extension(
    extensionName: String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ js.Any, 
      Extension
    ],
    defaultOptions: js.Object
  ): Unit = js.native
  @JSName("extension")
  def extension_ExtensionInfo(extensionName: String): ExtensionInfo = js.native
  def globals(): Globals = js.native
  def valid(osInstance: js.Any): Boolean = js.native
}

