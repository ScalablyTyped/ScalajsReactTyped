package typingsJapgolly.draftJs.mod.Draft.Model

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.draftJs.anon.PartialSelectionStateProp
import typingsJapgolly.draftJs.draftJsStrings.anchorKey
import typingsJapgolly.draftJs.draftJsStrings.anchorOffset
import typingsJapgolly.draftJs.draftJsStrings.focusKey
import typingsJapgolly.draftJs.draftJsStrings.focusOffset
import typingsJapgolly.draftJs.draftJsStrings.hasFocus
import typingsJapgolly.draftJs.draftJsStrings.isBackward
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEntityType
import typingsJapgolly.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typingsJapgolly.draftJs.mod.Draft.Model.Entity.DraftEntityInstance
import typingsJapgolly.immutable.mod.Map
import typingsJapgolly.immutable.mod.OrderedMap
import typingsJapgolly.immutable.mod.OrderedSet
import typingsJapgolly.immutable.mod.Stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImmutableData {
  
  type BlockMap = OrderedMap[String, ContentBlock]
  
  trait BlockMapBuilder extends StObject
  
  trait CharacterMetadata extends StObject {
    
    def getEntity(): String
    
    def getStyle(): DraftInlineStyle
    
    def hasStyle(style: String): Boolean
  }
  object CharacterMetadata {
    
    inline def apply(getEntity: CallbackTo[String], getStyle: CallbackTo[DraftInlineStyle], hasStyle: String => Boolean): CharacterMetadata = {
      val __obj = js.Dynamic.literal(getEntity = getEntity.toJsFn, getStyle = getStyle.toJsFn, hasStyle = js.Any.fromFunction1(hasStyle))
      __obj.asInstanceOf[CharacterMetadata]
    }
    
    extension [Self <: CharacterMetadata](x: Self) {
      
      inline def setGetEntity(value: CallbackTo[String]): Self = StObject.set(x, "getEntity", value.toJsFn)
      
      inline def setGetStyle(value: CallbackTo[DraftInlineStyle]): Self = StObject.set(x, "getStyle", value.toJsFn)
      
      inline def setHasStyle(value: String => Boolean): Self = StObject.set(x, "hasStyle", js.Any.fromFunction1(value))
    }
  }
  
  trait CharacterMetadataConfig extends StObject {
    
    var entity: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[DraftInlineStyle] = js.undefined
  }
  object CharacterMetadataConfig {
    
    inline def apply(): CharacterMetadataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CharacterMetadataConfig]
    }
    
    extension [Self <: CharacterMetadataConfig](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setStyle(value: DraftInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait ContentBlock extends StObject {
    
    /**
      * Execute a callback for every contiguous range of entities within the block.
      */
    def findEntityRanges(
      filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
      callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
    ): Unit
    
    /**
      * Execute a callback for every contiguous range of styles within the block.
      */
    def findStyleRanges(
      filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
      callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
    ): Unit
    
    def getCharacterList(): typingsJapgolly.immutable.mod.List[CharacterMetadata]
    
    def getData(): Map[Any, Any]
    
    def getDepth(): Double
    
    def getEntityAt(offset: Double): String
    
    def getInlineStyleAt(offset: Double): DraftInlineStyle
    
    def getKey(): String
    
    def getLength(): Double
    
    def getText(): String
    
    def getType(): DraftBlockType
  }
  object ContentBlock {
    
    inline def apply(
      findEntityRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Callback,
      findStyleRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Callback,
      getCharacterList: CallbackTo[typingsJapgolly.immutable.mod.List[CharacterMetadata]],
      getData: CallbackTo[Map[Any, Any]],
      getDepth: CallbackTo[Double],
      getEntityAt: Double => String,
      getInlineStyleAt: Double => DraftInlineStyle,
      getKey: CallbackTo[String],
      getLength: CallbackTo[Double],
      getText: CallbackTo[String],
      getType: CallbackTo[DraftBlockType]
    ): ContentBlock = {
      val __obj = js.Dynamic.literal(findEntityRanges = js.Any.fromFunction2((t0: js.Function1[/* value */ CharacterMetadata, Boolean], t1: js.Function2[/* start */ Double, /* end */ Double, Unit]) => (findEntityRanges(t0, t1)).runNow()), findStyleRanges = js.Any.fromFunction2((t0: js.Function1[/* value */ CharacterMetadata, Boolean], t1: js.Function2[/* start */ Double, /* end */ Double, Unit]) => (findStyleRanges(t0, t1)).runNow()), getCharacterList = getCharacterList.toJsFn, getData = getData.toJsFn, getDepth = getDepth.toJsFn, getEntityAt = js.Any.fromFunction1(getEntityAt), getInlineStyleAt = js.Any.fromFunction1(getInlineStyleAt), getKey = getKey.toJsFn, getLength = getLength.toJsFn, getText = getText.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[ContentBlock]
    }
    
    extension [Self <: ContentBlock](x: Self) {
      
      inline def setFindEntityRanges(
        value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "findEntityRanges", js.Any.fromFunction2((t0: js.Function1[/* value */ CharacterMetadata, Boolean], t1: js.Function2[/* start */ Double, /* end */ Double, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setFindStyleRanges(
        value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "findStyleRanges", js.Any.fromFunction2((t0: js.Function1[/* value */ CharacterMetadata, Boolean], t1: js.Function2[/* start */ Double, /* end */ Double, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetCharacterList(value: CallbackTo[typingsJapgolly.immutable.mod.List[CharacterMetadata]]): Self = StObject.set(x, "getCharacterList", value.toJsFn)
      
      inline def setGetData(value: CallbackTo[Map[Any, Any]]): Self = StObject.set(x, "getData", value.toJsFn)
      
      inline def setGetDepth(value: CallbackTo[Double]): Self = StObject.set(x, "getDepth", value.toJsFn)
      
      inline def setGetEntityAt(value: Double => String): Self = StObject.set(x, "getEntityAt", js.Any.fromFunction1(value))
      
      inline def setGetInlineStyleAt(value: Double => DraftInlineStyle): Self = StObject.set(x, "getInlineStyleAt", js.Any.fromFunction1(value))
      
      inline def setGetKey(value: CallbackTo[String]): Self = StObject.set(x, "getKey", value.toJsFn)
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[DraftBlockType]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait ContentState extends StObject {
    
    def addEntity(instance: DraftEntityInstance): ContentState = js.native
    
    def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability): ContentState = js.native
    def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability, data: js.Object): ContentState = js.native
    
    def getAllEntities(): OrderedMap[String, DraftEntityInstance] = js.native
    
    def getBlockAfter(key: String): js.UndefOr[ContentBlock] = js.native
    
    def getBlockBefore(key: String): js.UndefOr[ContentBlock] = js.native
    
    def getBlockForKey(key: String): ContentBlock = js.native
    
    def getBlockMap(): BlockMap = js.native
    
    def getBlocksAsArray(): js.Array[ContentBlock] = js.native
    
    def getEntity(key: String): Any = js.native
    
    def getEntityMap(): Any = js.native
    
    def getFirstBlock(): ContentBlock = js.native
    
    def getKeyAfter(key: String): String = js.native
    
    def getKeyBefore(key: String): String = js.native
    
    def getLastBlock(): ContentBlock = js.native
    
    def getLastCreatedEntityKey(): String = js.native
    
    def getPlainText(): String = js.native
    def getPlainText(delimiter: String): String = js.native
    
    def getSelectionAfter(): SelectionState = js.native
    
    def getSelectionBefore(): SelectionState = js.native
    
    def hasText(): Boolean = js.native
    
    def mergeEntityData(key: String, toMerge: StringDictionary[Any]): ContentState = js.native
    
    def replaceEntityData(key: String, toMerge: StringDictionary[Any]): ContentState = js.native
  }
  
  trait DraftBlockRenderConfig extends StObject {
    
    var element: String
    
    var wrapper: js.UndefOr[Node] = js.undefined
  }
  object DraftBlockRenderConfig {
    
    inline def apply(element: String): DraftBlockRenderConfig = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraftBlockRenderConfig]
    }
    
    extension [Self <: DraftBlockRenderConfig](x: Self) {
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: VdomNode): Self = StObject.set(x, "wrapper", value.rawNode.asInstanceOf[js.Any])
      
      inline def setWrapperNull: Self = StObject.set(x, "wrapper", null)
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
      
      inline def setWrapperVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "wrapper", js.Array(value*))
      
      inline def setWrapperVdomElement(value: VdomElement): Self = StObject.set(x, "wrapper", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type DraftInlineStyle = OrderedSet[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.`adjust-depth`
    - typingsJapgolly.draftJs.draftJsStrings.`apply-entity`
    - typingsJapgolly.draftJs.draftJsStrings.`backspace-character`
    - typingsJapgolly.draftJs.draftJsStrings.`change-block-data`
    - typingsJapgolly.draftJs.draftJsStrings.`change-block-type`
    - typingsJapgolly.draftJs.draftJsStrings.`change-inline-style`
    - typingsJapgolly.draftJs.draftJsStrings.`move-block`
    - typingsJapgolly.draftJs.draftJsStrings.`delete-character`
    - typingsJapgolly.draftJs.draftJsStrings.`insert-characters`
    - typingsJapgolly.draftJs.draftJsStrings.`insert-fragment`
    - typingsJapgolly.draftJs.draftJsStrings.redo
    - typingsJapgolly.draftJs.draftJsStrings.`remove-range`
    - typingsJapgolly.draftJs.draftJsStrings.`spellcheck-change`
    - typingsJapgolly.draftJs.draftJsStrings.`split-block`
    - typingsJapgolly.draftJs.draftJsStrings.undo
  */
  trait EditorChangeType extends StObject
  object EditorChangeType {
    
    inline def `adjust-depth`: typingsJapgolly.draftJs.draftJsStrings.`adjust-depth` = "adjust-depth".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`adjust-depth`]
    
    inline def `apply-entity`: typingsJapgolly.draftJs.draftJsStrings.`apply-entity` = "apply-entity".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`apply-entity`]
    
    inline def `backspace-character`: typingsJapgolly.draftJs.draftJsStrings.`backspace-character` = "backspace-character".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`backspace-character`]
    
    inline def `change-block-data`: typingsJapgolly.draftJs.draftJsStrings.`change-block-data` = "change-block-data".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`change-block-data`]
    
    inline def `change-block-type`: typingsJapgolly.draftJs.draftJsStrings.`change-block-type` = "change-block-type".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`change-block-type`]
    
    inline def `change-inline-style`: typingsJapgolly.draftJs.draftJsStrings.`change-inline-style` = "change-inline-style".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`change-inline-style`]
    
    inline def `delete-character`: typingsJapgolly.draftJs.draftJsStrings.`delete-character` = "delete-character".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`delete-character`]
    
    inline def `insert-characters`: typingsJapgolly.draftJs.draftJsStrings.`insert-characters` = "insert-characters".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`insert-characters`]
    
    inline def `insert-fragment`: typingsJapgolly.draftJs.draftJsStrings.`insert-fragment` = "insert-fragment".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`insert-fragment`]
    
    inline def `move-block`: typingsJapgolly.draftJs.draftJsStrings.`move-block` = "move-block".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`move-block`]
    
    inline def redo: typingsJapgolly.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.redo]
    
    inline def `remove-range`: typingsJapgolly.draftJs.draftJsStrings.`remove-range` = "remove-range".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`remove-range`]
    
    inline def `spellcheck-change`: typingsJapgolly.draftJs.draftJsStrings.`spellcheck-change` = "spellcheck-change".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`spellcheck-change`]
    
    inline def `split-block`: typingsJapgolly.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`split-block`]
    
    inline def undo: typingsJapgolly.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.undo]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait EditorState extends StObject {
    
    def getAllowUndo(): Boolean
    
    def getBlockTree(blockKey: String): typingsJapgolly.immutable.mod.List[Any]
    
    def getCurrentContent(): ContentState
    
    /**
      * Get the appropriate inline style for the editor state. If an
      * override is in place, use it. Otherwise, the current style is
      * based on the location of the selection state.
      */
    def getCurrentInlineStyle(): DraftInlineStyle
    
    def getDecorator(): DraftDecoratorType
    
    def getDirectionMap(): OrderedMap[Any, Any]
    
    /**
      * While editing, the user may apply inline style commands with a collapsed
      * cursor, intending to type text that adopts the specified style. In this
      * case, we track the specified style as an "override" that takes precedence
      * over the inline style of the text adjacent to the cursor.
      *
      * If null, there is no override in place.
      */
    def getInlineStyleOverride(): DraftInlineStyle
    
    def getLastChangeType(): EditorChangeType
    
    def getNativelyRenderedContent(): ContentState
    
    def getRedoStack(): Stack[ContentState]
    
    def getSelection(): SelectionState
    
    def getUndoStack(): Stack[ContentState]
    
    def isInCompositionMode(): Boolean
    
    def isSelectionAtEndOfContent(): Boolean
    
    def isSelectionAtStartOfContent(): Boolean
    
    def mustForceSelection(): Boolean
    
    def toJS(): js.Object
  }
  object EditorState {
    
    inline def apply(
      getAllowUndo: CallbackTo[Boolean],
      getBlockTree: String => typingsJapgolly.immutable.mod.List[Any],
      getCurrentContent: CallbackTo[ContentState],
      getCurrentInlineStyle: CallbackTo[DraftInlineStyle],
      getDecorator: CallbackTo[DraftDecoratorType],
      getDirectionMap: CallbackTo[OrderedMap[Any, Any]],
      getInlineStyleOverride: CallbackTo[DraftInlineStyle],
      getLastChangeType: CallbackTo[EditorChangeType],
      getNativelyRenderedContent: CallbackTo[ContentState],
      getRedoStack: CallbackTo[Stack[ContentState]],
      getSelection: CallbackTo[SelectionState],
      getUndoStack: CallbackTo[Stack[ContentState]],
      isInCompositionMode: CallbackTo[Boolean],
      isSelectionAtEndOfContent: CallbackTo[Boolean],
      isSelectionAtStartOfContent: CallbackTo[Boolean],
      mustForceSelection: CallbackTo[Boolean],
      toJS: CallbackTo[js.Object]
    ): EditorState = {
      val __obj = js.Dynamic.literal(getAllowUndo = getAllowUndo.toJsFn, getBlockTree = js.Any.fromFunction1(getBlockTree), getCurrentContent = getCurrentContent.toJsFn, getCurrentInlineStyle = getCurrentInlineStyle.toJsFn, getDecorator = getDecorator.toJsFn, getDirectionMap = getDirectionMap.toJsFn, getInlineStyleOverride = getInlineStyleOverride.toJsFn, getLastChangeType = getLastChangeType.toJsFn, getNativelyRenderedContent = getNativelyRenderedContent.toJsFn, getRedoStack = getRedoStack.toJsFn, getSelection = getSelection.toJsFn, getUndoStack = getUndoStack.toJsFn, isInCompositionMode = isInCompositionMode.toJsFn, isSelectionAtEndOfContent = isSelectionAtEndOfContent.toJsFn, isSelectionAtStartOfContent = isSelectionAtStartOfContent.toJsFn, mustForceSelection = mustForceSelection.toJsFn, toJS = toJS.toJsFn)
      __obj.asInstanceOf[EditorState]
    }
    
    extension [Self <: EditorState](x: Self) {
      
      inline def setGetAllowUndo(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowUndo", value.toJsFn)
      
      inline def setGetBlockTree(value: String => typingsJapgolly.immutable.mod.List[Any]): Self = StObject.set(x, "getBlockTree", js.Any.fromFunction1(value))
      
      inline def setGetCurrentContent(value: CallbackTo[ContentState]): Self = StObject.set(x, "getCurrentContent", value.toJsFn)
      
      inline def setGetCurrentInlineStyle(value: CallbackTo[DraftInlineStyle]): Self = StObject.set(x, "getCurrentInlineStyle", value.toJsFn)
      
      inline def setGetDecorator(value: CallbackTo[DraftDecoratorType]): Self = StObject.set(x, "getDecorator", value.toJsFn)
      
      inline def setGetDirectionMap(value: CallbackTo[OrderedMap[Any, Any]]): Self = StObject.set(x, "getDirectionMap", value.toJsFn)
      
      inline def setGetInlineStyleOverride(value: CallbackTo[DraftInlineStyle]): Self = StObject.set(x, "getInlineStyleOverride", value.toJsFn)
      
      inline def setGetLastChangeType(value: CallbackTo[EditorChangeType]): Self = StObject.set(x, "getLastChangeType", value.toJsFn)
      
      inline def setGetNativelyRenderedContent(value: CallbackTo[ContentState]): Self = StObject.set(x, "getNativelyRenderedContent", value.toJsFn)
      
      inline def setGetRedoStack(value: CallbackTo[Stack[ContentState]]): Self = StObject.set(x, "getRedoStack", value.toJsFn)
      
      inline def setGetSelection(value: CallbackTo[SelectionState]): Self = StObject.set(x, "getSelection", value.toJsFn)
      
      inline def setGetUndoStack(value: CallbackTo[Stack[ContentState]]): Self = StObject.set(x, "getUndoStack", value.toJsFn)
      
      inline def setIsInCompositionMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInCompositionMode", value.toJsFn)
      
      inline def setIsSelectionAtEndOfContent(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelectionAtEndOfContent", value.toJsFn)
      
      inline def setIsSelectionAtStartOfContent(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelectionAtStartOfContent", value.toJsFn)
      
      inline def setMustForceSelection(value: CallbackTo[Boolean]): Self = StObject.set(x, "mustForceSelection", value.toJsFn)
      
      inline def setToJS(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJS", value.toJsFn)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait SelectionState extends StObject {
    
    def getAnchorKey(): String = js.native
    
    def getAnchorOffset(): Double = js.native
    
    def getEndKey(): String = js.native
    
    def getEndOffset(): Double = js.native
    
    def getFocusKey(): String = js.native
    
    def getFocusOffset(): Double = js.native
    
    def getHasFocus(): Boolean = js.native
    
    def getIsBackward(): Boolean = js.native
    
    def getStartKey(): String = js.native
    
    def getStartOffset(): Double = js.native
    
    /**
      * Return whether the specified range overlaps with an edge of the
      * SelectionState.
      */
    def hasEdgeWithin(blockKey: String, start: Double, end: Double): Boolean = js.native
    
    def isCollapsed(): Boolean = js.native
    
    def merge(
      iterables: ((js.Iterable[anchorKey | anchorOffset | focusKey | focusOffset | isBackward | hasFocus]) | PartialSelectionStateProp)*
    ): SelectionState = js.native
    
    def serialize(): String = js.native
  }
  
  trait SelectionStateProperties extends StObject {
    
    var anchorKey: String
    
    var anchorOffset: Double
    
    var focusKey: String
    
    var focusOffset: Double
    
    var hasFocus: Boolean
    
    var isBackward: Boolean
  }
  object SelectionStateProperties {
    
    inline def apply(
      anchorKey: String,
      anchorOffset: Double,
      focusKey: String,
      focusOffset: Double,
      hasFocus: Boolean,
      isBackward: Boolean
    ): SelectionStateProperties = {
      val __obj = js.Dynamic.literal(anchorKey = anchorKey.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], focusKey = focusKey.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], hasFocus = hasFocus.asInstanceOf[js.Any], isBackward = isBackward.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionStateProperties]
    }
    
    extension [Self <: SelectionStateProperties](x: Self) {
      
      inline def setAnchorKey(value: String): Self = StObject.set(x, "anchorKey", value.asInstanceOf[js.Any])
      
      inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
      
      inline def setFocusKey(value: String): Self = StObject.set(x, "focusKey", value.asInstanceOf[js.Any])
      
      inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setIsBackward(value: Boolean): Self = StObject.set(x, "isBackward", value.asInstanceOf[js.Any])
    }
  }
}
