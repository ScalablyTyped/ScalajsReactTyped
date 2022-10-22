package typingsJapgolly.cfcsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cfcsCore.declarationReactiveReactiveSubscribeMod.ReactiveSubscribe
import typingsJapgolly.cfcsCore.declarationReactiveTypesMod.ReactiveEventCallback
import typingsJapgolly.egjsComponent.declarationTypesMod.EventKey
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveReactiveAdapterMod {
  
  trait ReactiveAdapter[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Data, Events /* <: Record[String, Any] */] extends StObject {
    
    /**
      * Occurs when a component is created.
      * If an instance is created and returned, the state specification can be omitted.
      * @return Instance
      */
    var created: js.UndefOr[js.Function1[/* data */ Data, js.UndefOr[Instance | Unit]]] = js.undefined
    
    /**
      * You can decide which data to pass when creating/destroying instances in the framework.
      */
    var data: js.UndefOr[js.Function0[Data]] = js.undefined
    
    /**
      * Occurs before the component is destroyed.
      */
    var destroy: js.UndefOr[js.Function2[/* instance */ Instance, /* data */ Data, Unit]] = js.undefined
    
    /**
      * If you want to use events, write the events property and a way to register/unregister events.
      */
    var events: js.UndefOr[js.Array[/* keyof Events */ String]] = js.undefined
    
    /**
      * Occurs after mount, state declaration, and observation in the component.
      */
    var init: js.UndefOr[js.Function2[/* instance */ Instance, /* data */ Data, Unit]] = js.undefined
    
    /**
      * If you want to use an instance's method, write the method names.
      */
    var methods: js.UndefOr[js.Array[Methods]] = js.undefined
    
    /**
      * Occurs when a component is mounted.
      * @return Instance
      */
    var mounted: js.UndefOr[js.Function1[/* data */ Data, js.UndefOr[Instance | Unit]]] = js.undefined
    
    /**
      * If you want to use events, write the events property and a way to register/unregister events.
      */
    var off: js.UndefOr[
        js.Function3[
          /* instance */ Instance, 
          /* eventName */ EventKey[Events], 
          /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If you want to use events, write the events property and a way to register/unregister events.
      */
    var on: js.UndefOr[
        js.Function3[
          /* instance */ Instance, 
          /* eventName */ EventKey[Events], 
          /* listener */ ReactiveEventCallback[Events, EventKey[Events]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Specify if you want to use the framework's state. If an instance is created through created, it can be omitted.
      */
    var state: js.UndefOr[State] = js.undefined
  }
  object ReactiveAdapter {
    
    inline def apply[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Data, Events /* <: Record[String, Any] */](): ReactiveAdapter[Instance, State, Methods, Data, Events] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactiveAdapter[Instance, State, Methods, Data, Events]]
    }
    
    extension [Self <: ReactiveAdapter[?, ?, ?, ?, ?], Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Data, Events /* <: Record[String, Any] */](x: Self & (ReactiveAdapter[Instance, State, Methods, Data, Events])) {
      
      inline def setCreated(value: /* data */ Data => js.UndefOr[Instance | Unit]): Self = StObject.set(x, "created", js.Any.fromFunction1(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDestroy(value: (/* instance */ Instance, /* data */ Data) => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction2((t0: /* instance */ Instance, t1: /* data */ Data) => (value(t0, t1)).runNow()))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEvents(value: js.Array[/* keyof Events */ String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: (/* keyof Events */ String)*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInit(value: (/* instance */ Instance, /* data */ Data) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: /* instance */ Instance, t1: /* data */ Data) => (value(t0, t1)).runNow()))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setMethods(value: js.Array[Methods]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: Methods*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setMounted(value: /* data */ Data => js.UndefOr[Instance | Unit]): Self = StObject.set(x, "mounted", js.Any.fromFunction1(value))
      
      inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      inline def setOff(
        value: (/* instance */ Instance, /* eventName */ EventKey[Events], /* listener */ ReactiveEventCallback[Events, EventKey[Events]]) => Callback
      ): Self = StObject.set(x, "off", js.Any.fromFunction3((t0: /* instance */ Instance, t1: /* eventName */ EventKey[Events], t2: /* listener */ ReactiveEventCallback[Events, EventKey[Events]]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(
        value: (/* instance */ Instance, /* eventName */ EventKey[Events], /* listener */ ReactiveEventCallback[Events, EventKey[Events]]) => Callback
      ): Self = StObject.set(x, "on", js.Any.fromFunction3((t0: /* instance */ Instance, t1: /* eventName */ EventKey[Events], t2: /* listener */ ReactiveEventCallback[Events, EventKey[Events]]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
