package typingsJapgolly.serverless

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.serverless.anon.CompiledCloudFormationTemplate
import typingsJapgolly.serverless.anon.Resources
import typingsJapgolly.serverless.mod.Event
import typingsJapgolly.serverless.mod.FunctionDefinitionHandler
import typingsJapgolly.serverless.mod.FunctionDefinitionImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesServiceMod {
  
  @JSImport("serverless/classes/Service", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Service {
    def this(serverless: typingsJapgolly.serverless.mod.^, data: js.Object) = this()
    
    /* CompleteClass */
    @JSName("package")
    var _package: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    var configValidationMode: String = js.native
    
    /* CompleteClass */
    var custom: Custom = js.native
    
    /* CompleteClass */
    var functions: StringDictionary[FunctionDefinitionHandler | FunctionDefinitionImage] = js.native
    
    /* CompleteClass */
    override def getAllEventsInFunction(functionName: String): js.Array[Event] = js.native
    
    /* CompleteClass */
    override def getAllFunctions(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getAllFunctionsNames(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getEventInFunction(eventName: String, functionName: String): Event = js.native
    
    /* CompleteClass */
    override def getFunction(functionName: String): FunctionDefinitionHandler | FunctionDefinitionImage = js.native
    
    /* CompleteClass */
    override def getServiceName(): String = js.native
    
    /* CompleteClass */
    var initialServerlessConfig: Any = js.native
    
    /* CompleteClass */
    var layers: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    override def load(rawOptions: js.Object): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def mergeResourceArrays(): Unit = js.native
    
    /* CompleteClass */
    var plugins: js.Array[String] = js.native
    
    /* CompleteClass */
    var pluginsData: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    var provider: CompiledCloudFormationTemplate = js.native
    
    /* CompleteClass */
    var resources: Resources | StringDictionary[Any] = js.native
    
    /* CompleteClass */
    var serverless: typingsJapgolly.serverless.mod.^ = js.native
    
    /* CompleteClass */
    var service: String | Null = js.native
    
    /* CompleteClass */
    override def setFunctionNames(rawOptions: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def update(data: js.Object): js.Object = js.native
    
    /* CompleteClass */
    override def validate(): Service = js.native
  }
  
  type Custom = StringDictionary[Any]
  
  trait Service extends StObject {
    
    @JSName("package")
    var _package: StringDictionary[Any]
    
    var app: js.UndefOr[Any] = js.undefined
    
    var configValidationMode: String
    
    var custom: Custom
    
    var disabledDeprecations: js.UndefOr[js.Array[Any]] = js.undefined
    
    var functions: StringDictionary[FunctionDefinitionHandler | FunctionDefinitionImage]
    
    def getAllEventsInFunction(functionName: String): js.Array[Event]
    
    def getAllFunctions(): js.Array[String]
    
    def getAllFunctionsNames(): js.Array[String]
    
    def getEventInFunction(eventName: String, functionName: String): Event
    
    def getFunction(functionName: String): FunctionDefinitionHandler | FunctionDefinitionImage
    
    def getServiceName(): String
    
    var initialServerlessConfig: Any
    
    var layers: StringDictionary[Any]
    
    def load(rawOptions: js.Object): js.Promise[Any]
    
    def mergeResourceArrays(): Unit
    
    @JSName("org")
    var org_ : js.UndefOr[Any] = js.undefined
    
    var outputs: js.UndefOr[Any] = js.undefined
    
    var plugins: js.Array[String]
    
    var pluginsData: StringDictionary[Any]
    
    var provider: CompiledCloudFormationTemplate
    
    var resources: Resources | StringDictionary[Any]
    
    var serverless: typingsJapgolly.serverless.mod.^
    
    var service: String | Null
    
    var serviceFilename: js.UndefOr[String] = js.undefined
    
    def setFunctionNames(rawOptions: js.Object): Unit
    
    var tenant: js.UndefOr[Any] = js.undefined
    
    def update(data: js.Object): js.Object
    
    def validate(): Service
  }
  object Service {
    
    inline def apply(
      _package: StringDictionary[Any],
      configValidationMode: String,
      custom: Custom,
      functions: StringDictionary[FunctionDefinitionHandler | FunctionDefinitionImage],
      getAllEventsInFunction: String => js.Array[Event],
      getAllFunctions: CallbackTo[js.Array[String]],
      getAllFunctionsNames: CallbackTo[js.Array[String]],
      getEventInFunction: (String, String) => Event,
      getFunction: String => FunctionDefinitionHandler | FunctionDefinitionImage,
      getServiceName: CallbackTo[String],
      initialServerlessConfig: Any,
      layers: StringDictionary[Any],
      load: js.Object => js.Promise[Any],
      mergeResourceArrays: Callback,
      plugins: js.Array[String],
      pluginsData: StringDictionary[Any],
      provider: CompiledCloudFormationTemplate,
      resources: Resources | StringDictionary[Any],
      serverless: typingsJapgolly.serverless.mod.^,
      setFunctionNames: js.Object => Callback,
      update: js.Object => js.Object,
      validate: CallbackTo[Service]
    ): Service = {
      val __obj = js.Dynamic.literal(configValidationMode = configValidationMode.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], getAllEventsInFunction = js.Any.fromFunction1(getAllEventsInFunction), getAllFunctions = getAllFunctions.toJsFn, getAllFunctionsNames = getAllFunctionsNames.toJsFn, getEventInFunction = js.Any.fromFunction2(getEventInFunction), getFunction = js.Any.fromFunction1(getFunction), getServiceName = getServiceName.toJsFn, initialServerlessConfig = initialServerlessConfig.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), mergeResourceArrays = mergeResourceArrays.toJsFn, plugins = plugins.asInstanceOf[js.Any], pluginsData = pluginsData.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], serverless = serverless.asInstanceOf[js.Any], setFunctionNames = js.Any.fromFunction1((t0: js.Object) => setFunctionNames(t0).runNow()), update = js.Any.fromFunction1(update), validate = validate.toJsFn, service = null)
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setApp(value: Any): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setConfigValidationMode(value: String): Self = StObject.set(x, "configValidationMode", value.asInstanceOf[js.Any])
      
      inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setDisabledDeprecations(value: js.Array[Any]): Self = StObject.set(x, "disabledDeprecations", value.asInstanceOf[js.Any])
      
      inline def setDisabledDeprecationsUndefined: Self = StObject.set(x, "disabledDeprecations", js.undefined)
      
      inline def setDisabledDeprecationsVarargs(value: Any*): Self = StObject.set(x, "disabledDeprecations", js.Array(value*))
      
      inline def setFunctions(value: StringDictionary[FunctionDefinitionHandler | FunctionDefinitionImage]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setGetAllEventsInFunction(value: String => js.Array[Event]): Self = StObject.set(x, "getAllEventsInFunction", js.Any.fromFunction1(value))
      
      inline def setGetAllFunctions(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAllFunctions", value.toJsFn)
      
      inline def setGetAllFunctionsNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAllFunctionsNames", value.toJsFn)
      
      inline def setGetEventInFunction(value: (String, String) => Event): Self = StObject.set(x, "getEventInFunction", js.Any.fromFunction2(value))
      
      inline def setGetFunction(value: String => FunctionDefinitionHandler | FunctionDefinitionImage): Self = StObject.set(x, "getFunction", js.Any.fromFunction1(value))
      
      inline def setGetServiceName(value: CallbackTo[String]): Self = StObject.set(x, "getServiceName", value.toJsFn)
      
      inline def setInitialServerlessConfig(value: Any): Self = StObject.set(x, "initialServerlessConfig", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: StringDictionary[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: js.Object => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setMergeResourceArrays(value: Callback): Self = StObject.set(x, "mergeResourceArrays", value.toJsFn)
      
      inline def setOrg_(value: Any): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
      
      inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
      
      inline def setOutputs(value: Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsData(value: StringDictionary[Any]): Self = StObject.set(x, "pluginsData", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setProvider(value: CompiledCloudFormationTemplate): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setResources(value: Resources | StringDictionary[Any]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setServerless(value: typingsJapgolly.serverless.mod.^): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceFilename(value: String): Self = StObject.set(x, "serviceFilename", value.asInstanceOf[js.Any])
      
      inline def setServiceFilenameUndefined: Self = StObject.set(x, "serviceFilename", js.undefined)
      
      inline def setServiceNull: Self = StObject.set(x, "service", null)
      
      inline def setSetFunctionNames(value: js.Object => Callback): Self = StObject.set(x, "setFunctionNames", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      
      inline def setTenant(value: Any): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
      
      inline def setUpdate(value: js.Object => js.Object): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setValidate(value: CallbackTo[Service]): Self = StObject.set(x, "validate", value.toJsFn)
      
      inline def set_package(value: StringDictionary[Any]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
}
