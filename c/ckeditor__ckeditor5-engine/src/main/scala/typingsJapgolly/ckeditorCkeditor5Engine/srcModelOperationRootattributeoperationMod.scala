package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Root
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`13`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.addRootAttribute
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.changeRootAttribute
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.removeRootAttribute
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationRootattributeoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/rootattributeoperation", JSImport.Default)
  @js.native
  open class default[O, N] protected ()
    extends StObject
       with RootAttributeOperation[O, N] {
    /**
      * Creates an operation that changes, removes or adds attributes on root element.
      */
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default,
      key: String,
      oldValue: O,
      newValue: N
    ) = this()
    def this(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default,
      key: String,
      oldValue: O,
      newValue: N,
      baseVersion: Double
    ) = this()
    
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    /* CompleteClass */
    var batch: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default | Null = js.native
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    /* CompleteClass */
    @JSName("clone")
    override def clone_MRootAttributeOperation(): RootAttributeOperation[Any, Any] = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MRootAttributeOperation(): RootAttributeOperation[Any, Any] = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Key of an attribute to change or remove.
      */
    /* CompleteClass */
    override val key: String = js.native
    
    /**
      * New value to set for the attribute. If `null`, then the operation just removes the attribute.
      */
    /* CompleteClass */
    override val newValue: N = js.native
    
    /**
      * Old value of the attribute with given key or `null` if adding a new attribute.
      */
    /* CompleteClass */
    override val oldValue: O = js.native
    
    /**
      * Root element to change.
      */
    /* CompleteClass */
    override val root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default = js.native
    
    /**
      * Custom toJSON method to solve child-parent circular dependencies.
      */
    /* CompleteClass */
    override def toJSON(): `13` = js.native
    
    /**
      * Operation type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /* CompleteClass */
    @JSName("type")
    override val type_RootAttributeOperation: addRootAttribute | removeRootAttribute | changeRootAttribute = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/rootattributeoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/rootattributeoperation", "default.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.RootAttributeOperation = js.native
    
    /**
      * Creates RootAttributeOperation object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: Root, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): RootAttributeOperation[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[RootAttributeOperation[Any, Any]]
  }
  
  trait RootAttributeOperation[O, N]
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MRootAttributeOperation(): RootAttributeOperation[Any, Any]
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MRootAttributeOperation(): RootAttributeOperation[Any, Any]
    
    /**
      * Key of an attribute to change or remove.
      */
    val key: String
    
    /**
      * New value to set for the attribute. If `null`, then the operation just removes the attribute.
      */
    val newValue: N
    
    /**
      * Old value of the attribute with given key or `null` if adding a new attribute.
      */
    val oldValue: O
    
    /**
      * Root element to change.
      */
    val root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default
    
    @JSName("type")
    val type_RootAttributeOperation: addRootAttribute | removeRootAttribute | changeRootAttribute
  }
  object RootAttributeOperation {
    
    inline def apply[O, N](
      clone_ : CallbackTo[RootAttributeOperation[Any, Any]],
      getReversed: CallbackTo[RootAttributeOperation[Any, Any]],
      isDocumentOperation: Boolean,
      key: String,
      newValue: N,
      oldValue: O,
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default,
      toJSON: CallbackTo[`13`],
      `type`: addRootAttribute | removeRootAttribute | changeRootAttribute
    ): RootAttributeOperation[O, N] = {
      val __obj = js.Dynamic.literal(getReversed = getReversed.toJsFn, isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootAttributeOperation[O, N]]
    }
    
    extension [Self <: RootAttributeOperation[?, ?], O, N](x: Self & (RootAttributeOperation[O, N])) {
      
      inline def setClone_(value: CallbackTo[RootAttributeOperation[Any, Any]]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setGetReversed(value: CallbackTo[RootAttributeOperation[Any, Any]]): Self = StObject.set(x, "getReversed", value.toJsFn)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: N): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: O): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRootelementMod.default): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setType(value: addRootAttribute | removeRootAttribute | changeRootAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
