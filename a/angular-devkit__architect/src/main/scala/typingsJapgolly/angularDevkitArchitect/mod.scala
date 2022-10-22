package typingsJapgolly.angularDevkitArchitect

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderHandlerFn
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderInfo
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcApiMod.ScheduleOptions
import typingsJapgolly.angularDevkitArchitect.srcApiMod.Target
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.ArchitectHost
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitArchitect.srcProgressSchemaMod.State
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/architect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/architect", "Architect")
  @js.native
  open class Architect protected ()
    extends typingsJapgolly.angularDevkitArchitect.srcArchitectMod.Architect {
    def this(_host: ArchitectHost[BuilderInfo]) = this()
    def this(_host: ArchitectHost[BuilderInfo], registry: SchemaRegistry) = this()
    def this(
      _host: ArchitectHost[BuilderInfo],
      registry: Unit,
      additionalJobRegistry: Registry[JsonValue, JsonValue, JsonValue]
    ) = this()
    def this(
      _host: ArchitectHost[BuilderInfo],
      registry: SchemaRegistry,
      additionalJobRegistry: Registry[JsonValue, JsonValue, JsonValue]
    ) = this()
  }
  
  @JSImport("@angular-devkit/architect", "BuilderProgressState")
  @js.native
  object BuilderProgressState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    /* "error" */ val Error: typingsJapgolly.angularDevkitArchitect.srcProgressSchemaMod.State.Error & String = js.native
    
    /* "running" */ val Running: typingsJapgolly.angularDevkitArchitect.srcProgressSchemaMod.State.Running & String = js.native
    
    /* "stopped" */ val Stopped: typingsJapgolly.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped & String = js.native
    
    /* "waiting" */ val Waiting: typingsJapgolly.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting & String = js.native
  }
  
  inline def createBuilder[OptT, OutT /* <: BuilderOutput */](fn: BuilderHandlerFn[OptT]): Builder[OptT & JsonObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(fn.asInstanceOf[js.Any]).asInstanceOf[Builder[OptT & JsonObject]]
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def isBuilderOutput(obj: Any): /* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilderOutput")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean]
  
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def targetFromTargetString(str: String): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("targetFromTargetString")(str.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def targetStringFromTarget(hasProjectTargetConfiguration: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetStringFromTarget")(hasProjectTargetConfiguration.asInstanceOf[js.Any]).asInstanceOf[String]
}
