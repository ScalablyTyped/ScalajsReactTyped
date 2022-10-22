package typingsJapgolly.slate.distInterfacesEditorMod

import typingsJapgolly.slate.distInterfacesElementMod.Element
import typingsJapgolly.slate.distInterfacesLocationMod.Location
import typingsJapgolly.slate.distInterfacesNodeMod.Ancestor
import typingsJapgolly.slate.distInterfacesNodeMod.Descendant
import typingsJapgolly.slate.distInterfacesNodeMod.Node
import typingsJapgolly.slate.distInterfacesNodeMod.NodeEntry
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.distInterfacesPathRefMod.PathRef
import typingsJapgolly.slate.distInterfacesPointMod.Point
import typingsJapgolly.slate.distInterfacesPointRefMod.PointRef
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slate.distInterfacesRangeRefMod.RangeRef
import typingsJapgolly.slate.distInterfacesTextMod.Text
import typingsJapgolly.slate.slateStrings.text_
import typingsJapgolly.std.Generator
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorInterface extends StObject {
  
  def above[T /* <: Ancestor */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def above[T /* <: Ancestor */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorAboveOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  def addMark(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, key: String, value: Any): Unit = js.native
  
  def after(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): js.UndefOr[Point] = js.native
  def after(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorAfterOptions
  ): js.UndefOr[Point] = js.native
  
  def before(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): js.UndefOr[Point] = js.native
  def before(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorBeforeOptions
  ): js.UndefOr[Point] = js.native
  
  def deleteBackward(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteBackward(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    options: EditorDirectedDeletionOptions
  ): Unit = js.native
  
  def deleteForward(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteForward(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    options: EditorDirectedDeletionOptions
  ): Unit = js.native
  
  def deleteFragment(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteFragment(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    options: EditorFragmentDeletionOptions
  ): Unit = js.native
  
  def edges(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): js.Tuple2[Point, Point] = js.native
  
  def end(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  
  def first(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  
  def fragment(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): js.Array[Descendant] = js.native
  
  def hasBlocks(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def hasInlines(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def hasPath(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, path: Path): Boolean = js.native
  
  def hasTexts(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def insertBreak(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit = js.native
  
  def insertFragment(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, fragment: js.Array[Node]): Unit = js.native
  
  def insertNode(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, node: Node): Unit = js.native
  
  def insertSoftBreak(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit = js.native
  
  def insertText(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, text: String): Unit = js.native
  
  def isBlock(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
  
  def isEdge(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  def isEditor(value: Any): /* is slate.slate/dist/interfaces/editor.Editor */ Boolean = js.native
  
  def isEmpty(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def isEnd(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  def isInline(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
  
  def isNormalizing(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Boolean = js.native
  
  def isStart(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  def isVoid(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
  
  def last(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  
  def leaf(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Text] = js.native
  def leaf(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorLeafOptions
  ): NodeEntry[Text] = js.native
  
  def levels[T /* <: Node */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = js.native
  def levels[T /* <: Node */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  def marks(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): (Omit[Text, text_]) | Null = js.native
  
  def next[T /* <: Descendant */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def next[T /* <: Descendant */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorNextOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  def node(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  def node(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorNodeOptions
  ): NodeEntry[Node] = js.native
  
  def nodes[T /* <: Node */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = js.native
  def nodes[T /* <: Node */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  def normalize(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def normalize(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorNormalizeOptions): Unit = js.native
  
  def parent(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Ancestor] = js.native
  def parent(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorParentOptions
  ): NodeEntry[Ancestor] = js.native
  
  def path(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): Path = js.native
  def path(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorPathOptions
  ): Path = js.native
  
  def pathRef(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, path: Path): PathRef = js.native
  def pathRef(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    path: Path,
    options: EditorPathRefOptions
  ): PathRef = js.native
  
  def pathRefs(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Set[PathRef] = js.native
  
  def point(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  def point(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorPointOptions
  ): Point = js.native
  
  def pointRef(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, point: Point): PointRef = js.native
  def pointRef(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    point: Point,
    options: EditorPointRefOptions
  ): PointRef = js.native
  
  def pointRefs(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Set[PointRef] = js.native
  
  def positions(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Generator[Point, Unit, Unit] = js.native
  def positions(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorPositionsOptions): Generator[Point, Unit, Unit] = js.native
  
  def previous[T /* <: Node */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def previous[T /* <: Node */](editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorPreviousOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  def range(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): Range = js.native
  def range(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location, to: Location): Range = js.native
  
  def rangeRef(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, range: Range): RangeRef = js.native
  def rangeRef(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    range: Range,
    options: EditorRangeRefOptions
  ): RangeRef = js.native
  
  def rangeRefs(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Set[RangeRef] = js.native
  
  def removeMark(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, key: String): Unit = js.native
  
  def setNormalizing(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, isNormalizing: Boolean): Unit = js.native
  
  def start(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  
  def string(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, at: Location): String = js.native
  def string(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    at: Location,
    options: EditorStringOptions
  ): String = js.native
  
  def unhangRange(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, range: Range): Range = js.native
  def unhangRange(
    editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor,
    range: Range,
    options: EditorUnhangRangeOptions
  ): Range = js.native
  
  def void(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[Element]] = js.native
  def void(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, options: EditorVoidOptions): js.UndefOr[NodeEntry[Element]] = js.native
  
  def withoutNormalizing(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor, fn: js.Function0[Unit]): Unit = js.native
}
