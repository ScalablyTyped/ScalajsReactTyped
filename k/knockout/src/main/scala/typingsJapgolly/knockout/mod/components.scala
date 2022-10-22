package typingsJapgolly.knockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object components {
  
  @JSImport("knockout", "components")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCachedDefinition(componentName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCachedDefinition")(componentName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("knockout", "components.defaultLoader")
  @js.native
  val defaultLoader: DefaultLoader_ = js.native
  
  inline def get(
    componentName: String,
    callback: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ /* definition */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Config */ /* config */ Any, 
      Unit
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(componentName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getComponentNameForNode(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentNameForNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isRegistered(componentName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(componentName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("knockout", "components.loaders")
  @js.native
  val loaders: js.Array[Loader] = js.native
  
  inline def register(componentName: String, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(componentName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def register(componentName: String, config: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(componentName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregister(componentName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(componentName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Component extends StObject {
    
    var createViewModel: js.UndefOr[CreateViewModel] = js.undefined
    
    var template: js.Array[Node]
  }
  object Component {
    
    inline def apply(template: js.Array[Node]): Component = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setCreateViewModel(value: (/* params */ ViewModelParams, /* componentInfo */ ComponentInfo) => ViewModel): Self = StObject.set(x, "createViewModel", js.Any.fromFunction2(value))
      
      inline def setCreateViewModelUndefined: Self = StObject.set(x, "createViewModel", js.undefined)
      
      inline def setTemplate(value: js.Array[Node]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value*))
    }
  }
  
  trait ComponentInfo extends StObject {
    
    var element: Node
    
    var templateNodes: js.Array[Node]
  }
  object ComponentInfo {
    
    inline def apply(element: Node, templateNodes: js.Array[Node]): ComponentInfo = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], templateNodes = templateNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentInfo]
    }
    
    extension [Self <: ComponentInfo](x: Self) {
      
      inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setTemplateNodes(value: js.Array[Node]): Self = StObject.set(x, "templateNodes", value.asInstanceOf[js.Any])
      
      inline def setTemplateNodesVarargs(value: Node*): Self = StObject.set(x, "templateNodes", js.Array(value*))
    }
  }
  
  trait Config extends StObject {
    
    var require: js.UndefOr[String] = js.undefined
    
    var synchronous: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[RequireConfig | TemplateConfig | Any] = js.undefined
    
    var viewModel: js.UndefOr[RequireConfig | ViewModelConfig | Any] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      inline def setTemplate(value: RequireConfig | TemplateConfig | Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value*))
      
      inline def setViewModel(value: RequireConfig | ViewModelConfig | Any): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
      
      inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    }
  }
  
  type CreateViewModel = js.Function2[/* params */ ViewModelParams, /* componentInfo */ ComponentInfo, ViewModel]
  
  trait DefaultLoader_
    extends StObject
       with Loader {
    
    @JSName("getConfig")
    def getConfig_MDefaultLoader_(componentName: String, callback: js.Function1[/* config */ Config | js.Object, Unit]): Unit
    
    @JSName("loadComponent")
    def loadComponent_MDefaultLoader_(componentName: String, config: Config, callback: js.Function1[/* component */ Component, Unit]): Unit
    
    @JSName("loadTemplate")
    def loadTemplate_MDefaultLoader_(
      componentName: String,
      config: TemplateConfig,
      callback: js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]
    ): Unit
    
    @JSName("loadViewModel")
    def loadViewModel_MDefaultLoader_(
      componentName: String,
      config: ViewModelConfig,
      callback: js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]
    ): Unit
  }
  object DefaultLoader_ {
    
    inline def apply(
      getConfig: (String, js.Function1[/* config */ Config | js.Object, Unit]) => Callback,
      loadComponent: (String, Config, js.Function1[/* component */ Component, Unit]) => Callback,
      loadTemplate: (String, TemplateConfig, js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => Callback,
      loadViewModel: (String, ViewModelConfig, js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => Callback
    ): DefaultLoader_ = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction2((t0: String, t1: js.Function1[/* config */ Config | js.Object, Unit]) => (getConfig(t0, t1)).runNow()), loadComponent = js.Any.fromFunction3((t0: String, t1: Config, t2: js.Function1[/* component */ Component, Unit]) => (loadComponent(t0, t1, t2)).runNow()), loadTemplate = js.Any.fromFunction3((t0: String, t1: TemplateConfig, t2: js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => (loadTemplate(t0, t1, t2)).runNow()), loadViewModel = js.Any.fromFunction3((t0: String, t1: ViewModelConfig, t2: js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => (loadViewModel(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[DefaultLoader_]
    }
    
    extension [Self <: DefaultLoader_](x: Self) {
      
      inline def setGetConfig(value: (String, js.Function1[/* config */ Config | js.Object, Unit]) => Callback): Self = StObject.set(x, "getConfig", js.Any.fromFunction2((t0: String, t1: js.Function1[/* config */ Config | js.Object, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLoadComponent(value: (String, Config, js.Function1[/* component */ Component, Unit]) => Callback): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3((t0: String, t1: Config, t2: js.Function1[/* component */ Component, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadTemplate(
        value: (String, TemplateConfig, js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => Callback
      ): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction3((t0: String, t1: TemplateConfig, t2: js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadViewModel(
        value: (String, ViewModelConfig, js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => Callback
      ): Self = StObject.set(x, "loadViewModel", js.Any.fromFunction3((t0: String, t1: ViewModelConfig, t2: js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Loader extends StObject {
    
    var getConfig: js.UndefOr[
        js.Function2[
          /* componentName */ String, 
          /* callback */ js.Function1[/* config */ Config | js.Object, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadComponent: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ Config | js.Object, 
          /* callback */ js.Function1[/* component */ Component | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadTemplate: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ TemplateConfig | Any, 
          /* callback */ js.Function1[/* resolvedTemplate */ js.Array[Node] | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadViewModel: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ ViewModelConfig | Any, 
          /* callback */ js.Function1[/* resolvedViewModel */ CreateViewModel | Null, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Loader {
    
    inline def apply(): Loader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Loader]
    }
    
    extension [Self <: Loader](x: Self) {
      
      inline def setGetConfig(
        value: (/* componentName */ String, /* callback */ js.Function1[/* config */ Config | js.Object, Unit]) => Callback
      ): Self = StObject.set(x, "getConfig", js.Any.fromFunction2((t0: /* componentName */ String, t1: /* callback */ js.Function1[/* config */ Config | js.Object, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetConfigUndefined: Self = StObject.set(x, "getConfig", js.undefined)
      
      inline def setLoadComponent(
        value: (/* componentName */ String, /* config */ Config | js.Object, /* callback */ js.Function1[/* component */ Component | Null, Unit]) => Callback
      ): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3((t0: /* componentName */ String, t1: /* config */ Config | js.Object, t2: /* callback */ js.Function1[/* component */ Component | Null, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadComponentUndefined: Self = StObject.set(x, "loadComponent", js.undefined)
      
      inline def setLoadTemplate(
        value: (/* componentName */ String, /* config */ TemplateConfig | Any, /* callback */ js.Function1[/* resolvedTemplate */ js.Array[Node] | Null, Unit]) => Callback
      ): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction3((t0: /* componentName */ String, t1: /* config */ TemplateConfig | Any, t2: /* callback */ js.Function1[/* resolvedTemplate */ js.Array[Node] | Null, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadTemplateUndefined: Self = StObject.set(x, "loadTemplate", js.undefined)
      
      inline def setLoadViewModel(
        value: (/* componentName */ String, /* config */ ViewModelConfig | Any, /* callback */ js.Function1[/* resolvedViewModel */ CreateViewModel | Null, Unit]) => Callback
      ): Self = StObject.set(x, "loadViewModel", js.Any.fromFunction3((t0: /* componentName */ String, t1: /* config */ ViewModelConfig | Any, t2: /* callback */ js.Function1[/* resolvedViewModel */ CreateViewModel | Null, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadViewModelUndefined: Self = StObject.set(x, "loadViewModel", js.undefined)
    }
  }
  
  trait RequireConfig extends StObject {
    
    var require: String
  }
  object RequireConfig {
    
    inline def apply(require: String): RequireConfig = {
      val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireConfig]
    }
    
    extension [Self <: RequireConfig](x: Self) {
      
      inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  type TemplateConfig = String | js.Array[Node] | DocumentFragment | TemplateElement
  
  trait TemplateElement extends StObject {
    
    var element: String | Node
  }
  object TemplateElement {
    
    inline def apply(element: String | Node): TemplateElement = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateElement]
    }
    
    extension [Self <: TemplateElement](x: Self) {
      
      inline def setElement(value: String | Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewModel extends StObject {
    
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var koDescendantsComplete: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  }
  object ViewModel {
    
    inline def apply(): ViewModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewModel]
    }
    
    extension [Self <: ViewModel](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setKoDescendantsComplete(value: /* node */ Node => Callback): Self = StObject.set(x, "koDescendantsComplete", js.Any.fromFunction1((t0: /* node */ Node) => value(t0).runNow()))
      
      inline def setKoDescendantsCompleteUndefined: Self = StObject.set(x, "koDescendantsComplete", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.knockout.mod.components.ViewModelConstructor
    - typingsJapgolly.knockout.mod.components.ViewModelStatic
    - typingsJapgolly.knockout.mod.components.ViewModelFactory
  */
  trait ViewModelConfig extends StObject
  
  @js.native
  trait ViewModelConstructor
    extends StObject
       with Instantiable0[ViewModel]
       with Instantiable1[/* params */ ViewModelParams, ViewModel]
       with ViewModelConfig
  
  trait ViewModelFactory
    extends StObject
       with ViewModelConfig {
    
    def createViewModel(params: ViewModelParams, componentInfo: ComponentInfo): ViewModel
    @JSName("createViewModel")
    var createViewModel_Original: CreateViewModel
  }
  object ViewModelFactory {
    
    inline def apply(createViewModel: (/* params */ ViewModelParams, /* componentInfo */ ComponentInfo) => ViewModel): ViewModelFactory = {
      val __obj = js.Dynamic.literal(createViewModel = js.Any.fromFunction2(createViewModel))
      __obj.asInstanceOf[ViewModelFactory]
    }
    
    extension [Self <: ViewModelFactory](x: Self) {
      
      inline def setCreateViewModel(value: (/* params */ ViewModelParams, /* componentInfo */ ComponentInfo) => ViewModel): Self = StObject.set(x, "createViewModel", js.Any.fromFunction2(value))
    }
  }
  
  type ViewModelParams = StringDictionary[Any]
  
  trait ViewModelStatic
    extends StObject
       with ViewModelConfig {
    
    var instance: Any
  }
  object ViewModelStatic {
    
    inline def apply(instance: Any): ViewModelStatic = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelStatic]
    }
    
    extension [Self <: ViewModelStatic](x: Self) {
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}
