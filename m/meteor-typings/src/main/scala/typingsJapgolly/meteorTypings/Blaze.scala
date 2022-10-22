package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.meteorTypings.Meteor.SubscriptionHandle
import typingsJapgolly.meteorTypings.Tracker.Computation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Blaze {
  
  type EventsMap = StringDictionary[js.Function]
  
  type HelpersMap = StringDictionary[js.Function]
  
  trait Template extends StObject {
    
    @JSName("$")
    var $: Any
    
    def constructView(): View
    
    var created: js.Function
    
    var destroyed: js.Function
    
    def events(eventsMap: EventsMap): Unit
    
    def find(selector: String): HTMLElement
    
    def findAll(selector: String): js.Array[HTMLElement]
    
    var head: Template
    
    def helpers(helpersMap: HelpersMap): Unit
    
    def onCreated(cb: js.Function): Unit
    
    def onDestroyed(cb: js.Function): Unit
    
    def onRendered(cb: js.Function): Unit
    
    var renderFunction: js.Function
    
    var rendered: js.Function
    
    var viewName: String
  }
  object Template {
    
    inline def apply(
      $: Any,
      constructView: CallbackTo[View],
      created: js.Function,
      destroyed: js.Function,
      events: EventsMap => Callback,
      find: String => HTMLElement,
      findAll: String => js.Array[HTMLElement],
      head: Template,
      helpers: HelpersMap => Callback,
      onCreated: js.Function => Callback,
      onDestroyed: js.Function => Callback,
      onRendered: js.Function => Callback,
      renderFunction: js.Function,
      rendered: js.Function,
      viewName: String
    ): Template = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constructView = constructView.toJsFn, created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], events = js.Any.fromFunction1((t0: EventsMap) => events(t0).runNow()), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head.asInstanceOf[js.Any], helpers = js.Any.fromFunction1((t0: HelpersMap) => helpers(t0).runNow()), onCreated = js.Any.fromFunction1((t0: js.Function) => onCreated(t0).runNow()), onDestroyed = js.Any.fromFunction1((t0: js.Function) => onDestroyed(t0).runNow()), onRendered = js.Any.fromFunction1((t0: js.Function) => onRendered(t0).runNow()), renderFunction = renderFunction.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template]
    }
    
    extension [Self <: Template](x: Self) {
      
      inline def set$(value: Any): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setConstructView(value: CallbackTo[View]): Self = StObject.set(x, "constructView", value.toJsFn)
      
      inline def setCreated(value: js.Function): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDestroyed(value: js.Function): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventsMap => Callback): Self = StObject.set(x, "events", js.Any.fromFunction1((t0: EventsMap) => value(t0).runNow()))
      
      inline def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
      
      inline def setHead(value: Template): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHelpers(value: HelpersMap => Callback): Self = StObject.set(x, "helpers", js.Any.fromFunction1((t0: HelpersMap) => value(t0).runNow()))
      
      inline def setOnCreated(value: js.Function => Callback): Self = StObject.set(x, "onCreated", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setOnDestroyed(value: js.Function => Callback): Self = StObject.set(x, "onDestroyed", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setOnRendered(value: js.Function => Callback): Self = StObject.set(x, "onRendered", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setRenderFunction(value: js.Function): Self = StObject.set(x, "renderFunction", value.asInstanceOf[js.Any])
      
      inline def setRendered(value: js.Function): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateInstance extends StObject {
    
    @JSName("$")
    def $(selector: String): Any
    
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
    
    var data: js.Object
    
    def find(selector: String): HTMLElement
    
    def findAll(selector: String): js.Array[HTMLElement]
    
    var firstNode: js.Object
    
    var lastNode: js.Object
    
    def subscribe(name: String, args: Any*): SubscriptionHandle
    
    def subscriptionsReady(): Boolean
    
    var view: js.Object
  }
  object TemplateInstance {
    
    inline def apply(
      $: String => Any,
      autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
      data: js.Object,
      find: String => HTMLElement,
      findAll: String => js.Array[HTMLElement],
      firstNode: js.Object,
      lastNode: js.Object,
      subscribe: (String, /* repeated */ Any) => SubscriptionHandle,
      subscriptionsReady: CallbackTo[Boolean],
      view: js.Object
    ): TemplateInstance = {
      val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode.asInstanceOf[js.Any], lastNode = lastNode.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = subscriptionsReady.toJsFn, view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateInstance]
    }
    
    extension [Self <: TemplateInstance](x: Self) {
      
      inline def set$(value: String => Any): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
      
      inline def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
      
      inline def setFirstNode(value: js.Object): Self = StObject.set(x, "firstNode", value.asInstanceOf[js.Any])
      
      inline def setLastNode(value: js.Object): Self = StObject.set(x, "lastNode", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: (String, /* repeated */ Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setSubscriptionsReady(value: CallbackTo[Boolean]): Self = StObject.set(x, "subscriptionsReady", value.toJsFn)
      
      inline def setView(value: js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplateInstanceStatic
    extends StObject
       with Instantiable1[/* view */ View, TemplateInstance]
  
  @js.native
  trait TemplateStatic
    extends StObject
       with Instantiable0[Template]
       with Instantiable1[/* viewName */ String, Template]
       with Instantiable2[
          (/* viewName */ String) | (/* viewName */ Unit), 
          /* renderFunction */ js.Function, 
          Template
        ] {
    
    def currentData(): Any = js.native
    
    def instance(): TemplateInstance = js.native
    
    def parentData(numLevels: Double): Any = js.native
    
    def registerHelper(name: String, func: js.Function): Unit = js.native
  }
  
  trait View extends StObject {
    
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
    
    def firstNode(): Node
    
    var isCreated: Boolean
    
    var isDestroyed: Boolean
    
    var isRendered: Boolean
    
    def lastNode(): Node
    
    var name: String
    
    def onViewCreated(func: js.Function): Unit
    
    def onViewDestroyed(func: js.Function): Unit
    
    def onViewReady(func: js.Function): Unit
    
    var parentView: View
    
    var renderCount: Double
    
    var template: Template
    
    def templateInstance(): TemplateInstance
  }
  object View {
    
    inline def apply(
      autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
      firstNode: CallbackTo[Node],
      isCreated: Boolean,
      isDestroyed: Boolean,
      isRendered: Boolean,
      lastNode: CallbackTo[Node],
      name: String,
      onViewCreated: js.Function => Callback,
      onViewDestroyed: js.Function => Callback,
      onViewReady: js.Function => Callback,
      parentView: View,
      renderCount: Double,
      template: Template,
      templateInstance: CallbackTo[TemplateInstance]
    ): View = {
      val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = firstNode.toJsFn, isCreated = isCreated.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], lastNode = lastNode.toJsFn, name = name.asInstanceOf[js.Any], onViewCreated = js.Any.fromFunction1((t0: js.Function) => onViewCreated(t0).runNow()), onViewDestroyed = js.Any.fromFunction1((t0: js.Function) => onViewDestroyed(t0).runNow()), onViewReady = js.Any.fromFunction1((t0: js.Function) => onViewReady(t0).runNow()), parentView = parentView.asInstanceOf[js.Any], renderCount = renderCount.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateInstance = templateInstance.toJsFn)
      __obj.asInstanceOf[View]
    }
    
    extension [Self <: View](x: Self) {
      
      inline def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
      
      inline def setFirstNode(value: CallbackTo[Node]): Self = StObject.set(x, "firstNode", value.toJsFn)
      
      inline def setIsCreated(value: Boolean): Self = StObject.set(x, "isCreated", value.asInstanceOf[js.Any])
      
      inline def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
      
      inline def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      inline def setLastNode(value: CallbackTo[Node]): Self = StObject.set(x, "lastNode", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnViewCreated(value: js.Function => Callback): Self = StObject.set(x, "onViewCreated", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setOnViewDestroyed(value: js.Function => Callback): Self = StObject.set(x, "onViewDestroyed", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setOnViewReady(value: js.Function => Callback): Self = StObject.set(x, "onViewReady", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setParentView(value: View): Self = StObject.set(x, "parentView", value.asInstanceOf[js.Any])
      
      inline def setRenderCount(value: Double): Self = StObject.set(x, "renderCount", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateInstance(value: CallbackTo[TemplateInstance]): Self = StObject.set(x, "templateInstance", value.toJsFn)
    }
  }
  
  @js.native
  trait ViewStatic
    extends StObject
       with Instantiable0[View]
       with Instantiable1[/* name */ String, View]
       with Instantiable2[(/* name */ String) | (/* name */ Unit), /* renderFunction */ js.Function, View]
}
