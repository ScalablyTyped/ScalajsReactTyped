package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeFirebase.anon.Priority
import typingsJapgolly.reactNativeFirebase.anon.TIMESTAMP
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object database {
  
  trait DataSnapshot extends StObject {
    
    def child(path: String): DataSnapshot
    
    def exists(): Boolean
    
    def exportVal(): Priority
    
    def forEach(action: js.Function1[/* a */ this.type, Boolean]): Boolean
    
    def getPriority(): String | Double | Null
    
    def hasChild(path: String): Boolean
    
    def hasChildren(): Boolean
    
    var key: String | Null
    
    def numChildren(): Double
    
    var ref: Reference
    
    def toJSON(): js.Object | Null
    
    def `val`(): Any
  }
  object DataSnapshot {
    
    inline def apply(
      child: String => DataSnapshot,
      exists: CallbackTo[Boolean],
      exportVal: CallbackTo[Priority],
      forEach: js.Function1[DataSnapshot, Boolean] => Boolean,
      getPriority: CallbackTo[String | Double | Null],
      hasChild: String => Boolean,
      hasChildren: CallbackTo[Boolean],
      numChildren: CallbackTo[Double],
      ref: Reference,
      toJSON: CallbackTo[js.Object | Null],
      `val`: CallbackTo[Any]
    ): DataSnapshot = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = exists.toJsFn, exportVal = exportVal.toJsFn, forEach = js.Any.fromFunction1(forEach), getPriority = getPriority.toJsFn, hasChild = js.Any.fromFunction1(hasChild), hasChildren = hasChildren.toJsFn, numChildren = numChildren.toJsFn, ref = ref.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, key = null)
      __obj.updateDynamic("val")(`val`.toJsFn)
      __obj.asInstanceOf[DataSnapshot]
    }
    
    extension [Self <: DataSnapshot](x: Self) {
      
      inline def setChild(value: String => DataSnapshot): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
      
      inline def setExportVal(value: CallbackTo[Priority]): Self = StObject.set(x, "exportVal", value.toJsFn)
      
      inline def setForEach(value: js.Function1[DataSnapshot, Boolean] => Boolean): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGetPriority(value: CallbackTo[String | Double | Null]): Self = StObject.set(x, "getPriority", value.toJsFn)
      
      inline def setHasChild(value: String => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
      
      inline def setHasChildren(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildren", value.toJsFn)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setNumChildren(value: CallbackTo[Double]): Self = StObject.set(x, "numChildren", value.toJsFn)
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: CallbackTo[js.Object | Null]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setVal(value: CallbackTo[Any]): Self = StObject.set(x, "val", value.toJsFn)
    }
  }
  
  @js.native
  trait Database
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Removes all event handlers and their native subscriptions
      */
    def cleanup(): js.Promise[Any] = js.native
    
    /**
      * disconnect to firebase backend
      */
    def goOffline(): Unit = js.native
    
    /**
      * connect to firebase backend
      */
    def goOnline(): Unit = js.native
    
    /**
      * unregister listener
      */
    def off(path: String, modifiersString: String): Any = js.native
    def off(path: String, modifiersString: String, eventName: String): Any = js.native
    def off(path: String, modifiersString: String, eventName: String, origCB: js.Function0[Unit]): Any = js.native
    def off(path: String, modifiersString: String, eventName: Unit, origCB: js.Function0[Unit]): Any = js.native
    
    /**
      * register listener
      */
    def on(
      path: String,
      modifiersString: String,
      modifiers: js.Array[String],
      eventName: String,
      cb: js.Function0[Unit],
      errorCb: js.Function0[Unit]
    ): Any = js.native
    
    /**
      * Returns a new firebase reference instance
      * */
    def ref(): RnReference = js.native
    def ref(path: String): RnReference = js.native
  }
  
  trait DatabaseStatics extends StObject {
    
    /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
    var ServerValue: TIMESTAMP
  }
  object DatabaseStatics {
    
    inline def apply(ServerValue: TIMESTAMP): DatabaseStatics = {
      val __obj = js.Dynamic.literal(ServerValue = ServerValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseStatics]
    }
    
    extension [Self <: DatabaseStatics](x: Self) {
      
      inline def setServerValue(value: TIMESTAMP): Self = StObject.set(x, "ServerValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    def endAt(): Query = js.native
    def endAt(value: String): Query = js.native
    def endAt(value: String, key: String): Query = js.native
    def endAt(value: Boolean): Query = js.native
    def endAt(value: Boolean, key: String): Query = js.native
    def endAt(value: Double): Query = js.native
    def endAt(value: Double, key: String): Query = js.native
    def endAt(value: Null, key: String): Query = js.native
    
    def equalTo(): Query = js.native
    def equalTo(value: String): Query = js.native
    def equalTo(value: String, key: String): Query = js.native
    def equalTo(value: Boolean): Query = js.native
    def equalTo(value: Boolean, key: String): Query = js.native
    def equalTo(value: Double): Query = js.native
    def equalTo(value: Double, key: String): Query = js.native
    def equalTo(value: Null, key: String): Query = js.native
    
    def isEqual(): Boolean = js.native
    def isEqual(other: Query): Boolean = js.native
    
    def limitToFirst(limit: Double): Query = js.native
    
    def limitToLast(limit: Double): Query = js.native
    
    def off(): Unit = js.native
    def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: Unit, callback: QuerySuccessCallback): Unit = js.native
    def off(eventType: Unit, callback: QuerySuccessCallback, context: js.Object): Unit = js.native
    def off(eventType: QueryEventType): Unit = js.native
    def off(eventType: QueryEventType, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: QueryEventType, callback: QuerySuccessCallback): Unit = js.native
    def off(eventType: QueryEventType, callback: QuerySuccessCallback, context: js.Object): Unit = js.native
    
    def on(eventType: QueryEventType, callback: QuerySuccessCallback): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    def on(
      eventType: QueryEventType,
      callback: QuerySuccessCallback,
      cancelCallbackOrContext: Unit,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    def on(
      eventType: QueryEventType,
      callback: QuerySuccessCallback,
      cancelCallbackOrContext: QueryErrorCallback
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    def on(
      eventType: QueryEventType,
      callback: QuerySuccessCallback,
      cancelCallbackOrContext: QueryErrorCallback,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    
    def once(eventType: QueryEventType): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: Unit,
      failureCallbackOrContext: Unit,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: QueryEventType, successCallback: Unit, failureCallbackOrContext: QueryErrorCallback): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: Unit,
      failureCallbackOrContext: QueryErrorCallback,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: QueryEventType, successCallback: QuerySuccessCallback): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: QuerySuccessCallback,
      failureCallbackOrContext: Unit,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: QuerySuccessCallback,
      failureCallbackOrContext: QueryErrorCallback
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: QuerySuccessCallback,
      failureCallbackOrContext: QueryErrorCallback,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    
    def orderByChild(path: String): Query = js.native
    
    def orderByKey(): Query = js.native
    
    def orderByPriority(): Query = js.native
    
    def orderByValue(): Query = js.native
    
    var ref: Reference = js.native
    
    def startAt(): Query = js.native
    def startAt(value: String): Query = js.native
    def startAt(value: String, key: String): Query = js.native
    def startAt(value: Boolean): Query = js.native
    def startAt(value: Boolean, key: String): Query = js.native
    def startAt(value: Double): Query = js.native
    def startAt(value: Double, key: String): Query = js.native
    def startAt(value: Null, key: String): Query = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  type QueryErrorCallback = js.Function1[/* e */ js.Error, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.value
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_added
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_removed
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_changed
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_moved
  */
  trait QueryEventType extends StObject
  object QueryEventType {
    
    inline def child_added: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_added = "child_added".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_added]
    
    inline def child_changed: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_changed = "child_changed".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_changed]
    
    inline def child_moved: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_moved = "child_moved".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_moved]
    
    inline def child_removed: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_removed = "child_removed".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.child_removed]
    
    inline def value: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.value = "value".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.value]
  }
  
  type QuerySuccessCallback = js.Function2[/* snapshot */ DataSnapshot, /* previousChildId */ js.UndefOr[String | Null], Unit]
  
  @js.native
  trait Reference
    extends StObject
       with Query {
    
    def child(path: String): Reference = js.native
    
    var key: String | Null = js.native
    
    def onDisconnect(): Any = js.native
    
    var parent: Reference | Null = js.native
    
    def push(): ThenableReference[Any] = js.native
    def push(value: Any): ThenableReference[Any] = js.native
    def push(value: Any, onComplete: js.Function1[/* a */ RnError | Null, Any]): ThenableReference[Any] = js.native
    def push(value: Unit, onComplete: js.Function1[/* a */ RnError | Null, Any]): ThenableReference[Any] = js.native
    
    def remove(): js.Promise[Any] = js.native
    def remove(onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    
    var root: Reference = js.native
    
    def set(value: Any): js.Promise[Any] = js.native
    def set(value: Any, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    
    def setPriority(priority: String, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    def setPriority(priority: Double, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    def setPriority(priority: Null, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    
    def setWithPriority(newVal: Any): js.Promise[Any] = js.native
    def setWithPriority(newVal: Any, newPriority: String): js.Promise[Any] = js.native
    def setWithPriority(newVal: Any, newPriority: String, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    def setWithPriority(newVal: Any, newPriority: Double): js.Promise[Any] = js.native
    def setWithPriority(newVal: Any, newPriority: Double, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    def setWithPriority(newVal: Any, newPriority: Null, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
    
    def transaction(transactionUpdate: js.Function1[/* a */ Any, Any]): js.Promise[Any] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ Any, Any],
      onComplete: js.Function3[/* a */ RnError | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Any]
    ): js.Promise[Any] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ Any, Any],
      onComplete: js.Function3[/* a */ RnError | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Any],
      applyLocally: Boolean
    ): js.Promise[Any] = js.native
    def transaction(transactionUpdate: js.Function1[/* a */ Any, Any], onComplete: Unit, applyLocally: Boolean): js.Promise[Any] = js.native
    
    def update(values: js.Object): js.Promise[Any] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ RnError | Null, Any]): js.Promise[Any] = js.native
  }
  
  @js.native
  trait RnReference
    extends StObject
       with Reference
       with /* key */ StringDictionary[Any] {
    
    def filter(name: String, value: Any): Any = js.native
    def filter(name: String, value: Any, key: String): Any = js.native
    
    def keepSynced(bool: Boolean): Any = js.native
  }
  
  @js.native
  trait ThenableReference[T]
    extends StObject
       with Promise[T]
       with Reference
}
