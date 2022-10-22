package typingsJapgolly.findRemove

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Age extends StObject {
    
    /** can be any float number. findRemoveSync then compares it with the file stats and deletes those with modification times older than age.seconds */
    var age: js.UndefOr[Seconds] = js.undefined
    
    /** can be a string or an array of directories you want to delete within dir. */
    var dir: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** this too, can be a string or an array of file extentions you want to delete within dir */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** can be a string or an array of files you want to delete within dir */
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** useful to exclude some files. again, can be a string or an array of file names you do NOT want to delete within dir */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** can be any integer number. Will limit the number of files to be deleted at single operation to be limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** advanced: limits filtering to a certain level. useful for performance. recommended for crawling huge directory trees */
    var maxLevel: js.UndefOr[Double] = js.undefined
    
    /** can be any string. Will delete any files that start with prefix */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** advanced: set to true for a test run, meaning it does not delete anything but returns a JSON of files/directories it would have deleted. useful for testing. */
    var test: js.UndefOr[Boolean] = js.undefined
  }
  object Age {
    
    inline def apply(): Age = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Age]
    }
    
    extension [Self <: Age](x: Self) {
      
      inline def setAge(value: Seconds): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
      
      inline def setDir(value: String | js.Array[String]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirVarargs(value: String*): Self = StObject.set(x, "dir", js.Array(value*))
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMaxLevel(value: Double): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  trait Seconds extends StObject {
    
    var seconds: Double
  }
  object Seconds {
    
    inline def apply(seconds: Double): Seconds = {
      val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Seconds]
    }
    
    extension [Self <: Seconds](x: Self) {
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
