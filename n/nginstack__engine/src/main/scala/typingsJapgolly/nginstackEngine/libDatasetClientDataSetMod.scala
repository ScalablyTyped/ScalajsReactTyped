package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetClientDataSetMod {
  
  inline def apply(dataSetOrArray: Any, howManyRecords: Any, fields: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSetOrArray.asInstanceOf[js.Any], howManyRecords.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/ClientDataSet", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ClientDataSet {
    def this(dataSetOrArray: Any, howManyRecords: Any, fields: Any) = this()
    
    /* CompleteClass */
    override def append(): Unit = js.native
    
    /* CompleteClass */
    var bof: Boolean = js.native
    
    /* CompleteClass */
    var bookmark: String = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def del(): Unit = js.native
    
    /* CompleteClass */
    var deleteRecord: Any = js.native
    
    /* CompleteClass */
    var eof: Boolean = js.native
    
    /* CompleteClass */
    var fieldCount: Any = js.native
    
    /* CompleteClass */
    override def fieldIsNull(fieldReference: Any): Boolean = js.native
    
    /* CompleteClass */
    var fieldNames: Any = js.native
    
    /* CompleteClass */
    var fieldSizes: Any = js.native
    
    /* CompleteClass */
    var fieldTypes: Any = js.native
    
    /* CompleteClass */
    override def first(): Unit = js.native
    
    /* CompleteClass */
    override def getField(fieldReference: Any): Any = js.native
    
    /* CompleteClass */
    override def getFieldName(fieldIndex: Any): Any = js.native
    
    /* CompleteClass */
    override def getFieldSize(fieldReference: Any): Any = js.native
    
    /* CompleteClass */
    override def getFieldType(fieldReference: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var indexOfFieldName_ : Any = js.native
    
    /* CompleteClass */
    var isEmpty: Boolean = js.native
    
    /* CompleteClass */
    override def last(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Unit = js.native
    
    /* CompleteClass */
    override def post(): Unit = js.native
    
    /* CompleteClass */
    override def prior(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var readRecord_ : Any = js.native
    
    /* CompleteClass */
    var recNo: Any = js.native
    
    /* CompleteClass */
    var recordCount: Any = js.native
    
    /* CompleteClass */
    var records: Any = js.native
    
    /* CompleteClass */
    override def setBookmark(bookmark: Any): Unit = js.native
    
    /* CompleteClass */
    override def setField(fieldReference: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setRecNo(newRecNo: Any, increment: Any): Unit = js.native
    
    /* CompleteClass */
    override def updateDataSet(dataSet: Any): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/dataset/ClientDataSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClientDataSet extends StObject {
    
    def append(): Unit
    
    var bof: Boolean
    
    var bookmark: String
    
    def cancel(): Unit
    
    def del(): Unit
    
    var deleteRecord: Any
    
    var eof: Boolean
    
    var fieldCount: Any
    
    def fieldIsNull(fieldReference: Any): Boolean
    
    var fieldNames: Any
    
    var fieldSizes: Any
    
    var fieldTypes: Any
    
    def first(): Unit
    
    def getField(fieldReference: Any): Any
    
    def getFieldName(fieldIndex: Any): Any
    
    def getFieldSize(fieldReference: Any): Any
    
    def getFieldType(fieldReference: Any): Any
    
    /* private */ var indexOfFieldName_ : Any
    
    var isEmpty: Boolean
    
    def last(): Unit
    
    def next(): Unit
    
    def post(): Unit
    
    def prior(): Unit
    
    /* private */ var readRecord_ : Any
    
    var recNo: Any
    
    var recordCount: Any
    
    var records: Any
    
    def setBookmark(bookmark: Any): Unit
    
    def setField(fieldReference: Any, value: Any): Unit
    
    def setRecNo(newRecNo: Any, increment: Any): Unit
    
    def updateDataSet(dataSet: Any): Unit
  }
  object ClientDataSet {
    
    inline def apply(
      append: Callback,
      bof: Boolean,
      bookmark: String,
      cancel: Callback,
      del: Callback,
      deleteRecord: Any,
      eof: Boolean,
      fieldCount: Any,
      fieldIsNull: Any => Boolean,
      fieldNames: Any,
      fieldSizes: Any,
      fieldTypes: Any,
      first: Callback,
      getField: Any => Any,
      getFieldName: Any => Any,
      getFieldSize: Any => Any,
      getFieldType: Any => Any,
      indexOfFieldName_ : Any,
      isEmpty: Boolean,
      last: Callback,
      next: Callback,
      post: Callback,
      prior: Callback,
      readRecord_ : Any,
      recNo: Any,
      recordCount: Any,
      records: Any,
      setBookmark: Any => Callback,
      setField: (Any, Any) => Callback,
      setRecNo: (Any, Any) => Callback,
      updateDataSet: Any => Callback
    ): ClientDataSet = {
      val __obj = js.Dynamic.literal(append = append.toJsFn, bof = bof.asInstanceOf[js.Any], bookmark = bookmark.asInstanceOf[js.Any], cancel = cancel.toJsFn, del = del.toJsFn, deleteRecord = deleteRecord.asInstanceOf[js.Any], eof = eof.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], fieldIsNull = js.Any.fromFunction1(fieldIsNull), fieldNames = fieldNames.asInstanceOf[js.Any], fieldSizes = fieldSizes.asInstanceOf[js.Any], fieldTypes = fieldTypes.asInstanceOf[js.Any], first = first.toJsFn, getField = js.Any.fromFunction1(getField), getFieldName = js.Any.fromFunction1(getFieldName), getFieldSize = js.Any.fromFunction1(getFieldSize), getFieldType = js.Any.fromFunction1(getFieldType), indexOfFieldName_ = indexOfFieldName_.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], last = last.toJsFn, next = next.toJsFn, post = post.toJsFn, prior = prior.toJsFn, readRecord_ = readRecord_.asInstanceOf[js.Any], recNo = recNo.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], setBookmark = js.Any.fromFunction1((t0: Any) => setBookmark(t0).runNow()), setField = js.Any.fromFunction2((t0: Any, t1: Any) => (setField(t0, t1)).runNow()), setRecNo = js.Any.fromFunction2((t0: Any, t1: Any) => (setRecNo(t0, t1)).runNow()), updateDataSet = js.Any.fromFunction1((t0: Any) => updateDataSet(t0).runNow()))
      __obj.asInstanceOf[ClientDataSet]
    }
    
    extension [Self <: ClientDataSet](x: Self) {
      
      inline def setAppend(value: Callback): Self = StObject.set(x, "append", value.toJsFn)
      
      inline def setBof(value: Boolean): Self = StObject.set(x, "bof", value.asInstanceOf[js.Any])
      
      inline def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setDel(value: Callback): Self = StObject.set(x, "del", value.toJsFn)
      
      inline def setDeleteRecord(value: Any): Self = StObject.set(x, "deleteRecord", value.asInstanceOf[js.Any])
      
      inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setFieldCount(value: Any): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      inline def setFieldIsNull(value: Any => Boolean): Self = StObject.set(x, "fieldIsNull", js.Any.fromFunction1(value))
      
      inline def setFieldNames(value: Any): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldSizes(value: Any): Self = StObject.set(x, "fieldSizes", value.asInstanceOf[js.Any])
      
      inline def setFieldTypes(value: Any): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: Callback): Self = StObject.set(x, "first", value.toJsFn)
      
      inline def setGetField(value: Any => Any): Self = StObject.set(x, "getField", js.Any.fromFunction1(value))
      
      inline def setGetFieldName(value: Any => Any): Self = StObject.set(x, "getFieldName", js.Any.fromFunction1(value))
      
      inline def setGetFieldSize(value: Any => Any): Self = StObject.set(x, "getFieldSize", js.Any.fromFunction1(value))
      
      inline def setGetFieldType(value: Any => Any): Self = StObject.set(x, "getFieldType", js.Any.fromFunction1(value))
      
      inline def setIndexOfFieldName_(value: Any): Self = StObject.set(x, "indexOfFieldName_", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Callback): Self = StObject.set(x, "last", value.toJsFn)
      
      inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setPost(value: Callback): Self = StObject.set(x, "post", value.toJsFn)
      
      inline def setPrior(value: Callback): Self = StObject.set(x, "prior", value.toJsFn)
      
      inline def setReadRecord_(value: Any): Self = StObject.set(x, "readRecord_", value.asInstanceOf[js.Any])
      
      inline def setRecNo(value: Any): Self = StObject.set(x, "recNo", value.asInstanceOf[js.Any])
      
      inline def setRecordCount(value: Any): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: Any): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setSetBookmark(value: Any => Callback): Self = StObject.set(x, "setBookmark", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetField(value: (Any, Any) => Callback): Self = StObject.set(x, "setField", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSetRecNo(value: (Any, Any) => Callback): Self = StObject.set(x, "setRecNo", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setUpdateDataSet(value: Any => Callback): Self = StObject.set(x, "updateDataSet", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
