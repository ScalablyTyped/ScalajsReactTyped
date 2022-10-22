package typingsJapgolly.overlayscrollbars.mod

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.overlayscrollbars.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayScrollbarsStatic extends StObject {
  
  def apply(): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: Element): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: Element, options: Options): OverlayScrollbars = js.native
  def apply(element: Element, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def apply(element: HTMLElement): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: HTMLElement, options: Options): OverlayScrollbars = js.native
  def apply(element: HTMLElement, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def apply(elements: js.Array[Element]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: js.Array[Element],
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeList[Element & Node]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeList[Element & Node], filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: NodeList[Element & Node],
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeList[Element & Node], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeList[Element & Node], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: JQuery,
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(element: JQuery): js.UndefOr[OverlayScrollbars] = js.native
  
  def defaultOptions(): Options = js.native
  def defaultOptions(newDefaultOptions: Options): Unit = js.native
  
  def `extension`(): Dictindex = js.native
  def `extension`(extensionName: String): Unit = js.native
  def `extension`(
    extensionName: String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ Any, 
      Extension
    ]
  ): Unit = js.native
  def `extension`(
    extensionName: String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ Any, 
      Extension
    ],
    defaultOptions: js.Object
  ): Unit = js.native
  @JSName("extension")
  def extension_ExtensionInfo(extensionName: String): ExtensionInfo = js.native
  
  def globals(): Globals = js.native
  
  def valid(osInstance: Any): Boolean = js.native
}
