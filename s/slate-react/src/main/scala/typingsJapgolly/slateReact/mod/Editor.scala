package typingsJapgolly.slateReact.mod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Range
import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.SyntheticEvent
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Operation
import typingsJapgolly.slate.mod.Point
import typingsJapgolly.slate.mod.PointJSON
import typingsJapgolly.slate.mod.PointProperties
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import typingsJapgolly.slate.mod.SchemaProperties
import typingsJapgolly.slate.mod.Value
import typingsJapgolly.slateReact.AnonNode
import typingsJapgolly.slateReact.Fn0
import typingsJapgolly.slateReact.Fn1
import typingsJapgolly.slateReact.Fn10
import typingsJapgolly.slateReact.Fn11
import typingsJapgolly.slateReact.Fn12
import typingsJapgolly.slateReact.Fn13
import typingsJapgolly.slateReact.Fn14
import typingsJapgolly.slateReact.Fn2
import typingsJapgolly.slateReact.Fn3
import typingsJapgolly.slateReact.Fn4
import typingsJapgolly.slateReact.Fn5
import typingsJapgolly.slateReact.Fn6
import typingsJapgolly.slateReact.Fn7
import typingsJapgolly.slateReact.Fn8
import typingsJapgolly.slateReact.Fn9
import typingsJapgolly.slateReact.FnCall
import typingsJapgolly.slateReact.FnCallAnnotationNewProperties
import typingsJapgolly.slateReact.FnCallBlock
import typingsJapgolly.slateReact.FnCallCommand
import typingsJapgolly.slateReact.FnCallData
import typingsJapgolly.slateReact.FnCallDepth
import typingsJapgolly.slateReact.FnCallFn
import typingsJapgolly.slateReact.FnCallFragment
import typingsJapgolly.slateReact.FnCallInline
import typingsJapgolly.slateReact.FnCallKey
import typingsJapgolly.slateReact.FnCallKeyArgs
import typingsJapgolly.slateReact.FnCallKeyIndexFragment
import typingsJapgolly.slateReact.FnCallKeyIndexNode
import typingsJapgolly.slateReact.FnCallKeyNewKeyNewIndex
import typingsJapgolly.slateReact.FnCallKeyNode
import typingsJapgolly.slateReact.FnCallKeyOffset
import typingsJapgolly.slateReact.FnCallKeyOffsetLength
import typingsJapgolly.slateReact.FnCallKeyOffsetLengthMark
import typingsJapgolly.slateReact.FnCallKeyOffsetLengthPropertiesNewProperties
import typingsJapgolly.slateReact.FnCallKeyOffsetTextMarks
import typingsJapgolly.slateReact.FnCallKeyParent
import typingsJapgolly.slateReact.FnCallKeyProperties
import typingsJapgolly.slateReact.FnCallKeyTextKeyTextOffset
import typingsJapgolly.slateReact.FnCallKeyTextMarks
import typingsJapgolly.slateReact.FnCallMark
import typingsJapgolly.slateReact.FnCallMarkNewMark
import typingsJapgolly.slateReact.FnCallN
import typingsJapgolly.slateReact.FnCallNode
import typingsJapgolly.slateReact.FnCallOperation
import typingsJapgolly.slateReact.FnCallPath
import typingsJapgolly.slateReact.FnCallPathBlock
import typingsJapgolly.slateReact.FnCallPathIndexFragment
import typingsJapgolly.slateReact.FnCallPathIndexNode
import typingsJapgolly.slateReact.FnCallPathN
import typingsJapgolly.slateReact.FnCallPathNewNode
import typingsJapgolly.slateReact.FnCallPathNewPathNewIndex
import typingsJapgolly.slateReact.FnCallPathNewProperties
import typingsJapgolly.slateReact.FnCallPathOffset
import typingsJapgolly.slateReact.FnCallPathOffsetLength
import typingsJapgolly.slateReact.FnCallPathOffsetLengthMark
import typingsJapgolly.slateReact.FnCallPathOffsetLengthMarks
import typingsJapgolly.slateReact.FnCallPathOffsetLengthPropertiesNewProperties
import typingsJapgolly.slateReact.FnCallPathOffsetLengthTextMarks
import typingsJapgolly.slateReact.FnCallPathOffsetTextMarks
import typingsJapgolly.slateReact.FnCallPathParent
import typingsJapgolly.slateReact.FnCallPathPositionOptions
import typingsJapgolly.slateReact.FnCallPathProperties
import typingsJapgolly.slateReact.FnCallPathTextMarks
import typingsJapgolly.slateReact.FnCallPathTextPathTextOffset
import typingsJapgolly.slateReact.FnCallPrefixSuffix
import typingsJapgolly.slateReact.FnCallProperties
import typingsJapgolly.slateReact.FnCallPropertiesOptions
import typingsJapgolly.slateReact.FnCallQuery
import typingsJapgolly.slateReact.FnCallQueryArgs
import typingsJapgolly.slateReact.FnCallRange
import typingsJapgolly.slateReact.FnCallRangeBlock
import typingsJapgolly.slateReact.FnCallRangeFragment
import typingsJapgolly.slateReact.FnCallRangeHeight
import typingsJapgolly.slateReact.FnCallRangeInline
import typingsJapgolly.slateReact.FnCallRangeMark
import typingsJapgolly.slateReact.FnCallRangeMarks
import typingsJapgolly.slateReact.FnCallRangeN
import typingsJapgolly.slateReact.FnCallRangePrefixSuffix
import typingsJapgolly.slateReact.FnCallRangeProperties
import typingsJapgolly.slateReact.FnCallRangeText
import typingsJapgolly.slateReact.FnCallText
import typingsJapgolly.slateReact.FnCallTypeArgs
import typingsJapgolly.std.Element
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "Editor")
@js.native
class Editor ()
  extends Component[EditorProps[Editor], EditorState, js.Any]
     with Controller {
  // Controller
  var addAnnotation: FnCall = js.native
  var addMark: FnCallMark = js.native
  var addMarkAtRange: FnCallRangeMark = js.native
  var addMarkByKey: FnCallKeyOffsetLengthMark = js.native
  var addMarkByPath: FnCallPathOffsetLengthMark = js.native
  var addMarks: Fn0 = js.native
  var addMarksAtRange: FnCallRangeMarks = js.native
  var addMarksByPath: FnCallPathOffsetLengthMarks = js.native
  var applyOperation: FnCallOperation = js.native
  @JSName("blur")
  var blur_FEditor: Fn1 = js.native
  var command: FnCallTypeArgs = js.native
  var controller: typingsJapgolly.slate.mod.Editor = js.native
  var deleteAtRange: FnCallRange = js.native
  var deleteBackwardAtRange: FnCallRangeN = js.native
  @JSName("deleteBackward")
  var deleteBackward_FEditor: FnCallN = js.native
  var deleteCharBackwardAtRange: FnCallRange = js.native
  @JSName("deleteCharBackward")
  var deleteCharBackward_FEditor: Fn1 = js.native
  var deleteCharForwardAtRange: FnCallRange = js.native
  @JSName("deleteCharForward")
  var deleteCharForward_FEditor: Fn1 = js.native
  var deleteForwardAtRange: FnCallRangeN = js.native
  @JSName("deleteForward")
  var deleteForward_FEditor: FnCallN = js.native
  var deleteLineBackwardAtRange: FnCallRange = js.native
  @JSName("deleteLineBackward")
  var deleteLineBackward_FEditor: Fn1 = js.native
  var deleteLineForwardAtRange: FnCallRange = js.native
  @JSName("deleteLineForward")
  var deleteLineForward_FEditor: Fn1 = js.native
  var deleteWordBackwardAtRange: FnCallRange = js.native
  @JSName("deleteWordBackward")
  var deleteWordBackward_FEditor: Fn1 = js.native
  var deleteWordForwardAtRange: FnCallRange = js.native
  @JSName("deleteWordForward")
  var deleteWordForward_FEditor: Fn1 = js.native
  @JSName("delete")
  var delete_FEditor: Fn1 = js.native
  @JSName("deselect")
  var deselect_FEditor: Fn1 = js.native
  @JSName("flip")
  var flip_FEditor: Fn1 = js.native
  @JSName("focus")
  var focus_FEditor: Fn1 = js.native
  var hasCommand: js.Function1[/* type */ String, Boolean] = js.native
  var hasQuery: js.Function1[/* type */ String, Boolean] = js.native
  var insertBlock: FnCallBlock = js.native
  var insertBlockAtRange: FnCallRangeBlock = js.native
  var insertFragment: FnCallFragment = js.native
  var insertFragmentAtRange: FnCallRangeFragment = js.native
  var insertFragmentByKey: FnCallKeyIndexFragment = js.native
  var insertFragmentByPath: FnCallPathIndexFragment = js.native
  var insertInline: FnCallInline = js.native
  var insertInlineAtRange: FnCallRangeInline = js.native
  var insertNodeByKey: FnCallKeyIndexNode = js.native
  var insertNodeByPath: FnCallPathIndexNode = js.native
  var insertText: FnCallText = js.native
  var insertTextAtRange: FnCallRangeText = js.native
  var insertTextByKey: FnCallKeyOffsetTextMarks = js.native
  var insertTextByPath: FnCallPathOffsetTextMarks = js.native
  var mergeNodeByKey: FnCallKey = js.native
  var mergeNodeByPath: FnCallPath = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: FnCallN = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: FnCallN = js.native
  var moveAnchorTo: FnCallPathOffset = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: Fn1 = js.native
  var moveAnchorToEndOfNode: FnCallNode = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: Fn1 = js.native
  var moveAnchorToStartOfNode: FnCallNode = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveAnchorWordBackward")
  var moveAnchorWordBackward_FEditor: Fn1 = js.native
  @JSName("moveAnchorWordForward")
  var moveAnchorWordForward_FEditor: Fn1 = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: FnCallN = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: FnCallN = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: FnCallN = js.native
  var moveEndTo: FnCallPathOffset = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: Fn1 = js.native
  var moveEndToEndOfNode: FnCallNode = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: Fn1 = js.native
  var moveEndToStartOfNode: FnCallNode = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveEndWordBackward")
  var moveEndWordBackward_FEditor: Fn1 = js.native
  @JSName("moveEndWordForward")
  var moveEndWordForward_FEditor: Fn1 = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: FnCallN = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: FnCallN = js.native
  var moveFocusTo: FnCallPathOffset = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: Fn1 = js.native
  var moveFocusToEndOfNode: FnCallNode = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: Fn1 = js.native
  var moveFocusToStartOfNode: FnCallNode = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveFocusWordBackward")
  var moveFocusWordBackward_FEditor: Fn1 = js.native
  @JSName("moveFocusWordForward")
  var moveFocusWordForward_FEditor: Fn1 = js.native
  @JSName("moveForward")
  var moveForward_FEditor: FnCallN = js.native
  var moveNodeByKey: FnCallKeyNewKeyNewIndex = js.native
  var moveNodeByPath: FnCallPathNewPathNewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: FnCallN = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: FnCallN = js.native
  var moveStartTo: FnCallPathN = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: Fn1 = js.native
  var moveStartToEndOfNode: FnCallNode = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: Fn1 = js.native
  var moveStartToStartOfNode: FnCallNode = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveStartWordBackward")
  var moveStartWordBackward_FEditor: Fn1 = js.native
  @JSName("moveStartWordForward")
  var moveStartWordForward_FEditor: Fn1 = js.native
  var moveTo: FnCallPathOffset = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: Fn1 = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: Fn1 = js.native
  var moveToEndOfNode: FnCallNode = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: Fn1 = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: Fn1 = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: Fn1 = js.native
  var moveToRangeOfNode: FnCallNode = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: Fn1 = js.native
  var moveToStartOfNode: FnCallNode = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: Fn1 = js.native
  @JSName("moveWordBackward")
  var moveWordBackward_FEditor: Fn1 = js.native
  @JSName("moveWordForward")
  var moveWordForward_FEditor: Fn1 = js.native
  @JSName("normalize")
  var normalize_FEditor: Fn1 = js.native
  val operations: List[Operation] = js.native
  val plugins: js.Array[Plugin[Editor]] = js.native
  var query: FnCallQueryArgs = js.native
  val readOnly: Boolean = js.native
  @JSName("redo")
  var redo_FEditor: Fn1 = js.native
  var registerCommand: FnCallCommand = js.native
  var registerQuery: FnCallQuery = js.native
  var removeAllMarksByKey: FnCallKey = js.native
  var removeAllMarksByPath: FnCallPath = js.native
  var removeAnnotation: FnCall = js.native
  var removeMark: Fn4 = js.native
  var removeMarkAtRange: Fn7 = js.native
  var removeMarkByKey: FnCallKeyOffsetLengthMark = js.native
  var removeMarkByPath: FnCallPathOffsetLengthMark = js.native
  var removeMarksByPath: FnCallPathOffsetLengthMarks = js.native
  var removeNodeByKey: FnCallKey = js.native
  var removeNodeByPath: FnCallPath = js.native
  var removeTextByKey: FnCallKeyOffsetLength = js.native
  var removeTextByPath: FnCallPathOffsetLength = js.native
  var replaceMark: FnCallMarkNewMark = js.native
  var replaceNodeByKey: FnCallKeyNode = js.native
  var replaceNodeByPath: FnCallPathNewNode = js.native
  var replaceTextByKey: FnCallKeyNode = js.native
  var replaceTextByPath: FnCallPathOffsetLengthTextMarks = js.native
  var run: FnCallKeyArgs = js.native
  var save: js.Function1[/* operation */ Operation, Unit] = js.native
  var select: FnCallPropertiesOptions = js.native
  var setAnchor: js.Function1[/* point */ Point, Unit] = js.native
  var setAnnotation: FnCallAnnotationNewProperties = js.native
  var setBlocks: FnCallProperties = js.native
  var setBlocksAtRange: FnCallRangeProperties = js.native
  var setData: FnCallData = js.native
  var setEnd: js.Function1[/* point */ Point, Unit] = js.native
  var setFocus: js.Function1[/* point */ Point, Unit] = js.native
  var setInlines: Fn2 = js.native
  var setInlinesAtRange: Fn8 = js.native
  var setMarkByKey: FnCallKeyOffsetLengthPropertiesNewProperties = js.native
  var setMarkByPath: FnCallPathOffsetLengthPropertiesNewProperties = js.native
  var setNodeByKey: FnCallKeyProperties = js.native
  var setNodeByPath: FnCallPathNewProperties = js.native
  var setStart: js.Function1[/* point */ Point, Unit] = js.native
  var setTextByKey: FnCallKeyTextMarks = js.native
  var setTextByPath: FnCallPathTextMarks = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: Fn1 = js.native
  var splitBlockAtRange: FnCallRangeHeight = js.native
  @JSName("splitBlock")
  var splitBlock_FEditor: FnCallDepth = js.native
  var splitDescendantsByKey: FnCallKeyTextKeyTextOffset = js.native
  var splitDescendantsByPath: FnCallPathTextPathTextOffset = js.native
  var splitInline: Fn3 = js.native
  var splitInlineAtRange: FnCallRangeHeight = js.native
  var splitNodeByKey: FnCallKeyOffset = js.native
  var splitNodeByPath: FnCallPathPositionOptions = js.native
  var toggleMark: FnCallMark = js.native
  var toggleMarkAtRange: Fn7 = js.native
  @JSName("undo")
  var undo_FEditor: Fn1 = js.native
  var unwrapBlock: Fn5 = js.native
  var unwrapBlockAtRange: Fn9 = js.native
  var unwrapBlockByKey: Fn10 = js.native
  var unwrapBlockByPath: FnCallPathProperties = js.native
  var unwrapChildrenByKey: FnCallKey = js.native
  var unwrapChildrenByPath: Fn11 = js.native
  var unwrapInline: Fn6 = js.native
  var unwrapInlineAtRange: Fn8 = js.native
  var unwrapInlineByKey: Fn12 = js.native
  var unwrapInlineByPath: Fn13 = js.native
  var unwrapNodeByKey: FnCallKey = js.native
  var unwrapNodeByPath: FnCallPath = js.native
  val value: Value = js.native
  var withoutMerging: Fn14 = js.native
  var withoutNormalizing: FnCallFn = js.native
  var withoutSaving: Fn14 = js.native
  var wrapBlock: Fn5 = js.native
  var wrapBlockAtRange: Fn9 = js.native
  var wrapBlockByKey: Fn10 = js.native
  var wrapBlockByPath: FnCallPathBlock = js.native
  var wrapInline: Fn6 = js.native
  var wrapInlineAtRange: Fn8 = js.native
  var wrapInlineByKey: Fn12 = js.native
  var wrapInlineByPath: Fn13 = js.native
  var wrapNodeByKey: FnCallKeyParent = js.native
  var wrapNodeByPath: FnCallPathParent = js.native
  var wrapText: FnCallPrefixSuffix = js.native
  var wrapTextAtRange: FnCallRangePrefixSuffix = js.native
  def findDOMNode(path: js.Array[Double]): Node | Null = js.native
  def findDOMNode(path: List[Double]): Node | Null = js.native
  def findDOMPoint(point: Point): AnonNode | Null = js.native
  def findDOMPoint(point: PointJSON): AnonNode | Null = js.native
  def findDOMPoint(point: PointProperties): AnonNode | Null = js.native
  def findDOMRange(range: RangeType): Range | Null = js.native
  def findDOMRange(range: RangeTypeJSON): Range | Null = js.native
  def findDOMRange(range: RangeTypeProperties): Range | Null = js.native
  def findEventRange(event: SyntheticEvent[Element, Event_]): typingsJapgolly.slate.mod.Range | Null = js.native
  def findEventRange(event: Event_): typingsJapgolly.slate.mod.Range | Null = js.native
  def findNode(element: org.scalajs.dom.raw.Element): typingsJapgolly.slate.mod.Node | Null = js.native
  def findPath(element: org.scalajs.dom.raw.Element): List[Double] | Null = js.native
  def findPoint(nativeNode: org.scalajs.dom.raw.Element, nativeOffset: Double): Point | Null = js.native
  def findRange(domRange: typingsJapgolly.std.Range): typingsJapgolly.slate.mod.Range | Null = js.native
  def findRange(domRange: Selection): typingsJapgolly.slate.mod.Range | Null = js.native
  def findSelection(domSelection: org.scalajs.dom.raw.Selection): typingsJapgolly.slate.mod.Selection | Null = js.native
  // Instance methods
  def resolveController(
    plugins: js.Array[Plugin[Editor]],
    schema: SchemaProperties,
    commands: js.Array[_],
    queries: js.Array[_]
  ): Unit = js.native
}

