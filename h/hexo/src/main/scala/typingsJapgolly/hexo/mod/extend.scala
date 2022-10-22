package typingsJapgolly.hexo.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.connect.mod.Server
import typingsJapgolly.hexo.anon.Desc
import typingsJapgolly.hexo.anon.Dictkey
import typingsJapgolly.hexo.anon.Path
import typingsJapgolly.hexo.hexoBooleans.`false`
import typingsJapgolly.hexo.hexoBooleans.`true`
import typingsJapgolly.hexo.hexoStrings.after_clean
import typingsJapgolly.hexo.hexoStrings.after_generate
import typingsJapgolly.hexo.hexoStrings.after_init
import typingsJapgolly.hexo.hexoStrings.after_post_render
import typingsJapgolly.hexo.hexoStrings.after_renderColonhtml
import typingsJapgolly.hexo.hexoStrings.before_exit
import typingsJapgolly.hexo.hexoStrings.before_generate
import typingsJapgolly.hexo.hexoStrings.before_post_render
import typingsJapgolly.hexo.hexoStrings.new_post_path
import typingsJapgolly.hexo.hexoStrings.post_permalink
import typingsJapgolly.hexo.hexoStrings.server_middleware
import typingsJapgolly.hexo.hexoStrings.template_locals
import typingsJapgolly.hexo.mod.Box.File
import typingsJapgolly.hexo.mod.Post.Data
import typingsJapgolly.hexo.mod.extend.Console.Options
import typingsJapgolly.hexo.mod.extend.Deployer.Config
import typingsJapgolly.hexo.mod.extend.Generator.Return
import typingsJapgolly.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extend {
  
  @js.native
  trait Console extends StObject {
    
    def register(name: String, desc: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
    def register(name: String, desc: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
    def register(name: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
    def register(name: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  }
  object Console {
    
    trait Options extends StObject {
      
      /**
        * The description of each argument of a console command.
        */
      var arguments: js.UndefOr[js.Array[Desc]] = js.undefined
      
      /**
        * More detailed information about a console command.
        */
      var desc: js.UndefOr[String] = js.undefined
      
      /**
        * The description of each option of a console command.
        */
      var options: js.UndefOr[js.Array[Desc]] = js.undefined
      
      /**
        * The usage of a console command.
        */
      var usage: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setArguments(value: js.Array[Desc]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
        
        inline def setArgumentsVarargs(value: Desc*): Self = StObject.set(x, "arguments", js.Array(value*))
        
        inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        inline def setOptions(value: js.Array[Desc]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setOptionsVarargs(value: Desc*): Self = StObject.set(x, "options", js.Array(value*))
        
        inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
        
        inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      }
    }
  }
  
  trait Deployer extends StObject {
    
    def register(name: String, fn: js.Function1[/* args */ Config, Unit]): Unit
  }
  object Deployer {
    
    inline def apply(register: (String, js.Function1[/* args */ Config, Unit]) => Callback): Deployer = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2((t0: String, t1: js.Function1[/* args */ Config, Unit]) => (register(t0, t1)).runNow()))
      __obj.asInstanceOf[Deployer]
    }
    
    trait Config
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      val `type`: js.UndefOr[String] = js.undefined
    }
    object Config {
      
      inline def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      extension [Self <: Config](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    extension [Self <: Deployer](x: Self) {
      
      inline def setRegister(value: (String, js.Function1[/* args */ Config, Unit]) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: String, t1: js.Function1[/* args */ Config, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    def exec(`type`: String): Any = js.native
    def exec(`type`: String, data: Any): Any = js.native
    def exec(`type`: String, data: Any, options: typingsJapgolly.hexo.mod.extend.Filter.Options): Any = js.native
    def exec(`type`: String, data: Unit, options: typingsJapgolly.hexo.mod.extend.Filter.Options): Any = js.native
    
    def execSync(`type`: String): Any = js.native
    def execSync(`type`: String, data: Any): Any = js.native
    def execSync(`type`: String, data: Any, options: typingsJapgolly.hexo.mod.extend.Filter.Options): Any = js.native
    def execSync(`type`: String, data: Unit, options: typingsJapgolly.hexo.mod.extend.Filter.Options): Any = js.native
    
    def register(`type`: String, fn: js.Function2[/* data */ Any, /* repeated */ Any, Any]): Unit = js.native
    def register(`type`: String, fn: js.Function2[/* data */ Any, /* repeated */ Any, Any], priority: Double): Unit = js.native
    /**
      * Executed after generated files and cache are removed with hexo clean command.
      */
    @JSName("register")
    def register_afterclean(`type`: after_clean, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_afterclean(`type`: after_clean, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed after generation finishes.
      */
    @JSName("register")
    def register_aftergenerate(`type`: after_generate, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_aftergenerate(`type`: after_generate, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed after Hexo is initialized – this will run right after `hexo.init` completes.
      */
    @JSName("register")
    def register_afterinit(`type`: after_init, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_afterinit(`type`: after_init, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed after a post is rendered. Refer to post rendering to learn the execution steps.
      */
    @JSName("register")
    def register_afterpostrender(`type`: after_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit]): Unit = js.native
    @JSName("register")
    def register_afterpostrender(`type`: after_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit], priority: Double): Unit = js.native
    /**
      * Executed after rendering finishes. You can see rendering for more info.
      */
    @JSName("register")
    def register_afterrenderhtml(
      `type`: after_renderColonhtml,
      fn: js.Function2[/* result */ String, /* data */ Path, String | Unit]
    ): Unit = js.native
    @JSName("register")
    def register_afterrenderhtml(
      `type`: after_renderColonhtml,
      fn: js.Function2[/* result */ String, /* data */ Path, String | Unit],
      priority: Double
    ): Unit = js.native
    /**
      * Executed before Hexo is about to exit – this will run right after `hexo.exit` is called.
      */
    @JSName("register")
    def register_beforeexit(`type`: before_exit, fn: js.Function0[Unit]): Unit = js.native
    @JSName("register")
    def register_beforeexit(`type`: before_exit, fn: js.Function0[Unit], priority: Double): Unit = js.native
    /**
      * Executed before generation begins.
      */
    @JSName("register")
    def register_beforegenerate(`type`: before_generate, fn: js.Function1[/* data */ Any, Any]): Unit = js.native
    @JSName("register")
    def register_beforegenerate(`type`: before_generate, fn: js.Function1[/* data */ Any, Any], priority: Double): Unit = js.native
    /**
      * Executed before a post is rendered. Refer to post rendering to learn the execution steps.
      */
    @JSName("register")
    def register_beforepostrender(`type`: before_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit]): Unit = js.native
    @JSName("register")
    def register_beforepostrender(`type`: before_post_render, fn: js.Function1[/* data */ Dictkey, Dictkey | Unit], priority: Double): Unit = js.native
    /**
      * Executed when creating a post to determine the path of new posts.
      */
    @JSName("register")
    def register_newpostpath(`type`: new_post_path, fn: js.Function2[/* data */ Data, /* replace */ js.UndefOr[Boolean], Unit]): Unit = js.native
    @JSName("register")
    def register_newpostpath(
      `type`: new_post_path,
      fn: js.Function2[/* data */ Data, /* replace */ js.UndefOr[Boolean], Unit],
      priority: Double
    ): Unit = js.native
    /**
      * Used to determine the permalink of posts.
      */
    @JSName("register")
    def register_postpermalink(`type`: post_permalink, fn: js.Function1[/* permalink */ String, String]): Unit = js.native
    @JSName("register")
    def register_postpermalink(`type`: post_permalink, fn: js.Function1[/* permalink */ String, String], priority: Double): Unit = js.native
    /**
      * Add middleware to the server. app is a Connect instance.
      */
    @JSName("register")
    def register_servermiddleware(`type`: server_middleware, fn: js.Function1[/* app */ Server, Server | Unit]): Unit = js.native
    @JSName("register")
    def register_servermiddleware(`type`: server_middleware, fn: js.Function1[/* app */ Server, Server | Unit], priority: Double): Unit = js.native
    /**
      * Modify [local variables](https://hexo.io/docs/variables) in templates.
      */
    @JSName("register")
    def register_templatelocals(`type`: template_locals, fn: js.Function1[/* locals */ TemplateLocals, TemplateLocals | Unit]): Unit = js.native
    @JSName("register")
    def register_templatelocals(
      `type`: template_locals,
      fn: js.Function1[/* locals */ TemplateLocals, TemplateLocals | Unit],
      priority: Double
    ): Unit = js.native
    
    def unregister(`type`: String, fn: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  }
  object Filter {
    
    trait Options extends StObject {
      
      /**
        * Arguments. This must be an array.
        */
      var args: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * `hexo` object.
        */
      var context: js.UndefOr[Hexo] = js.undefined
    }
    object Options {
      
      inline def apply(): typingsJapgolly.hexo.mod.extend.Filter.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.hexo.mod.extend.Filter.Options]
      }
      
      extension [Self <: typingsJapgolly.hexo.mod.extend.Filter.Options](x: Self) {
        
        inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
        
        inline def setContext(value: Hexo): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      }
    }
  }
  
  trait Generator extends StObject {
    
    def register(
      name: String,
      fn: js.Function1[
          /* locals */ Site, 
          Return | js.Array[Return] | (typingsJapgolly.bluebird.mod.^[js.Array[Return] | Return])
        ]
    ): Unit
  }
  object Generator {
    
    inline def apply(
      register: (String, js.Function1[
          /* locals */ Site, 
          Return | js.Array[Return] | (typingsJapgolly.bluebird.mod.^[js.Array[Return] | Return])
        ]) => Callback
    ): Generator = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2((t0: String, t1: js.Function1[
          /* locals */ Site, 
          Return | js.Array[Return] | (typingsJapgolly.bluebird.mod.^[js.Array[Return] | Return])
        ]) => (register(t0, t1)).runNow()))
      __obj.asInstanceOf[Generator]
    }
    
    extension [Self <: Generator](x: Self) {
      
      inline def setRegister(
        value: (String, js.Function1[
              /* locals */ Site, 
              Return | js.Array[Return] | (typingsJapgolly.bluebird.mod.^[js.Array[Return] | Return])
            ]) => Callback
      ): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: String, t1: js.Function1[
              /* locals */ Site, 
              Return | js.Array[Return] | (typingsJapgolly.bluebird.mod.^[js.Array[Return] | Return])
            ]) => (value(t0, t1)).runNow()))
    }
    
    trait Return extends StObject {
      
      var data: Any
      
      /**
        * Layout. Specify the layouts for rendering. The value can be a string or an array. If it’s ignored then the route will return data directly.
        */
      var layout: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * Path not including the prefixing `/` .
        */
      var path: String
    }
    object Return {
      
      inline def apply(data: Any, path: String): Return = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Return]
      }
      
      extension [Self <: Return](x: Self) {
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setLayout(value: String | js.Array[String]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setLayoutVarargs(value: String*): Self = StObject.set(x, "layout", js.Array(value*))
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait Helper extends StObject {
    
    def get(name: String): js.UndefOr[js.Function1[/* repeated */ Any, Any]]
    
    def list(): StringDictionary[js.Function1[/* repeated */ Any, Any]]
    
    def register(name: String, fn: js.Function1[/* repeated */ Any, Any]): Unit
  }
  object Helper {
    
    inline def apply(
      get: String => js.UndefOr[js.Function1[/* repeated */ Any, Any]],
      list: CallbackTo[StringDictionary[js.Function1[/* repeated */ Any, Any]]],
      register: (String, js.Function1[/* repeated */ Any, Any]) => Callback
    ): Helper = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = list.toJsFn, register = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (register(t0, t1)).runNow()))
      __obj.asInstanceOf[Helper]
    }
    
    extension [Self <: Helper](x: Self) {
      
      inline def setGet(value: String => js.UndefOr[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setList(value: CallbackTo[StringDictionary[js.Function1[/* repeated */ Any, Any]]]): Self = StObject.set(x, "list", value.toJsFn)
      
      inline def setRegister(value: (String, js.Function1[/* repeated */ Any, Any]) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Migrator extends StObject {
    
    def register(
      name: String,
      fn: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ Any, Unit], Unit]
    ): Unit
  }
  object Migrator {
    
    inline def apply(
      register: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ Any, Unit], Unit]) => Callback
    ): Migrator = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2((t0: String, t1: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ Any, Unit], Unit]) => (register(t0, t1)).runNow()))
      __obj.asInstanceOf[Migrator]
    }
    
    extension [Self <: Migrator](x: Self) {
      
      inline def setRegister(
        value: (String, js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ Any, Unit], Unit]) => Callback
      ): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: String, t1: js.Function2[/* args */ ParsedArgs, /* fn */ js.Function1[/* err */ Any, Unit], Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait Processor extends StObject {
    
    def register(fn: js.Function1[/* file */ File, Unit]): Unit = js.native
    def register(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
    def register(pattern: js.Function1[/* str */ String, Any], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
    def register(pattern: js.RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def register(
      srcExt: String,
      outExt: String,
      fn: js.ThisFunction2[/* this */ Hexo, /* data */ RendererData, /* options */ Any, js.Promise[String]]
    ): Unit = js.native
    @JSName("register")
    def register_false(
      srcExt: String,
      outExt: String,
      fn: js.ThisFunction2[/* this */ Hexo, /* data */ RendererData, /* options */ Any, js.Promise[String]],
      sync: `false`
    ): Unit = js.native
    @JSName("register")
    def register_true(
      srcExt: String,
      outExt: String,
      fn: js.ThisFunction2[/* this */ Hexo, /* data */ RendererData, /* options */ Any, String],
      sync: `true`
    ): Unit = js.native
  }
  
  trait RendererData extends StObject {
    
    /**
      * File path.
      */
    val path: js.UndefOr[String] = js.undefined
    
    /**
      * File content.
      */
    val text: String
  }
  object RendererData {
    
    inline def apply(text: String): RendererData = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererData]
    }
    
    extension [Self <: RendererData](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    def register(
      name: String,
      fn: js.Function2[/* args */ js.Array[String], /* content */ js.UndefOr[String], String]
    ): Unit = js.native
    def register(
      name: String,
      fn: js.Function2[/* args */ js.Array[String], /* content */ js.UndefOr[String], String],
      options: typingsJapgolly.hexo.mod.extend.Tag.Options
    ): Unit = js.native
  }
  object Tag {
    
    trait Options extends StObject {
      
      var async: js.UndefOr[Boolean] = js.undefined
      
      var ends: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): typingsJapgolly.hexo.mod.extend.Tag.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.hexo.mod.extend.Tag.Options]
      }
      
      extension [Self <: typingsJapgolly.hexo.mod.extend.Tag.Options](x: Self) {
        
        inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        inline def setEnds(value: Boolean): Self = StObject.set(x, "ends", value.asInstanceOf[js.Any])
        
        inline def setEndsUndefined: Self = StObject.set(x, "ends", js.undefined)
      }
    }
  }
}
