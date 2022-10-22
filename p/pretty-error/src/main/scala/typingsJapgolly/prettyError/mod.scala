package typingsJapgolly.prettyError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty-error", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PrettyError
  @JSImport("pretty-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pretty-error", "ParsedError")
  @js.native
  open class ParsedError protected () extends StObject {
    def this(error: js.Error) = this()
  }
  
  inline def start(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Any]
  
  inline def stop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Any]
  
  type Callback = js.Function2[/* traceLine */ js.Object | Any, /* lineNumber */ Double, Boolean]
  
  trait ConfigObject extends StObject {
    
    var aliases: js.UndefOr[Boolean | js.Object] = js.undefined
    
    // assuming this is optional
    var filters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.undefined
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var parsedErrorFilters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.undefined
    
    var skip: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.undefined
    
    var skipNodeFiles: js.UndefOr[Boolean | Any] = js.undefined
    
    var skipPackages: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var skipPaths: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  }
  object ConfigObject {
    
    inline def apply(): ConfigObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigObject]
    }
    
    extension [Self <: ConfigObject](x: Self) {
      
      inline def setAliases(value: Boolean | js.Object): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setFilters(value: Boolean | Callback | js.Array[Callback]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersFunction2(value: (/* traceLine */ js.Object | Any, /* lineNumber */ Double) => Boolean): Self = StObject.set(x, "filters", js.Any.fromFunction2(value))
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Callback*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setParsedErrorFilters(value: Boolean | Callback | js.Array[Callback]): Self = StObject.set(x, "parsedErrorFilters", value.asInstanceOf[js.Any])
      
      inline def setParsedErrorFiltersFunction2(value: (/* traceLine */ js.Object | Any, /* lineNumber */ Double) => Boolean): Self = StObject.set(x, "parsedErrorFilters", js.Any.fromFunction2(value))
      
      inline def setParsedErrorFiltersUndefined: Self = StObject.set(x, "parsedErrorFilters", js.undefined)
      
      inline def setParsedErrorFiltersVarargs(value: Callback*): Self = StObject.set(x, "parsedErrorFilters", js.Array(value*))
      
      inline def setSkip(value: Boolean | Callback | js.Array[Callback]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipFunction2(value: (/* traceLine */ js.Object | Any, /* lineNumber */ Double) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      inline def setSkipNodeFiles(value: Boolean | Any): Self = StObject.set(x, "skipNodeFiles", value.asInstanceOf[js.Any])
      
      inline def setSkipNodeFilesUndefined: Self = StObject.set(x, "skipNodeFiles", js.undefined)
      
      inline def setSkipPackages(value: Boolean | js.Array[String]): Self = StObject.set(x, "skipPackages", value.asInstanceOf[js.Any])
      
      inline def setSkipPackagesUndefined: Self = StObject.set(x, "skipPackages", js.undefined)
      
      inline def setSkipPackagesVarargs(value: String*): Self = StObject.set(x, "skipPackages", js.Array(value*))
      
      inline def setSkipPaths(value: Boolean | js.Array[String]): Self = StObject.set(x, "skipPaths", value.asInstanceOf[js.Any])
      
      inline def setSkipPathsUndefined: Self = StObject.set(x, "skipPaths", js.undefined)
      
      inline def setSkipPathsVarargs(value: String*): Self = StObject.set(x, "skipPaths", js.Array(value*))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipVarargs(value: Callback*): Self = StObject.set(x, "skip", js.Array(value*))
    }
  }
  
  @js.native
  trait PrettyError extends StObject {
    
    def alias(stringOrRx: String, alias: String): PrettyError = js.native
    
    def appendStyle(toAppend: js.Object): PrettyError = js.native
    
    def config(configObject: ConfigObject): PrettyError = js.native
    
    def filter(callbacks: Callback): PrettyError = js.native
    
    def filterParsedError(callbacks: Callback): PrettyError = js.native
    
    def getObject(e: js.Object): js.Object = js.native
    
    def removeAlias(stringOrRx: String): PrettyError = js.native
    
    def removeAllAliases(): PrettyError = js.native
    
    def removeAllFilters(): PrettyError = js.native
    
    def removeAllParsedErrorFilters(): PrettyError = js.native
    
    def removeFilter(callbacks: Callback): PrettyError = js.native
    
    def removeParsedErrorFilter(callbacks: Callback): PrettyError = js.native
    
    def render(e: ParsedError): String = js.native
    def render(e: ParsedError, logIt: Boolean): String = js.native
    def render(e: ParsedError, logIt: Boolean, useColors: Boolean): String = js.native
    def render(e: ParsedError, logIt: Unit, useColors: Boolean): String = js.native
    
    def setMaxItems(maxItems: Double): PrettyError = js.native
    
    def skip(callbacks: Callback): PrettyError = js.native
    
    def skipNodeFiles(): Any = js.native
    
    def skipPackage(packages: String*): PrettyError = js.native
    
    def skipPath(paths: String*): PrettyError = js.native
    
    def start(): PrettyError = js.native
    
    def stop(): Any = js.native
    
    def unskip(callbacks: Callback): PrettyError = js.native
    
    def unskipAll(): PrettyError = js.native
    
    def unskipAllPackages(): PrettyError = js.native
    
    def unskipAllPaths(): PrettyError = js.native
    
    def unskipNodeFiles(): Any = js.native
    
    def unskipPackage(packages: String*): PrettyError = js.native
    
    def unskipPath(paths: String*): PrettyError = js.native
    
    def withColors(): PrettyError = js.native
    
    def withoutColors(): PrettyError = js.native
  }
}
