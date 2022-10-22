package typingsJapgolly.tsNode

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.tsNode.anon.Conditions
import typingsJapgolly.tsNode.anon.Format
import typingsJapgolly.tsNode.anon.FormatShortCircuit
import typingsJapgolly.tsNode.anon.ImportAssertions
import typingsJapgolly.tsNode.anon.ShortCircuit
import typingsJapgolly.tsNode.anon.Source
import typingsJapgolly.tsNode.anon.Url
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI1.GetFormatHook
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI1.TransformSourceHook
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.LoadHook
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.ResolveHook
import typingsJapgolly.tsNode.mod.Service
import typingsJapgolly.tsNode.tsNodeStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("ts-node/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEsmHooks(tsNodeService: Service): NodeLoaderHooksAPI1 | NodeLoaderHooksAPI2 = ^.asInstanceOf[js.Dynamic].applyDynamic("createEsmHooks")(tsNodeService.asInstanceOf[js.Any]).asInstanceOf[NodeLoaderHooksAPI1 | NodeLoaderHooksAPI2]
  
  trait NodeImportAssertions extends StObject {
    
    var `type`: js.UndefOr[json] = js.undefined
  }
  object NodeImportAssertions {
    
    inline def apply(): NodeImportAssertions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeImportAssertions]
    }
    
    extension [Self <: NodeImportAssertions](x: Self) {
      
      inline def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type NodeImportConditions = Any
  
  trait NodeLoaderHooksAPI1 extends StObject {
    
    def getFormat(url: String, context: js.Object, defaultGetFormat: GetFormatHook): js.Promise[Format]
    @JSName("getFormat")
    var getFormat_Original: GetFormatHook
    
    def resolve(specifier: String, context: Conditions, defaultResolve: ResolveHook): js.Promise[ShortCircuit]
    @JSName("resolve")
    var resolve_Original: typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI1.ResolveHook
    
    def transformSource(source: String, context: Url, defaultTransformSource: TransformSourceHook): js.Promise[Source]
    def transformSource(source: Buffer, context: Url, defaultTransformSource: TransformSourceHook): js.Promise[Source]
    @JSName("transformSource")
    var transformSource_Original: TransformSourceHook
  }
  object NodeLoaderHooksAPI1 {
    
    inline def apply(
      getFormat: GetFormatHook,
      resolve: typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI1.ResolveHook,
      transformSource: TransformSourceHook
    ): NodeLoaderHooksAPI1 = {
      val __obj = js.Dynamic.literal(getFormat = getFormat.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], transformSource = transformSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLoaderHooksAPI1]
    }
    
    @js.native
    trait GetFormatHook extends StObject {
      
      def apply(url: String, context: js.Object, defaultGetFormat: GetFormatHook): js.Promise[Format] = js.native
    }
    
    extension [Self <: NodeLoaderHooksAPI1](x: Self) {
      
      inline def setGetFormat(value: GetFormatHook): Self = StObject.set(x, "getFormat", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI1.ResolveHook): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setTransformSource(value: TransformSourceHook): Self = StObject.set(x, "transformSource", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait ResolveHook
      extends StObject
         with typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.ResolveHook
    
    @js.native
    trait TransformSourceHook extends StObject {
      
      def apply(source: String, context: Url, defaultTransformSource: TransformSourceHook): js.Promise[Source] = js.native
      def apply(source: Buffer, context: Url, defaultTransformSource: TransformSourceHook): js.Promise[Source] = js.native
    }
  }
  
  trait NodeLoaderHooksAPI2 extends StObject {
    
    def load(url: String, context: ImportAssertions, defaultLoad: LoadHook): js.Promise[FormatShortCircuit]
    @JSName("load")
    var load_Original: LoadHook
    
    def resolve(specifier: String, context: Conditions, defaultResolve: ResolveHook): js.Promise[ShortCircuit]
    @JSName("resolve")
    var resolve_Original: ResolveHook
  }
  object NodeLoaderHooksAPI2 {
    
    inline def apply(load: LoadHook, resolve: ResolveHook): NodeLoaderHooksAPI2 = {
      val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLoaderHooksAPI2]
    }
    
    @js.native
    trait LoadHook extends StObject {
      
      def apply(url: String, context: ImportAssertions, defaultLoad: LoadHook): js.Promise[FormatShortCircuit] = js.native
    }
    
    trait NodeImportAssertions extends StObject {
      
      var `type`: js.UndefOr[json] = js.undefined
    }
    object NodeImportAssertions {
      
      inline def apply(): typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.NodeImportAssertions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.NodeImportAssertions]
      }
      
      extension [Self <: typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.NodeImportAssertions](x: Self) {
        
        inline def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    type NodeImportConditions = Any
    
    extension [Self <: NodeLoaderHooksAPI2](x: Self) {
      
      inline def setLoad(value: LoadHook): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: ResolveHook): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait ResolveHook extends StObject {
      
      def apply(specifier: String, context: Conditions, defaultResolve: ResolveHook): js.Promise[ShortCircuit] = js.native
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tsNode.tsNodeStrings.builtin
    - typingsJapgolly.tsNode.tsNodeStrings.commonjs
    - typingsJapgolly.tsNode.tsNodeStrings.dynamic
    - typingsJapgolly.tsNode.tsNodeStrings.json
    - typingsJapgolly.tsNode.tsNodeStrings.module
    - typingsJapgolly.tsNode.tsNodeStrings.wasm
  */
  trait NodeLoaderHooksFormat extends StObject
  object NodeLoaderHooksFormat {
    
    inline def builtin: typingsJapgolly.tsNode.tsNodeStrings.builtin = "builtin".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.builtin]
    
    inline def commonjs: typingsJapgolly.tsNode.tsNodeStrings.commonjs = "commonjs".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.commonjs]
    
    inline def dynamic: typingsJapgolly.tsNode.tsNodeStrings.dynamic = "dynamic".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.dynamic]
    
    inline def json: typingsJapgolly.tsNode.tsNodeStrings.json = "json".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.json]
    
    inline def module: typingsJapgolly.tsNode.tsNodeStrings.module = "module".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.module]
    
    inline def wasm: typingsJapgolly.tsNode.tsNodeStrings.wasm = "wasm".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.wasm]
  }
}
