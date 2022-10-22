package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.InstanceConstructor
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalUnitsMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly */ @JSImport("mendixmodelsdk/src/sdk/internal/units", "AbstractUnit")
  @js.native
  open class AbstractUnit[TModel /* <: IAbstractModel */] protected () extends Structure[TModel, StructuralUnit[IAbstractModel]] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    
    def deepCopyInto(newParent: IStructuralUnit): AbstractUnit[IAbstractModel] = js.native
    
    def isLoadable: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) can be loaded.
      */
    @JSName("isLoadable")
    val isLoadable_FAbstractUnit: Boolean = js.native
    
    /**
      * Checks whether all attributes are available at this instant;
      * if false, a load is required to access these properties.
      */
    @JSName("isLoaded")
    def isLoaded_MAbstractUnit: Boolean = js.native
    
    def isReadOnly: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) are editable.
      */
    @JSName("isReadOnly")
    val isReadOnly_FAbstractUnit: Boolean = js.native
  }
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/sdk/internal/units", "ModelUnit")
  @js.native
  open class ModelUnit[TModel /* <: IAbstractModel */] protected () extends AbstractElement[TModel, StructuralUnit[IAbstractModel]] {
    def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    
    def isLoadable: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) can be loaded.
      */
    @JSName("isLoadable")
    val isLoadable_FModelUnit: Boolean = js.native
    
    @JSName("isLoaded")
    def isLoaded_MModelUnit: Boolean = js.native
    
    def isReadOnly: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) are editable.
      */
    @JSName("isReadOnly")
    val isReadOnly_FModelUnit: Boolean = js.native
    
    @JSName("unit")
    def unit_MModelUnit: this.type = js.native
  }
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/sdk/internal/units", "StructuralUnit")
  @js.native
  open class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
    extends AbstractUnit[TModel]
       with IContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      _ignoredIsPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    
    @JSName("unit")
    def unit_MStructuralUnit: this.type = js.native
  }
  
  trait IAbstractUnit
    extends StObject
       with IStructure {
    
    /**
      * The parent unit of this unit.
      */
    @JSName("container")
    val container_IAbstractUnit: IStructuralUnit
    
    /**
      * Deletes the unit from the model
      */
    def delete(): Unit
    
    /**
      * Whether this unit and all of its children (recursively) can be loaded.
      */
    val isLoadable: Boolean
    
    /**
      * Whether this unit and all of its children (recursively) are editable.
      */
    val isReadOnly: Boolean
  }
  object IAbstractUnit {
    
    inline def apply(
      allProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      container: IStructuralUnit,
      delete: Callback,
      id: String,
      isLoadable: Boolean,
      isLoaded: Boolean,
      isReadOnly: Boolean,
      loadedProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      model: IAbstractModel,
      publicProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      structureTypeName: String,
      toJSON: CallbackTo[js.Object],
      traverse: js.Function1[IAbstractUnit, Unit] => Callback,
      traverseFind: js.Function1[IAbstractUnit, Any] => Any | Null,
      traversePublicParts: js.Function1[IAbstractUnit, Unit] => Callback,
      unit: IAbstractUnit
    ): IAbstractUnit = {
      val __obj = js.Dynamic.literal(allProperties = allProperties.toJsFn, container = container.asInstanceOf[js.Any], delete = delete.toJsFn, id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = loadedProperties.toJsFn, model = model.asInstanceOf[js.Any], publicProperties = publicProperties.toJsFn, structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, traverse = js.Any.fromFunction1((t0: js.Function1[IAbstractUnit, Unit]) => traverse(t0).runNow()), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1((t0: js.Function1[IAbstractUnit, Unit]) => traversePublicParts(t0).runNow()), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAbstractUnit]
    }
    
    extension [Self <: IAbstractUnit](x: Self) {
      
      inline def setContainer(value: IStructuralUnit): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
      
      inline def setIsLoadable(value: Boolean): Self = StObject.set(x, "isLoadable", value.asInstanceOf[js.Any])
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAbstractUnitConstructor
    extends StObject
       with Instantiable1[
          /* args (repeated) */ Any, 
          ModelUnit[IAbstractModel] | StructuralUnit[IAbstractModel]
        ]
       with InstanceConstructor
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded, findElementById */ @js.native
  trait IModelUnit
    extends StObject
       with IAbstractUnit
       with IContainer {
    
    def asLoaded(): IAbstractElement = js.native
    
    def findElementById(id: String): IAbstractElement | Null = js.native
    
    def load(): js.Promise[IAbstractElement] = js.native
    def load(callback: js.Function1[/* element */ this.type, Unit]): Unit = js.native
    def load(callback: js.Function1[/* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
    def load(forceRefresh: Boolean): js.Promise[IAbstractElement] = js.native
  }
  
  trait IStructuralUnit
    extends StObject
       with IAbstractUnit
       with IContainer
  object IStructuralUnit {
    
    inline def apply(
      allProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      container: IStructuralUnit,
      delete: Callback,
      id: String,
      isLoadable: Boolean,
      isLoaded: Boolean,
      isReadOnly: Boolean,
      loadedProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      model: IAbstractModel,
      publicProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      structureTypeName: String,
      toJSON: CallbackTo[js.Object],
      traverse: js.Function1[IStructuralUnit, Unit] => Callback,
      traverseFind: js.Function1[IStructuralUnit, Any] => Any | Null,
      traversePublicParts: js.Function1[IStructuralUnit, Unit] => Callback,
      unit: IAbstractUnit
    ): IStructuralUnit = {
      val __obj = js.Dynamic.literal(allProperties = allProperties.toJsFn, container = container.asInstanceOf[js.Any], delete = delete.toJsFn, id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = loadedProperties.toJsFn, model = model.asInstanceOf[js.Any], publicProperties = publicProperties.toJsFn, structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, traverse = js.Any.fromFunction1((t0: js.Function1[IStructuralUnit, Unit]) => traverse(t0).runNow()), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1((t0: js.Function1[IStructuralUnit, Unit]) => traversePublicParts(t0).runNow()), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuralUnit]
    }
  }
}
