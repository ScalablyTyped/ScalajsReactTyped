package typingsJapgolly.nginstackJsunit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestSuiteMod {
  
  inline def apply(fileId: String): Unit = ^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileId: String, opt_sourceEncoding: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any], opt_sourceEncoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fileId: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileId: Double, opt_sourceEncoding: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any], opt_sourceEncoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/jsunit/lib/TestSuite", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TestSuite {
    def this(fileId: String) = this()
    def this(fileId: Double) = this()
    def this(fileId: String, opt_sourceEncoding: String) = this()
    def this(fileId: Double, opt_sourceEncoding: String) = this()
    
    /* private */ /* CompleteClass */
    var _tests: Any = js.native
    
    /* private */ /* CompleteClass */
    var _testsByName: Any = js.native
    
    /* private */ /* CompleteClass */
    var argumentsIncludeComments_ : Any = js.native
    
    /* CompleteClass */
    override def assert(message: Any, condition: Any, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertEquals(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertFalse(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNan(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotEquals(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotNan(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotNull(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNotUndefined(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertNull(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertTrue(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def assertUndefined(args: Any*): Unit = js.native
    
    /* private */ /* CompleteClass */
    var assert_ : Any = js.native
    
    /* CompleteClass */
    override def check(condition: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualArrays(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualDates(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualArrays(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualDates(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def checkNotEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var commentArg_ : Any = js.native
    
    /* CompleteClass */
    override def declareTestMethods(): Unit = js.native
    
    /* CompleteClass */
    override def deleteTestMethods(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var displayStringForValue_ : Any = js.native
    
    /* CompleteClass */
    override def fail(msg: String): scala.Nothing = js.native
    
    /* CompleteClass */
    override def failEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* CompleteClass */
    override def failNotEquals(expected: Any, actual: Any, msg: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var fail_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fileId_ : Any = js.native
    
    /* CompleteClass */
    var filePath: String = js.native
    
    /* CompleteClass */
    override def getFileId(): String | Double = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    /* CompleteClass */
    override def getSourceEncoding(): String = js.native
    
    /* CompleteClass */
    override def getTestByName(name: Any): Any = js.native
    
    /* CompleteClass */
    override def getTests(): js.Array[Any] = js.native
    
    /* private */ /* CompleteClass */
    var getUfsTestType_ : Any = js.native
    
    /* CompleteClass */
    override def isEqualArrays(ar1: Any, ar2: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isTestCase(methodName: Any): Boolean = js.native
    
    /* CompleteClass */
    var key: Double | Null = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var nonCommentArg_ : Any = js.native
    
    /* CompleteClass */
    override def removeTime(dt: Any): js.Date = js.native
    
    /* CompleteClass */
    override def setUp(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var sourceEncoding_ : Any = js.native
    
    /* CompleteClass */
    override def tearDown(): Unit = js.native
    
    /* CompleteClass */
    var `type`: Double = js.native
    
    /* private */ /* CompleteClass */
    var type_ : Any = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var validateArguments_ : Any = js.native
    
    /* CompleteClass */
    var version: Double | Null = js.native
  }
  @JSImport("@nginstack/jsunit/lib/TestSuite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TestSuite extends StObject {
    
    /* private */ var _tests: Any
    
    /* private */ var _testsByName: Any
    
    /* private */ var argumentsIncludeComments_ : Any
    
    def assert(message: Any, condition: Any, args: Any*): Unit
    
    def assertEquals(args: Any*): Unit
    
    def assertFalse(args: Any*): Unit
    
    def assertNan(args: Any*): Unit
    
    def assertNotEquals(args: Any*): Unit
    
    def assertNotNan(args: Any*): Unit
    
    def assertNotNull(args: Any*): Unit
    
    def assertNotUndefined(args: Any*): Unit
    
    def assertNull(args: Any*): Unit
    
    def assertTrue(args: Any*): Unit
    
    def assertUndefined(args: Any*): Unit
    
    /* private */ var assert_ : Any
    
    def check(condition: Any, msg: Any): Unit
    
    def checkEqualArrays(expected: Any, actual: Any, msg: Any): Unit
    
    def checkEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit
    
    def checkEqualDates(expected: Any, actual: Any, msg: Any): Unit
    
    def checkEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit
    
    def checkEquals(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualArrays(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualDateTimes(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualDates(expected: Any, actual: Any, msg: Any): Unit
    
    def checkNotEqualNumbers(expected: Any, actual: Any, delta: Any, msg: Any): Unit
    
    def checkNotEquals(expected: Any, actual: Any, msg: Any): Unit
    
    /* private */ var commentArg_ : Any
    
    def declareTestMethods(): Unit
    
    def deleteTestMethods(): Unit
    
    /* private */ var displayStringForValue_ : Any
    
    def fail(msg: String): scala.Nothing
    
    def failEquals(expected: Any, actual: Any, msg: Any): Unit
    
    def failNotEquals(expected: Any, actual: Any, msg: Any): Unit
    
    /* private */ var fail_ : Any
    
    /* private */ var fileId_ : Any
    
    var filePath: String
    
    def getFileId(): String | Double
    
    def getId(): String
    
    def getSourceEncoding(): String
    
    def getTestByName(name: Any): Any
    
    def getTests(): js.Array[Any]
    
    /* private */ var getUfsTestType_ : Any
    
    def isEqualArrays(ar1: Any, ar2: Any): Boolean
    
    def isTestCase(methodName: Any): Boolean
    
    var key: Double | Null
    
    var name: String
    
    /* private */ var nonCommentArg_ : Any
    
    def removeTime(dt: Any): js.Date
    
    def setUp(): Unit
    
    /* private */ var sourceEncoding_ : Any
    
    def tearDown(): Unit
    
    var `type`: Double
    
    /* private */ var type_ : Any
    
    def update(): Unit
    
    /* private */ var validateArguments_ : Any
    
    var version: Double | Null
  }
  object TestSuite {
    
    inline def apply(
      _tests: Any,
      _testsByName: Any,
      argumentsIncludeComments_ : Any,
      assert: (Any, Any, /* repeated */ Any) => Callback,
      assertEquals: /* repeated */ Any => Callback,
      assertFalse: /* repeated */ Any => Callback,
      assertNan: /* repeated */ Any => Callback,
      assertNotEquals: /* repeated */ Any => Callback,
      assertNotNan: /* repeated */ Any => Callback,
      assertNotNull: /* repeated */ Any => Callback,
      assertNotUndefined: /* repeated */ Any => Callback,
      assertNull: /* repeated */ Any => Callback,
      assertTrue: /* repeated */ Any => Callback,
      assertUndefined: /* repeated */ Any => Callback,
      assert_ : Any,
      check: (Any, Any) => Callback,
      checkEqualArrays: (Any, Any, Any) => Callback,
      checkEqualDateTimes: (Any, Any, Any) => Callback,
      checkEqualDates: (Any, Any, Any) => Callback,
      checkEqualNumbers: (Any, Any, Any, Any) => Callback,
      checkEquals: (Any, Any, Any) => Callback,
      checkNotEqualArrays: (Any, Any, Any) => Callback,
      checkNotEqualDateTimes: (Any, Any, Any) => Callback,
      checkNotEqualDates: (Any, Any, Any) => Callback,
      checkNotEqualNumbers: (Any, Any, Any, Any) => Callback,
      checkNotEquals: (Any, Any, Any) => Callback,
      commentArg_ : Any,
      declareTestMethods: Callback,
      deleteTestMethods: Callback,
      displayStringForValue_ : Any,
      fail: String => scala.Nothing,
      failEquals: (Any, Any, Any) => Callback,
      failNotEquals: (Any, Any, Any) => Callback,
      fail_ : Any,
      fileId_ : Any,
      filePath: String,
      getFileId: CallbackTo[String | Double],
      getId: CallbackTo[String],
      getSourceEncoding: CallbackTo[String],
      getTestByName: Any => Any,
      getTests: CallbackTo[js.Array[Any]],
      getUfsTestType_ : Any,
      isEqualArrays: (Any, Any) => Boolean,
      isTestCase: Any => Boolean,
      name: String,
      nonCommentArg_ : Any,
      removeTime: Any => js.Date,
      setUp: Callback,
      sourceEncoding_ : Any,
      tearDown: Callback,
      `type`: Double,
      type_ : Any,
      update: Callback,
      validateArguments_ : Any
    ): TestSuite = {
      val __obj = js.Dynamic.literal(_tests = _tests.asInstanceOf[js.Any], _testsByName = _testsByName.asInstanceOf[js.Any], argumentsIncludeComments_ = argumentsIncludeComments_.asInstanceOf[js.Any], assert = js.Any.fromFunction3((t0: Any, t1: Any, t2: /* repeated */ Any) => (assert(t0, t1, t2)).runNow()), assertEquals = js.Any.fromFunction1((t0: /* repeated */ Any) => assertEquals(t0).runNow()), assertFalse = js.Any.fromFunction1((t0: /* repeated */ Any) => assertFalse(t0).runNow()), assertNan = js.Any.fromFunction1((t0: /* repeated */ Any) => assertNan(t0).runNow()), assertNotEquals = js.Any.fromFunction1((t0: /* repeated */ Any) => assertNotEquals(t0).runNow()), assertNotNan = js.Any.fromFunction1((t0: /* repeated */ Any) => assertNotNan(t0).runNow()), assertNotNull = js.Any.fromFunction1((t0: /* repeated */ Any) => assertNotNull(t0).runNow()), assertNotUndefined = js.Any.fromFunction1((t0: /* repeated */ Any) => assertNotUndefined(t0).runNow()), assertNull = js.Any.fromFunction1((t0: /* repeated */ Any) => assertNull(t0).runNow()), assertTrue = js.Any.fromFunction1((t0: /* repeated */ Any) => assertTrue(t0).runNow()), assertUndefined = js.Any.fromFunction1((t0: /* repeated */ Any) => assertUndefined(t0).runNow()), assert_ = assert_.asInstanceOf[js.Any], check = js.Any.fromFunction2((t0: Any, t1: Any) => (check(t0, t1)).runNow()), checkEqualArrays = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkEqualArrays(t0, t1, t2)).runNow()), checkEqualDateTimes = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkEqualDateTimes(t0, t1, t2)).runNow()), checkEqualDates = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkEqualDates(t0, t1, t2)).runNow()), checkEqualNumbers = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (checkEqualNumbers(t0, t1, t2, t3)).runNow()), checkEquals = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkEquals(t0, t1, t2)).runNow()), checkNotEqualArrays = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkNotEqualArrays(t0, t1, t2)).runNow()), checkNotEqualDateTimes = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkNotEqualDateTimes(t0, t1, t2)).runNow()), checkNotEqualDates = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkNotEqualDates(t0, t1, t2)).runNow()), checkNotEqualNumbers = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (checkNotEqualNumbers(t0, t1, t2, t3)).runNow()), checkNotEquals = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (checkNotEquals(t0, t1, t2)).runNow()), commentArg_ = commentArg_.asInstanceOf[js.Any], declareTestMethods = declareTestMethods.toJsFn, deleteTestMethods = deleteTestMethods.toJsFn, displayStringForValue_ = displayStringForValue_.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), failEquals = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (failEquals(t0, t1, t2)).runNow()), failNotEquals = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (failNotEquals(t0, t1, t2)).runNow()), fail_ = fail_.asInstanceOf[js.Any], fileId_ = fileId_.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], getFileId = getFileId.toJsFn, getId = getId.toJsFn, getSourceEncoding = getSourceEncoding.toJsFn, getTestByName = js.Any.fromFunction1(getTestByName), getTests = getTests.toJsFn, getUfsTestType_ = getUfsTestType_.asInstanceOf[js.Any], isEqualArrays = js.Any.fromFunction2(isEqualArrays), isTestCase = js.Any.fromFunction1(isTestCase), name = name.asInstanceOf[js.Any], nonCommentArg_ = nonCommentArg_.asInstanceOf[js.Any], removeTime = js.Any.fromFunction1(removeTime), setUp = setUp.toJsFn, sourceEncoding_ = sourceEncoding_.asInstanceOf[js.Any], tearDown = tearDown.toJsFn, type_ = type_.asInstanceOf[js.Any], update = update.toJsFn, validateArguments_ = validateArguments_.asInstanceOf[js.Any], key = null, version = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestSuite]
    }
    
    extension [Self <: TestSuite](x: Self) {
      
      inline def setArgumentsIncludeComments_(value: Any): Self = StObject.set(x, "argumentsIncludeComments_", value.asInstanceOf[js.Any])
      
      inline def setAssert(value: (Any, Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "assert", js.Any.fromFunction3((t0: Any, t1: Any, t2: /* repeated */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setAssertEquals(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertEquals", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertFalse(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertFalse", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertNan(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertNan", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertNotEquals(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertNotEquals", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertNotNan(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertNotNan", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertNotNull(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertNotNull", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertNotUndefined(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertNotUndefined", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertNull(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertNull", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertTrue(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertTrue", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssertUndefined(value: /* repeated */ Any => Callback): Self = StObject.set(x, "assertUndefined", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setAssert_(value: Any): Self = StObject.set(x, "assert_", value.asInstanceOf[js.Any])
      
      inline def setCheck(value: (Any, Any) => Callback): Self = StObject.set(x, "check", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setCheckEqualArrays(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkEqualArrays", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckEqualDateTimes(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkEqualDateTimes", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckEqualDates(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkEqualDates", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckEqualNumbers(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "checkEqualNumbers", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCheckEquals(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkEquals", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckNotEqualArrays(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkNotEqualArrays", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckNotEqualDateTimes(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkNotEqualDateTimes", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckNotEqualDates(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkNotEqualDates", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCheckNotEqualNumbers(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "checkNotEqualNumbers", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCheckNotEquals(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "checkNotEquals", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setCommentArg_(value: Any): Self = StObject.set(x, "commentArg_", value.asInstanceOf[js.Any])
      
      inline def setDeclareTestMethods(value: Callback): Self = StObject.set(x, "declareTestMethods", value.toJsFn)
      
      inline def setDeleteTestMethods(value: Callback): Self = StObject.set(x, "deleteTestMethods", value.toJsFn)
      
      inline def setDisplayStringForValue_(value: Any): Self = StObject.set(x, "displayStringForValue_", value.asInstanceOf[js.Any])
      
      inline def setFail(value: String => scala.Nothing): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setFailEquals(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "failEquals", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setFailNotEquals(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "failNotEquals", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setFail_(value: Any): Self = StObject.set(x, "fail_", value.asInstanceOf[js.Any])
      
      inline def setFileId_(value: Any): Self = StObject.set(x, "fileId_", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setGetFileId(value: CallbackTo[String | Double]): Self = StObject.set(x, "getFileId", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetSourceEncoding(value: CallbackTo[String]): Self = StObject.set(x, "getSourceEncoding", value.toJsFn)
      
      inline def setGetTestByName(value: Any => Any): Self = StObject.set(x, "getTestByName", js.Any.fromFunction1(value))
      
      inline def setGetTests(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getTests", value.toJsFn)
      
      inline def setGetUfsTestType_(value: Any): Self = StObject.set(x, "getUfsTestType_", value.asInstanceOf[js.Any])
      
      inline def setIsEqualArrays(value: (Any, Any) => Boolean): Self = StObject.set(x, "isEqualArrays", js.Any.fromFunction2(value))
      
      inline def setIsTestCase(value: Any => Boolean): Self = StObject.set(x, "isTestCase", js.Any.fromFunction1(value))
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNonCommentArg_(value: Any): Self = StObject.set(x, "nonCommentArg_", value.asInstanceOf[js.Any])
      
      inline def setRemoveTime(value: Any => js.Date): Self = StObject.set(x, "removeTime", js.Any.fromFunction1(value))
      
      inline def setSetUp(value: Callback): Self = StObject.set(x, "setUp", value.toJsFn)
      
      inline def setSourceEncoding_(value: Any): Self = StObject.set(x, "sourceEncoding_", value.asInstanceOf[js.Any])
      
      inline def setTearDown(value: Callback): Self = StObject.set(x, "tearDown", value.toJsFn)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setType_(value: Any): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
      
      inline def setValidateArguments_(value: Any): Self = StObject.set(x, "validateArguments_", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def set_tests(value: Any): Self = StObject.set(x, "_tests", value.asInstanceOf[js.Any])
      
      inline def set_testsByName(value: Any): Self = StObject.set(x, "_testsByName", value.asInstanceOf[js.Any])
    }
  }
}
