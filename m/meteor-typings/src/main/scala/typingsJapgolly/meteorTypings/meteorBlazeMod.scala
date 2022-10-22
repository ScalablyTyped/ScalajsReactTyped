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

object meteorBlazeMod {
  
  object Blaze {
    
    @JSImport("meteor/blaze", "Blaze")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Each(argFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def If(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def Let(bindings: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Let")(bindings.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
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
      
      @JSImport("meteor/blaze", "Blaze.Template")
      @js.native
      val ^ : typingsJapgolly.meteorTypings.meteorBlazeMod.Blaze.TemplateStatic = js.native
      
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
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.Template")
    @js.native
    open class TemplateCls ()
      extends StObject
         with Template {
      def this(viewName: String) = this()
      def this(viewName: String, renderFunction: js.Function) = this()
      def this(viewName: Unit, renderFunction: js.Function) = this()
      
      /* CompleteClass */
      @JSName("$")
      var $: Any = js.native
      
      /* CompleteClass */
      override def constructView(): View = js.native
      
      /* CompleteClass */
      var created: js.Function = js.native
      
      /* CompleteClass */
      var destroyed: js.Function = js.native
      
      /* CompleteClass */
      override def events(eventsMap: EventsMap): Unit = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var head: Template = js.native
      
      /* CompleteClass */
      override def helpers(helpersMap: HelpersMap): Unit = js.native
      
      /* CompleteClass */
      override def onCreated(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onDestroyed(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onRendered(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      var renderFunction: js.Function = js.native
      
      /* CompleteClass */
      var rendered: js.Function = js.native
      
      /* CompleteClass */
      var viewName: String = js.native
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
      
      @JSImport("meteor/blaze", "Blaze.TemplateInstance")
      @js.native
      val ^ : TemplateInstanceStatic = js.native
      
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
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.TemplateInstance")
    @js.native
    open class TemplateInstanceCls protected ()
      extends StObject
         with TemplateInstance {
      def this(view: View) = this()
      
      /* CompleteClass */
      @JSName("$")
      override def $(selector: String): Any = js.native
      
      /* CompleteClass */
      override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      /* CompleteClass */
      var data: js.Object = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var firstNode: js.Object = js.native
      
      /* CompleteClass */
      var lastNode: js.Object = js.native
      
      /* CompleteClass */
      override def subscribe(name: String, args: Any*): SubscriptionHandle = js.native
      
      /* CompleteClass */
      override def subscriptionsReady(): Boolean = js.native
      
      /* CompleteClass */
      var view: js.Object = js.native
    }
    
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
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
      
      @JSImport("meteor/blaze", "Blaze.View")
      @js.native
      val ^ : ViewStatic = js.native
      
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
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/blaze", "Blaze.View")
    @js.native
    open class ViewCls ()
      extends StObject
         with View {
      def this(name: String) = this()
      def this(name: String, renderFunction: js.Function) = this()
      def this(name: Unit, renderFunction: js.Function) = this()
      
      /* CompleteClass */
      override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      /* CompleteClass */
      override def firstNode(): Node = js.native
      
      /* CompleteClass */
      var isCreated: Boolean = js.native
      
      /* CompleteClass */
      var isDestroyed: Boolean = js.native
      
      /* CompleteClass */
      var isRendered: Boolean = js.native
      
      /* CompleteClass */
      override def lastNode(): Node = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override def onViewCreated(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onViewDestroyed(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onViewReady(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      var parentView: View = js.native
      
      /* CompleteClass */
      var renderCount: Double = js.native
      
      /* CompleteClass */
      var template: Template = js.native
      
      /* CompleteClass */
      override def templateInstance(): TemplateInstance = js.native
    }
    
    inline def With(data: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def With(data: js.Object, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSImport("meteor/blaze", "Blaze.currentView")
    @js.native
    def currentView: View = js.native
    inline def currentView_=(x: View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentView")(x.asInstanceOf[js.Any])
    
    inline def getData(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[js.Object]
    inline def getData(elementOrView: HTMLElement): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def getData(elementOrView: View): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def getView(): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")().asInstanceOf[View]
    inline def getView(element: HTMLElement): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")(element.asInstanceOf[js.Any]).asInstanceOf[View]
    
    inline def isTemplate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def remove(renderedView: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(renderedView.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def render(templateOrView: Template, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: Template, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: Template, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: Template, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Function, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: Template, data: js.Object, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def toHTML(templateOrView: Template): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toHTML(templateOrView: View): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toHTMLWithData(templateOrView: Template, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: Template, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    
    type EventsMap = StringDictionary[js.Function]
    
    type HelpersMap = StringDictionary[js.Function]
    
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
    
    @js.native
    trait ViewStatic
      extends StObject
         with Instantiable0[View]
         with Instantiable1[/* name */ String, View]
         with Instantiable2[(/* name */ String) | (/* name */ Unit), /* renderFunction */ js.Function, View]
  }
}
