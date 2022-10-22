package typingsJapgolly.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePattern extends StObject {
  
  /**
    * @default true
    * @description Should the files be included in the browser using <script> tag? Use false if you want to
    * load them manually, eg. using Require.js.
    */
  var included: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    * @description Should the files be served from disk on each request by Karma's webserver?
    */
  var nocache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The pattern to use for matching.
    */
  var pattern: String
  
  /**
    * @default true
    * @description Should the files be served by Karma's webserver?
    */
  var served: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Choose the type to use when including a file
    * @default 'js'
    * @description  The type determines the mechanism for including the file.
    * The css and html types create link elements; the js and module elements create script elements.
    * The dom type includes the file content in the page, used, for example, to test components combining HTML and JS.
    */
  var `type`: js.UndefOr[FilePatternTypes] = js.undefined
  
  /**
    * @default true
    * @description If <code>autoWatch</code> is true all files that have set watched to true will be watched
    * for changes.
    */
  var watched: js.UndefOr[Boolean] = js.undefined
}
object FilePattern {
  
  inline def apply(pattern: String): FilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePattern]
  }
  
  extension [Self <: FilePattern](x: Self) {
    
    inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
    
    inline def setNocache(value: Boolean): Self = StObject.set(x, "nocache", value.asInstanceOf[js.Any])
    
    inline def setNocacheUndefined: Self = StObject.set(x, "nocache", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setServed(value: Boolean): Self = StObject.set(x, "served", value.asInstanceOf[js.Any])
    
    inline def setServedUndefined: Self = StObject.set(x, "served", js.undefined)
    
    inline def setType(value: FilePatternTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWatched(value: Boolean): Self = StObject.set(x, "watched", value.asInstanceOf[js.Any])
    
    inline def setWatchedUndefined: Self = StObject.set(x, "watched", js.undefined)
  }
}
