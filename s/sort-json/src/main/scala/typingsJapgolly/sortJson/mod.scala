package typingsJapgolly.sortJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Sorts the keys on objects
    * @param old An object to sort the keys of, if not object just returns whatever
    * was given
    */
  inline def apply[T](old: T): T = ^.asInstanceOf[js.Dynamic].apply(old.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T](old: T, options: VisitOptions): T = (^.asInstanceOf[js.Dynamic].apply(old.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("sort-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sorts the JSON files with the `visit()` function and then overwrites the
    * file with sorted JSON
    * @param absolutePaths
    * * String: Absolute path to JSON file to sort and overwrite
    * * Array: Absolute paths to JSON files to sort and overwrite
    */
  inline def overwrite(absolutePaths: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(absolutePaths.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def overwrite(absolutePaths: String, options: OverwriteOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(absolutePaths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def overwrite(absolutePaths: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(absolutePaths.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def overwrite(absolutePaths: js.Array[String], options: OverwriteOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(absolutePaths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait OverwriteOptions
    extends StObject
       with VisitOptions {
    
    /**
      * Formats the file content with an indentation of spaces. Use a number
      * greater then 0 for the value (default: detects the used indentation
      * of the file)
      */
    var indentSize: js.UndefOr[Double] = js.undefined
    
    /** Default: `false` */
    var noFinalNewLine: js.UndefOr[Boolean] = js.undefined
  }
  object OverwriteOptions {
    
    inline def apply(): OverwriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverwriteOptions]
    }
    
    extension [Self <: OverwriteOptions](x: Self) {
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      inline def setNoFinalNewLine(value: Boolean): Self = StObject.set(x, "noFinalNewLine", value.asInstanceOf[js.Any])
      
      inline def setNoFinalNewLineUndefined: Self = StObject.set(x, "noFinalNewLine", js.undefined)
    }
  }
  
  trait VisitOptions extends StObject {
    
    /**
      * Depth's level sorting keys on a multidimensional object
      * (default: `Infinity`)
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * When sorting keys, converts all keys to lowercase so that
      * capitalization doesn't interfere with sort order (default: `false`)
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /** Default: `1` */
    var level: js.UndefOr[Double] = js.undefined
    
    /** Reverse the ordering z -> a (default: `false`) */
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object VisitOptions {
    
    inline def apply(): VisitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisitOptions]
    }
    
    extension [Self <: VisitOptions](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
}
