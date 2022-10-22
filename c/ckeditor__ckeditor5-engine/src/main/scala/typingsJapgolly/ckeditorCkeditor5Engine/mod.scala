package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.ckeditorCkeditor5Engine.anon.AffectsData
import typingsJapgolly.ckeditorCkeditor5Engine.anon.BaseVersion
import typingsJapgolly.ckeditorCkeditor5Engine.anon.BlockFillerMode
import typingsJapgolly.ckeditorCkeditor5Engine.anon.ClassName
import typingsJapgolly.ckeditorCkeditor5Engine.anon.End
import typingsJapgolly.ckeditorCkeditor5Engine.anon.FnCall
import typingsJapgolly.ckeditorCkeditor5Engine.anon.NonNullableBoxSides
import typingsJapgolly.ckeditorCkeditor5Engine.anon.OperationsA
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Value
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`0`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`1`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`2`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`3`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`4`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`5`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`6`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`7`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`8`
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.NodeSet
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.PositionStickiness
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerOptions
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverClickobserverMod.default
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.BoxSides
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewViewMod.View
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine", "ClickObserver")
  @js.native
  open class ClickObserver () extends default
  
  @JSImport("@ckeditor/ckeditor5-engine", "Conversion")
  @js.native
  open class Conversion protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcConversionConversionMod.default {
    def this(
      downcastDispatchers: js.Array[
            typingsJapgolly.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]
          ],
      upcastDispatchers: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default]
    ) = this()
    def this(
      downcastDispatchers: js.Array[
            typingsJapgolly.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]
          ],
      upcastDispatchers: typingsJapgolly.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default
    ) = this()
    def this(
      downcastDispatchers: typingsJapgolly.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object],
      upcastDispatchers: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default]
    ) = this()
    def this(
      downcastDispatchers: typingsJapgolly.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object],
      upcastDispatchers: typingsJapgolly.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default
    ) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "DataController")
  @js.native
  open class DataController protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcControllerDatacontrollerMod.default {
    /**
      * Creates a data controller instance.
      */
    def this(
      model: typingsJapgolly.ckeditorCkeditor5Engine.srcModelModelMod.Model,
      stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor
    ) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "DocumentSelection")
  @js.native
  open class DocumentSelection protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default {
    def this(doc: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "DomConverter")
  @js.native
  open class DomConverter protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default {
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
    def this(
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      options: BlockFillerMode
    ) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "DomEventData")
  @js.native
  open class DomEventData[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */] protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventdataMod.default[V, K, L] {
    def this(view: View, domEvent: K) = this()
    def this(
      view: View,
      domEvent: K,
      additionalData: Record[
            L, 
            /* import warning: importer.ImportType#apply Failed type conversion: K[L] */ js.Any
          ]
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine", "DomEventObserver")
  @js.native
  open class DomEventObserver ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default
  
  @JSImport("@ckeditor/ckeditor5-engine", "DowncastWriter")
  @js.native
  open class DowncastWriter[D /* <: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default */] protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[D] {
    def this(document: D) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "EditingController")
  @js.native
  open class EditingController protected ()
    extends StObject
       with typingsJapgolly.ckeditorCkeditor5Engine.srcControllerEditingcontrollerMod.EditingController {
    /**
      * Creates an editing controller instance.
      */
    def this(
      model: typingsJapgolly.ckeditorCkeditor5Engine.srcModelModelMod.Model,
      stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor
    ) = this()
    
    /**
      * Removes all event listeners attached to the `EditingController`. Destroys all objects created
      * by `EditingController` that need to be destroyed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Downcast dispatcher that converts changes from the model to {@link #view the editing view}.
      */
    /* CompleteClass */
    override val downcastDispatcher: typingsJapgolly.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object] = js.native
    
    /**
      * Mapper which describes the model-view binding.
      */
    /* CompleteClass */
    override val mapper: typingsJapgolly.ckeditorCkeditor5Engine.srcConversionMapperMod.default = js.native
    
    /**
      * Editor model.
      */
    /* CompleteClass */
    override val model: typingsJapgolly.ckeditorCkeditor5Engine.srcModelModelMod.Model = js.native
    
    /**
      * Editing view controller.
      */
    /* CompleteClass */
    override val view: View = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "Element")
  @js.native
  open class Element protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default {
    def this(name: String) = this()
    def this(name: String, attrs: js.Tuple2[String, String]) = this()
    def this(name: String, attrs: Record[String, String]) = this()
    def this(
      name: String,
      attrs: js.Tuple2[String, String],
      children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default]
    ) = this()
    def this(
      name: String,
      attrs: js.Tuple2[String, String],
      children: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ) = this()
    def this(
      name: String,
      attrs: Unit,
      children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default]
    ) = this()
    def this(
      name: String,
      attrs: Unit,
      children: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ) = this()
    def this(
      name: String,
      attrs: Record[String, String],
      children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default]
    ) = this()
    def this(
      name: String,
      attrs: Record[String, String],
      children: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ) = this()
  }
  /* static members */
  object Element {
    
    @JSImport("@ckeditor/ckeditor5-engine", "Element")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[FnCall]): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.Element]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "HtmlDataProcessor")
  @js.native
  open class HtmlDataProcessor protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorHtmldataprocessorMod.default {
    /**
      * Creates a new instance of the HTML data processor class.
      */
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "InsertOperation")
  @js.native
  open class InsertOperation protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default {
    /**
      * Creates an insert operation.
      */
    def this(position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default, nodes: NodeSet) = this()
    def this(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      nodes: NodeSet,
      baseVersion: Double
    ) = this()
  }
  /* static members */
  object InsertOperation {
    
    @JSImport("@ckeditor/ckeditor5-engine", "InsertOperation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine", "InsertOperation.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.InsertOperation = js.native
    
    /**
      * Creates `InsertOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: BaseVersion, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.InsertOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.InsertOperation]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "LivePosition")
  @js.native
  open class LivePosition protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelLivepositionMod.default {
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default,
      path: js.Array[Double]
    ) = this()
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ) = this()
  }
  /* static members */
  object LivePosition {
    
    @JSImport("@ckeditor/ckeditor5-engine", "LivePosition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromPosition(position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelLivepositionMod.LivePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPosition")(position.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelLivepositionMod.LivePosition]
    inline def fromPosition(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      stickiness: PositionStickiness
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelLivepositionMod.LivePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPosition")(position.asInstanceOf[js.Any], stickiness.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelLivepositionMod.LivePosition]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "LiveRange")
  @js.native
  open class LiveRange ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelLiverangeMod.default
  /* static members */
  object LiveRange {
    
    @JSImport("@ckeditor/ckeditor5-engine", "LiveRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromRange(range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelLiverangeMod.LiveRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelLiverangeMod.LiveRange]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "MarkerOperation")
  @js.native
  open class MarkerOperation protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default {
    def this(
      name: String,
      oldRange: Null,
      newRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean
    ) = this()
    def this(
      name: String,
      oldRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      newRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean
    ) = this()
    def this(
      name: String,
      oldRange: Null,
      newRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean,
      baseVersion: Double
    ) = this()
    def this(
      name: String,
      oldRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      newRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean,
      baseVersion: Double
    ) = this()
  }
  /* static members */
  object MarkerOperation {
    
    @JSImport("@ckeditor/ckeditor5-engine", "MarkerOperation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine", "MarkerOperation.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.MarkerOperation = js.native
    
    /**
      * Creates `MarkerOperation` object from deserialized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: AffectsData, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.MarkerOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.MarkerOperation]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "Matcher")
  @js.native
  open class Matcher protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewMatcherMod.default {
    def this(pattern: MatcherPattern*) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "Model")
  @js.native
  open class Model ()
    extends StObject
       with typingsJapgolly.ckeditorCkeditor5Engine.srcModelModelMod.Model
  
  @JSImport("@ckeditor/ckeditor5-engine", "MouseObserver")
  @js.native
  open class MouseObserver ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverMouseobserverMod.default
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine", "Observer")
  @js.native
  open class Observer[V /* <: View */] protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[V] {
    /**
      * Creates an instance of the observer.
      */
    def this(view: V) = this()
  }
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine", "OperationFactory")
  @js.native
  open class OperationFactory ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationfactoryMod.default
  /* static members */
  object OperationFactory {
    
    @JSImport("@ckeditor/ckeditor5-engine", "OperationFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ClassName, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationAttributeoperationMod.default[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationAttributeoperationMod.default[Any, Any]]
    inline def fromJSON(json: `0`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default]
    inline def fromJSON(json: `1`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default]
    inline def fromJSON(json: `2`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default]
    inline def fromJSON(json: `3`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationNooperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationNooperationMod.default]
    inline def fromJSON(json: `4`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRenameoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRenameoperationMod.default]
    inline def fromJSON(json: `5`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRootattributeoperationMod.default[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRootattributeoperationMod.default[Any, Any]]
    inline def fromJSON(json: `6`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default]
    inline def fromJSON(json: `7`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default]
    inline def fromJSON(json: `8`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Operation]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "Range")
  @js.native
  open class Range protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default {
    def this(start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default) = this()
    def this(
      start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      end: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ) = this()
  }
  /* static members */
  object Range {
    
    @JSImport("@ckeditor/ckeditor5-engine", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[js.Function0[End]], doc: Document): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.Range]
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "Renderer")
  @js.native
  open class Renderer protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewRendererMod.default {
    def this(
      domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default,
      selection: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentselectionMod.default
    ) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "StylesProcessor")
  @js.native
  open class StylesProcessor ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor
  
  @JSImport("@ckeditor/ckeditor5-engine", "TreeWalker")
  @js.native
  open class TreeWalker protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelTreewalkerMod.default {
    /**
      * Creates a range iterator. All parameters are optional, but you have to specify either `boundaries` or `startPosition`.
      */
    def this(options: TreeWalkerOptions) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "UpcastWriter")
  @js.native
  open class UpcastWriter protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewUpcastwriterMod.default {
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "ViewDocument")
  @js.native
  open class ViewDocument protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default {
    def this(stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor) = this()
  }
  
  inline def addBackgroundRules(stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBackgroundRules")(stylesProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addBorderRules(stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBorderRules")(stylesProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addMarginRules(stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMarginRules")(stylesProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addPaddingRules(stylesProcessor: typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPaddingRules")(stylesProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disablePlaceholder(view: View, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disablePlaceholder")(view.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enablePlaceholder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePlaceholder")().asInstanceOf[Unit]
  inline def enablePlaceholder(options: typingsJapgolly.ckeditorCkeditor5Engine.anon.Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePlaceholder")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getBoxSidesShorthandValue(styleShorthand: NonNullableBoxSides): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesShorthandValue")(styleShorthand.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBoxSidesValueReducer(styleShorthand: String): js.Function1[
    /* notation */ Record[String, js.UndefOr[String]], 
    js.Array[js.Tuple2[String, String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesValueReducer")(styleShorthand.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* notation */ Record[String, js.UndefOr[String]], 
    js.Array[js.Tuple2[String, String]]
  ]]
  
  inline def getBoxSidesValues(): BoxSides = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesValues")().asInstanceOf[BoxSides]
  inline def getBoxSidesValues(value: String): BoxSides = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesValues")(value.asInstanceOf[js.Any]).asInstanceOf[BoxSides]
  
  inline def getFillerOffset(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFillerOffset")().asInstanceOf[Double | Null]
  
  inline def getPositionShorthandNormalizer(shorthand: String): js.Function1[/* value */ String, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositionShorthandNormalizer")(shorthand.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ String, Value]]
  
  inline def getShorthandValues(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShorthandValues")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def hidePlaceholder(
    writer: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default],
    element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hidePlaceholder")(writer.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAttachment(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttachment")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isColor(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColor")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLength(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLineStyle(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineStyle")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPercentage(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentage")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPosition(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPosition")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRepeat(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeat")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isURL(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def needsPlaceholder(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, keepOnFocus: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needsPlaceholder")(element.asInstanceOf[js.Any], keepOnFocus.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def showPlaceholder(
    writer: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default],
    element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("showPlaceholder")(writer.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def transformSets(operationsA: js.Array[Operation], operationsB: js.Array[Operation]): OperationsA = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSets")(operationsA.asInstanceOf[js.Any], operationsB.asInstanceOf[js.Any])).asInstanceOf[OperationsA]
  inline def transformSets(
    operationsA: js.Array[Operation],
    operationsB: js.Array[Operation],
    options: typingsJapgolly.ckeditorCkeditor5Engine.anon.Document
  ): OperationsA = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSets")(operationsA.asInstanceOf[js.Any], operationsB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperationsA]
}
