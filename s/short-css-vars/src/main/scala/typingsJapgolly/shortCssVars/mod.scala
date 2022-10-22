package typingsJapgolly.shortCssVars

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("short-css-vars", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ShortCssVars {
    def this(options: Options) = this()
    
    /**
      * Get a mapping of original names to shortened names
      *
      * @example
      * {
      *   'long-variable-name-that-defines-a-particular-color': '1vf2dsn'
      * }
      * @returns map
      */
    /* CompleteClass */
    override def getMap(): StringDictionary[String] = js.native
    
    /**
      * Shortens the names of variables throughout CSS
      * @param css - Text containing CSS variables
      * @returns shortened CSS
      */
    /* CompleteClass */
    override def replaceCss(css: String): String = js.native
    
    /**
      * Shortens the name part of a variable string
      * @param varName - Variable name including -- prefix
      * @returns short
      */
    /* CompleteClass */
    override def replaceName(varName: String): String = js.native
  }
  
  type CustomFormatter = js.Function1[/* name */ String, String]
  
  type CustomIgnore = js.Function1[/* name */ String, Boolean]
  
  type IgnoreType = js.RegExp | String | CustomIgnore
  
  /**
    * Optional configurations
    */
  trait Options extends StObject {
    
    /**
      * Custom formatter
      */
    var formatter: js.UndefOr[CustomFormatter] = js.undefined
    
    /**
      * Rule to ignore certain variable names
      */
    var ignore: js.UndefOr[IgnoreType] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormatter(value: /* name */ String => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setIgnore(value: IgnoreType): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    }
  }
  
  trait ShortCssVars extends StObject {
    
    /**
      * Get a mapping of original names to shortened names
      *
      * @example
      * {
      *   'long-variable-name-that-defines-a-particular-color': '1vf2dsn'
      * }
      * @returns map
      */
    def getMap(): StringDictionary[String]
    
    /**
      * Shortens the names of variables throughout CSS
      * @param css - Text containing CSS variables
      * @returns shortened CSS
      */
    def replaceCss(css: String): String
    
    /**
      * Shortens the name part of a variable string
      * @param varName - Variable name including -- prefix
      * @returns short
      */
    def replaceName(varName: String): String
  }
  object ShortCssVars {
    
    inline def apply(
      getMap: CallbackTo[StringDictionary[String]],
      replaceCss: String => String,
      replaceName: String => String
    ): ShortCssVars = {
      val __obj = js.Dynamic.literal(getMap = getMap.toJsFn, replaceCss = js.Any.fromFunction1(replaceCss), replaceName = js.Any.fromFunction1(replaceName))
      __obj.asInstanceOf[ShortCssVars]
    }
    
    extension [Self <: ShortCssVars](x: Self) {
      
      inline def setGetMap(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "getMap", value.toJsFn)
      
      inline def setReplaceCss(value: String => String): Self = StObject.set(x, "replaceCss", js.Any.fromFunction1(value))
      
      inline def setReplaceName(value: String => String): Self = StObject.set(x, "replaceName", js.Any.fromFunction1(value))
    }
  }
}
