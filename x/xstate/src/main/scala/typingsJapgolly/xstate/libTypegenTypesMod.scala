package typingsJapgolly.xstate

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import typingsJapgolly.xstate.anon.Actions
import typingsJapgolly.xstate.anon.TypegenMetaindexedActions
import typingsJapgolly.xstate.libTypesMod.BaseActionObject
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.Prop
import typingsJapgolly.xstate.libTypesMod.ServiceMap
import typingsJapgolly.xstate.xstateBooleans.`false`
import typingsJapgolly.xstate.xstateBooleans.`true`
import typingsJapgolly.xstate.xstateStrings.`@@xstateSlashtypegen`
import typingsJapgolly.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypegenTypesMod {
  
  trait AllImplementationsProvided extends StObject
  
  trait AllowAllEvents extends StObject {
    
    var eventsCausingActions: Record[String, String]
    
    var eventsCausingDelays: Record[String, String]
    
    var eventsCausingGuards: Record[String, String]
    
    var eventsCausingServices: Record[String, String]
  }
  object AllowAllEvents {
    
    inline def apply(
      eventsCausingActions: Record[String, String],
      eventsCausingDelays: Record[String, String],
      eventsCausingGuards: Record[String, String],
      eventsCausingServices: Record[String, String]
    ): AllowAllEvents = {
      val __obj = js.Dynamic.literal(eventsCausingActions = eventsCausingActions.asInstanceOf[js.Any], eventsCausingDelays = eventsCausingDelays.asInstanceOf[js.Any], eventsCausingGuards = eventsCausingGuards.asInstanceOf[js.Any], eventsCausingServices = eventsCausingServices.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowAllEvents]
    }
    
    extension [Self <: AllowAllEvents](x: Self) {
      
      inline def setEventsCausingActions(value: Record[String, String]): Self = StObject.set(x, "eventsCausingActions", value.asInstanceOf[js.Any])
      
      inline def setEventsCausingDelays(value: Record[String, String]): Self = StObject.set(x, "eventsCausingDelays", value.asInstanceOf[js.Any])
      
      inline def setEventsCausingGuards(value: Record[String, String]): Self = StObject.set(x, "eventsCausingGuards", value.asInstanceOf[js.Any])
      
      inline def setEventsCausingServices(value: Record[String, String]): Self = StObject.set(x, "eventsCausingServices", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    xstate.xstate/lib/types.IsAny<TResolvedTypesMeta> extends true ? true : TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? xstate.xstate/lib/types.IsNever<xstate.xstate/lib/types.Values<{[ K in keyof TMissingImplementations ]: TMissingImplementations[K]}>> extends true ? true : false : true
    }}}
    */
  @js.native
  trait AreAllImplementationsAssumedToBeProvided[TResolvedTypesMeta, TMissingImplementations] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TEventType extends any ? {  type :TEventType} & xstate.xstate/lib/types.Prop<TServiceMap, TServiceName> : never
    }}}
    */
  @js.native
  trait GenerateServiceEvent[TServiceName, TEventType, TServiceMap /* <: ServiceMap */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    string extends keyof TServiceMap ? never : xstate.xstate/lib/types.Cast<{[ K in keyof TInvokeSrcNameMap ]: xstate.xstate/lib/typegenTypes.GenerateServiceEvent<K, TInvokeSrcNameMap[K], TServiceMap>}[keyof TInvokeSrcNameMap], xstate.xstate/lib/types.EventObject>
    }}}
    */
  @js.native
  trait GenerateServiceEvents[TServiceMap /* <: ServiceMap */, TInvokeSrcNameMap] extends StObject
  
  trait MarkAllImplementationsAsProvided[TResolvedTypesMeta] extends StObject {
    
    @JSName("@@xstate/typegen")
    var `@@xstateSlashtypegen`: Prop[TResolvedTypesMeta, typingsJapgolly.xstate.xstateStrings.`@@xstateSlashtypegen`]
    
    var resolved: (Prop[TResolvedTypesMeta, typingsJapgolly.xstate.xstateStrings.resolved]) & AllImplementationsProvided
  }
  object MarkAllImplementationsAsProvided {
    
    inline def apply[TResolvedTypesMeta](
      `@@xstateSlashtypegen`: Prop[TResolvedTypesMeta, `@@xstateSlashtypegen`],
      resolved: (Prop[TResolvedTypesMeta, resolved]) & AllImplementationsProvided
    ): MarkAllImplementationsAsProvided[TResolvedTypesMeta] = {
      val __obj = js.Dynamic.literal(resolved = resolved.asInstanceOf[js.Any])
      __obj.updateDynamic("@@xstate/typegen")(`@@xstateSlashtypegen`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkAllImplementationsAsProvided[TResolvedTypesMeta]]
    }
    
    extension [Self <: MarkAllImplementationsAsProvided[?], TResolvedTypesMeta](x: Self & MarkAllImplementationsAsProvided[TResolvedTypesMeta]) {
      
      inline def `set@@xstateSlashtypegen`(value: Prop[TResolvedTypesMeta, `@@xstateSlashtypegen`]): Self = StObject.set(x, "@@xstate/typegen", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: (Prop[TResolvedTypesMeta, resolved]) & AllImplementationsProvided): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
  
  type MergeWithInternalEvents[TIndexedEvents, TInternalEvents] = TIndexedEvents & (Pick[
    TInternalEvents, 
    Exclude[/* keyof TInternalEvents */ String, /* keyof TIndexedEvents */ String]
  ])
  
  trait ResolveTypegenMeta[TTypesMeta /* <: TypegenConstraint */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */] extends StObject {
    
    @JSName("@@xstate/typegen")
    var `@@xstateSlashtypegen`: /* import warning: importer.ImportType#apply Failed type conversion: TTypesMeta['@@xstate/typegen'] */ js.Any
    
    var resolved: /* import warning: importer.ImportType#apply Failed type conversion: xstate.anon.Disabled<TTypesMeta, TAction, TEvent, TServiceMap>[xstate.xstate/lib/types.IsNever<TTypesMeta> extends true ? 'disabled' : TTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? 'enabled' : 'disabled'] */ js.Any
  }
  object ResolveTypegenMeta {
    
    inline def apply[TTypesMeta /* <: TypegenConstraint */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */](
      `@@xstateSlashtypegen`: /* import warning: importer.ImportType#apply Failed type conversion: TTypesMeta['@@xstate/typegen'] */ js.Any,
      resolved: /* import warning: importer.ImportType#apply Failed type conversion: xstate.anon.Disabled<TTypesMeta, TAction, TEvent, TServiceMap>[xstate.xstate/lib/types.IsNever<TTypesMeta> extends true ? 'disabled' : TTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? 'enabled' : 'disabled'] */ js.Any
    ): ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap] = {
      val __obj = js.Dynamic.literal(resolved = resolved.asInstanceOf[js.Any])
      __obj.updateDynamic("@@xstate/typegen")(`@@xstateSlashtypegen`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap]]
    }
    
    extension [Self <: ResolveTypegenMeta[?, ?, ?, ?], TTypesMeta /* <: TypegenConstraint */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */](x: Self & (ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap])) {
      
      inline def `set@@xstateSlashtypegen`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TTypesMeta['@@xstate/typegen'] */ js.Any
      ): Self = StObject.set(x, "@@xstate/typegen", value.asInstanceOf[js.Any])
      
      inline def setResolved(
        value: /* import warning: importer.ImportType#apply Failed type conversion: xstate.anon.Disabled<TTypesMeta, TAction, TEvent, TServiceMap>[xstate.xstate/lib/types.IsNever<TTypesMeta> extends true ? 'disabled' : TTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? 'enabled' : 'disabled'] */ js.Any
      ): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvedTypegenMeta
    extends StObject
       with TypegenMeta {
    
    var resolved: TypegenMetaindexedActions
  }
  object ResolvedTypegenMeta {
    
    inline def apply(
      eventsCausingActions: Record[String, String],
      eventsCausingDelays: Record[String, String],
      eventsCausingGuards: Record[String, String],
      eventsCausingServices: Record[String, String],
      invokeSrcNameMap: Record[String, String],
      matchesStates: String | js.Object,
      missingImplementations: Actions,
      resolved: TypegenMetaindexedActions,
      tags: String
    ): ResolvedTypegenMeta = {
      val __obj = js.Dynamic.literal(eventsCausingActions = eventsCausingActions.asInstanceOf[js.Any], eventsCausingDelays = eventsCausingDelays.asInstanceOf[js.Any], eventsCausingGuards = eventsCausingGuards.asInstanceOf[js.Any], eventsCausingServices = eventsCausingServices.asInstanceOf[js.Any], invokeSrcNameMap = invokeSrcNameMap.asInstanceOf[js.Any], matchesStates = matchesStates.asInstanceOf[js.Any], missingImplementations = missingImplementations.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("@@xstate/typegen")(true)
      __obj.asInstanceOf[ResolvedTypegenMeta]
    }
    
    extension [Self <: ResolvedTypegenMeta](x: Self) {
      
      inline def setResolved(value: TypegenMetaindexedActions): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xstate.libTypegenTypesMod.TypegenEnabled
    - typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled
  */
  trait TypegenConstraint extends StObject
  object TypegenConstraint {
    
    inline def TypegenDisabled(): typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@xstate/typegen")(false)
      __obj.asInstanceOf[typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled]
    }
    
    inline def TypegenEnabled(): typingsJapgolly.xstate.libTypegenTypesMod.TypegenEnabled = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@xstate/typegen")(true)
      __obj.asInstanceOf[typingsJapgolly.xstate.libTypegenTypesMod.TypegenEnabled]
    }
  }
  
  trait TypegenDisabled
    extends StObject
       with TypegenConstraint {
    
    @JSName("@@xstate/typegen")
    var `@@xstateSlashtypegen`: `false`
  }
  object TypegenDisabled {
    
    inline def apply(): TypegenDisabled = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@xstate/typegen")(false)
      __obj.asInstanceOf[TypegenDisabled]
    }
    
    extension [Self <: TypegenDisabled](x: Self) {
      
      inline def `set@@xstateSlashtypegen`(value: `false`): Self = StObject.set(x, "@@xstate/typegen", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypegenEnabled
    extends StObject
       with TypegenConstraint {
    
    @JSName("@@xstate/typegen")
    var `@@xstateSlashtypegen`: `true`
  }
  object TypegenEnabled {
    
    inline def apply(): TypegenEnabled = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@xstate/typegen")(true)
      __obj.asInstanceOf[TypegenEnabled]
    }
    
    extension [Self <: TypegenEnabled](x: Self) {
      
      inline def `set@@xstateSlashtypegen`(value: `true`): Self = StObject.set(x, "@@xstate/typegen", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypegenMeta
    extends StObject
       with TypegenEnabled {
    
    /**
      * Keeps track of which events lead to which
      * actions.
      *
      * Key: 'EVENT_NAME'
      * Value: 'actionName' | 'otherActionName'
      */
    var eventsCausingActions: Record[String, String]
    
    /**
      * Keeps track of which events lead to which
      * delays.
      *
      * Key: 'EVENT_NAME'
      * Value: 'delayName' | 'otherDelayName'
      */
    var eventsCausingDelays: Record[String, String]
    
    /**
      * Keeps track of which events lead to which
      * guards.
      *
      * Key: 'EVENT_NAME'
      * Value: 'guardName' | 'otherGuardName'
      */
    var eventsCausingGuards: Record[String, String]
    
    /**
      * Keeps track of which events lead to which
      * services.
      *
      * Key: 'EVENT_NAME'
      * Value: 'serviceName' | 'otherServiceName'
      */
    var eventsCausingServices: Record[String, String]
    
    /**
      * Maps the name of the service to the event type
      * of the done.invoke action
      *
      * key: 'invokeSrc'
      * value: 'done.invoke.invokeName'
      */
    var invokeSrcNameMap: Record[String, String]
    
    /**
      * Allows you to specify all the results of state.matches
      */
    var matchesStates: String | js.Object
    
    /**
      * Allows you to specify all the missing implementations
      * of the machine
      */
    var missingImplementations: Actions
    
    /**
      * Allows you to specify all tags used by the machine
      */
    var tags: String
  }
  object TypegenMeta {
    
    inline def apply(
      eventsCausingActions: Record[String, String],
      eventsCausingDelays: Record[String, String],
      eventsCausingGuards: Record[String, String],
      eventsCausingServices: Record[String, String],
      invokeSrcNameMap: Record[String, String],
      matchesStates: String | js.Object,
      missingImplementations: Actions,
      tags: String
    ): TypegenMeta = {
      val __obj = js.Dynamic.literal(eventsCausingActions = eventsCausingActions.asInstanceOf[js.Any], eventsCausingDelays = eventsCausingDelays.asInstanceOf[js.Any], eventsCausingGuards = eventsCausingGuards.asInstanceOf[js.Any], eventsCausingServices = eventsCausingServices.asInstanceOf[js.Any], invokeSrcNameMap = invokeSrcNameMap.asInstanceOf[js.Any], matchesStates = matchesStates.asInstanceOf[js.Any], missingImplementations = missingImplementations.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("@@xstate/typegen")(true)
      __obj.asInstanceOf[TypegenMeta]
    }
    
    extension [Self <: TypegenMeta](x: Self) {
      
      inline def setEventsCausingActions(value: Record[String, String]): Self = StObject.set(x, "eventsCausingActions", value.asInstanceOf[js.Any])
      
      inline def setEventsCausingDelays(value: Record[String, String]): Self = StObject.set(x, "eventsCausingDelays", value.asInstanceOf[js.Any])
      
      inline def setEventsCausingGuards(value: Record[String, String]): Self = StObject.set(x, "eventsCausingGuards", value.asInstanceOf[js.Any])
      
      inline def setEventsCausingServices(value: Record[String, String]): Self = StObject.set(x, "eventsCausingServices", value.asInstanceOf[js.Any])
      
      inline def setInvokeSrcNameMap(value: Record[String, String]): Self = StObject.set(x, "invokeSrcNameMap", value.asInstanceOf[js.Any])
      
      inline def setMatchesStates(value: String | js.Object): Self = StObject.set(x, "matchesStates", value.asInstanceOf[js.Any])
      
      inline def setMissingImplementations(value: Actions): Self = StObject.set(x, "missingImplementations", value.asInstanceOf[js.Any])
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
