package typingsJapgolly.skatejs

import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import typingsJapgolly.skatejs.anon.TypeofWithComponent
import typingsJapgolly.skatejs.typesMod.ComposedCustomEvent
import typingsJapgolly.skatejs.typesMod.Constructor
import typingsJapgolly.skatejs.typesMod.EventOptions
import typingsJapgolly.skatejs.typesMod.HTMLElementClass
import typingsJapgolly.skatejs.typesMod.PropOptions
import typingsJapgolly.skatejs.typesMod.WithChildren
import typingsJapgolly.skatejs.typesMod.WithComponent
import typingsJapgolly.skatejs.typesMod.WithContext
import typingsJapgolly.skatejs.typesMod.WithLifecycle
import typingsJapgolly.skatejs.typesMod.WithRenderer
import typingsJapgolly.skatejs.typesMod.WithUpdate
import typingsJapgolly.std.PropertyDecorator
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object skate {
    
    @JSGlobal("skate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("skate.CustomElement")
    @js.native
    open class CustomElement ()
      extends typingsJapgolly.skatejs.mod.CustomElement
    /* static members */
    object CustomElement {
      
      @JSGlobal("skate.CustomElement.observedAttributes")
      @js.native
      val observedAttributes: js.Array[String] = js.native
    }
    
    @JSGlobal("skate.WithChildren")
    @js.native
    open class WithChildren_ ()
      extends typingsJapgolly.skatejs.mod.WithChildren_
    
    @JSGlobal("skate.WithComponent")
    @js.native
    open class WithComponent_[P, S, C] () extends WithComponent[P, S, C]
    /* static members */
    object WithComponent_ {
      
      @JSGlobal("skate.WithComponent.observedAttributes")
      @js.native
      val observedAttributes: js.Array[String] = js.native
    }
    
    @JSGlobal("skate.WithContext")
    @js.native
    open class WithContext_[C] ()
      extends typingsJapgolly.skatejs.mod.WithContext_[C]
    
    @JSGlobal("skate.WithLifecycle")
    @js.native
    open class WithLifecycle_ ()
      extends typingsJapgolly.skatejs.mod.WithLifecycle_
    
    @JSGlobal("skate.WithRenderer")
    @js.native
    open class WithRenderer_[O] ()
      extends typingsJapgolly.skatejs.mod.WithRenderer_[O]
    
    @JSGlobal("skate.WithUpdate")
    @js.native
    open class WithUpdate_[P, S] ()
      extends typingsJapgolly.skatejs.mod.WithUpdate_[P, S]
    
    inline def define[T /* <: HTMLElementClass */](ctor: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(ctor.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def emit(elem: EventTarget, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def emit(elem: HTMLElementClass, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def link(elem: typingsJapgolly.skatejs.typesMod.CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* e */ ComposedCustomEvent, Unit]]
    inline def link(elem: typingsJapgolly.skatejs.typesMod.CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(elem.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ ComposedCustomEvent, Unit]]
    
    inline def name(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name")().asInstanceOf[String]
    inline def name(componentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(componentName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def prop(): PropertyDecorator & PropOptions[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")().asInstanceOf[PropertyDecorator & PropOptions[Any]]
    inline def prop(ops: PropOptions[Any]): PropertyDecorator & PropOptions[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(ops.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & PropOptions[Any]]
    
    /* Inlined std.Readonly<{  any :skatejs.skatejs/types.PropOptions<any> & std.PropertyDecorator,   array :skatejs.skatejs/types.PropOptions<std.Array<any>> & std.PropertyDecorator,   boolean :skatejs.skatejs/types.PropOptions<boolean> & std.PropertyDecorator,   number :skatejs.skatejs/types.PropOptions<number> & std.PropertyDecorator,   object :skatejs.skatejs/types.PropOptions<object> & std.PropertyDecorator,   string :skatejs.skatejs/types.PropOptions<string> & std.PropertyDecorator}> */
    object props {
      
      @JSGlobal("skate.props")
      @js.native
      val ^ : js.Any = js.native
      
      inline def any(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def any(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def array(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def array(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def boolean(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def boolean(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def number(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def number(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def `object`(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def `object`(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def string(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def string(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def shadow(elem: HTMLElement): ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(elem.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot]
    inline def shadow(elem: typingsJapgolly.skatejs.typesMod.CustomElement): ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(elem.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot]
    
    inline def withChildren[T /* <: Constructor[HTMLElement] */](): Constructor[WithChildren] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withChildren")().asInstanceOf[Constructor[WithChildren] & T]
    inline def withChildren[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithChildren] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withChildren")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithChildren] & T]
    
    inline def withComponent[T /* <: Constructor[HTMLElement] */](): TypeofWithComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")().asInstanceOf[TypeofWithComponent]
    inline def withComponent[T /* <: Constructor[HTMLElement] */](Base: T): TypeofWithComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(Base.asInstanceOf[js.Any]).asInstanceOf[TypeofWithComponent]
    
    inline def withComponent_PSCT_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](): (Constructor[WithComponent[P, S, C]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")().asInstanceOf[(Constructor[WithComponent[P, S, C]]) & T]
    inline def withComponent_PSCT_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithComponent[P, S, C]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(Base.asInstanceOf[js.Any]).asInstanceOf[(Constructor[WithComponent[P, S, C]]) & T]
    
    inline def withContext[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withContext")().asInstanceOf[Constructor[WithContext[C]] & T]
    inline def withContext[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withContext")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithContext[C]] & T]
    
    inline def withLifecycle[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withLifecycle")().asInstanceOf[Constructor[WithLifecycle] & T]
    inline def withLifecycle[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withLifecycle")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithLifecycle] & T]
    
    inline def withRenderer[O, T /* <: Constructor[HTMLElement] */](): Constructor[WithRenderer[O]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withRenderer")().asInstanceOf[Constructor[WithRenderer[O]] & T]
    inline def withRenderer[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithRenderer[O]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withRenderer")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithRenderer[O]] & T]
    
    inline def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](): (Constructor[WithUpdate[P, S]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withUpdate")().asInstanceOf[(Constructor[WithUpdate[P, S]]) & T]
    inline def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithUpdate[P, S]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withUpdate")(Base.asInstanceOf[js.Any]).asInstanceOf[(Constructor[WithUpdate[P, S]]) & T]
  }
}
