package typingsJapgolly.xstate

import typingsJapgolly.std.Omit
import typingsJapgolly.xstate.anon.Id
import typingsJapgolly.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled
import typingsJapgolly.xstate.libTypesMod.ActorRef
import typingsJapgolly.xstate.libTypesMod.BaseActionObject
import typingsJapgolly.xstate.libTypesMod.BaseActorRef
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.InvokeDefinition
import typingsJapgolly.xstate.libTypesMod.NoInfer
import typingsJapgolly.xstate.libTypesMod.SCXML.Event
import typingsJapgolly.xstate.libTypesMod.ServiceMap
import typingsJapgolly.xstate.libTypesMod.Spawnable
import typingsJapgolly.xstate.libTypesMod.StateMachine
import typingsJapgolly.xstate.libTypesMod.Subscribable
import typingsJapgolly.xstate.xstateStrings.getSnapshot
import typingsJapgolly.xstate.xstateStrings.id
import typingsJapgolly.xstate.xstateStrings.send
import typingsJapgolly.xstate.xstateStrings.stop
import typingsJapgolly.xstate.xstateStrings.subscribe
import typingsJapgolly.xstate.xstateStrings.toJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActorMod {
  
  @JSImport("xstate/lib/Actor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDeferredActor(entity: Spawnable, id: String): ActorRef[Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredActor")(entity.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Unit]]
  inline def createDeferredActor(entity: Spawnable, id: String, data: Any): ActorRef[Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredActor")(entity.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Unit]]
  
  inline def createInvocableActor[TC, TE /* <: EventObject */](
    invokeDefinition: InvokeDefinition[TC, TE],
    machine: StateMachine[
      TC, 
      Any, 
      TE, 
      Any, 
      BaseActionObject, 
      ServiceMap, 
      ResolveTypegenMeta[TypegenDisabled, NoInfer[TE], BaseActionObject, ServiceMap]
    ],
    context: TC,
    _event: Event[TE]
  ): ActorRef[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvocableActor")(invokeDefinition.asInstanceOf[js.Any], machine.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Any]]
  
  inline def createNullActor(id: String): ActorRef[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullActor")(id.asInstanceOf[js.Any]).asInstanceOf[ActorRef[Any, Any]]
  
  inline def isActor(item: Any): /* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActor")(item.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean]
  
  inline def isSpawnedActor(item: Any): /* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpawnedActor")(item.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean]
  
  inline def toActorRef[TEvent /* <: EventObject */, TEmitted, TActorRefLike /* <: BaseActorRef[TEvent] */](actorRefLike: TActorRefLike): (ActorRef[TEvent, TEmitted]) & (Omit[
    TActorRefLike, 
    /* keyof xstate.xstate/lib/types.ActorRef<any, any> */ send | id | getSnapshot | stop | toJSON | subscribe
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("toActorRef")(actorRefLike.asInstanceOf[js.Any]).asInstanceOf[(ActorRef[TEvent, TEmitted]) & (Omit[
    TActorRefLike, 
    /* keyof xstate.xstate/lib/types.ActorRef<any, any> */ send | id | getSnapshot | stop | toJSON | subscribe
  ])]
  
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */]
    extends StObject
       with Subscribable[TContext] {
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var meta: js.UndefOr[InvokeDefinition[TContext, TEvent]] = js.native
    
    def send(event: TEvent): Any = js.native
    
    var state: js.UndefOr[Any] = js.native
    
    var stop: js.UndefOr[js.Function0[js.UndefOr[Any]]] = js.native
    
    def toJSON(): Id = js.native
  }
}
