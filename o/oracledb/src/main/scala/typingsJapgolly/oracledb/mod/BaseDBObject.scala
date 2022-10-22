package typingsJapgolly.oracledb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracledb.anon.Type
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
  * @since 4.0
  */
trait BaseDBObject[T] extends StObject {
  
  /**
    * Add the given value to the end of the collection.
    */
  def append(value: T): Unit
  
  /**
    * When dbObject.isCollection is false, this will be an object containing attributes corresponding to the Oracle Database object attributes.
    */
  var attributes: Record[String, Type[T]]
  
  /**
    * Deletes the value from collection at the given index.
    */
  def deleteElement(index: Double): Unit
  
  /** When dbObject.isCollection is true, this will be one of the DB_TYPE constants. */
  val elementType: Double
  
  val elementTypeClass: DBObjectClass[T]
  
  /** When dbObject.isCollection is true, this will have the name of the element type, such as “VARCHAR2” or “NUMBER”. */
  val elementTypeName: String
  
  /** The fully qualified name of the Oracle Database object or collection. */
  val fqn: String
  
  /**
    * Return the value associated with the given index.
    */
  def getElement(index: Double): Any
  
  /**
    * Returns the first index for later use to obtain the value.
    */
  def getFirstIndex(): Double
  
  /**
    * Returns a JavaScript array containing the ‘index’ keys.
    */
  def getKeys(): /* import warning: importer.ImportType#apply Failed type conversion: T extends string | number ? std.Array<number> : std.Array<keyof T> */ js.Any
  
  /**
    * To obtain the last index for later use to obtain a value.
    */
  def getLastIndex(): Double
  
  /**
    * Returns the next index value for later use to obtain a value.
    */
  def getNextIndex(): Double
  
  /**
    * Returns the previous index for later use to obtain the value.
    */
  def getPrevIndex(): Double
  
  /**
    * Returns an array of element values as a JavaScript array in key order.
    */
  def getValues(): js.Array[T]
  
  /**
    * Returns true if an element exists in the collection at the given index. Returns false otherwise.
    */
  def hasElement(): Boolean
  
  /** True if the object is a collection, false otherwise. */
  val isCollection: Boolean
  
  /** When dbObject.isCollection is true, this will have the number of elements in the collection. It is undefined for non-collections. */
  val length: js.UndefOr[Double] = js.undefined
  
  /** Name of the Oracle Database object or collection. */
  val name: String
  
  /** Schema owning the Oracle Database object or collection. */
  val schema: String
  
  /**
    * To set the given value at the position of the given index.
    */
  def setElement(index: Double, value: T): Unit
  
  /**
    * Trims the specified number of elements from the end of the collection.
    */
  def trim(count: Double): Unit
}
object BaseDBObject {
  
  inline def apply[T](
    append: T => Callback,
    attributes: Record[String, Type[T]],
    deleteElement: Double => Callback,
    elementType: Double,
    elementTypeClass: DBObjectClass[T],
    elementTypeName: String,
    fqn: String,
    getElement: Double => Any,
    getFirstIndex: CallbackTo[Double],
    getKeys: CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends string | number ? std.Array<number> : std.Array<keyof T> */ js.Any
    ],
    getLastIndex: CallbackTo[Double],
    getNextIndex: CallbackTo[Double],
    getPrevIndex: CallbackTo[Double],
    getValues: CallbackTo[js.Array[T]],
    hasElement: CallbackTo[Boolean],
    isCollection: Boolean,
    name: String,
    schema: String,
    setElement: (Double, T) => Callback,
    trim: Double => Callback
  ): BaseDBObject[T] = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: T) => append(t0).runNow()), attributes = attributes.asInstanceOf[js.Any], deleteElement = js.Any.fromFunction1((t0: Double) => deleteElement(t0).runNow()), elementType = elementType.asInstanceOf[js.Any], elementTypeClass = elementTypeClass.asInstanceOf[js.Any], elementTypeName = elementTypeName.asInstanceOf[js.Any], fqn = fqn.asInstanceOf[js.Any], getElement = js.Any.fromFunction1(getElement), getFirstIndex = getFirstIndex.toJsFn, getKeys = getKeys.toJsFn, getLastIndex = getLastIndex.toJsFn, getNextIndex = getNextIndex.toJsFn, getPrevIndex = getPrevIndex.toJsFn, getValues = getValues.toJsFn, hasElement = hasElement.toJsFn, isCollection = isCollection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], setElement = js.Any.fromFunction2((t0: Double, t1: T) => (setElement(t0, t1)).runNow()), trim = js.Any.fromFunction1((t0: Double) => trim(t0).runNow()))
    __obj.asInstanceOf[BaseDBObject[T]]
  }
  
  extension [Self <: BaseDBObject[?], T](x: Self & BaseDBObject[T]) {
    
    inline def setAppend(value: T => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setAttributes(value: Record[String, Type[T]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setDeleteElement(value: Double => Callback): Self = StObject.set(x, "deleteElement", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setElementType(value: Double): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeClass(value: DBObjectClass[T]): Self = StObject.set(x, "elementTypeClass", value.asInstanceOf[js.Any])
    
    inline def setElementTypeName(value: String): Self = StObject.set(x, "elementTypeName", value.asInstanceOf[js.Any])
    
    inline def setFqn(value: String): Self = StObject.set(x, "fqn", value.asInstanceOf[js.Any])
    
    inline def setGetElement(value: Double => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    inline def setGetFirstIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getFirstIndex", value.toJsFn)
    
    inline def setGetKeys(
      value: CallbackTo[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends string | number ? std.Array<number> : std.Array<keyof T> */ js.Any
        ]
    ): Self = StObject.set(x, "getKeys", value.toJsFn)
    
    inline def setGetLastIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getLastIndex", value.toJsFn)
    
    inline def setGetNextIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getNextIndex", value.toJsFn)
    
    inline def setGetPrevIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getPrevIndex", value.toJsFn)
    
    inline def setGetValues(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "getValues", value.toJsFn)
    
    inline def setHasElement(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasElement", value.toJsFn)
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSetElement(value: (Double, T) => Callback): Self = StObject.set(x, "setElement", js.Any.fromFunction2((t0: Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setTrim(value: Double => Callback): Self = StObject.set(x, "trim", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
