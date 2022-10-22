package typingsJapgolly.emotionStylis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@emotion/stylis", JSImport.Default)
  @js.native
  val default: StylisConstructor = js.native
  
  @js.native
  sealed trait Context extends StObject
  @JSImport("@emotion/stylis", "Context")
  @js.native
  object Context extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Context & Double] = js.native
    
    @js.native
    sealed trait ATRUL
      extends StObject
         with Context
         with PrefixContext
    /* 3 */ val ATRUL: typingsJapgolly.emotionStylis.mod.Context.ATRUL & Double = js.native
    
    @js.native
    sealed trait BLCKS
      extends StObject
         with Context
         with PrefixContext
    /* 2 */ val BLCKS: typingsJapgolly.emotionStylis.mod.Context.BLCKS & Double = js.native
    
    @js.native
    sealed trait POSTS
      extends StObject
         with Context
    /* -2 */ val POSTS: typingsJapgolly.emotionStylis.mod.Context.POSTS & Double = js.native
    
    @js.native
    sealed trait PREPS
      extends StObject
         with Context
    /* -1 */ val PREPS: typingsJapgolly.emotionStylis.mod.Context.PREPS & Double = js.native
    
    @js.native
    sealed trait PROPS
      extends StObject
         with Context
         with PrefixContext
    /* 1 */ val PROPS: typingsJapgolly.emotionStylis.mod.Context.PROPS & Double = js.native
    
    @js.native
    sealed trait UNKWN
      extends StObject
         with Context
    /* 0 */ val UNKWN: typingsJapgolly.emotionStylis.mod.Context.UNKWN & Double = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@emotion/stylis", JSImport.Default)
  @js.native
  open class defaultCls ()
    extends StObject
       with Stylis {
    def this(options: Options) = this()
  }
  
  type ArrayPlugable = js.Array[Plugable]
  
  trait Options extends StObject {
    
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ PrefixContext) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type Plugable = js.UndefOr[Null | Boolean | Plugin | Any]
  
  type Plugin = js.ThisFunction9[
    /* this */ Stylis, 
    /* context */ Context, 
    /* content */ Any, 
    /* selector */ js.Array[String], 
    /* parent */ js.Array[String], 
    /* line */ Double, 
    /* column */ Double, 
    /* length */ Double, 
    /* at */ Double, 
    /* depth */ Double, 
    Any
  ]
  
  type Prefix = Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ PrefixContext, Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emotionStylis.mod.Context.PROPS
    - typingsJapgolly.emotionStylis.mod.Context.BLCKS
    - typingsJapgolly.emotionStylis.mod.Context.ATRUL
  */
  trait PrefixContext extends StObject
  
  @js.native
  trait Stylis
    extends StObject
       with StylisConstructor {
    
    def apply(selector: String, properties: String): Any = js.native
    
    def set(options: Options): StylisSet = js.native
    @JSName("set")
    var set_Original: StylisSet = js.native
    
    def use(): StylisUse = js.native
    def use(plugin: Plugable): StylisUse = js.native
    @JSName("use")
    var use_Original: StylisUse = js.native
  }
  
  @js.native
  trait StylisConstructor
    extends StObject
       with Instantiable0[Stylis]
       with Instantiable1[/* options */ Options, Stylis]
  
  @js.native
  trait StylisSet extends StObject {
    
    def apply(options: Options): StylisSet = js.native
  }
  
  @js.native
  trait StylisUse extends StObject {
    
    def apply(): StylisUse = js.native
    def apply(plugin: Plugable): StylisUse = js.native
  }
  
  type _To = StylisConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: StylisConstructor = default
}
