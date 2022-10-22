package typingsJapgolly.istanbulLibHook

import japgolly.scalajs.react.Callback
import typingsJapgolly.istanbulLibHook.anon.PartialHookRequireOptions
import typingsJapgolly.istanbulLibHook.anon.PartialHookRunInContextOp
import typingsJapgolly.istanbulLibHook.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hookCreateScript(matcher: Matcher, transformer: Transformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookCreateScript")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookCreateScript(matcher: Matcher, transformer: Transformer, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookCreateScript")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hookRequire(matcher: Matcher, transformer: Transformer): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRequire")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def hookRequire(matcher: Matcher, transformer: Transformer, options: PartialHookRequireOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRequire")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def hookRunInContext(matcher: Matcher, transformer: Transformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookRunInContext(matcher: Matcher, transformer: Transformer, options: PartialHookRunInContextOp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hookRunInThisContext(matcher: Matcher, transformer: Transformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInThisContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookRunInThisContext(matcher: Matcher, transformer: Transformer, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInThisContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unhookCreateScript(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookCreateScript")().asInstanceOf[Unit]
  
  inline def unhookRunInContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookRunInContext")().asInstanceOf[Unit]
  
  inline def unhookRunInThisContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookRunInThisContext")().asInstanceOf[Unit]
  
  inline def unloadRequireCache(matcher: Matcher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadRequireCache")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait HookRequireOptions
    extends StObject
       with Options {
    
    var extensions: js.Array[String]
    
    def postLoadHook(filename: String): Unit
  }
  object HookRequireOptions {
    
    inline def apply(extensions: js.Array[String], postLoadHook: String => Callback, verbose: Boolean): HookRequireOptions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], postLoadHook = js.Any.fromFunction1((t0: String) => postLoadHook(t0).runNow()), verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookRequireOptions]
    }
    
    extension [Self <: HookRequireOptions](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setPostLoadHook(value: String => Callback): Self = StObject.set(x, "postLoadHook", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait HookRunInContextOptions
    extends StObject
       with Options {
    
    var coverageVariable: String
  }
  object HookRunInContextOptions {
    
    inline def apply(coverageVariable: String, verbose: Boolean): HookRunInContextOptions = {
      val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookRunInContextOptions]
    }
    
    extension [Self <: HookRunInContextOptions](x: Self) {
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
    }
  }
  
  type Matcher = js.Function1[/* filename */ String, Boolean]
  
  trait Options extends StObject {
    
    var verbose: Boolean
  }
  object Options {
    
    inline def apply(verbose: Boolean): Options = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  type Transformer = js.Function2[/* code */ String, /* options */ TransformerOptions, String]
  
  trait TransformerOptions extends StObject {
    
    var filename: String
  }
  object TransformerOptions {
    
    inline def apply(filename: String): TransformerOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformerOptions]
    }
    
    extension [Self <: TransformerOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
