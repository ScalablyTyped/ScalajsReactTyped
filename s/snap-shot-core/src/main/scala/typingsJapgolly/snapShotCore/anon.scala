package typingsJapgolly.snapShotCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.snapShotCore.mod.CompareFunction
import typingsJapgolly.snapShotCore.mod.Opts
import typingsJapgolly.snapShotCore.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comment[T /* <: js.Object | Null */, U] extends StObject {
    
    /**
      * Alias of `file`.
      * Either `file` or `__filename` must be defined.
      */
    var __filename: js.UndefOr[String] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * A function that checks if the given value matches the expected value.
      */
    var compare: js.UndefOr[CompareFunction[T]] = js.undefined
    
    /**
      * Either `specName` or `exactSpecName` must be defined.
      */
    var exactSpecName: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[/* template literal string: .${string} */ String] = js.undefined
    
    /**
      * Either `file` or `__filename` must be defined.
      */
    var file: js.UndefOr[String] = js.undefined
    
    var opts: js.UndefOr[Opts] = js.undefined
    
    /**
      * A function that throws an error when the given value does not match the expected value.
      */
    var raiser: js.UndefOr[js.Function1[/* options */ Compare[T], Unit]] = js.undefined
    
    /**
      * Either `specName` or `exactSpecName` must be defined.
      */
    var specName: js.UndefOr[String] = js.undefined
    
    /**
      * A function that transforms the value before storing it as snapshots.
      * Defaults to the identity function.
      */
    var store: js.UndefOr[js.Function1[/* value */ T, U]] = js.undefined
    
    /**
      * The value to store.
      * Cannot be `undefined` (see https://github.com/bahmutov/snap-shot-core/issues/111).
      */
    var what: T
  }
  object Comment {
    
    inline def apply[T /* <: js.Object | Null */, U](what: T): Comment[T, U] = {
      val __obj = js.Dynamic.literal(what = what.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment[T, U]]
    }
    
    extension [Self <: Comment[?, ?], T /* <: js.Object | Null */, U](x: Self & (Comment[T, U])) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompare(value: /* options */ Expected[T] => Result): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setExactSpecName(value: String): Self = StObject.set(x, "exactSpecName", value.asInstanceOf[js.Any])
      
      inline def setExactSpecNameUndefined: Self = StObject.set(x, "exactSpecName", js.undefined)
      
      inline def setExt(value: /* template literal string: .${string} */ String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setOpts(value: Opts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setRaiser(value: /* options */ Compare[T] => Callback): Self = StObject.set(x, "raiser", js.Any.fromFunction1((t0: /* options */ Compare[T]) => value(t0).runNow()))
      
      inline def setRaiserUndefined: Self = StObject.set(x, "raiser", js.undefined)
      
      inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
      
      inline def setSpecNameUndefined: Self = StObject.set(x, "specName", js.undefined)
      
      inline def setStore(value: /* value */ T => U): Self = StObject.set(x, "store", js.Any.fromFunction1(value))
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setWhat(value: T): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
      
      inline def set__filename(value: String): Self = StObject.set(x, "__filename", value.asInstanceOf[js.Any])
      
      inline def set__filenameUndefined: Self = StObject.set(x, "__filename", js.undefined)
    }
  }
  
  trait Compare[T /* <: js.Object | Null */] extends StObject {
    
    def compare(options: Expected[T]): Result
    @JSName("compare")
    var compare_Original: CompareFunction[T]
    
    var expected: Any
    
    var specName: String
    
    var value: T
  }
  object Compare {
    
    inline def apply[T /* <: js.Object | Null */](compare: /* options */ Expected[T] => Result, expected: Any, specName: String, value: T): Compare[T] = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), expected = expected.asInstanceOf[js.Any], specName = specName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compare[T]]
    }
    
    extension [Self <: Compare[?], T /* <: js.Object | Null */](x: Self & Compare[T]) {
      
      inline def setCompare(value: /* options */ Expected[T] => Result): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExactSpecName extends StObject {
    
    var exactSpecName: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var specName: js.UndefOr[String] = js.undefined
  }
  object ExactSpecName {
    
    inline def apply(): ExactSpecName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExactSpecName]
    }
    
    extension [Self <: ExactSpecName](x: Self) {
      
      inline def setExactSpecName(value: String): Self = StObject.set(x, "exactSpecName", value.asInstanceOf[js.Any])
      
      inline def setExactSpecNameUndefined: Self = StObject.set(x, "exactSpecName", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
      
      inline def setSpecNameUndefined: Self = StObject.set(x, "specName", js.undefined)
    }
  }
  
  trait Expected[T /* <: js.Object | Null */] extends StObject {
    
    var expected: Any
    
    var value: T
  }
  object Expected {
    
    inline def apply[T /* <: js.Object | Null */](expected: Any, value: T): Expected[T] = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expected[T]]
    }
    
    extension [Self <: Expected[?], T /* <: js.Object | Null */](x: Self & Expected[T]) {
      
      inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ext extends StObject {
    
    /**
      * Defaults to `.snapshot.js`.
      */
    var ext: js.UndefOr[/* template literal string: .${string} */ String] = js.undefined
    
    var tests: js.Array[SpecFile]
  }
  object Ext {
    
    inline def apply(tests: js.Array[SpecFile]): Ext = {
      val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ext]
    }
    
    extension [Self <: Ext](x: Self) {
      
      inline def setExt(value: /* template literal string: .${string} */ String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setTests(value: js.Array[SpecFile]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: SpecFile*): Self = StObject.set(x, "tests", js.Array(value*))
    }
  }
  
  trait File extends StObject {
    
    var file: String
    
    var specName: String
  }
  object File {
    
    inline def apply(file: String, specName: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], specName = specName.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileParameter extends StObject {
    
    var exactSpecName: js.UndefOr[String] = js.undefined
    
    var fileParameter: String
    
    var index: js.UndefOr[Double] = js.undefined
    
    var specName: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object FileParameter {
    
    inline def apply(fileParameter: String): FileParameter = {
      val __obj = js.Dynamic.literal(fileParameter = fileParameter.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileParameter]
    }
    
    extension [Self <: FileParameter](x: Self) {
      
      inline def setExactSpecName(value: String): Self = StObject.set(x, "exactSpecName", value.asInstanceOf[js.Any])
      
      inline def setExactSpecNameUndefined: Self = StObject.set(x, "exactSpecName", js.undefined)
      
      inline def setFileParameter(value: String): Self = StObject.set(x, "fileParameter", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
      
      inline def setSpecNameUndefined: Self = StObject.set(x, "specName", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var exactSpecName: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[/* template literal string: .${string} */ String] = js.undefined
    
    var file: String
    
    var index: js.UndefOr[Double] = js.undefined
    
    var opts: js.UndefOr[Opts] = js.undefined
    
    var specName: js.UndefOr[String] = js.undefined
    
    var value: js.Object | Null
  }
  object Index {
    
    inline def apply(file: String): Index = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setExactSpecName(value: String): Self = StObject.set(x, "exactSpecName", value.asInstanceOf[js.Any])
      
      inline def setExactSpecNameUndefined: Self = StObject.set(x, "exactSpecName", js.undefined)
      
      inline def setExt(value: /* template literal string: .${string} */ String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOpts(value: Opts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
      
      inline def setSpecNameUndefined: Self = StObject.set(x, "specName", js.undefined)
      
      inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait Key[U] extends StObject {
    
    /**
      * The formed snapshot name.
      */
    var key: String
    
    /**
      * The stored value.
      */
    var value: U
  }
  object Key {
    
    inline def apply[U](key: String, value: U): Key[U] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[U]]
    }
    
    extension [Self <: Key[?], U](x: Self & Key[U]) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: U): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortSnapshots extends StObject {
    
    var sortSnapshots: js.UndefOr[Boolean] = js.undefined
    
    var useRelativePath: js.UndefOr[Boolean] = js.undefined
  }
  object SortSnapshots {
    
    inline def apply(): SortSnapshots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSnapshots]
    }
    
    extension [Self <: SortSnapshots](x: Self) {
      
      inline def setSortSnapshots(value: Boolean): Self = StObject.set(x, "sortSnapshots", value.asInstanceOf[js.Any])
      
      inline def setSortSnapshotsUndefined: Self = StObject.set(x, "sortSnapshots", js.undefined)
      
      inline def setUseRelativePath(value: Boolean): Self = StObject.set(x, "useRelativePath", value.asInstanceOf[js.Any])
      
      inline def setUseRelativePathUndefined: Self = StObject.set(x, "useRelativePath", js.undefined)
    }
  }
  
  trait SpecFile extends StObject {
    
    var key: String
    
    var specFile: String
  }
  object SpecFile {
    
    inline def apply(key: String, specFile: String): SpecFile = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], specFile = specFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecFile]
    }
    
    extension [Self <: SpecFile](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSpecFile(value: String): Self = StObject.set(x, "specFile", value.asInstanceOf[js.Any])
    }
  }
}
