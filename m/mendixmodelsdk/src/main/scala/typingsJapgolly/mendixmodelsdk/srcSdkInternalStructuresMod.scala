package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PartListProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PartProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildListProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalStructuresMod {
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal/structures", "Structure")
  @js.native
  open class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected ()
    extends StObject
       with IStructure {
    def this(_model: AbstractModel, structureTypeName: String, id: String) = this()
    def this(_model: AbstractModel, structureTypeName: String, id: String, _isPartial: Boolean) = this()
    def this(
      _model: AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean,
      container: IContainer
    ) = this()
    def this(
      _model: AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Unit,
      container: IContainer
    ) = this()
    
    /* CompleteClass */
    override def allProperties(): js.Array[AbstractProperty[Any, Any]] = js.native
    
    /* CompleteClass */
    override val container: IContainer | Null = js.native
    @JSName("container")
    def container_MStructure: TContainer = js.native
    
    /**
      * Deletes a model from the model.
      * This will automatically remove the item from its model parent,
      * and update incoming references and send server changes.
      */
    def delete(): Unit = js.native
    
    /* protected */ def getContainerAs[T /* <: IContainer */](containerType: Any): T = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    @JSName("isLoaded")
    def isLoaded_MStructure: Boolean = js.native
    
    /**
      * Returns all properties when this structure is loaded, otherwise just the public properties.
      */
    /* CompleteClass */
    override def loadedProperties(): js.Array[AbstractProperty[Any, Any]] = js.native
    
    /* CompleteClass */
    var model: IAbstractModel = js.native
    @JSName("model")
    def model_MStructure: TModel = js.native
    
    /* CompleteClass */
    override def publicProperties(): js.Array[AbstractProperty[Any, Any]] = js.native
    
    /* CompleteClass */
    var structureTypeName: String = js.native
    
    /**
      * Renders the structure as plain JSON (without observables magic).
      * This is intended for debugging and development convenience.
      * Note that the resulting object is not of the interface type corresponding to this structure.
      */
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
    
    /**
      * Traverses this structure by calling the provided visitor function
      * on itself and all the structures contained (as part) by it,
      * in depth-first order, and it returns synchronously after that.
      */
    /* CompleteClass */
    override def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
    
    /**
      * Traverses this structure, returning immediately when `visit` returns something other than `null`.
      */
    /* CompleteClass */
    override def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null = js.native
    
    /**
      * Traverses this structure, only visiting children contained in public properties.
      */
    /* CompleteClass */
    override def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
    
    /**
      * Unit that owns/contains this thing.
      */
    /* CompleteClass */
    var unit: IAbstractUnit = js.native
    @JSName("unit")
    def unit_MStructure: IAbstractUnit = js.native
  }
  
  type AbstractStructureProperty = PartProperty[Any] | PartListProperty[Any] | StructuralChildProperty[Any] | StructuralChildListProperty[Any]
  
  trait IChildHandle extends StObject {
    
    var containingProperty: AbstractStructureProperty
    
    def delete(): Unit
    
    def detach(): Unit
  }
  object IChildHandle {
    
    inline def apply(containingProperty: AbstractStructureProperty, delete: Callback, detach: Callback): IChildHandle = {
      val __obj = js.Dynamic.literal(containingProperty = containingProperty.asInstanceOf[js.Any], delete = delete.toJsFn, detach = detach.toJsFn)
      __obj.asInstanceOf[IChildHandle]
    }
    
    extension [Self <: IChildHandle](x: Self) {
      
      inline def setContainingProperty(value: AbstractStructureProperty): Self = StObject.set(x, "containingProperty", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
      
      inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
    }
  }
  
  trait IStructure extends StObject {
    
    def allProperties(): js.Array[AbstractProperty[Any, Any]]
    
    val container: IContainer | Null
    
    var id: String
    
    var isLoaded: Boolean
    
    /**
      * Returns all properties when this structure is loaded, otherwise just the public properties.
      */
    def loadedProperties(): js.Array[AbstractProperty[Any, Any]]
    
    var model: IAbstractModel
    
    def publicProperties(): js.Array[AbstractProperty[Any, Any]]
    
    var structureTypeName: String
    
    /**
      * Renders the structure as plain JSON (without observables magic).
      * This is intended for debugging and development convenience.
      * Note that the resulting object is not of the interface type corresponding to this structure.
      */
    def toJSON(): js.Object
    
    /**
      * Traverses this structure by calling the provided visitor function
      * on itself and all the structures contained (as part) by it,
      * in depth-first order, and it returns synchronously after that.
      */
    def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit
    
    /**
      * Traverses this structure, returning immediately when `visit` returns something other than `null`.
      */
    def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null
    
    /**
      * Traverses this structure, only visiting children contained in public properties.
      */
    def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit
    
    /**
      * Unit that owns/contains this thing.
      */
    var unit: IAbstractUnit
  }
  object IStructure {
    
    inline def apply(
      allProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      id: String,
      isLoaded: Boolean,
      loadedProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      model: IAbstractModel,
      publicProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
      structureTypeName: String,
      toJSON: CallbackTo[js.Object],
      traverse: js.Function1[IStructure, Unit] => Callback,
      traverseFind: js.Function1[IStructure, Any] => Any | Null,
      traversePublicParts: js.Function1[IStructure, Unit] => Callback,
      unit: IAbstractUnit
    ): IStructure = {
      val __obj = js.Dynamic.literal(allProperties = allProperties.toJsFn, id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = loadedProperties.toJsFn, model = model.asInstanceOf[js.Any], publicProperties = publicProperties.toJsFn, structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, traverse = js.Any.fromFunction1((t0: js.Function1[IStructure, Unit]) => traverse(t0).runNow()), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1((t0: js.Function1[IStructure, Unit]) => traversePublicParts(t0).runNow()), unit = unit.asInstanceOf[js.Any], container = null)
      __obj.asInstanceOf[IStructure]
    }
    
    extension [Self <: IStructure](x: Self) {
      
      inline def setAllProperties(value: CallbackTo[js.Array[AbstractProperty[Any, Any]]]): Self = StObject.set(x, "allProperties", value.toJsFn)
      
      inline def setContainer(value: IContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedProperties(value: CallbackTo[js.Array[AbstractProperty[Any, Any]]]): Self = StObject.set(x, "loadedProperties", value.toJsFn)
      
      inline def setModel(value: IAbstractModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setPublicProperties(value: CallbackTo[js.Array[AbstractProperty[Any, Any]]]): Self = StObject.set(x, "publicProperties", value.toJsFn)
      
      inline def setStructureTypeName(value: String): Self = StObject.set(x, "structureTypeName", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setTraverse(value: js.Function1[IStructure, Unit] => Callback): Self = StObject.set(x, "traverse", js.Any.fromFunction1((t0: js.Function1[IStructure, Unit]) => value(t0).runNow()))
      
      inline def setTraverseFind(value: js.Function1[IStructure, Any] => Any | Null): Self = StObject.set(x, "traverseFind", js.Any.fromFunction1(value))
      
      inline def setTraversePublicParts(value: js.Function1[IStructure, Unit] => Callback): Self = StObject.set(x, "traversePublicParts", js.Any.fromFunction1((t0: js.Function1[IStructure, Unit]) => value(t0).runNow()))
      
      inline def setUnit(value: IAbstractUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStructureClass extends StObject {
    
    var versionInfo: StructureVersionInfo
  }
  object IStructureClass {
    
    inline def apply(versionInfo: StructureVersionInfo): IStructureClass = {
      val __obj = js.Dynamic.literal(versionInfo = versionInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructureClass]
    }
    
    extension [Self <: IStructureClass](x: Self) {
      
      inline def setVersionInfo(value: StructureVersionInfo): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStructureConstructor[T /* <: IStructure */]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`new`
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.attached
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.detached
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.deleted
  */
  trait StructureState extends StObject
  object StructureState {
    
    inline def attached: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.attached = "attached".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.attached]
    
    inline def deleted: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.deleted = "deleted".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.deleted]
    
    inline def detached: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.detached = "detached".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.detached]
    
    inline def `new`: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`new` = "new".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`new`]
  }
  
  object aliases {
    
    type Container = StructuralUnit[IAbstractModel] | (AbstractElement[IAbstractModel, Any])
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
      - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
    */
    trait IContainer extends StObject
  }
}
