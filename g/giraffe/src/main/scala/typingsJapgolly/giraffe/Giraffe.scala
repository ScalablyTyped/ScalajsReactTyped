package typingsJapgolly.giraffe

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.backbone.mod.EventsMixin
import typingsJapgolly.backbone.mod.ModelSetOptions
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Giraffe {
  
  @js.native
  trait App extends View[Model] {
    
    def addInitializer(
      initializer: js.Function2[/* options */ js.UndefOr[Any], /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
    ): App = js.native
    
    var routes: StringMap = js.native
    
    def start(): App = js.native
    def start(options: Any): App = js.native
  }
  
  type AppMap = StringDictionary[App]
  
  trait AttachmentOptions extends StObject {
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var suppressRender: js.UndefOr[Boolean] = js.undefined
  }
  object AttachmentOptions {
    
    inline def apply(): AttachmentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachmentOptions]
    }
    
    extension [Self <: AttachmentOptions](x: Self) {
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSuppressRender(value: Boolean): Self = StObject.set(x, "suppressRender", value.asInstanceOf[js.Any])
      
      inline def setSuppressRenderUndefined: Self = StObject.set(x, "suppressRender", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
  trait Collection[TModel /* <: Model */]
    extends typingsJapgolly.backbone.mod.Collection[TModel] {
    
    var afterDispose: js.UndefOr[js.Function0[Any]] = js.native
    
    var afterInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    var app: App = js.native
    
    var appEvents: js.UndefOr[StringMap] = js.native
    
    var beforeDispose: js.UndefOr[js.Function0[Any]] = js.native
    
    var beforeInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    var dataEvents: js.UndefOr[StringMap] = js.native
    
    var defaultOptions: js.UndefOr[DefaultOptions] = js.native
    
    var dispose: js.UndefOr[js.Function0[Any]] = js.native
  }
  
  object Contrib {
    
    @js.native
    trait CollectionView[TModel /* <: Model */] extends View[TModel] {
      
      def addOne(model: Model): View[TModel] = js.native
      
      @JSName("collection")
      var collection_CollectionView: Collection[TModel] = js.native
      
      def findByModel(model: Model): View[TModel] = js.native
      
      var modelView: View[TModel] = js.native
      
      var modelViewArgs: js.Array[Any] = js.native
      
      var modelViewEl: Any = js.native
      
      def removeOne(model: Model): View[TModel] = js.native
      
      var renderOnChange: Boolean = js.native
    }
    
    @js.native
    trait Controller
      extends EventsMixin
         with GiraffeObject {
      
      /**
        * Faulty overgeneralization of Backbone.Events.on, for historical
        * reasons.
        */
      def on(eventName: Any): this.type = js.native
      def on(eventName: Any, callback: Any): this.type = js.native
      def on(eventName: Any, callback: Any, context: Any): this.type = js.native
      def on(eventName: Any, callback: Unit, context: Any): this.type = js.native
    }
    
    @js.native
    trait FastCollectionView[TModel /* <: Model */] extends View[TModel] {
      
      def addAll(): View[TModel] = js.native
      
      def addOne(model: Model): View[TModel] = js.native
      
      @JSName("collection")
      var collection_FastCollectionView: Collection[TModel] = js.native
      
      def findElByIndex(index: Double): JQuery[HTMLElement] = js.native
      
      def findElByModel(model: Model): JQuery[HTMLElement] = js.native
      
      def findModelByEl(el: Any): Model = js.native
      
      var modelEl: Any = js.native
      
      def modelSerialize(): Any = js.native
      
      var modelTemplate: Any = js.native
      
      var modelTemplateStrategy: String = js.native
      
      def removeByIndex(index: Double): View[TModel] = js.native
      
      def removeOne(model: Model): View[TModel] = js.native
      
      var renderOnChange: Boolean = js.native
    }
  }
  
  trait DefaultOptions extends StObject {
    
    var alwaysRender: js.UndefOr[Boolean] = js.undefined
    
    var disposeOnDetach: js.UndefOr[Boolean] = js.undefined
    
    var documentTitle: js.UndefOr[String] = js.undefined
    
    var saveScrollPosition: js.UndefOr[Boolean] = js.undefined
  }
  object DefaultOptions {
    
    inline def apply(): DefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setAlwaysRender(value: Boolean): Self = StObject.set(x, "alwaysRender", value.asInstanceOf[js.Any])
      
      inline def setAlwaysRenderUndefined: Self = StObject.set(x, "alwaysRender", js.undefined)
      
      inline def setDisposeOnDetach(value: Boolean): Self = StObject.set(x, "disposeOnDetach", value.asInstanceOf[js.Any])
      
      inline def setDisposeOnDetachUndefined: Self = StObject.set(x, "disposeOnDetach", js.undefined)
      
      inline def setDocumentTitle(value: String): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
      
      inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
      
      inline def setSaveScrollPosition(value: Boolean): Self = StObject.set(x, "saveScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setSaveScrollPositionUndefined: Self = StObject.set(x, "saveScrollPosition", js.undefined)
    }
  }
  
  trait GiraffeObject extends StObject {
    
    var afterDispose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var afterInitialize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var app: App
    
    var appEvents: js.UndefOr[StringMap] = js.undefined
    
    var beforeDispose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var beforeInitialize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var dataEvents: js.UndefOr[StringMap] = js.undefined
    
    var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
    
    var dispose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var initialize: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object GiraffeObject {
    
    inline def apply(app: App): GiraffeObject = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[GiraffeObject]
    }
    
    extension [Self <: GiraffeObject](x: Self) {
      
      inline def setAfterDispose(value: CallbackTo[Any]): Self = StObject.set(x, "afterDispose", value.toJsFn)
      
      inline def setAfterDisposeUndefined: Self = StObject.set(x, "afterDispose", js.undefined)
      
      inline def setAfterInitialize(value: CallbackTo[Any]): Self = StObject.set(x, "afterInitialize", value.toJsFn)
      
      inline def setAfterInitializeUndefined: Self = StObject.set(x, "afterInitialize", js.undefined)
      
      inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppEvents(value: StringMap): Self = StObject.set(x, "appEvents", value.asInstanceOf[js.Any])
      
      inline def setAppEventsUndefined: Self = StObject.set(x, "appEvents", js.undefined)
      
      inline def setBeforeDispose(value: CallbackTo[Any]): Self = StObject.set(x, "beforeDispose", value.toJsFn)
      
      inline def setBeforeDisposeUndefined: Self = StObject.set(x, "beforeDispose", js.undefined)
      
      inline def setBeforeInitialize(value: CallbackTo[Any]): Self = StObject.set(x, "beforeInitialize", value.toJsFn)
      
      inline def setBeforeInitializeUndefined: Self = StObject.set(x, "beforeInitialize", js.undefined)
      
      inline def setDataEvents(value: StringMap): Self = StObject.set(x, "dataEvents", value.asInstanceOf[js.Any])
      
      inline def setDataEventsUndefined: Self = StObject.set(x, "dataEvents", js.undefined)
      
      inline def setDefaultOptions(value: DefaultOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      inline def setDispose(value: CallbackTo[Any]): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setInitialize(value: CallbackTo[Any]): Self = StObject.set(x, "initialize", value.toJsFn)
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
  trait Model
    extends typingsJapgolly.backbone.mod.Model[Any, ModelSetOptions, Any] {
    
    var afterDispose: js.UndefOr[js.Function0[Any]] = js.native
    
    var afterInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    var app: App = js.native
    
    var appEvents: js.UndefOr[StringMap] = js.native
    
    var beforeDispose: js.UndefOr[js.Function0[Any]] = js.native
    
    var beforeInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    var dataEvents: js.UndefOr[StringMap] = js.native
    
    var defaultOptions: js.UndefOr[DefaultOptions] = js.native
    
    var dispose: js.UndefOr[js.Function0[Any]] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
  trait Router
    extends typingsJapgolly.backbone.mod.Router {
    
    var afterDispose: js.UndefOr[js.Function0[Any]] = js.native
    
    var afterInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    var app: App = js.native
    
    var appEvents: js.UndefOr[StringMap] = js.native
    
    var beforeDispose: js.UndefOr[js.Function0[Any]] = js.native
    
    var beforeInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    def cause(appEvent: String, args: Any*): Any = js.native
    
    var dataEvents: js.UndefOr[StringMap] = js.native
    
    var defaultOptions: js.UndefOr[DefaultOptions] = js.native
    
    var dispose: js.UndefOr[js.Function0[Any]] = js.native
    
    def getRoute(appEvent: String, args: Any*): String = js.native
    
    def isCaused(appEvent: String, args: Any*): Boolean = js.native
    
    var namespace: String = js.native
    
    def reload(url: String): Any = js.native
    
    var triggers: StringMap = js.native
  }
  
  type StringMap = StringDictionary[String]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
  trait View[TModel /* <: Model */]
    extends typingsJapgolly.backbone.mod.View[TModel, HTMLElement] {
    
    def addChild(child: View[TModel]): View[TModel] = js.native
    
    def addChildren(children: js.Array[View[TModel]]): View[TModel] = js.native
    
    def afterDispose(): View[TModel] = js.native
    
    var afterInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    def afterRender(): Any = js.native
    
    var app: App = js.native
    
    var appEvents: js.UndefOr[StringMap] = js.native
    
    def attach(view: View[TModel]): View[TModel] = js.native
    def attach(view: View[TModel], options: AttachmentOptions): View[TModel] = js.native
    
    def attachTo(el: Any): View[TModel] = js.native
    def attachTo(el: Any, options: AttachmentOptions): View[TModel] = js.native
    
    def beforeDispose(): View[TModel] = js.native
    
    var beforeInitialize: js.UndefOr[js.Function0[Any]] = js.native
    
    def beforeRender(): Any = js.native
    
    var children: js.Array[View[TModel]] = js.native
    
    var dataEvents: js.UndefOr[StringMap] = js.native
    
    var defaultOptions: js.UndefOr[DefaultOptions] = js.native
    
    def detach(): View[TModel] = js.native
    def detach(preserve: Boolean): View[TModel] = js.native
    
    def detachChildren(): View[TModel] = js.native
    def detachChildren(preserve: Boolean): View[TModel] = js.native
    
    def dispose(): View[TModel] = js.native
    
    var documentTitle: String = js.native
    
    def invoke(method: String, args: Any*): Any = js.native
    
    def isAttached(el: Any): Boolean = js.native
    
    var parent: View[TModel] = js.native
    
    def removeChild(child: View[TModel]): View[TModel] = js.native
    def removeChild(child: View[TModel], preserve: Boolean): View[TModel] = js.native
    
    def removeChildren(): View[TModel] = js.native
    def removeChildren(preserve: Boolean): View[TModel] = js.native
    
    def render(options: Any): this.type = js.native
    
    def serialize(): Any = js.native
    
    def setParent(parent: View[TModel]): View[TModel] = js.native
    
    var template: Any = js.native
    
    def templateStrategy(): String = js.native
    
    var ui: StringMap = js.native
  }
  
  type ViewMap[TModel /* <: Model */] = StringDictionary[View[TModel]]
}
