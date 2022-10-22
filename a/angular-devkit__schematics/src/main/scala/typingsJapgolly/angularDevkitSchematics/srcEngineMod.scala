package typingsJapgolly.angularDevkitSchematics

import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Collection
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.CollectionDescription
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Engine
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.EngineHost
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.RuleFactory
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.SchematicContext
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.SchematicDescription
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.TaskId
import typingsJapgolly.angularDevkitSchematics.srcWorkflowInterfaceMod.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEngineMod {
  
  @JSImport("@angular-devkit/schematics/src/engine", "CircularCollectionException")
  @js.native
  open class CircularCollectionException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.CircularCollectionException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "CollectionImpl")
  @js.native
  open class CollectionImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.CollectionImpl[CollectionT, SchematicT] {
    def this(
      _description: CollectionDescription[CollectionT],
      _engine: typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT]
    ) = this()
    def this(
      _description: CollectionDescription[CollectionT],
      _engine: typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT],
      baseDescriptions: js.Array[CollectionDescription[CollectionT]]
    ) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "InvalidSchematicsNameException")
  @js.native
  open class InvalidSchematicsNameException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineSchematicMod.InvalidSchematicsNameException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "PrivateSchematicException")
  @js.native
  open class PrivateSchematicException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.PrivateSchematicException {
    def this(name: String, collection: typingsJapgolly.angularDevkitSchematics.anon.CollectionDescription) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "SchematicEngine")
  @js.native
  open class SchematicEngine[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT] {
    def this(_host: EngineHost[CollectionT, SchematicT]) = this()
    def this(_host: EngineHost[CollectionT, SchematicT], _workflow: Workflow) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "SchematicEngineConflictingException")
  @js.native
  open class SchematicEngineConflictingException ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.SchematicEngineConflictingException
  
  @JSImport("@angular-devkit/schematics/src/engine", "SchematicImpl")
  @js.native
  open class SchematicImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineSchematicMod.SchematicImpl[CollectionT, SchematicT] {
    def this(
      _description: SchematicDescription[CollectionT, SchematicT],
      _factory: RuleFactory[js.Object],
      _collection: Collection[CollectionT, SchematicT],
      _engine: Engine[CollectionT, SchematicT]
    ) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "TaskScheduler")
  @js.native
  open class TaskScheduler protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.TaskScheduler {
    def this(_context: SchematicContext) = this()
  }
  /* static members */
  object TaskScheduler {
    
    @JSImport("@angular-devkit/schematics/src/engine", "TaskScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/schematics/src/engine", "TaskScheduler._taskIdCounter")
    @js.native
    def _taskIdCounter: Any = js.native
    inline def _taskIdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_taskIdCounter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownCollectionException")
  @js.native
  open class UnknownCollectionException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.UnknownCollectionException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownSchematicException")
  @js.native
  open class UnknownSchematicException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.UnknownSchematicException {
    def this(name: String, collection: typingsJapgolly.angularDevkitSchematics.anon.CollectionDescription) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownTaskDependencyException")
  @js.native
  open class UnknownTaskDependencyException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.UnknownTaskDependencyException {
    def this(id: TaskId) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownUrlSourceProtocol")
  @js.native
  open class UnknownUrlSourceProtocol protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.UnknownUrlSourceProtocol {
    def this(url: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnregisteredTaskException")
  @js.native
  open class UnregisteredTaskException protected ()
    extends typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.UnregisteredTaskException {
    def this(name: String) = this()
    def this(name: String, schematic: typingsJapgolly.angularDevkitSchematics.anon.SchematicDescription) = this()
  }
}
