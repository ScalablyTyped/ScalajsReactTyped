package typingsJapgolly.tinajsTina

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tinajsTina.anon.PartialComponentDefinitio
import typingsJapgolly.tinajsTina.anon.PartialPageDefinitions
import typingsJapgolly.tinajsTina.anon.PartialPageDefinitionsAttached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tinajs/tina", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tinajs/tina", "Component")
  @js.native
  open class Component () extends StObject {
    
    var data: StringDictionary[Any] = js.native
    
    def setData(data: StringDictionary[Any]): Unit = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("@tinajs/tina", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(definitions: PartialComponentDefinitio): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mixin(definitions: PartialComponentDefinitio): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@tinajs/tina", "Page")
  @js.native
  open class Page () extends Component
  /* static members */
  object Page {
    
    @JSImport("@tinajs/tina", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(definitions: PartialPageDefinitions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mixin(definitions: PartialPageDefinitions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def use(plugin: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ComponentDefinitions
    extends StObject
       with ComponentLifecycles {
    
    def compute(data: StringDictionary[Any]): StringDictionary[Any]
    
    var data: StringDictionary[Any]
    
    var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]
    
    var mixins: js.Array[PartialComponentDefinitio]
    
    var properties: ComponentProperties
  }
  object ComponentDefinitions {
    
    inline def apply(
      attached: Callback,
      compute: StringDictionary[Any] => StringDictionary[Any],
      created: Callback,
      data: StringDictionary[Any],
      detached: Callback,
      methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]],
      mixins: js.Array[PartialComponentDefinitio],
      moved: Callback,
      properties: ComponentProperties,
      ready: Callback
    ): ComponentDefinitions = {
      val __obj = js.Dynamic.literal(attached = attached.toJsFn, compute = js.Any.fromFunction1(compute), created = created.toJsFn, data = data.asInstanceOf[js.Any], detached = detached.toJsFn, methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], moved = moved.toJsFn, properties = properties.asInstanceOf[js.Any], ready = ready.toJsFn)
      __obj.asInstanceOf[ComponentDefinitions]
    }
    
    extension [Self <: ComponentDefinitions](x: Self) {
      
      inline def setCompute(value: StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMixins(value: js.Array[PartialComponentDefinitio]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsVarargs(value: PartialComponentDefinitio*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentLifecycles extends StObject {
    
    def attached(): Unit
    
    def created(): Unit
    
    def detached(): Unit
    
    def moved(): Unit
    
    def ready(): Unit
  }
  object ComponentLifecycles {
    
    inline def apply(attached: Callback, created: Callback, detached: Callback, moved: Callback, ready: Callback): ComponentLifecycles = {
      val __obj = js.Dynamic.literal(attached = attached.toJsFn, created = created.toJsFn, detached = detached.toJsFn, moved = moved.toJsFn, ready = ready.toJsFn)
      __obj.asInstanceOf[ComponentLifecycles]
    }
    
    extension [Self <: ComponentLifecycles](x: Self) {
      
      inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
      
      inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
      
      inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
      
      inline def setMoved(value: Callback): Self = StObject.set(x, "moved", value.toJsFn)
      
      inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    }
  }
  
  type ComponentProperties = StringDictionary[Any]
  
  @js.native
  trait PageDefinitions
    extends StObject
       with ComponentDefinitions
       with PageEvents
       with PageHooks {
    
    @JSName("mixins")
    var mixins_PageDefinitions: js.Array[PartialPageDefinitionsAttached] = js.native
  }
  
  trait PageEvents extends StObject {
    
    def onPageScroll(event: Page): Unit
    
    def onPullDownRefresh(event: Page): Unit
    
    def onReachBottom(event: Page): Unit
    
    def onShareAppMessage(event: Page): Unit
  }
  object PageEvents {
    
    inline def apply(
      onPageScroll: Page => Callback,
      onPullDownRefresh: Page => Callback,
      onReachBottom: Page => Callback,
      onShareAppMessage: Page => Callback
    ): PageEvents = {
      val __obj = js.Dynamic.literal(onPageScroll = js.Any.fromFunction1((t0: Page) => onPageScroll(t0).runNow()), onPullDownRefresh = js.Any.fromFunction1((t0: Page) => onPullDownRefresh(t0).runNow()), onReachBottom = js.Any.fromFunction1((t0: Page) => onReachBottom(t0).runNow()), onShareAppMessage = js.Any.fromFunction1((t0: Page) => onShareAppMessage(t0).runNow()))
      __obj.asInstanceOf[PageEvents]
    }
    
    extension [Self <: PageEvents](x: Self) {
      
      inline def setOnPageScroll(value: Page => Callback): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1((t0: Page) => value(t0).runNow()))
      
      inline def setOnPullDownRefresh(value: Page => Callback): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1((t0: Page) => value(t0).runNow()))
      
      inline def setOnReachBottom(value: Page => Callback): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1((t0: Page) => value(t0).runNow()))
      
      inline def setOnShareAppMessage(value: Page => Callback): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1((t0: Page) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait PageHooks extends StObject {
    
    def beforeLoad(): Unit = js.native
    
    def onHide(): Unit = js.native
    
    def onLoad(): Unit = js.native
    def onLoad(options: Any): Unit = js.native
    
    def onReady(): Unit = js.native
    
    def onShow(): Unit = js.native
    
    def onUnload(): Unit = js.native
  }
}
