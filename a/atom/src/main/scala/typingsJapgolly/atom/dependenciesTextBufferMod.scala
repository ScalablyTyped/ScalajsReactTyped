package typingsJapgolly.atom

import typingsJapgolly.atom.anon.ShouldDestroyOnFileDelete
import typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.BufferLoadOptions
import typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBufferFileBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferMod {
  
  @JSImport("atom/dependencies/text-buffer", "Point")
  @js.native
  /** Construct a Point object */
  open class Point ()
    extends typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.Point {
    def this(row: Double) = this()
    def this(row: Double, column: Double) = this()
    def this(row: Unit, column: Double) = this()
  }
  /* static members */
  object Point {
    
    @JSImport("atom/dependencies/text-buffer", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    // Construction
    /**
      *  Create a Point from an array containing two numbers representing the
      *  row and column.
      */
    inline def fromObject(`object`: PointCompatible): typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.Point]
    inline def fromObject(`object`: PointCompatible, copy: Boolean): typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.Point]
    
    // Comparison
    /** Returns the given Point that is earlier in the buffer. */
    inline def min(point1: PointCompatible, point2: PointCompatible): typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.Point]
  }
  
  @JSImport("atom/dependencies/text-buffer", "Range")
  @js.native
  /** Construct a Range object. */
  open class Range ()
    extends typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.Range {
    def this(pointA: PointCompatible) = this()
    def this(pointA: Unit, pointB: PointCompatible) = this()
    def this(pointA: PointCompatible, pointB: PointCompatible) = this()
  }
  /* static members */
  object Range {
    
    @JSImport("atom/dependencies/text-buffer", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    /** Call this with the result of Range::serialize to construct a new Range. */
    inline def deserialize(array: js.Object): typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.Range]
    
    // Construction
    /** Convert any range-compatible object to a Range. */
    inline def fromObject(`object`: RangeCompatible): typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.Range]
    inline def fromObject(`object`: RangeCompatible, copy: Boolean): typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.Range]
  }
  
  @JSImport("atom/dependencies/text-buffer", "TextBuffer")
  @js.native
  /** Create a new buffer with the given params. */
  open class TextBuffer ()
    extends typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer {
    def this(params: ShouldDestroyOnFileDelete) = this()
    /** Create a new buffer with the given starting text. */
    def this(text: String) = this()
  }
  /* static members */
  object TextBuffer {
    
    @JSImport("atom/dependencies/text-buffer", "TextBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Restore a TextBuffer based on an earlier state created using the
      *  TextBuffer::serialize method.
      */
    inline def deserialize(params: js.Object): js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    
    /** Create a new buffer backed by the given file path. */
    inline def load(filePath: String): js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: String, params: BufferLoadOptions): js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: TextBufferFileBackend): js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: TextBufferFileBackend, params: BufferLoadOptions): js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    
    /**
      *  Create a new buffer backed by the given file path. For better performance,
      *  use TextBuffer.load instead.
      */
    inline def loadSync(filePath: String): typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]
    inline def loadSync(filePath: String, params: BufferLoadOptions): typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]
  }
}
