package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridTableViewBufferMod {
  
  inline def apply(grid: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TableViewBuffer {
    def this(grid: Any) = this()
    
    /* private */ /* CompleteClass */
    var _grid: Any = js.native
    
    /* private */ /* CompleteClass */
    var _searchRecordBufferByRecNo: Any = js.native
    
    /* CompleteClass */
    var buffer: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var clientBufferIndex: Any = js.native
    
    /* CompleteClass */
    override def createRecordBuffer(qtd: Any, bufferLength: Any): Unit = js.native
    
    /* CompleteClass */
    var editedRecBuffer: Any = js.native
    
    /* CompleteClass */
    var editing: Boolean = js.native
    
    /* CompleteClass */
    var editingOrInserting: Boolean = js.native
    
    /* CompleteClass */
    var fEditingRecBuffer: Any = js.native
    
    /* CompleteClass */
    override def getEditingRecBuffer(): Any = js.native
    
    /* private */ /* CompleteClass */
    var getLastUsedBufferIndex: Any = js.native
    
    /* CompleteClass */
    override def getRecordBufferByRecNo(recNo: Any): Any = js.native
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def isBrowsing(): Boolean = js.native
    
    /* CompleteClass */
    override def isInactive(): Boolean = js.native
    
    /* CompleteClass */
    var lastRecordIndex: Double = js.native
    
    /* CompleteClass */
    override def rebuild(qtd: Any, bufferLength: Any): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def resync(): Unit = js.native
    
    /* CompleteClass */
    override def resyncRecord(recNo: Any): Unit = js.native
    
    /* CompleteClass */
    override def setEditingRecBuffer(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setFieldRecordBuffer(fieldIndex: Any, recNo: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setState(value: Double): Unit = js.native
    
    /* CompleteClass */
    var stateModified: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var state_ : Any = js.native
    
    /* CompleteClass */
    var syncBookmarkAfterInsert: Boolean = js.native
    
    /* CompleteClass */
    override def updateBufferProperties(propertyName: Any, value: Any): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_BROWSE")
  @js.native
  val BM_BROWSE: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_DELETING")
  @js.native
  val BM_DELETING: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_EDIT")
  @js.native
  val BM_EDIT: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_INACTIVE")
  @js.native
  val BM_INACTIVE: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_INSERT")
  @js.native
  val BM_INSERT: Double = js.native
  
  trait TableViewBuffer extends StObject {
    
    /* private */ var _grid: Any
    
    /* private */ var _searchRecordBufferByRecNo: Any
    
    var buffer: js.Array[Any]
    
    def clear(): Unit
    
    var clientBufferIndex: Any
    
    def createRecordBuffer(qtd: Any, bufferLength: Any): Unit
    
    var editedRecBuffer: Any
    
    var editing: Boolean
    
    var editingOrInserting: Boolean
    
    var fEditingRecBuffer: Any
    
    def getEditingRecBuffer(): Any
    
    /* private */ var getLastUsedBufferIndex: Any
    
    def getRecordBufferByRecNo(recNo: Any): Any
    
    def getState(): Double
    
    def isBrowsing(): Boolean
    
    def isInactive(): Boolean
    
    var lastRecordIndex: Double
    
    def rebuild(qtd: Any, bufferLength: Any): Unit
    
    def reset(): Unit
    
    def resync(): Unit
    
    def resyncRecord(recNo: Any): Unit
    
    def setEditingRecBuffer(value: Any): Unit
    
    def setFieldRecordBuffer(fieldIndex: Any, recNo: Any, value: Any): Unit
    
    def setState(value: Double): Unit
    
    var stateModified: Boolean
    
    /* private */ var state_ : Any
    
    var syncBookmarkAfterInsert: Boolean
    
    def updateBufferProperties(propertyName: Any, value: Any): Unit
  }
  object TableViewBuffer {
    
    inline def apply(
      _grid: Any,
      _searchRecordBufferByRecNo: Any,
      buffer: js.Array[Any],
      clear: Callback,
      clientBufferIndex: Any,
      createRecordBuffer: (Any, Any) => Callback,
      editedRecBuffer: Any,
      editing: Boolean,
      editingOrInserting: Boolean,
      fEditingRecBuffer: Any,
      getEditingRecBuffer: CallbackTo[Any],
      getLastUsedBufferIndex: Any,
      getRecordBufferByRecNo: Any => Any,
      getState: CallbackTo[Double],
      isBrowsing: CallbackTo[Boolean],
      isInactive: CallbackTo[Boolean],
      lastRecordIndex: Double,
      rebuild: (Any, Any) => Callback,
      reset: Callback,
      resync: Callback,
      resyncRecord: Any => Callback,
      setEditingRecBuffer: Any => Callback,
      setFieldRecordBuffer: (Any, Any, Any) => Callback,
      setState: Double => Callback,
      stateModified: Boolean,
      state_ : Any,
      syncBookmarkAfterInsert: Boolean,
      updateBufferProperties: (Any, Any) => Callback
    ): TableViewBuffer = {
      val __obj = js.Dynamic.literal(_grid = _grid.asInstanceOf[js.Any], _searchRecordBufferByRecNo = _searchRecordBufferByRecNo.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], clear = clear.toJsFn, clientBufferIndex = clientBufferIndex.asInstanceOf[js.Any], createRecordBuffer = js.Any.fromFunction2((t0: Any, t1: Any) => (createRecordBuffer(t0, t1)).runNow()), editedRecBuffer = editedRecBuffer.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], editingOrInserting = editingOrInserting.asInstanceOf[js.Any], fEditingRecBuffer = fEditingRecBuffer.asInstanceOf[js.Any], getEditingRecBuffer = getEditingRecBuffer.toJsFn, getLastUsedBufferIndex = getLastUsedBufferIndex.asInstanceOf[js.Any], getRecordBufferByRecNo = js.Any.fromFunction1(getRecordBufferByRecNo), getState = getState.toJsFn, isBrowsing = isBrowsing.toJsFn, isInactive = isInactive.toJsFn, lastRecordIndex = lastRecordIndex.asInstanceOf[js.Any], rebuild = js.Any.fromFunction2((t0: Any, t1: Any) => (rebuild(t0, t1)).runNow()), reset = reset.toJsFn, resync = resync.toJsFn, resyncRecord = js.Any.fromFunction1((t0: Any) => resyncRecord(t0).runNow()), setEditingRecBuffer = js.Any.fromFunction1((t0: Any) => setEditingRecBuffer(t0).runNow()), setFieldRecordBuffer = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (setFieldRecordBuffer(t0, t1, t2)).runNow()), setState = js.Any.fromFunction1((t0: Double) => setState(t0).runNow()), stateModified = stateModified.asInstanceOf[js.Any], state_ = state_.asInstanceOf[js.Any], syncBookmarkAfterInsert = syncBookmarkAfterInsert.asInstanceOf[js.Any], updateBufferProperties = js.Any.fromFunction2((t0: Any, t1: Any) => (updateBufferProperties(t0, t1)).runNow()))
      __obj.asInstanceOf[TableViewBuffer]
    }
    
    extension [Self <: TableViewBuffer](x: Self) {
      
      inline def setBuffer(value: js.Array[Any]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferVarargs(value: Any*): Self = StObject.set(x, "buffer", js.Array(value*))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClientBufferIndex(value: Any): Self = StObject.set(x, "clientBufferIndex", value.asInstanceOf[js.Any])
      
      inline def setCreateRecordBuffer(value: (Any, Any) => Callback): Self = StObject.set(x, "createRecordBuffer", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setEditedRecBuffer(value: Any): Self = StObject.set(x, "editedRecBuffer", value.asInstanceOf[js.Any])
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingOrInserting(value: Boolean): Self = StObject.set(x, "editingOrInserting", value.asInstanceOf[js.Any])
      
      inline def setFEditingRecBuffer(value: Any): Self = StObject.set(x, "fEditingRecBuffer", value.asInstanceOf[js.Any])
      
      inline def setGetEditingRecBuffer(value: CallbackTo[Any]): Self = StObject.set(x, "getEditingRecBuffer", value.toJsFn)
      
      inline def setGetLastUsedBufferIndex(value: Any): Self = StObject.set(x, "getLastUsedBufferIndex", value.asInstanceOf[js.Any])
      
      inline def setGetRecordBufferByRecNo(value: Any => Any): Self = StObject.set(x, "getRecordBufferByRecNo", js.Any.fromFunction1(value))
      
      inline def setGetState(value: CallbackTo[Double]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setIsBrowsing(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBrowsing", value.toJsFn)
      
      inline def setIsInactive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInactive", value.toJsFn)
      
      inline def setLastRecordIndex(value: Double): Self = StObject.set(x, "lastRecordIndex", value.asInstanceOf[js.Any])
      
      inline def setRebuild(value: (Any, Any) => Callback): Self = StObject.set(x, "rebuild", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setResync(value: Callback): Self = StObject.set(x, "resync", value.toJsFn)
      
      inline def setResyncRecord(value: Any => Callback): Self = StObject.set(x, "resyncRecord", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetEditingRecBuffer(value: Any => Callback): Self = StObject.set(x, "setEditingRecBuffer", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetFieldRecordBuffer(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "setFieldRecordBuffer", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetState(value: Double => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setStateModified(value: Boolean): Self = StObject.set(x, "stateModified", value.asInstanceOf[js.Any])
      
      inline def setState_(value: Any): Self = StObject.set(x, "state_", value.asInstanceOf[js.Any])
      
      inline def setSyncBookmarkAfterInsert(value: Boolean): Self = StObject.set(x, "syncBookmarkAfterInsert", value.asInstanceOf[js.Any])
      
      inline def setUpdateBufferProperties(value: (Any, Any) => Callback): Self = StObject.set(x, "updateBufferProperties", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def set_grid(value: Any): Self = StObject.set(x, "_grid", value.asInstanceOf[js.Any])
      
      inline def set_searchRecordBufferByRecNo(value: Any): Self = StObject.set(x, "_searchRecordBufferByRecNo", value.asInstanceOf[js.Any])
    }
  }
}
