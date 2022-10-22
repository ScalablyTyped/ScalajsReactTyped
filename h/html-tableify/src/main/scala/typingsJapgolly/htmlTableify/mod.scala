package typingsJapgolly.htmlTableify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: /* keyof any */ String */](data: js.Array[Datum[T]]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply[T /* <: /* keyof any */ String */](data: js.Array[Datum[T]], config: Config[T]): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("html-tableify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.htmlTableify.htmlTableifyStrings.center
    - typingsJapgolly.htmlTableify.htmlTableifyStrings.left
    - typingsJapgolly.htmlTableify.htmlTableifyStrings.right
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typingsJapgolly.htmlTableify.htmlTableifyStrings.center = "center".asInstanceOf[typingsJapgolly.htmlTableify.htmlTableifyStrings.center]
    
    inline def left: typingsJapgolly.htmlTableify.htmlTableifyStrings.left = "left".asInstanceOf[typingsJapgolly.htmlTableify.htmlTableifyStrings.left]
    
    inline def right: typingsJapgolly.htmlTableify.htmlTableifyStrings.right = "right".asInstanceOf[typingsJapgolly.htmlTableify.htmlTableifyStrings.right]
  }
  
  /** Table config object for data with keys `T`. */
  trait Config[T] extends StObject {
    
    var headers: js.UndefOr[js.Array[Header[T]]] = js.undefined
    
    /** Tidy the output HTML. */
    var tidy: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply[T](): Config[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[T]]
    }
    
    extension [Self <: Config[?], T](x: Self & Config[T]) {
      
      inline def setHeaders(value: js.Array[Header[T]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Header[T]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setTidy(value: Boolean): Self = StObject.set(x, "tidy", value.asInstanceOf[js.Any])
      
      inline def setTidyUndefined: Self = StObject.set(x, "tidy", js.undefined)
    }
  }
  
  /** Object of optional values for each key `T`. */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in T ]:? unknown}
    }}}
    */
  @js.native
  trait Datum[T /* <: /* keyof any */ String */] extends StObject
  
  /** Header config object for key `T`. */
  trait Header[T] extends StObject {
    
    /** Text align of the column. */
    var align: js.UndefOr[Alignment] = js.undefined
    
    /** Key in data object. */
    var name: T
    
    /** Title of the column. */
    var title: js.UndefOr[String] = js.undefined
  }
  object Header {
    
    inline def apply[T](name: T): Header[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header[T]]
    }
    
    extension [Self <: Header[?], T](x: Self & Header[T]) {
      
      inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
